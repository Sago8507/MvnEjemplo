package mx.sago.java.customer.dao;

import mx.sago.java.customer.model.Customer;

public interface CustomerDAO {

	public abstract void insert(Customer customer);
	public abstract Customer findByCustomerId(int custId);
	
}
