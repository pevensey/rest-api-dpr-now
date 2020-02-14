package com.rest.api.controller;

import com.rest.api.model.Pengaduan;
import com.rest.api.repository.PengaduanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pengaduan")
public class PengaduanController {
	@Autowired
	PengaduanRepository pengaduanrepo;

    @RequestMapping("/hellopengaduan")
    public String hello(){
        return "Hello pengaduan";
    }

	@GetMapping("/")
	public List<Pengaduan> getAll(){
	return pengaduanrepo.findAll();
	}

	@PostMapping("/")
	public Pengaduan tambahAduan(@Valid @RequestBody Pengaduan pengaduan) {
	return pengaduanrepo.save(pengaduan);
	}

	/* objek cariPengaduan akan mencari id di databases dari path id yang di submit.
	* Jika null maka return notfound, jika ada maka ambil nilai detilPengaduan dari
	* @RequestBody yang client submit Kemudian simpan nilai tersebut dengan id yang sama (update) */
	@PutMapping("/{id}")
	public ResponseEntity<Pengaduan> updatePengaduan(@PathVariable(value="id")Long id,
	@Valid @RequestBody Pengaduan detailpengaduan){
	Pengaduan cariPengaduan = pengaduanrepo.findById(id).orElse(null);
	if(cariPengaduan == null)
	return ResponseEntity.notFound().build();
	detailpengaduan.setid_pengaduan(id);
	detailpengaduan.getemail();
	detailpengaduan.getnama();
	detailpengaduan.getisi_aduan();
	detailpengaduan.getno_telepon();
	Pengaduan updatedPengaduan = pengaduanrepo.save(detailpengaduan);
	return ResponseEntity.ok(updatedPengaduan);
	}

	@DeleteMapping("/{id}")
	public String deleteHotel(@PathVariable (value="id") Long id){
	Pengaduan pengaduan = pengaduanrepo.findById(id).orElse(null);
	String result = "";
	if(pengaduan == null) {
	result = "id "+id+" tidak ditemukan";
	return result;
	}
	result = "id "+id+" berhasil di hapus";
	pengaduanrepo.deleteById(id);
	return result;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pengaduan> getHotelById(@PathVariable(value="id") Long id){
	Pengaduan pengaduan = pengaduanrepo.findById(id).orElse(null);
	if(pengaduan == null)
	return ResponseEntity.notFound().build();
	return ResponseEntity.ok().body(pengaduan);
	}

//	@GetMapping("/sortPengaduan")
//	public List<Pengaduan> sortHotel(@RequestParam(value="nama")String nama_hotel){
//	return pengaduanrepo.findByNamaHotel(nama_hotel);
//	}

//	@GetMapping("/sortstatus/{statusPeminjaman}")
//	public List<Pengaduan> sortstatus(@PathVariable(value="statusPeminjaman") int statusPeminjaman){
//	return pengaduanrepo.findByStatusPeminjaman(statusPeminjaman);
//	}
}
