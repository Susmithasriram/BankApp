package Day3;

import java.util.Scanner;

import Day2.Customer;

public class BankApp {


	public static void main(String[] args) throws InvalidAccountException  {
		int num = 2022;
		Bank myBank = new Bank();

		int n =0;
     		Account myAccount = new Account(20200022, 6000);
		do{
			System.out.println("show bank menu");

			System.out.println("Welcome to our bank ");

			System.out.println("choose any ");

			System.out.println("1. Add a Customer");

			System.out.println(" 2. dispay all customer");
			System.out.println("3.Deposit");
			System.out.println("4. withdraw ");
			System.out.println("5 . transfer ");
			System.out.println("6 . exit ");
			Scanner scan = new Scanner(System.in);
			n = scan.nextInt();
			//System.out.println("you chose = " + n);

			if(n == 1){
				//			Customer myCustomer3 = new Customer(0, "kavya" , "kurma","FSD-36");
				//			myBank.addCustomer(myCustomer3);
				//			System.out.println(" added");
				Scanner scan1 = new Scanner(System.in);
				System.out.println("enter the First name");
				String fname = scan1.next();
				Scanner scan2 = new Scanner(System.in);
				System.out.println("enter the last name");
				String lname = scan2.next();
				Scanner scan3 =  new Scanner(System.in);
				System.out.println("enter the address");
				String address = scan2.next();
				Customer myCustomer3 = new Customer( n, fname, lname, address, myAccount);
				myBank.addCustomer(myCustomer3);
				System.out.println(" added");
				// int n1 = scan1.nextInt();


			}
			if(n==2){
				Customer[] tempCusts = myBank.getCustomers();
				int N = Bank.getCount();
				if(N == 0)
					System.out.println("no customers");
				for(int j = 0; j < N; j++) {
					System.out.println(tempCusts[j]);

				}
			}
			if(n==3){
				Scanner scan4 = new Scanner(System.in);
				System.out.println("Enter the customer Id");
				long customerId = scan.nextLong();
				//Customer temp= myBank.getCustomerByID(customerId);
				Scanner scan5 =  new Scanner(System.in);
				System.out.println("Enter the ammount");
				double ammount = scan.nextDouble();
				Customer temp= myBank.getCustomerByID(customerId);
				if(temp != null){
					try{
					double newBalance=  temp.getAccount().deposite(ammount);
					System.out.println("ammount is add");
					System.out.println(" you total ammount = " +newBalance);
					}catch(NegativeAmountException new2){
						new2.printStackTrace();
					}
				}else{
					throw new InvalidAccountException();
				}
			
				
			}if(n==4){
				Scanner scan4 = new Scanner(System.in);
				System.out.println("Enter the customer Id");
				long customerId = scan.nextLong();
				//Customer temp= myBank.getCustomerByID(customerId);
				Scanner scan5 =  new Scanner(System.in);
				System.out.println("Enter the ammount");
				double ammount = scan.nextDouble();
				Customer temp= myBank.getCustomerByID(customerId);
				if(temp != null){
					try{
					double newBalance =temp.getAccount().withdraw(ammount);
					System.out.println("ammount is withraw");
					System.out.println(" you total ammount = " +newBalance);
					}catch(InsufficientFundsException new2){
						new2.printStackTrace();
					}
				}else{
					throw new InvalidAccountException();
				}
				}
			if(n == 5) {
		    	 Scanner scan2 = new Scanner(System.in);
		    	 System.out.println("Enter customer ID : " );
		    	 long customerId1 = scan2.nextLong();
		    	 System.out.println("Enter customer ID : ");
	             long customerId2 = scan2.nextLong();
	             System.out.println("Enter the withdraw amount : ");
	             double amount = scan2.nextDouble();
	             Customer senderCustomer = myBank.getCustomerByID(customerId1);
	             Customer recieverCustomer = myBank.getCustomerByID(customerId2);
	             if(senderCustomer != null && recieverCustomer != null) {
	            	 try{
	            		 double newBalance = senderCustomer.getAccount().transferTo(recieverCustomer.getAccount(), amount);
	                	 System.out.println("Transfer Successful.");
	                	 System.out.println("Your new balance : " + newBalance);
	            	 } catch(InsufficientFundsException ex) {
	            		 ex.printStackTrace();
	            	 } catch(NegativeAmountException ex) {
	            		 ex.printStackTrace();
	            	 }
	            		 
	             } else {
	            	 throw new InvalidAccountException();
	             }
		     }

			

			if(n==6){
				System.exit(0);
			}

		}while(n > 0 && n <= 3);


	}
}







