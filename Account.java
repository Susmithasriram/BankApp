package Day3;

public class Account {

	private long  accountno;
	private double balance;

	Account (long ac){
		this.accountno = ac;

	}
	Account(long acc, double bal){
		this.accountno = acc;
		this.balance = bal;

	}
	public long getAccountno() {
		return accountno;
	}
	public double getBalance() {
		return balance;
	}

	public String toString() {
		return "Account [accountno=" + accountno + ", balance=" + balance + "]";
	}
   double deposite(double ammount)  throws NegativeAmountException{
	   
	   if(ammount >= 0){
		   balance = balance + ammount;
		    }else{
		    	throw new NegativeAmountException();
		    	}
	   return balance;
   }
  double withdraw(double ammount) throws InsufficientFundsException{
	   if(ammount <= balance){
		  balance = balance - ammount;   
	   }else{
		   throw new InsufficientFundsException();
	   }
	   return balance;
   }

  public double transferTo( Account reciver, double ammount ) throws InsufficientFundsException, NegativeAmountException{
	  this.withdraw(ammount);
	  reciver.deposite(ammount);
	  return balance;
	  
  }
  }
