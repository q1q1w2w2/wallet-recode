package com.project.wallet_keeper.repository;

import com.project.wallet_keeper.entity.Expense;
import com.project.wallet_keeper.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByUser(User user);
    List<Expense> findByUserAndExpenseAtBetween(User user, LocalDateTime startDate, LocalDateTime endDate);
}
