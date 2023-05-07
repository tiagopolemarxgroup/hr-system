package com.microservice.userapi.impl;

import com.microservice.userapi.domain.Usuario;
import com.microservice.userapi.exceptions.ObjectNotFoundException;
import com.microservice.userapi.repository.UserRepository;
import com.microservice.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public Usuario findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<Usuario> findAll() {
        return userRepository.findAll();
    }
}
