package com.yvan.budget_app_v2_backend.Service;

import com.yvan.budget_app_v2_backend.Entity.Account;
import com.yvan.budget_app_v2_backend.Repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }


    @Override
    public Account saveAccount(Account account) {
    Account incomingAccountTosave = accountRepository.save(account);
    return incomingAccountTosave;
    }

    @Override
    public Account getAccount(Long id) {
        return null;
    }

    @Override
    public List<Account> findaAllAccounts() {
        List<Account> accountFromDB = accountRepository.findAll();
        if(accountFromDB.isEmpty()){
            System.out.println("There are currently no accounts");
            return null;
        }else{
           return accountFromDB;
        }
    }

    @Override
    public List<Account> findAccount(Long id, Account account) {
        return null;
    }

    @Override
    public void deleteAccount(Account account) {

    }
}
