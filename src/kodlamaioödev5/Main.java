package kodlamaio�dev5;

import kodlamaio�dev5.business.abstracts.UserService;
import kodlamaio�dev5.business.concretes.UserManager;
import kodlamaio�dev5.core.GoogleServiceManager;
import kodlamaio�dev5.core.VerificationServiceManager;
import kodlamaio�dev5.dataAccess.concretes.HibernateUserDao;
import kodlamaio�dev5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Berke");
		user1.setLastName("B��ak");
		user1.setEmail("berke.bicak@hotmail.com");
		user1.setPassword("berke123");
		
		UserService userService = new UserManager(new HibernateUserDao(),new VerificationServiceManager(),new GoogleServiceManager());
		userService.signUp(user1);
		userService.login(user1);
		
		
		

	}

}
