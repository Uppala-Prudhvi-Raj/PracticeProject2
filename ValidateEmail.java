package simplilearn.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
public static void main(String[] args) {
	String email = "RajB8yahoo@com";
	String email1 = "Raj@_gmail.com";
	String email2 = "Raj@b6gmail.com";
	String email3 = "Rajb7@gmail.com";
	String email4 = "Raj@gmail1.com";
	String email5 = "R_a_j@gmail.com";
	String email6 = "Raj@gmail_.com";

	System.out.println(valEmail(email));
	System.out.println(valEmail(email1));
        System.out.println(valEmail(email2));
        System.out.println(valEmail(email3));
        System.out.println(valEmail(email4));
        System.out.println(valEmail(email5));
        System.out.println(valEmail(email6));
}

public static boolean valEmail(String input) {
	String  emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
	Pattern emailPat=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
	Matcher matcher=emailPat.matcher(input);
	return matcher.find();
	
}
}