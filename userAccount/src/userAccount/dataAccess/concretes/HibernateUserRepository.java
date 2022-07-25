package userAccount.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import userAccount.dataAccess.abstracts.UserRepository;
import userAccount.entities.concretes.User;

public class HibernateUserRepository implements UserRepository{

	List<User> users=new ArrayList<User>();
	
	@Override
	public void register(User user) {
		users.add(user);
		
	}

	@Override
	public void forgotPassword(User user) {
		
		
	}

	@Override
	public User getById(int id) {
		User item=null;
		for (User user : users) {
			if(user.getId()==id) {
				item=user;
				
			}
		}
		return item;
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	
	

}
