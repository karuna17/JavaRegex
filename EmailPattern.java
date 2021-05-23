import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email id: ");
		String email = sc.next();
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";	
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			System.out.println("Given email id is valid");
		} else {
			System.out.println("Given email id is not valid");
		}
	}

}

