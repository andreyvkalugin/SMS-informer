package ru.plantEquipment.repos;

import org.springframework.data.repository.CrudRepository;
import ru.plantEquipment.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message,Long> {
    List<Message> findByTag(String tag);
}
