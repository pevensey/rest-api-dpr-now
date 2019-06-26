package com.example.coba_API.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.coba_API.model.Hotel;
import com.example.coba_API.repository.HotelRepository;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	HotelRepository hotelrepo;

	

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
	@GetMapping("/")
	public List<Hotel> getAll(){
	return hotelrepo.findAll();
	}

	@PostMapping("/")
	public Hotel tambahHotel(@Valid @RequestBody Hotel Hotel) {
	return hotelrepo.save(Hotel);
	}

//	@PutMapping("/{id}")
//	public ResponseEntity<Hotel> updateHotel(@PathVariable(value="id")Long id,
//	@Valid @RequestBody Hotel detailHotel){
//	Hotel Hotel = hotelrepo.findOne(id);
//	if(Hotel == null)
//	return ResponseEntity.notFound().build();
//	Hotel.setTitleBook(detailHotel.getTitleBook());
//	Hotel.setNamaDepanPengarang(detailHotel.getNamaDepanPengarang());
//	Hotel.setNamaBelakangPengarang(detailHotel.getNamaBelakangPengarang());
//	Hotel.setNamaPeminjam(detailHotel.getNamaPeminjam());
//	Hotel.setStatusPeminjaman(detailHotel.getStatusPeminjaman());
//	Hotel updatedHotel = hotelrepo.save(Hotel);
//	return ResponseEntity.ok(updatedHotel);
//	}

	@DeleteMapping("/{id}")
	public String deleteHotel(@PathVariable (value="id") Long id){
	Hotel Hotel = hotelrepo.findOne(id);
	String result = "";
	if(Hotel == null) {
	result = "id "+id+" tidak ditemukan";
	return result;
	}
	result = "id "+id+" berhasil di hapus";
	hotelrepo.delete(id);
	return result; 
	}

	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable(value="id") Long id){
	Hotel hotel = hotelrepo.findOne(id);
	if(hotel == null)
	return ResponseEntity.notFound().build();
	return ResponseEntity.ok().body(hotel);
	}

//	@GetMapping("/sortHotel")
//	public List<Hotel> sortHotel(@RequestParam(value="title")String titleBook){
//	return hotelrepo.findByTitleBook(titleBook);
//	}
//
//	@GetMapping("/sortstatus/{statusPeminjaman}")
//	public List<Hotel> sortstatus(@PathVariable(value="statusPeminjaman") int statusPeminjaman){
//	return hotelrepo.findByStatusPeminjaman(statusPeminjaman);
//	}
}
