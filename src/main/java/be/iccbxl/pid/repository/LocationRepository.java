package be.iccbxl.pid.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import be.iccbxl.pid.models.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {
	Location findByDesignation(String designation);
	Optional<Location> findById(Long id);
}


