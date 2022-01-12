package com.example.demo;




import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String>{
	//@Query(value = "select * from movie", nativeQuery = true)
	Optional<Movie> findBymovieTitle(String MovieTitle);

	
	
}
 