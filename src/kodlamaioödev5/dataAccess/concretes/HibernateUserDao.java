package kodlamaio�dev5.dataAccess.concretes;

import java.util.List;

import kodlamaio�dev5.dataAccess.abstracts.UserDao;
import kodlamaio�dev5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Added :"+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
	
		
	}

	@Override
	public void update(User user) {
	
		
	}

	@Override
	public User get(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

	@Override
	public void login(String email, String password) {
		
		
	}



}
