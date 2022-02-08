package by.mifort.zhenekns.dev.springtraining.repository;

import by.mifort.zhenekns.dev.springtraining.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
