 


package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email em1 = new Email("Jhon" , "Doe");
 		em1.setMailbox(500);
 		em1.setAlternateEmail("andarkazanli@gmail.com");
 		System.out.println(em1.getAlternateEmail());
 		System.out.println(em1.showInfo());
	}

}
