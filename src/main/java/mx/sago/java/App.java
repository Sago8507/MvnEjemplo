package mx.sago.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.sago.java.customer.dao.CustomerDAO;
import mx.sago.java.customer.model.Customer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	    	 
	        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
	        Customer customer = new Customer(3, "santiago",6);
	        customerDAO.insert(customer);
	    	
	        Customer customer1 = customerDAO.findByCustomerId(3);
	        System.out.println(customer1);
	}
}
