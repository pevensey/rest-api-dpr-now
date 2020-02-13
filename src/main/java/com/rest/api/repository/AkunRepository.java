package com.rest.api.repository;

import com.rest.api.model.Akun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AkunRepository extends JpaRepository<Akun, Long> {

    @Query("SELECT password FROM Akun where password=pass")
    String find_password(String pass);

    @Query("SELECT t.password FROM Akun t where t.password = :password")
    String findKataSandi(@Param("password") String pass);
//    @Query("SELECT username from AKUN where username=username")


//    @Query("SELECT t.email FROM Akun t where t.email = :email")
//    String findEmail(@Param("email") String email);

    Akun findByUsername(String username);
}
