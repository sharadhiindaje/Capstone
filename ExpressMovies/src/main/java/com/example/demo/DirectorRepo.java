package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface DirectorRepo extends JpaRepository<Director, String>{
	//@Query("select e from director e where e.firstName = :firstName and e.lastName = :lastName")
    List<Director> findByfirstName(String FirstName);
    
    @Transactional
	   @Modifying(clearAutomatically=true, flushAutomatically=true)
	   @Query(value = "update Movie set date = ? " + " where firstName = ?", nativeQuery = true)
	   void dateUpdate(String date,String fname);

	List<Director> findOneByfirstName(String fname);
}