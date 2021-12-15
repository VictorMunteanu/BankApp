package com.example.BankApp.repository;

import com.example.BankApp.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}