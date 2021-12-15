package com.example.BankApp.service;

import com.example.BankApp.model.Bank;
import java.util.List;

public interface BankService {

    Bank save(Bank bank);
    List<Bank> getAll();
    Bank get(long id);
    Bank update(Bank company, long id, Bank curencyNr, Bank type, Bank headQuarters, Bank lastYearAttendance);
    void delete(long id);
}