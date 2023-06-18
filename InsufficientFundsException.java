package Day3;

public class InsufficientFundsException  extends Exception{
	public String message;
	public InsufficientFundsException(){
		this.message = "invalid ammount exception";
	}
	
   public InsufficientFundsException(String message){
	   this. message = message;
   }
   public String getMessage(){
	   return message;
   }
}
