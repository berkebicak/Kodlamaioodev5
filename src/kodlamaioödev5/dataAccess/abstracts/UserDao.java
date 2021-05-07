package kodlamaio�dev5.dataAccess.abstracts;

import java.util.List;

import kodlamaio�dev5.entities.concretes.User;


public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	void login(String email,String password);
	User get(int id);
	List<User> getAll();
	

}
