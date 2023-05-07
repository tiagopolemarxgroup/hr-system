package com.microservice.userapi.controller;

import com.microservice.userapi.domain.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserController {
    @GetMapping(value = "/{id}")
    ResponseEntity<Usuario> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<Usuario>> findAll();
}
