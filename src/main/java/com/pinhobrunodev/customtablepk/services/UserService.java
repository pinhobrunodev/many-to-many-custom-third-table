package com.pinhobrunodev.customtablepk.services;

import java.util.List;
import java.util.stream.Collectors;

import com.pinhobrunodev.customtablepk.dtos.User.UserDTO;
import com.pinhobrunodev.customtablepk.mapper.UserMapper;
import com.pinhobrunodev.customtablepk.model.User;
import com.pinhobrunodev.customtablepk.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private UserMapper mapper;

    @Transactional
    public UserDTO insert(UserDTO dto) {
        User entity = mapper.toEntity(dto);
        repository.save(entity);
        return new UserDTO(entity);
    }

    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        return repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
    }
}
