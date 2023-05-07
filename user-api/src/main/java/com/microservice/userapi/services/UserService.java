package com.microservice.userapi.services;

import com.microservice.userapi.domain.Usuario;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Usuario findById(Long id);
    List<Usuario> findAll();
}
