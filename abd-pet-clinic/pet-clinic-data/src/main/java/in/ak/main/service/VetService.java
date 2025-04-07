package in.ak.main.service;

import java.util.Set;

import in.ak.main.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
	
	Vet findbyId(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
