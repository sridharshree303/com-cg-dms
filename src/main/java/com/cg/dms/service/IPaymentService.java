package com.cg.dms.service;

import java.util.List;

import com.cg.dms.entities.Payment;
import com.cg.dms.exception.CustomerNotFoundException;
import com.cg.dms.exception.PaymentNotFoundException;

public interface IPaymentService {
	public Payment insertCompanyToFarmerPayment(Payment payment)throws PaymentNotFoundException;
	public Payment insertDealerToComapnyPayment(Payment payment)throws PaymentNotFoundException;
	public Payment insertCustomerToDelearPayment(Payment payment)throws PaymentNotFoundException;
	
	
	public List<Payment> viewAllpaymentsCustomer(int customerId) throws CustomerNotFoundException;
	public List<Payment> viewAllpaymentsDealer(int delearId) throws CustomerNotFoundException;
	public List<Payment> viewAllpaymentsCompany(int companyId) throws CustomerNotFoundException;
	
	public Payment calculateBillForCustomer(int customerId)throws CustomerNotFoundException;
	public Payment calculateBillForDealer(int dealerId)throws CustomerNotFoundException;
	public Payment calculateBillForCompany(int companyId)throws CustomerNotFoundException;
}