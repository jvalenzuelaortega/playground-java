package com.example.postgres.controller;

import com.example.postgres.dtos.UserDto;
import com.example.postgres.repository.UserJdbcRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainJdbcOperationsController {

    private final UserJdbcRepository userJdbcRepository;

    public MainJdbcOperationsController(UserJdbcRepository userJdbcRepository) {
        this.userJdbcRepository = userJdbcRepository;
    }

    @GetMapping("/get-users")
    public ResponseEntity<List<UserDto>> getUsers() {
        List<UserDto> listUsers = userJdbcRepository.getUsers();
        return new ResponseEntity<>(listUsers, HttpStatus.OK);
    }

    @GetMapping("/get-user-by-id")
    public ResponseEntity<UserDto> getUserById(@RequestParam("user_id") Long userId) {
        UserDto user = userJdbcRepository.getUser(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/insert-user")
    public ResponseEntity<UserDto> insertUser(@RequestBody UserDto userDto) {
        UserDto user = userJdbcRepository.insertUser(userDto);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/update-user/{user_id}")
    public ResponseEntity<UserDto> updateUser(
            @PathVariable("user_id") Long userId,
            @RequestBody UserDto userDto) {
        UserDto user = userJdbcRepository.updateUser(userId, userDto);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/delete-user-by-id")
    public ResponseEntity<Boolean> deleteUserById(@RequestParam("user_id") Long id) {
        Boolean deleteUser = userJdbcRepository.deleteUser(id);
        return new ResponseEntity<>(deleteUser, HttpStatus.OK);
    }

}
