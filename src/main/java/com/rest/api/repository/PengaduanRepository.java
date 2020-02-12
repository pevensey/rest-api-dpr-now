package com.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rest.api.model.Pengaduan;

@Repository
public interface PengaduanRepository extends JpaRepository<Pengaduan, Long> {

}