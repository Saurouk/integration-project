package be.iccbxl.pid.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import be.iccbxl.pid.models.Location;
import be.iccbxl.pid.models.Show;

public interface ShowRepository extends CrudRepository<Show,Integer> {
	Show findBySlug(String slug);
	Show findByTitle(String title);
	List<Show> findByLocation(Location location);
}

