import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your email id: ");
		String phone = sc.next();
		//Regular expression to accept valid email id
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		//Creating a pattern object
		Pattern pattern = Pattern.compile(regex);
		//Creating a Matcher object
		Matcher matcher = pattern.matcher(phone);
		//Verifying whether given phone number is valid
		if(matcher.matches()) {
			System.out.println("Given email id is valid");
		} else {
			System.out.println("Given email id is not valid");
		}
	}

}

