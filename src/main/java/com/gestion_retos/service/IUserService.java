package com.gestion_retos.service;

import com.gestion_retos.dto.UserDTO;

import java.util.List;

public interface IUserService {
    //getAllUsersByRanking
    List<UserDTO> getAllUsersByRanking();

    //getUserById
    UserDTO getUserById(Long id);

    //createUser
    UserDTO createUser(UserDTO userDto);

    //updateUser
    UserDTO updateUser(Long id, UserDTO userDto);

    //deleteUser
    void deleteUser(Long id);
}
