package ECommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ECommerceProject.dataAccess.abstracts.UserDao;
import ECommerceProject.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

		
	public List<User> users= new ArrayList<User>();		//users içinde user'lar tutuluyor.
	
	@Override
	public void add(User user) {
   	this.users.add(user); 
	System.out.println("Kullanıcı database'e eklendi. Kullanıcı: " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		System.out.println("Kullanıcı database'den silindi.Silinen kullanıcı: " + user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		
		return this.users; //users listleniyor
	}

	@Override
	public boolean emailExist(User user) {
		for (User person : users) 
			if (person.getEmail() == user.getEmail()) {		// kullanıcıların maillerini kıyaslıyoruz
				return false;								// aynı mail hata
			}				
		return true;
		
	}

	
		
	}

	
	

	

