package emailApp;
import java.util.Scanner;
import java. lang. Math;
public class Email {
	//here we are declaring a variable, but not initializing it. 
	private String firstName;
	private String lastName;
	private String passWord;
	private String email;
	private int passWordLength;
	private String departMent;
	private int mailBoxCapacity;
	String alterNateEmail;
	private String companySuffix = "aeycompany.com";
	
	//Constructor. 
	public Email(String firstName,String lastName) {
		//here we connect the class fields to the constructor parameters. 
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " "+ this.lastName);
		this.departMent = setdepartMent();
		System.out.println("Department: " + this.departMent);
		this.passWord = passWordGen(8);
		System.out.println("Your password is : " + this.passWord);
		//combine elements to generate email. 
		  email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departMent+ companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	//Create a scanner that takes in the department number
	private String setdepartMent() {
		System.out.println("Enter the department number \n 1 for Sales \n 2 for Dev\n Any other number will return empty");
		Scanner in = new Scanner(System.in);
		int departMentChoice = in.nextInt();
		if(departMentChoice == 1) {
			
			return "Sales";
		}else if(departMentChoice == 2) {
			return "Dev";
		}else {
			return "Not Valid Department";
		}
		
		
		
	}
	
	//Create a random password generator. 
	
	private String passWordGen(int passWordLength) {
		
		String str = "shcnkugbciyquuetrgvvnnoaoi123488y6f8csigh";
		String passWOrd = "";
		for(int i = 0; i < passWordLength;i++) {
			double rando1 = Math.random()*i;
			int rando2 = (int) rando1;
 			passWOrd += str.charAt(rando2);
			
		}
		
		return passWOrd;
	}
	
	
	public void setMailbox( int megaBytes) {
		this.mailBoxCapacity = megaBytes;
		
	}
	
	public void setAlternateEmail(String alternative) {
		
		this.alterNateEmail = alternative;
		
	}
	
	public void changePass(String newPass) {
		this.passWord = newPass;
	}
	
	public int getMailBox() {
		return mailBoxCapacity;
	}
	public String getAlternateEmail() {
		return alterNateEmail;
		
	}
	
	public String getPass() {
		return passWord;
	}
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName +
					"\nCompany Email:" + email +
				"\nMailBox Capacity: " + mailBoxCapacity + "mb";
	}
	
}
