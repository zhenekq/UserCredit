package by.mifort.zhenekns.dev.springtraining.repository;

import by.mifort.zhenekns.dev.springtraining.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
