package be.iccbxl.pid.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import be.iccbxl.pid.models.Location;
import be.iccbxl.pid.models.Representation;
import be.iccbxl.pid.models.Show;

public interface RepresentationRepository extends CrudRepository<Representation, Integer> {
	List<Representation> findByShow(Show show);
	List<Representation> findByLocation(Location location);
	List<Representation> findByWhen(LocalDateTime when);
}


