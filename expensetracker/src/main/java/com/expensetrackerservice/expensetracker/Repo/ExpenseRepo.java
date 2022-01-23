package com.expensetrackerservice.expensetracker.Repo;

import com.expensetrackerservice.expensetracker.domain.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepo extends MongoRepository<Expense,Long> {
}
