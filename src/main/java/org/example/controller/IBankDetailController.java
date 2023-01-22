package org.example.controller;

import io.swagger.annotations.Api;
import org.example.modal.BankDetailsModal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "bank management")
public interface IBankDetailController {
    @RequestMapping(method = {RequestMethod.GET},value = "Bank/AllDetails",produces = "application/json")
    ResponseEntity<BankDetailsModal> getBankDetails() throws Exception;
}
