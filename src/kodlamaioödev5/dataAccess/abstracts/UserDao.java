package kodlamaioödev5.dataAccess.abstracts;

import java.util.List;

import kodlamaioödev5.entities.concretes.User;


public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	void login(String email,String password);
	User get(int id);
	List<User> getAll();
	

}
