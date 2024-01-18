package com.yvan.budget_app_v2_backend.Repository;

import com.yvan.budget_app_v2_backend.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long>{
}
