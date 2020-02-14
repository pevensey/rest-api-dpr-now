package com.rest.api.model;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "pengaduan")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"updatedAt"}, allowGetters = true)

public class Pengaduan {

    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
	private Long id_pengaduan;
    @Column
	private String nama;
    @Column
	private String email;
    @Column
	private String no_telepon;
    @Column
	private String isi_aduan;

	@Column(nullable = false, updatable = false)
	@CreatedDate
	@JsonFormat
	private java.util.Date createdAt;

	@Column(nullable = false)
	@LastModifiedDate
	private java.util.Date updatedAt;

	public Long getid_pengaduan() {
		return id_pengaduan;
	}
	public Long setid_pengaduan(Long id_pengaduan) {
		return this.id_pengaduan = id_pengaduan;
	}
	public String getnama() {
		return nama;
	}
	public void setnama(String nama) {
		this.nama = nama;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getno_telepon() {
		return no_telepon;
	}
	public void setno_telepon(String nama_hotel) {
		this.no_telepon = nama_hotel;
	}
	public String getisi_aduan() {
		return isi_aduan;
	}
	public void setisi_aduan(String isi_aduan) {
		this.isi_aduan = isi_aduan;
	}
	public java.util.Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}
	public java.util.Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(java.util.Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
