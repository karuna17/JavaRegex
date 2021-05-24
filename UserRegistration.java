import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean emailTest(String email){
		String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";	
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher m = pattern.matcher(email);
		System.out.println("Is this email valid? "+m.matches());
		return m.matches();
	}

	public boolean passTest(String pass) {
		String passRegex = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";	
		Pattern pattern = Pattern.compile(passRegex);
		Matcher m = pattern.matcher(pass);
		System.out.println("Is this password valid? "+m.matches());
		return m.matches();		
	}
	
	public boolean mobTest(String mobile) {	
		String mobRegex = "(0/91)?[7-9][0-9]{9}";
		Pattern pattern = Pattern.compile(mobRegex);
		Matcher m = pattern.matcher(mobile);
		System.out.println("Is this mobile valid? "+m.matches());
		return m.matches();			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration u = new UserRegistration();
		
		System.out.println("Enter your email");
		String email = sc.next();
		u.emailTest(email);
		
		System.out.println("Enter your password");
		String password = sc.next();
		u.emailTest(password);
		
		System.out.println("Enter your mobile number");
		String mobile = sc.next();
		u.emailTest(mobile);
	}

}
