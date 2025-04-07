package in.ak.main.service;

import java.util.Set;

import in.ak.main.model.Pet;

public interface PetService extends CrudService<Pet, Long> {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
