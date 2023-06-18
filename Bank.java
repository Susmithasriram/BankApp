package Day3;

import Day2.Customer;

public class Bank {
//	String name;
//	Customer[] arr = new Customer[10];
int customerName;
	
	Customer[] customers = new Customer[10];
	public static int count;
	
	public void addCustomer(Customer newCustomer) {
		customers[count++] = newCustomer;
	}
	public Customer getCustomer() {
		return customers[count-1];
	}
	public static int getCount() {
		return count;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public Customer getCustomerByID(long ID){
		for(int i = 0; i < getCount(); i++){
		if(ID ==  customers[i].getCustomerId()){
			return customers[i];
		}
	}
		return null;
	
	}
 	
}

