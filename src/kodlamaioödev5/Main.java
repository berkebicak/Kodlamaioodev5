package kodlamaioödev5;

import kodlamaioödev5.business.abstracts.UserService;
import kodlamaioödev5.business.concretes.UserManager;
import kodlamaioödev5.core.GoogleServiceManager;
import kodlamaioödev5.core.VerificationServiceManager;
import kodlamaioödev5.dataAccess.concretes.HibernateUserDao;
import kodlamaioödev5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Berke");
		user1.setLastName("Býçak");
		user1.setEmail("berke.bicak@hotmail.com");
		user1.setPassword("berke123");
		
		UserService userService = new UserManager(new HibernateUserDao(),new VerificationServiceManager(),new GoogleServiceManager());
		userService.signUp(user1);
		userService.login(user1);
		
		
		

	}

}
