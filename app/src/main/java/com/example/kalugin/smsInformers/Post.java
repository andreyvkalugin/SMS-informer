package com.example.kalugin.sms3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("zd_name")
    @Expose
    private String zd_name;
    @SerializedName("zd_location")
    @Expose
    private String zd_location;
    @SerializedName("zd_blok_number")
    @Expose
    private String zd_blok_number;
    @SerializedName("sa_name")
    @Expose
    private String sa_name;
    @SerializedName("uso_name")
    @Expose
    private String uso_name;
    @SerializedName("CI_number")
    @Expose
    private String CI_number;
    @SerializedName("zd_hod")
    @Expose
    private String zd_hod;
    @SerializedName("zd_modbus_speed")
    @Expose
    private String zd_modbus_speed;
    @SerializedName("zd_modbus_number")
    @Expose
    private String zd_modbus_number;
    @SerializedName("zd_modbus_setting")
    @Expose
    private String zd_modbus_setting;
    @SerializedName("zd_max_torque")
    @Expose
    private String zd_max_torque;
    @SerializedName("zd_torque_for_close")
    @Expose
    private String zd_torque_for_close;
    @SerializedName("zd_torque_for_start_open")
    @Expose
    private String zd_torque_for_start_open;
    @SerializedName("zd_torque_for_open")
    @Expose
    private String zd_torque_for_open;
    @SerializedName("zd_torque_for_start_close")
    @Expose
    private String zd_torque_for_start_close;
    @SerializedName("zd_type")
    @Expose
    private String zd_type;
    @SerializedName("zd_time_to_sleep")
    @Expose
    private String zd_time_to_sleep;
    @SerializedName("zd_discrete_command")
    @Expose
    private String zd_discrete_command;
    @SerializedName("zd_open_position")
    @Expose
    private String zd_open_position;
    @SerializedName("zd_close_position")
    @Expose
    private String zd_close_position;
    @SerializedName("zd_dimens_x")
    @Expose
    private String zd_dimens_x;
    @SerializedName("zd_dimens_y")
    @Expose
    private String zd_dimens_y;
    @SerializedName("zd_pdf_main")
    @Expose
    private String zd_pdf_main;
    @SerializedName("zd_pdf_uso")
    @Expose
    private String zd_pdf_uso;
    @SerializedName("zd_pdf_main_page")
    @Expose
    private String zd_pdf_main_page;
    @SerializedName("zd_pdf_uso_page")
    @Expose
    private String zd_pdf_uso_page;
    @SerializedName("zd_redundant")
    @Expose
    private String zd_redundant;
    @SerializedName("zd_redundant_2")
    @Expose
    private String zd_redundant_2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZd_name() {
        return zd_name;
    }

    public void setZd_name(String zd_name) {
        this.zd_name = zd_name;
    }

    public String getZd_location() {
        return zd_location;
    }

    public void setZd_location(String zd_location) {
        this.zd_location = zd_location;
    }

    public String getZd_blok_number() {
        return zd_blok_number;
    }

    public void setZd_blok_number(String zd_blok_number) {
        this.zd_blok_number = zd_blok_number;
    }

    public String getSa_name() {
        return sa_name;
    }

    public void setSa_name(String sa_name) {
        this.sa_name = sa_name;
    }

    public String getUso_name() {
        return uso_name;
    }

    public void setUso_name(String uso_name) {
        this.uso_name = uso_name;
    }

    public String getCI_number() {
        return CI_number;
    }

    public void setCI_number(String CI_number) {
        this.CI_number = CI_number;
    }

    public String getZd_hod() {
        return zd_hod;
    }

    public void setZd_hod(String zd_hod) {
        this.zd_hod = zd_hod;
    }

    public String getZd_modbus_speed() {
        return zd_modbus_speed;
    }

    public void setZd_modbus_speed(String zd_modbus_speed) {
        this.zd_modbus_speed = zd_modbus_speed;
    }

    public String getZd_modbus_number() {
        return zd_modbus_number;
    }

    public void setZd_modbus_number(String zd_modbus_number) {
        this.zd_modbus_number = zd_modbus_number;
    }

    public String getZd_modbus_setting() {
        return zd_modbus_setting;
    }

    public void setZd_modbus_setting(String zd_modbus_setting) {
        this.zd_modbus_setting = zd_modbus_setting;
    }

    public String getZd_max_torque() {
        return zd_max_torque;
    }

    public void setZd_max_torque(String zd_max_torque) {
        this.zd_max_torque = zd_max_torque;
    }

    public String getZd_torque_for_close() {
        return zd_torque_for_close;
    }

    public void setZd_torque_for_close(String zd_torque_for_close) {
        this.zd_torque_for_close = zd_torque_for_close;
    }

    public String getZd_torque_for_start_open() {
        return zd_torque_for_start_open;
    }

    public void setZd_torque_for_start_open(String zd_torque_for_start_open) {
        this.zd_torque_for_start_open = zd_torque_for_start_open;
    }

    public String getZd_torque_for_open() {
        return zd_torque_for_open;
    }

    public void setZd_torque_for_open(String zd_torque_for_open) {
        this.zd_torque_for_open = zd_torque_for_open;
    }

    public String getZd_torque_for_start_close() {
        return zd_torque_for_start_close;
    }

    public void setZd_torque_for_start_close(String zd_torque_for_start_close) {
        this.zd_torque_for_start_close = zd_torque_for_start_close;
    }

    public String getZd_type() {
        return zd_type;
    }

    public void setZd_type(String zd_type) {
        this.zd_type = zd_type;
    }

    public String getZd_time_to_sleep() {
        return zd_time_to_sleep;
    }

    public void setZd_time_to_sleep(String zd_time_to_sleep) {
        this.zd_time_to_sleep = zd_time_to_sleep;
    }

    public String getZd_discrete_command() {
        return zd_discrete_command;
    }

    public void setZd_discrete_command(String zd_discrete_command) {
        this.zd_discrete_command = zd_discrete_command;
    }

    public String getZd_open_position() {
        return zd_open_position;
    }

    public void setZd_open_position(String zd_open_position) {
        this.zd_open_position = zd_open_position;
    }

    public String getZd_close_position() {
        return zd_close_position;
    }

    public void setZd_close_position(String zd_close_position) {
        this.zd_close_position = zd_close_position;
    }

    public String getZd_dimens_x() {
        return zd_dimens_x;
    }

    public void setZd_dimens_x(String zd_dimens_x) {
        this.zd_dimens_x = zd_dimens_x;
    }

    public String getZd_dimens_y() {
        return zd_dimens_y;
    }

    public void setZd_dimens_y(String zd_dimens_y) {
        this.zd_dimens_y = zd_dimens_y;
    }

    public String getZd_pdf_main() {
        return zd_pdf_main;
    }

    public void setZd_pdf_main(String zd_pdf_main) {
        this.zd_pdf_main = zd_pdf_main;
    }

    public String getZd_pdf_uso() {
        return zd_pdf_uso;
    }

    public void setZd_pdf_uso(String zd_pdf_uso) {
        this.zd_pdf_uso = zd_pdf_uso;
    }

    public String getZd_pdf_main_page() {
        return zd_pdf_main_page;
    }

    public void setZd_pdf_main_page(String zd_pdf_main_page) {
        this.zd_pdf_main_page = zd_pdf_main_page;
    }

    public String getZd_pdf_uso_page() {
        return zd_pdf_uso_page;
    }

    public void setZd_pdf_uso_page(String zd_pdf_uso_page) {
        this.zd_pdf_uso_page = zd_pdf_uso_page;
    }

    public String getZd_redundant() {
        return zd_redundant;
    }

    public void setZd_redundant(String zd_redundant) {
        this.zd_redundant = zd_redundant;
    }

    public String getZd_redundant_2() {
        return zd_redundant_2;
    }

    public void setZd_redundant_2(String zd_redundant_2) {
        this.zd_redundant_2 = zd_redundant_2;
    }

    public Post(String zd_name, String zd_location, String zd_blok_number,
                String sa_name, String uso_name, String CI_number, String zd_hod,
                String zd_modbus_speed, String zd_modbus_number, String zd_modbus_setting,
                String zd_max_torque, String zd_torque_for_close,
                String zd_torque_for_start_open, String zd_torque_for_open,
                String zd_torque_for_start_close, String zd_type,
                String zd_time_to_sleep, String zd_discrete_command,
                String zd_open_position, String zd_close_position,
                String zd_dimens_x, String zd_dimens_y, String zd_pdf_main,
                String zd_pdf_uso, String zd_pdf_main_page, String zd_pdf_uso_page,
                String zd_redundant, String zd_redundant_2) {
        this.zd_name = zd_name;
        this.zd_location = zd_location;
        this.zd_blok_number = zd_blok_number;
        this.sa_name = sa_name;
        this.uso_name = uso_name;
        this.CI_number = CI_number;
        this.zd_hod = zd_hod;
        this.zd_modbus_speed = zd_modbus_speed;
        this.zd_modbus_number = zd_modbus_number;
        this.zd_modbus_setting = zd_modbus_setting;
        this.zd_max_torque = zd_max_torque;
        this.zd_torque_for_close = zd_torque_for_close;
        this.zd_torque_for_start_open = zd_torque_for_start_open;
        this.zd_torque_for_open = zd_torque_for_open;
        this.zd_torque_for_start_close = zd_torque_for_start_close;
        this.zd_type = zd_type;
        this.zd_time_to_sleep = zd_time_to_sleep;
        this.zd_discrete_command = zd_discrete_command;
        this.zd_open_position = zd_open_position;
        this.zd_close_position = zd_close_position;
        this.zd_dimens_x = zd_dimens_x;
        this.zd_dimens_y = zd_dimens_y;
        this.zd_pdf_main = zd_pdf_main;
        this.zd_pdf_uso = zd_pdf_uso;
        this.zd_pdf_main_page = zd_pdf_main_page;
        this.zd_pdf_uso_page = zd_pdf_uso_page;
        this.zd_redundant = zd_redundant;
        this.zd_redundant_2 = zd_redundant_2;
    }
}
