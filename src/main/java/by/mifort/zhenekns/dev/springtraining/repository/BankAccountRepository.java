package by.mifort.zhenekns.dev.springtraining.repository;

import by.mifort.zhenekns.dev.springtraining.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
