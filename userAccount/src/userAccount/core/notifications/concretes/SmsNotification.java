package userAccount.core.notifications.concretes;

import userAccount.core.notifications.abstracts.NotificationMethod;
import userAccount.entities.concretes.User;

public class SmsNotification implements NotificationMethod{

	@Override
	public void send(User user) {
		System.out.println("Sms ile bilgilendirildi");
		
	}

}
