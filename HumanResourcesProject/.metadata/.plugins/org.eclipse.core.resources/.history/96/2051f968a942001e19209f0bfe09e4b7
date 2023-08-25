package com.star.humanResourcesProject.business.abstracts;

import java.util.List;

import com.star.humanResourcesProject.business.requests.CreatePersonelRequest;
import com.star.humanResourcesProject.business.requests.UpdatePersonelRequest;
import com.star.humanResourcesProject.business.responses.GetAllPersonelResponse;
import com.star.humanResourcesProject.entities.concretes.Personel;

public interface PersonelService {

	List<GetAllPersonelResponse> getAll();
	
	void add(CreatePersonelRequest createPersonelRequest);
	
	void update(UpdatePersonelRequest updatePersonelRequest);
	
	void delete(int registryNumber);
	
	List<Personel> getByFirstNameOrLastNameContains(String firstName, String lastName);
	
	List<Personel> getByTckn(String tckn);
	
	void add2(Personel personel);
}
