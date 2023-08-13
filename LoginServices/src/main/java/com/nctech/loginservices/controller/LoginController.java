package com.nctech.loginservices.controller;

import com.nctech.loginservices.entities.LoginEntity;
import com.nctech.loginservices.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/HairXpertise/login/")
public class LoginController {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @PostMapping("save")
    public ResponseEntity<LoginEntity> createLogin(@RequestBody LoginEntity loginEntity) {
        // Save the login entity to the database
        LoginEntity savedLogin = loginRepository.save(loginEntity);
        return ResponseEntity.ok(savedLogin);
    }
@GetMapping("fetchAll")
    public List<LoginEntity> get(){
        return loginRepository.findAll();
    }
    @GetMapping("{id}")
    public ResponseEntity<LoginEntity> getLoginById(@PathVariable Long id) {
        // Retrieve the login entity by ID from the database
        LoginEntity loginEntity = loginRepository.findById(id).orElse(null);

        if (loginEntity != null) {
            return ResponseEntity.ok(loginEntity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
