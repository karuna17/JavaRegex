import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your email id: ");
		String email = sc.next();
		
		String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";	
		Pattern emailPattern=Pattern.compile(emailRegex);
		Matcher emailMach=emailPattern.matcher(email);
		if(emailMach.matches()) {
			System.out.println("Given email id is valid");
		} else {
			System.out.println("Given email id is not valid");
		}
		
		System.out.println("Enter your password: ");
		String password = sc.next();
		
		String passRegex = "^[a-zA-Z0-9]";	
		Pattern passPattern=Pattern.compile(passRegex);
		Matcher passMach=passPattern.matcher(password);
		if(passMach.matches()) {
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is not valid");
		}
		System.out.println("Enter your mobile number: ");
		String mobile = sc.next();
		String mobRegx="^[0-9]";
		Pattern mobPattern=Pattern.compile(mobRegx);
		Matcher mobMach=mobPattern.matcher(mobile);
		if(mobMach.matches()) {
			System.out.println("Given mobile number is valid");
		} else {
			System.out.println("Given mobile number is not valid");
		}
		
	}

}
