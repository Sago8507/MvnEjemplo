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
	    	 
	        
		int id = 4;
		String name = "Isaac";
		int age = 6;
		
		
		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
	        Customer customer = new Customer(id, name, age);
	        customerDAO.insert(customer);
	    	
	        Customer customer1 = customerDAO.findByCustomerId(id);
	        System.out.println(customer1);
	}
}
