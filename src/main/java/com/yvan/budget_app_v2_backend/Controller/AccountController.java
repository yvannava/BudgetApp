package com.yvan.budget_app_v2_backend.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api/v1")
public class AccountController {

    @GetMapping("/Account")
    public ResponseEntity<String> getAccount(){
        return new ResponseEntity<>("found", HttpStatus.OK);
    }
}
