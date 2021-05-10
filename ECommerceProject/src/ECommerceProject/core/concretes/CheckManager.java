package ECommerceProject.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import ECommerceProject.core.abstracts.CheckService;

public class CheckManager implements CheckService {
	
	public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"; 
	
	@Override
	public boolean checkPassword(String password) {  
		
		if(password.length()<6) {
			System.out.println("Şifre en az 6 karakterden oluşmalıdır");
			return false;
		}
		return true;
	}
	
	@Override
	public boolean checkEmail(String email) {	
		
		
		Pattern pattern=Pattern.compile(regex);				// regex teki karakterleri patternde tuttuk
		Matcher matcher = pattern.matcher(email);			// emaili pattern ile kıyasladık
		if(!matcher.matches()) {							// eğer eşleşmezse
			System.out.println("Email Regex formatında olmalıdır.");
			return false;
		}
		return true;
		}
		
	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()<2) {
			System.out.println("İsminiz en az 2 karakterden oluşmalıdır.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()<2) {
			System.out.println("Soyadınız en az 2 karakterden oluşmalıdır.");
			return false;
		}
		return true;
	}
	
}
