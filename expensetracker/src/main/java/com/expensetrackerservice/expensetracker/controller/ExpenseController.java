package com.expensetrackerservice.expensetracker.controller;


import com.expensetrackerservice.expensetracker.Repo.ExpenseRepo;
import com.expensetrackerservice.expensetracker.domain.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepo expenseRepo;

    @GetMapping
    public List<Expense> welocome(){
        return expenseRepo.findAll();
    }
    @PostMapping
    public Expense createoneexpense(@RequestBody Expense expense1){
        return expenseRepo.save(expense1);
    }

}
