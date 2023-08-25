package com.star.humanResourcesProject.webApi;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.star.humanResourcesProject.business.abstracts.PersonelService;
import com.star.humanResourcesProject.business.requests.CreatePersonelRequest;
import com.star.humanResourcesProject.business.requests.UpdatePersonelRequest;
import com.star.humanResourcesProject.business.responses.GetAllPersonelResponse;
import com.star.humanResourcesProject.entities.concretes.Personel;

@RestController
@RequestMapping("api/personel")
public class PersonelController {

	private PersonelService personelService;

	@Autowired
	public PersonelController(PersonelService personelService) {
		super();
		this.personelService = personelService;
	}
	
	@GetMapping()
	public List<GetAllPersonelResponse> getAll(){
		return personelService.getAll();
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreatePersonelRequest createPersonelRequest) {
		personelService.add(createPersonelRequest);
	}
	
	@DeleteMapping("/{registryNumber}")
	public void delete(@PathVariable int registryNumber) {
		this.personelService.delete(registryNumber);
	}
	
	@PutMapping
	public void update(@RequestBody UpdatePersonelRequest updatePersonelRequest) {
		this.personelService.update(updatePersonelRequest);
	}
	
	@GetMapping("/getByFirstNameOrLastNameContains")
	public List<Personel> getByFirstNameOrLastNameContains(@RequestParam String firstName, @RequestParam String lastName){
		return this.personelService.getByFirstNameOrLastNameContains(firstName, lastName);
	}
	
	@GetMapping("/getByTckn")
	public List<Personel> getByTckn(String tckn) {
		return this.personelService.getByTckn(tckn);
	}
	
	@PostMapping("/add2")
	public void add2(Personel personel) {
		this.personelService.add2(personel);
	}
	
	
	
}
