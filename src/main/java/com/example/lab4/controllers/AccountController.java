package com.example.lab4.controllers;

import com.example.lab4.dao.AccountRepository;
import com.example.lab4.models.Account;
import com.example.lab4.models.Car;
import com.example.lab4.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/account")
@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    private AccountService accountService;
    @GetMapping("/{id}")
    public Account getById(@PathVariable("id") Long id){
        return accountService.getAccById(id);
    }
    @GetMapping("/")
    public List<Account> getAccWOCar(){
        return accountService.getAccWOCar();
    }
    @PutMapping("/{id}")
    public Account update(@RequestBody Account account, @PathVariable("id") Long id){
        account.setCarid(account.getCarid());
        return accountRepository.save(account);
    }
}
