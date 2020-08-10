package com.example.kalugin.sms3;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements
        SMSReceiver.OTPReceiveListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    private SMSReceiver smsReceiver;
    public TextView my;
    public Boolean firstScan = true;
    public SmsRetrieverClient client;
    public final String MES_INITIATE = "#NEED rashod NNS: phone_auth_key EKXfRwiYu71";
    public final String MES_REPLY_FIRST_PART = "#GOT YOU rashod ";
    public final String MES_REPLY_SECOND_PART = ": phone_auth_key EKXfRwiYu71";
    public final String ABONENT_INITIATE = "+79313509064";
    public static String ABONENT_REPLY = "+79967873716";
    public final String sub = "#";
    public Context context;
    public Button btnSendSMS;
    public Button btnPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my = findViewById(R.id.my);
        context = this;
        btnSendSMS = (Button) findViewById(R.id.btnSendSMS);
        btnPost = (Button) findViewById(R.id.btnPost);
        //AppSignatureHashHelper appSignatureHashHelper = new AppSignatureHashHelper(this);

        // This code requires one time to get Hash keys do comment and share key
       // Log.d(TAG, "Apps Hash Key: " + appSignatureHashHelper.getAppSignatures().get(0));
       // showToast("OTP Received: " + appSignatureHashHelper.getAppSignatures().get(0));
        //my.setText(appSignatureHashHelper.getAppSignatures().get(0));
        startSMSListener();


        btnSendSMS.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                SmsSend initSms = new SmsSend();
                initSms.sendSMS(ABONENT_INITIATE,MES_INITIATE,context);
            }
        });

        btnPost.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

            }
        });
    }


    /**
     * Starts SmsRetriever, which waits for ONE matching SMS message until timeout
     * (5 minutes). The matching SMS message will be sent via a Broadcast Intent with
     * action SmsRetriever#SMS_RETRIEVED_ACTION.
     */
    private void startSMSListener() {
        try {
           if (firstScan) {
               smsReceiver = new SMSReceiver();
               smsReceiver.setOTPListener(this);
               IntentFilter intentFilter = new IntentFilter();
               intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
               this.registerReceiver(smsReceiver, intentFilter);
               client = SmsRetriever.getClient(this);
               firstScan = false;
            }

            Task<Void> task = client.startSmsRetriever();
            task.addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void aVoid) {
                    // API successfully started
                }
            });

            task.addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    // Fail to start API
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onOTPReceived(String otp) {
        my.append(otp + "\n");
        if (otp.indexOf(MES_REPLY_SECOND_PART) != -1) {
            Thread w = new Thread(new Runnable() {
                @Override
                public void run() {
                    NetworkService.getInstance()
                            .getJSONApi()
                            //  .getPostWithID(Integer.parseInt(idd.getText().toString()))
                            .getPostWithID(2)
                            .enqueue(new Callback<Post>() {
                                @Override
                                public void onResponse(@NonNull Call<Post> call, @NonNull Response<Post> response) {
                                    Post post = response.body();
                                    SmsSend initSms = new SmsSend();
                                    initSms.sendSMS(ABONENT_REPLY, MES_REPLY_FIRST_PART + post.getZd_modbus_speed() + MES_REPLY_SECOND_PART, context);
                                    startSMSListener();
                                }

                                @Override
                                public void onFailure(@NonNull Call<Post> call, @NonNull Throwable t) {

                                    my.append("Error occurred while getting request!");
                                    t.printStackTrace();
                                    startSMSListener();
                                }
                            });

                }
            });
            w.start();
        }
    }

    @Override
    public void onOTPTimeOut() {
        showToast("OTP Time out");
    }

    @Override
    public void onOTPReceivedError(String error) {
        showToast(error);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (smsReceiver != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(smsReceiver);
        }
    }


    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
