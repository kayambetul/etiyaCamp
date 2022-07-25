package userAccount.business.abstracts;

import java.util.List;

import userAccount.entities.concretes.User;

public interface UserService {
	void register(User user);
	void forgotPassword(User user);
	List<User> getAll();

}
