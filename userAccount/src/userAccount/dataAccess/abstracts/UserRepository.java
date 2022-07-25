package userAccount.dataAccess.abstracts;

import java.util.List;

import userAccount.entities.concretes.User;

public interface UserRepository {
	void register(User user);
	void forgotPassword(User user);
	User getById(int id);
	List<User> getAll();

}
