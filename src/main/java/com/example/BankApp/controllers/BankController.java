package com.example.BankApp.controllers;

import com.example.BankApp.model.Bank;
import com.example.BankApp.service.BankService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banks")
public class BankController {
    private BankService bankService;

    public BankController(BankService bankService){
        super();
        this.bankService = bankService;
    }

    @PostMapping
    public ResponseEntity<Bank> create(@RequestBody Bank bank){
        return new ResponseEntity<Bank>(bankService.save(bank), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Bank> get(){
        return bankService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Bank> get(@PathVariable("id") long id){
        return new ResponseEntity<Bank>(bankService.get(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Bank> update(@PathVariable("id") long id, @RequestBody Bank company, Bank curencyNr, Bank type, Bank headQuarters, Bank lastYearAttendance){
        return new ResponseEntity<Bank>(bankService.update(company, id, curencyNr, type, headQuarters, lastYearAttendance), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
        bankService.delete(id);
        return new ResponseEntity<String>("It has been deleted", HttpStatus.OK);
    }

}
