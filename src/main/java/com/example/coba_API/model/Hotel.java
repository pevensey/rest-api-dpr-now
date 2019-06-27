package com.example.coba_API.model;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "hotel")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)

public class Hotel {

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id_hotel;
	
	@NotBlank
	private String id_daerah;
	
	@NotBlank
	private String tempat;
	
	@NotBlank
	private String nama_hotel;
	
	@NotBlank
	private String lokasi;
	
	@NotBlank
	private String harga;
	
	@NotBlank
	private String deskripsi;
	
	@NotBlank
	private String gambar;
	
	@NotBlank
	private String maps;
	
	@Column(nullable = false, updatable = false)
	//@Temporal (TemporalType.TIMESTAMP)
	@CreatedDate
	private java.util.Date createdAt;
	@Column(nullable = false)
	//@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private java.util.Date updatedAt;

	public Long getId_hotel() {
		return id_hotel;
	}
	public Long setId_hotel(Long id_hotel) {
		return this.id_hotel = id_hotel;
	}
	public String getId_daerah() {
		return id_daerah;
	}
	public void setId_daerah(String id_daerah) {
		this.id_daerah = id_daerah;
	}
	public String getTempat() {
		return tempat;
	}
	public void setTempat(String tempat) {
		this.tempat = tempat;
	}
	public String getNama_hotel() {
		return nama_hotel;
	}
	public void setNama_hotel(String nama_hotel) {
		this.nama_hotel = nama_hotel;
	}
	public String getLokasi() {
		return lokasi;
	}
	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}
	public String getHarga() {
		return harga;
	}
	public void setHarga(String harga) {
		this.harga = harga;
	}
	public String getDeskripsi() {
		return deskripsi;
	}
	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}
	public String getGambar() {
		return gambar;
	}
	public void setGambar(String gambar) {
		this.gambar = gambar;
	}
	public String getMaps() {
		return maps;
	}
	public void setMaps(String maps) {
		this.maps = maps;
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
