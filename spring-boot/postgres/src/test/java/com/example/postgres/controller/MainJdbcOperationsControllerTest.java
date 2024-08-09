package com.example.postgres.controller;

import com.example.postgres.dtos.UserDto;
import com.example.postgres.repository.UserJdbcRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class MainJdbcOperationsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserJdbcRepository userJdbcRepository;

    @Test
    void getUsers() throws Exception {
        // Arrange
        when(userJdbcRepository.getUsers()).thenReturn(new ArrayList<>());

        // Act
        this.mockMvc.perform(get("/get-users"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("anyways")));

        // Assert
        verify(userJdbcRepository).getUsers();
    }

    @Test
    void getUserById() throws Exception {
        // Arrange
        when(userJdbcRepository.getUser(1L)).thenReturn(new UserDto());

        // Act
        this.mockMvc.perform(get("/get-users").param("user_id", "1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("anyways")));

        // Assert
        verify(userJdbcRepository).getUser(1L);
    }

    @Test
    void insertUser() throws Exception {
        // Arrange
        when(userJdbcRepository.insertUser(any())).thenReturn(any());

        // Act
        this.mockMvc.perform(post("/insert-user")
                .content(mockJsonUserDto())
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("anyways")));

        // Assert
        verify(userJdbcRepository).insertUser(any());
    }

    @Test
    void updateUser() throws Exception {
        // Arrange
        when(userJdbcRepository.updateUser(anyLong(), any())).thenReturn(any());

        // Act
        this.mockMvc.perform(post("/update-user").param("user_id", "1")
                .content(mockJsonUserDto())
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("anyways")));

        // Assert
        verify(userJdbcRepository).updateUser(anyLong(), any());
    }

    @Test
    void deleteUserById() throws Exception {
        // Arrange
        when(userJdbcRepository.deleteUser(anyLong())).thenReturn(any());

        // Act
        this.mockMvc.perform(delete("/delete-user").param("user_id", "1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("anyways")));

        // Assert
        verify(userJdbcRepository).deleteUser(anyLong());
    }

    private String mockJsonUserDto() {
        return """
                {
                   "fullName":"test",
                   "nickName":"test",
                   "email":"email@test.com",
                   "pass":"123456"
                }
                """;
    }
}