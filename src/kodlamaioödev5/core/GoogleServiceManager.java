package kodlamaio�dev5.core;

import kodlamaio�dev5.google.GoogleManager;

public class GoogleServiceManager implements GoogleService {

	@Override
	public boolean isEmailValid(String email) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.emailIsValid(email);
		return false;
	}

}
