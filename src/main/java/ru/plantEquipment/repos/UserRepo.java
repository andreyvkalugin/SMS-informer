package ru.plantEquipment.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.plantEquipment.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
