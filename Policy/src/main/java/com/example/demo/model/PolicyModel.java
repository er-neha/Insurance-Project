package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
//This is model class..

@Entity
@DynamicInsert
@DynamicUpdate
public class PolicyModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policy_Id;
	private String policy_type;
	private Date policy_IssueDate;
	private Date policy_ExpiryDate;
	private long policy_Amount;
	private String policy_Benifits;
	private String policy_Description;
	private String policy_PaymentOption;

	public int getPolicy_Id() {
		return policy_Id;
	}

	public void setPolicy_Id(int policy_Id) {
		this.policy_Id = policy_Id;
	}

	public String getPolicy_type() {
		return policy_type;
	}

	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}

	public Date getPolicy_IssueDate() {
		return policy_IssueDate;
	}

	public void setPolicy_IssueDate(Date policy_IssueDate) {
		this.policy_IssueDate = policy_IssueDate;
	}

	public Date getPolicy_ExpiryDate() {
		return policy_ExpiryDate;
	}

	public void setPolicy_ExpiryDate(Date policy_ExpiryDate) {
		this.policy_ExpiryDate = policy_ExpiryDate;
	}

	public long getPolicy_Amount() {
		return policy_Amount;
	}

	public void setPolicy_Amount(long policy_Amount) {
		this.policy_Amount = policy_Amount;
	}

	public String getPolicy_Benifits() {
		return policy_Benifits;
	}

	public void setPolicy_Benifits(String policy_Benifits) {
		this.policy_Benifits = policy_Benifits;
	}

	public String getPolicy_Description() {
		return policy_Description;
	}

	public void setPolicy_Description(String policy_Description) {
		this.policy_Description = policy_Description;
	}

	public String getPolicy_PaymentOption() {
		return policy_PaymentOption;
	}

	public void setPolicy_PaymentOption(String policy_PaymentOption) {
		this.policy_PaymentOption = policy_PaymentOption;
	}

	@Override
	public String toString() {
		return "Model [policy_Id=" + policy_Id + ", policy_type=" + policy_type + ", policy_IssueDate="
				+ policy_IssueDate + ", policy_ExpiryDate=" + policy_ExpiryDate + ", policy_Amount=" + policy_Amount
				+ ", policy_Benifits=" + policy_Benifits + ", policy_Description=" + policy_Description
				+ ", policy_PaymentOption=" + policy_PaymentOption + "]";
	}

}
