package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/account")
    public Map<String, Object> getAccountDetails() {
        return Map.of(
            "number", "00987987973432",
            "type", "savings",
            "balance", 234343
        );
    }
}
