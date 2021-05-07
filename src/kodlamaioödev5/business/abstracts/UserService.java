package kodlamaioödev5.business.abstracts;

import kodlamaioödev5.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void login(User user);
	

}
