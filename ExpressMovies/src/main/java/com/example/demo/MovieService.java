package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository  mRepository;
	@Autowired
	DirectorRepo dir;
	
	public Movie addMovie(Movie c)
	{
		return  mRepository.save(c);
		
	}
	public Director addDirector(Director c)
	{
		return  dir.save(c);
		
	}
	

	public List<Movie> getall() {
		// TODO Auto-generated method stub
		return mRepository.findAll();
	}
	public List<Director> getDir(){
		return dir.findAll();
	}
	
	public Director updateDirector(String fname,Director di) {
		Director upP=(Director) dir.findOneByfirstName(fname);
	upP.setAdress(di.getAdress());
	upP.setAdress(di.getEmail());
	upP.setAdress(di.getFirstName());
	upP.setAdress(di.getLastName());
	return upP;
	
	}
	public Optional<Movie> updateMr(String title,String di) {
		Optional<Movie> um=mRepository.findBymovieTitle(title);
	Movie ne=um.get();
	ne.setDate(di);
	return mRepository.findBymovieTitle(title);
	}
	
	public Optional<Movie> getMovie(String title) {
		
		return mRepository.findBymovieTitle(title);
	}
	public List<Director> getName(String first) {
		
		return dir.findByfirstName(first);
	}
	
	
	public void deleteMovie(String title) {
		Optional<Movie> um=mRepository.findBymovieTitle(title);
		 Movie m=um.get();
		  mRepository.delete(m);
		  
	}

	

}