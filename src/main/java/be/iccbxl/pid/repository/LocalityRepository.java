package be.iccbxl.pid.repository;

import org.springframework.data.repository.CrudRepository;

import be.iccbxl.pid.models.Locality;

public interface LocalityRepository extends CrudRepository<Locality, Integer> {
	Locality findByPostalCode(String postalCode);
	Locality findByLocality(String locality);
}
