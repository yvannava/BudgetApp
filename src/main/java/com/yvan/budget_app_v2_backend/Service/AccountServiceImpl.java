package com.yvan.budget_app_v2_backend.Service;

import com.yvan.budget_app_v2_backend.Entity.Account;
import com.yvan.budget_app_v2_backend.Repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }


    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public Account getAccount(Long id) {
        return null;
    }

    @Override
    public List<Account> findaAllAccounts(Account account) {
        return null;
    }

    @Override
    public List<Account> findAccount(Long id, Account account) {
        return null;
    }

    @Override
    public void deleteAccount(Account account) {

    }
}
