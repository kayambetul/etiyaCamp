package userAccount.core.notifications.concretes;

import userAccount.core.notifications.abstracts.NotificationMethod;
import userAccount.entities.concretes.User;

public class EmailNotification implements NotificationMethod{

	@Override
	public void send(User user) {
		System.out.println("Email ile bilgilendirildi");
		
	}

}
