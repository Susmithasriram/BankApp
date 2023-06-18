package Day3;

public class InvalidAccountException extends Exception {
	public String message;
	public InvalidAccountException(){
		this.message = "invalid ammount exception";
	}
	
   public InvalidAccountException(String message){
	   this. message = message;
   }
   public String getMessage(){
	   return message;
   }

}
