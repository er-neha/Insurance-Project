package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billId;
	private int policyId;
	private int driverId;
	private int downpayment;
	private int balance;
	private int totalAmount;
	private Date date;

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public int getDownpayment() {
		return downpayment;
	}

	public void setDownpayment(int downpayment) {
		this.downpayment = downpayment;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Bill(int billId, int policyId, int driverId, int downpayment, int balance, int totalAmount,
			Date date) {
		super();
		this.billId = billId;
		this.policyId = policyId;
		this.driverId = driverId;
		this.downpayment = downpayment;
		this.balance = balance;
		this.totalAmount = totalAmount;
		this.date = new Date();
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", policyId=" + policyId + ", driverId=" + driverId + ", downpayment="
				+ downpayment + ", balance=" + balance + ", totalAmount=" + totalAmount + ", date=" + date + "]";
	}

}
