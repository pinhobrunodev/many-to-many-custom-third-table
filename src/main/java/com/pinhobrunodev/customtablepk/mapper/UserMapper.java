package com.pinhobrunodev.customtablepk.mapper;

import com.pinhobrunodev.customtablepk.dtos.User.UserDTO;
import com.pinhobrunodev.customtablepk.model.User;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserDTO dto) {
        User entity = new User();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setPhone(dto.getPhone());
        return entity;
    }
}
