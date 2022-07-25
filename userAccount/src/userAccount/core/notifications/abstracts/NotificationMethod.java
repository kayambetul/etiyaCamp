package userAccount.core.notifications.abstracts;

import userAccount.entities.concretes.User;

public interface NotificationMethod {
	void send(User user);

}
