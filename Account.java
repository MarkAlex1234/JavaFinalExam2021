
/**
 *
 * QUESTION 1
 *
 * Mark Alexander
 *
 * 20112145
 *
 * COMP503
 *
 * */

public class Account
{

	private String username,password;
	private int numOfTimesLoggedIn = 0;

  public Account(String username)
  {
	  this.username = username;
	  this.password = "";
	  this.numOfTimesLoggedIn = 1;
  }

  public void changePassword(String current, String update)
  {
	  if(current.equals(this.password) == true) {
		  if(update.equals("") == true){
			//Do nothing  
		  }
		  else {
			  this.password = update; //Else Update Password  
		  }
	  }
	  else {
		  //Do nothing
	  }
  }

 




}
