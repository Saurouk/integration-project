package be.iccbxl.pid.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import be.iccbxl.pid.models.Type;

public interface TypeRepository extends CrudRepository<Type, Integer> {
	Type findByType(String type);
	Optional<Type> findById(Long id);
}

