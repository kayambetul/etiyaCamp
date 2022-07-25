package userAccount.business.concretes;

import java.util.List;

import userAccount.business.abstracts.UserService;

import userAccount.dataAccess.abstracts.UserRepository;
import userAccount.entities.concretes.User;

public class UserManager implements UserService{

	private UserRepository userRepository;
	//NotificationMethod notificationMethod;
	
	public UserManager(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}

	@Override
	public void register(User user) {
		userRepository.register(user);
		user.getNotificationMethod().send(user);
		
		
	}

	@Override
	public void forgotPassword(User user) {
		user.getNotificationMethod().send(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return this.userRepository.getAll();
	}

	

}
