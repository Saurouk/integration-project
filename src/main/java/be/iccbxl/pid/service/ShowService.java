package be.iccbxl.pid.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.iccbxl.pid.models.Location;
import be.iccbxl.pid.models.Show;
import be.iccbxl.pid.repository.ShowRepository;

@Service
public class ShowService {
	@Autowired
	private ShowRepository repository;
	
	
	public List<Show> getAll() {
		List<Show> shows = new ArrayList<>();
		
		repository.findAll().forEach(shows::add);
		
		return shows;
	}
	
	public Show get(String id) {
		int indice = (int) Integer.parseInt(id);
		Optional<Show> show = repository.findById(indice); 
		
		return show.isPresent() ? show.get() : null;
	}

	public void add(Show show) {
		repository.save(show);
	}

	public void update(int id, Show show) {
		repository.save(show);
	}

	public void delete(String id) {
		int indice = (int) Integer.parseInt(id);
		
		repository.deleteById(indice);
	}

	public List<Show> getFromLocation(Location location) {
		return repository.findByLocation(location);
	}
}


