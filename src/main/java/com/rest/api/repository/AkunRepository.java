package com.rest.api.repository;

import com.rest.api.model.Akun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AkunRepository extends JpaRepository<Akun, Long> {
    Akun findByUsername(String username);
}
