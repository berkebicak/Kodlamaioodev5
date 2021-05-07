package kodlamaioödev5.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificationServiceManager implements VerificationService {

	@Override
	public boolean isValidName(String name) {
		String namePattern = "(.{2,})";
		Pattern pattern = Pattern.compile(namePattern, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
	}

	@Override
	public boolean isValidPassword(String password) {
		String passwordPatern = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}";
		Pattern pattern = Pattern.compile(passwordPatern, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
		 
		
		
	}

	@Override
	public boolean verification() {
			System.out.println("E mail onaylandý! ");
		return true;
	}

	

}
