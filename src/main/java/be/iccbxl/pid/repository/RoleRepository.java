package be.iccbxl.pid.repository;

import org.springframework.data.repository.CrudRepository;

import be.iccbxl.pid.models.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	Role findByRole(String role);
}

