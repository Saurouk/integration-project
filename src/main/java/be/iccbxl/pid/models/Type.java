package be.iccbxl.pid.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;



@Entity
@Table(name="types")
public class Type {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String type;
	
	@ManyToMany
	@JoinTable(
		  name = "artist_type", 
		  joinColumns = @JoinColumn(name = "type_id"), 
		  inverseJoinColumns = @JoinColumn(name = "artist_id"))
	private List<Artist> artists = new ArrayList<>();
	
	public Type() {
	}

	public Type(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public Type addArtist(Artist artist) {
		if(!this.artists.contains(artist)) {
			this.artists.add(artist);
			artist.addType(this);
		}
		
		return this;
	}
	
	public Type removeType(Artist artist) {
		if(this.artists.contains(artist)) {
			this.artists.remove(artist);
			artist.getTypes().remove(this);
		}
		
		return this;
	}

	@Override
	public String toString() {
		return "Type [id=" + id + ", type=" + type + "]";
	}
	
	
}

