package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bill;
import com.example.demo.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	BillService billService;
	
	@PostMapping("/addbill")
	public Bill addBill(@RequestBody Bill bill) {
		Bill bill2 = billService.addBill(bill);
		return bill2;
	}

}
