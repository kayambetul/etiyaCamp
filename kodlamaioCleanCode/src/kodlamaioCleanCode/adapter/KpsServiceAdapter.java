package kodlamaioCleanCode.adapter;

import kodlamaioCleanCode.business.absratcts.PersonService;
import kodlamaioCleanCode.entities.concretes.Person;
import kodlamaioCleanCode.kpsService.KpsService;

public class KpsServiceAdapter implements PersonService{


	@Override
	public boolean checkService(Person person) {
		KpsService kpsService = new KpsService();
		return kpsService.checkPerson(Long.parseLong(person.getIdentityNumber()),person.getFirstName(),person.getLastName(),person.getYearOfBirth());
	}
	
	
	

}
