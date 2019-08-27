package com.example.coba_API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.coba_API.model.Pengaduan;

import java.util.List;

@Repository
public interface PengaduanRepository extends JpaRepository<Pengaduan, Long> {

    //List<Pengaduan> findByStatusPeminjaman (int statusPeminjaman);
    //List<Pengaduan> findBynamaHotel(String nama_hotel);
    //List<Pengaduan> findByNamaHotel(String nama_hotel);
    //List<Pengaduan> findByName(String nama_hotel);
    //List<Pengaduan> findAll();
    //List<Pengaduan> findAll(String titleBook);
    //	@Query("SELECT id_hotel FROM hotel")
    //	List<Pengaduan> findAll();
}