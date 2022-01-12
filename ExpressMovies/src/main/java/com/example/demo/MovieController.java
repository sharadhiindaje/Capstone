package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@Autowired
	MovieService mService;

	@GetMapping("/test")
	String fun() {
		return "hi";
	}
	
	@PostMapping("/addMD")
	public List<Director> fun5(@RequestBody MdDTO md) {
		Movie mo=md.getM();
		Director dd=md.getD();
	mService.addMovie(mo);
	mService.addDirector(dd);
	List<Director> dierc=mService.getDir();
	return dierc;
	}
	
	@GetMapping("/movie/{title}")
	public Optional<Movie> title(@PathVariable String title)
	{
		System.out.println(title);
			return mService.getMovie(title);
	}
	
	@PutMapping("/director/{fname}")
	public List<Director> update(@PathVariable String fname,@RequestBody Director d )
	{
		
			@SuppressWarnings("unchecked")
			List<Director> updateDirector = (List<Director>) mService.updateDirector(fname,d);
			return updateDirector;
	}
	
	@PutMapping("/movieupdate/{title}")
	public String updateMovie(@PathVariable String title,@RequestBody String d )
	{
		
			@SuppressWarnings("unchecked")
			Optional<Movie> updateMr = mService.updateMr(title,d);
			return "updated";
	}
	
	@GetMapping("/dirname/{name}")
	public List<Director> name(@PathVariable String name)
	{
		System.out.println(name);
			return mService.getName(name);
	}
	
	@PostMapping("/add")
	public Movie addMovies(@RequestBody Movie c) {
		return mService.addMovie(c);

	}
	
	@DeleteMapping("movie/{title}")
	public String deleteMovie(@PathVariable String title)
	{
		System.out.println(title);
			mService.deleteMovie(title);
			return "deleted";
	}
	
	@GetMapping("/all")
	public List<Movie> f3()
	{
		return mService.getall();
	}
	

}