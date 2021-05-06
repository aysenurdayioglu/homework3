package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		 
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		  try {
	            return client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),
	                    customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),
	                    customer.DateOfBirth.getYear());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return  false;
	
	}

}
