package com.example.coba_API.repository;

import com.example.coba_API.model.Akun;
import com.example.coba_API.model.Pengaduan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AkunRepository extends JpaRepository<Akun, Long> {

    @Query("SELECT password FROM Akun where password=pass")
    String find_password(String pass);

    @Query("SELECT t.password FROM Akun t where t.password = :password")
    String findKataSandi(@Param("password") String pass);

    @Query("SELECT t.email FROM Akun t where t.email = :email")
    String findEmail(@Param("email") String email);
}
