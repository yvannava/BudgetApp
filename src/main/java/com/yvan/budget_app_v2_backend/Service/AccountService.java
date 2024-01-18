package com.yvan.budget_app_v2_backend.Service;

import com.yvan.budget_app_v2_backend.Entity.Account;

import java.util.List;

public interface AccountService {

    /* TODO:
    Save an account
    Get an account
    find all accounts
    Update an account
    delete an account
    delete all accounts
     */
    void saveAccount(Account account);

    Account getAccount(Long id);

    List<Account> findaAllAccounts(Account account);

    List<Account> findAccount(Long id, Account account);

    void deleteAccount(Account account);
}
