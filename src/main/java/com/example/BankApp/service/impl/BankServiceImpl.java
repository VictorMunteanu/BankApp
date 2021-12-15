package com.example.BankApp.service.impl;

import com.example.BankApp.exception.ResourceNotFoundException;
import com.example.BankApp.model.Bank;
import com.example.BankApp.repository.BankRepository;
import com.example.BankApp.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {
    BankRepository bankRepository;

    public BankServiceImpl(BankRepository bankRepository){
        super();
        this.bankRepository = bankRepository;
    }

    @Override
    public Bank save(Bank bank) {
        return bankRepository.save(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }

    @Override
    public Bank get(long id) {
        return bankRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("Bank", "id", id));
    }

    @Override
    public Bank update(Bank company, long id, Bank curencyNr, Bank type, Bank headQuarters, Bank lastYearAttendance) {
        Bank existingBank = bankRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Bank", "id", id));
        existingBank.setCompany(company.getCompany());
        existingBank.setId(company.getId());
        existingBank.setCurencyNr(company.getCurencyNr());
        existingBank.setType(company.getType());
        existingBank.setHeadQuarters(company.getHeadQuarters());
        existingBank.setLastYearAttendance(company.getLastYearAttendance());
        bankRepository.save(existingBank);
        return null;
    }

    @Override
    public void delete(long id) {
        bankRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Bank", "id", id));
        bankRepository.deleteById(id);
    }

}