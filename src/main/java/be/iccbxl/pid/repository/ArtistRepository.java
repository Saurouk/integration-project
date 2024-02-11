package be.iccbxl.pid.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import be.iccbxl.pid.models.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long>  {
	List<Artist> findByLastname(String lastname);
	Artist findById(int id);


}
