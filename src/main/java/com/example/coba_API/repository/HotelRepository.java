package com.example.coba_API.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.coba_API.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
//	List<Hotel> findByStatusPeminjaman (int statusPeminjaman);
//	List<Hotel> findByTitleBook(String titleBook);
//	List<Hotel> findAll();
//	//List<Hotel> findAll(String titleBook);
//	@Query("SELECT id_hotel FROM hotel")
//	List<Hotel> findAll();
}