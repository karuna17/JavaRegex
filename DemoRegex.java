import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {

	Scanner sc = new Scanner(System.in);
	
	public void validatePin() {
		System.out.println("Enter your pin code to check");
		String pin = sc.next();
		
		String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		Pattern pinPattern = Pattern.compile(regex);
		Matcher pinMach = pinPattern.matcher(pin);
		
		if(pinMach.matches()) {
			System.out.println("Given pin is valid");
		}else {
			System.out.println("Given pin is invalid");
		}		
	}
	
	public static void main(String[] args) {
      DemoRegex d = new DemoRegex();
      d.validatePin();
	}
}
