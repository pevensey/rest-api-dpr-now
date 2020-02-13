package com.rest.api.controller;

import com.rest.api.model.Akun;
import com.rest.api.repository.AkunRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="/akun" )
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

    public AkunController(AkunRepository akunRepo,
                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.akunRepo = akunRepo;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public ResponseEntity<?>signUp(@RequestBody Akun pengguna) {
        String username = pengguna.getUsername();
        Akun akun = akunRepo.findByUsername(username);
        if (akun!=null) {
            System.out.println("sudah ada akun");
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        } else {
            pengguna.setPassword(bCryptPasswordEncoder.encode(pengguna.getPassword()));
            akunRepo.save(pengguna);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }
}


