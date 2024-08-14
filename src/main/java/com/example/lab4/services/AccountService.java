package com.example.lab4.services;

import com.example.lab4.dao.AccountRepository;
import com.example.lab4.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    public Account getAccById(Long id){
        return accountRepository.findAccountById(id);
    }
    public List<Account> getAccWOCar(){
        return accountRepository.findAllByCaridIsNull();
    }
}
