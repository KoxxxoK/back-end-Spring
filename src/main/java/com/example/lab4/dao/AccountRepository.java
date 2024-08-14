package com.example.lab4.dao;

import com.example.lab4.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findAccountById(Long id);
    List<Account> findAccountsByCarid(String carid);
    List<Account> findAllByCaridIsNull();
}
