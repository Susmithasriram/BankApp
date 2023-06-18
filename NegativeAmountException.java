package Day3;

public class NegativeAmountException extends Exception {
	public String message;
	public NegativeAmountException(){
		this.message = "invalid ammount exception";
	}
	
   public NegativeAmountException(String message){
	   this. message = message;
   }
   public String getMessage(){
	   return message;
   }

}
