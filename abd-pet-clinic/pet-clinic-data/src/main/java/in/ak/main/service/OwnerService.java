package in.ak.main.service;

import java.util.Set;

import in.ak.main.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);

}
