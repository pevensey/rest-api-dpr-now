package com.example.coba_API.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "akun")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Akun {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private Long id_akun;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private boolean error;
//    public Long getId_akun() {
//        return id_akun;
//    }

    public void setId_akun(Long id_akun) {
        this.id_akun = id_akun;
    }

    public String getEmail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
