package kodlamaioödev5.google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleManager {
	
	public boolean emailIsValid(String email) {
		String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			System.out.println("Email matches the Google account! :" + email);
			return true;
		}
		else 
		{
			System.out.println("Email doesn't matches the Google account!");
			return false;
		}

	}
}
