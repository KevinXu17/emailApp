package emailapp;

public class EmailApp {

	  public void getInfo(Email e) {
		   System.out.println("The user is: " + e.getFirstName() + " " + e.getLastName());
		   System.out.println("The email is: " + e.getEmail());
		   System.out.println("The mailbox capacity is: " + e.getMailboxCapacity());
		   System.out.println("The alternate email is: " + e.getAlternateEmail());

	   }

	
	
	public static void main(String[] args) {
		Email em1 = new Email("Kevin","Xu");
		
		em1.changePassWord();
		
		em1.getPassword();
		
		
	}
}
