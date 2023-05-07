package com.microservice.userapi.controller;

import com.microservice.userapi.domain.Usuario;
import com.microservice.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UsuarioControllerImpl implements UserController{
    private  final UserService service;
    @Override
    public ResponseEntity<Usuario> findById(Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @Override
    public ResponseEntity<List<Usuario>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
