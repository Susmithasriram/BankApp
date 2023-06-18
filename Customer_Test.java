package Day3;

import Day2.Customer;

public class Customer_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer newcustomer = new Customer(1001, "Susmitha", "Sriram", "kamalapur, warangal");
		//     System.out.println("id       =" + newcustomer.customerId); if we use the public it will work.
		
		//       System.out.println("1st name = " + newcustomer.firstname);
		//        System.out.println("lastname =" +newcustomer.lastname);
		//        System.out.println("Address  = " +newcustomer.address);
			//System.out.println("Hii  "+ newcustomer.getFirstName()+"! " +"your Id  " +newcustomer.getCustomerId() + ".");
            System.out.println(Customer.getCount());
//		System.out.println("details = "+ newcustomer.toString()); //toString
//		System.out.println(newcustomer.getCustomerId()); //getter method
//		System.out.println(newcustomer.getFirstName());
//		System.out.println(newcustomer.getLastname());
//		System.out.println(newcustomer.getAddress());
//		Customer onecustomer = new Customer();   //null constructor
//		System.out.println(onecustomer.getCustomerId());
//		System.out.println(onecustomer.getFirstName());
//		System.out.println(onecustomer.getLastname());
//		System.out.println(onecustomer.getAddress());
//		System.out.println(newcustomer.getFirstName());
//
//		newcustomer.setFirstname("name");            //setter method
//		System.out.println(newcustomer.getFirstName());
//		newcustomer.setLastname("name2");
//		//newcustomer.firstname = "lucy";
//		// System.out.println(newcustomer.firstname);
//		System.out.println(newcustomer.getLastname());
		

	}

}