package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bill;
import com.example.demo.repository.BillRepository;

@Service
public class BillServiceImpl implements BillService{
	
	@Autowired
	BillRepository billRepository;

	@Override
	public Bill addBill(Bill bill) {
		Bill bill1 = billRepository.save(bill);
		return bill1;
	}

}
