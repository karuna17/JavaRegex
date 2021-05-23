import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {

	public void validatePin(String pin, Pattern pinPattern) {		
		Matcher pinMach = pinPattern.matcher(pin);

		if(pinMach.matches()) {
			System.out.println("Given pin is valid");
		}else {
			System.out.println("Given pin is invalid");
		}		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DemoRegex d = new DemoRegex();
		
		System.out.println("Enter your pin code to check");
		String pin = sc.next();
		String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		Pattern pinPattern = Pattern.compile(regex);
		d.validatePin(pin, pinPattern);
		
		System.out.println("Enter your pin code to restrict alphabet");
		String pin1 = sc.next();
		String regex1=",.^'[a-zA-Z]'^[1-9]{1}[0-9]{2}\\\\s{0,1}[0-9]{3}$";
		Pattern pinPattern1 = Pattern.compile(regex1);
		d.validatePin(pin1, pinPattern1);
	}
}
