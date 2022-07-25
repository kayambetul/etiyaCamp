package userAccount;

import userAccount.business.abstracts.UserService;
import userAccount.business.concretes.UserManager;
import userAccount.core.notifications.concretes.EmailNotification;

import userAccount.dataAccess.concretes.HibernateUserRepository;
import userAccount.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user=new User(1,"Betul","Kayam","bb@kkk","ldjkdkll","546987123",new EmailNotification());
		
		UserService userService=new UserManager(new HibernateUserRepository());
		userService.register(user);
		userService.forgotPassword(user);

		for (User item : userService.getAll()) {
			System.out.println(item.getFirstName());
			
		}
		
		
	}

}
