package kodlamaio�dev5.business.concretes;

import kodlamaio�dev5.business.abstracts.UserService;
import kodlamaio�dev5.core.GoogleService;
import kodlamaio�dev5.core.VerificationService;
import kodlamaio�dev5.dataAccess.abstracts.UserDao;
import kodlamaio�dev5.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private VerificationService verificationService;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao,VerificationService verificationService,GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.verificationService=verificationService;
		this.googleService = googleService;
		
		
	}

	@Override
	public void signUp(User user) {
		if(googleService.isEmailValid(user.getEmail())) {
			System.out.println("E mail is invalid :"+user.getEmail());
			return;
			
		}
		else if(!verificationService.isValidPassword(user.getPassword())) {
			System.out.println("Password is invalid : "+user.getPassword());
			return;
			
		}
		else if(!verificationService.isValidName(user.getFirstName())&(!verificationService.isValidName(user.getLastName()))) {
			System.out.println("Name and surname must have at least two char."+user.getFirstName());
			return;
		}
		else {
			System.out.println("Confirmation message has been sent : "+user.getEmail());
			if(verificationService.verification()) {
				this.userDao.add(user);
				System.out.println("Registration Completed ! ");
			}
			else {
				System.out.println("Try again ");
			}
		}
		
		
	}

	@Override
	public void login(User user) {
		if((user.getEmail()==null) & (user.getPassword()==null)){
			System.out.println("email doesn't match with password ");
		}
		else {
			this.userDao.login(user.getEmail(),user.getPassword());
		}
		
	}
	

}
