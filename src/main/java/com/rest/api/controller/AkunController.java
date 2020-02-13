package com.rest.api.controller;

import com.rest.api.model.Akun;
import com.rest.api.repository.AkunRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.management.Query;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/akun")
public class AkunController {
    @Autowired
    private AkunRepository akunRepo;
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @RequestMapping("/hello")
    public String hello(){
        return "Hello Akun  ";
    }
    @GetMapping("/")
    public List<Akun> getAll(){
        return akunRepo.findAll();
    }
    @PostMapping("/tambahakun")
    public Akun tambahAkun(@Valid @RequestBody Akun akun) {
        return akunRepo.save(akun);
    }


    @PostMapping("/tambah")
    public Akun tambahManual() {

        Akun akun = new Akun();
        akun.setUsername("cobacoba.com");
        akun.setPassword("123456");

        return akunRepo.save(akun);
    }
    public AkunController(AkunRepository akunRepo,
                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.akunRepo = akunRepo;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody Akun pengguna) {
//        Query query=  session.createQuery("from Account where name=?");
//
//        Account user=(Account)query.setString(0,user.getName()).uniqueResult();
//        if(pengguna.getUsername() == )
        String username = pengguna.getUsername();
        Akun akun = akunRepo.findByUsername(username);
        if (akun!=null) {
            System.out.println("sudah ada akun");
        }else {
            pengguna.setPassword(bCryptPasswordEncoder.encode(pengguna.getPassword()));
            akunRepo.save(pengguna);
        }
    }
//    @PostMapping("/")
//    public Akun login(@Valid @RequestBody Akun akun) {
//        return akunRepo.save(akun);
//    }


    //    }@PostMapping("/")
//    @ResponseStatus(value = HttpStatus.OK)
//    public  ResponseEntity<Akun>  cobalogin(String nm, String ps) {
//        //return akunRepo.findByemail(nm);
//
//        List<Akun> a = akunRepo.findByemail(nm);
//        if(a==null){
//            System.out.println(ResponseEntity.ok().body(a));
//            return ResponseEntity.notFound().build();
//            //return ResponseEntity.ok().body(nm);
//        }else {
//            //System.out.println(ResponseEntity.notFound());
//            return ResponseEntity.ok().body(a);
//        }
//    @PostMapping("/")
////@ResponseStatus(value = HttpStatus.OK)
//    public ResponseEntity<Akun> login(@Valid @RequestBody Akun akun) {
//
//
//        String email = akun.getUsername();
//        String pass = akun.getPassword();
//
//        String pass_benar = akunRepo.findKataSandi(pass);
//        String email_benar = akunRepo.findEmail(email);
//
//        ResponseEntity<Akun> a = null;
//
//        if (email.equals(email_benar)) {
//            if (pass.isEmpty())  //pass!=pass_benar
//                a = ResponseEntity.notFound().build();
//
//            if (pass.equals(pass_benar))  //pass==pass_benar
//                a = ResponseEntity.ok().body(akun);
//
//        }else{
//            a=ResponseEntity.badRequest().build();
//        }
//        System.out.println(email);
//        System.out.println(email_benar);
////        System.out.println(pass);
////        System.out.println(pass_benar);
////        System.out.println(a);
////
//        return a;
//    }


}


