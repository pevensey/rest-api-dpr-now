package com.example.coba_API.controller;

import com.example.coba_API.model.Akun;
import com.example.coba_API.model.Akun;
import com.example.coba_API.model.Pengaduan;
import com.example.coba_API.repository.AkunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/login")
public class AkunController {
    @Autowired
    AkunRepository akunrepo;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Akun  ";
    }
    @GetMapping("/")
    public List<Akun> getAll(){
        return akunrepo.findAll();
    }
    @PostMapping("/tambahakun")
    public Akun tambahAkun(@Valid @RequestBody Akun akun) {
        return akunrepo.save(akun);
    }


    @PostMapping("/tambah")
    public Akun tambahManual() {

        Akun akun = new Akun();
        akun.setemail("cobacoba.com");
        akun.setPassword("123456");

        return akunrepo.save(akun);
    }
//    @PostMapping("/")
//    public Akun login(@Valid @RequestBody Akun akun) {
//        return akunrepo.save(akun);
//    }


    //    }@PostMapping("/")
//    @ResponseStatus(value = HttpStatus.OK)
//    public  ResponseEntity<Akun>  cobalogin(String nm, String ps) {
//        //return akunrepo.findByemail(nm);
//
//        List<Akun> a = akunrepo.findByemail(nm);
//        if(a==null){
//            System.out.println(ResponseEntity.ok().body(a));
//            return ResponseEntity.notFound().build();
//            //return ResponseEntity.ok().body(nm);
//        }else {
//            //System.out.println(ResponseEntity.notFound());
//            return ResponseEntity.ok().body(a);
//        }
    @PostMapping("/")
//@ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<Akun> login(@Valid @RequestBody Akun akun) {


        String email = akun.getEmail();
        String pass = akun.getPassword();

        String pass_benar = akunrepo.findKataSandi(pass);
        String email_benar = akunrepo.findEmail(email);

        ResponseEntity<Akun> a = null;

        if (email.equals(email_benar)) {
            if (pass.isEmpty())  //pass!=pass_benar
                a = ResponseEntity.notFound().build();

            if (pass.equals(pass_benar))  //pass==pass_benar
                a = ResponseEntity.ok().body(akun);

        }else{
            a=ResponseEntity.badRequest().build();
        }
        System.out.println(email);
        System.out.println(email_benar);
//        System.out.println(pass);
//        System.out.println(pass_benar);
//        System.out.println(a);
//
        return a;
    }
}


