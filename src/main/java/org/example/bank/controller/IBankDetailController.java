package org.example.bank.controller;

import io.swagger.annotations.Api;
import org.example.bank.modal.BankDetailsModal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "bank management")
public interface IBankDetailController {
    @GetMapping(path = "Bank/AllDetails", produces = "application/json")
    default ResponseEntity<BankDetailsModal> getBankDetails() {
       return null;
    }
}
