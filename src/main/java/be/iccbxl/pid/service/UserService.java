package be.iccbxl.pid.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.iccbxl.pid.models.User;
import be.iccbxl.pid.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		
		repository.findAll().forEach(users::add);
		
		return users;
	}
	
	public User getUser(String id) {
		int indice = Integer.parseInt(id);
		
		return repository.findById(indice);
	}

	public void addUser(User user) {
		repository.save(user);
	}

	public void updateUser(String id, User user) {
		repository.save(user);
	}

	public void deleteUser(String id) {
		int indice = (int) Integer.parseInt(id);
		
		repository.deleteById(indice);
	}
}

