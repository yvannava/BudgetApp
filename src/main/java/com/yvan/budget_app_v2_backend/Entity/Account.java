package com.yvan.budget_app_v2_backend.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "balance", nullable = false)
    private double balance;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    public Account(String accountName, double balance, Date date){
        this.accountName = accountName;
        this.balance = balance;
        this.date = date;
    }
    public Account(){
    };

}
