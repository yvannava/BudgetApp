package com.yvan.budget_app_v2_backend.Controller;

import com.yvan.budget_app_v2_backend.Entity.Account;
import com.yvan.budget_app_v2_backend.Service.AccountServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/Api/v1")
public class AccountController {

    private AccountServiceImpl accountServiceImpl;

    public AccountController(AccountServiceImpl accountServiceImpl){
        this.accountServiceImpl = accountServiceImpl;
    }
    @GetMapping("/Accounts")
    public ResponseEntity<List<Account>> getAccounts(){
        List<Account>accountsFromDB = accountServiceImpl.findaAllAccounts();
        if(accountsFromDB == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(accountsFromDB, HttpStatus.OK);
        }
    }


    @PostMapping("/Account")
    public ResponseEntity<Account> saveAccount(@RequestBody Account account){
        Account saveAccountToDB = accountServiceImpl.saveAccount(account);
        return new ResponseEntity<>(saveAccountToDB,HttpStatus.CREATED);
    }
}
