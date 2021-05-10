package ECommerceProject.core;


import ECommerceProject.GoogleRegister.GoogleManager;

import ECommerceProject.core.abstracts.GoogleService;


public class GoogleManagerAdapter implements GoogleService {	//kendi sistemimizi implement ettik.

	
	@Override
	public void registerToSystem() {
				
		GoogleManager googleManager=new GoogleManager();		//kendi şablonumuza uygun manager'ı çağırdık
		googleManager.register();
			
	}
}
	
	

