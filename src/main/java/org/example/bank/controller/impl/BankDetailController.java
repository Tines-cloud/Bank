package org.example.bank.controller.impl;

import io.swagger.annotations.Api;
import org.example.bank.controller.IBankDetailController;
import org.example.bank.modal.BankDetailsModal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "bank management")
public class BankDetailController implements IBankDetailController {

    @Override
    public ResponseEntity<BankDetailsModal> getBankDetails() throws Exception {
        ResponseEntity<BankDetailsModal> response=null;
        return response;
    }
}
