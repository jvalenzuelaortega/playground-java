package com.example.postgres.repository;

import com.example.postgres.dtos.UserDto;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserJdbcRepository {

    private JdbcTemplate jdbcTemplate;

    public UserJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<UserDto> getUsers(){
        String sql = "select * from users";
        List<UserDto> userDtoList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(UserDto.class));
        return userDtoList;
    }

    public UserDto getUser(Long userId) {
        String sql = "select * from users where user_id = ?";
        UserDto userDto = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(UserDto.class), userId);
        return userDto;
    }

    public UserDto insertUser(UserDto userDto) {
        String sql = "insert into users (fullname, nickname, email, pass) values (?,?,?,?)";
        int resultCode = jdbcTemplate.update(sql, userDto.getFullName(), userDto.getNickName(), userDto.getEmail(), userDto.getPass());

        return resultCode > 0 ? userDto : null;
    }

    public UserDto updateUser(Long userId, UserDto userDto) {
        String sql = "update users set fullname = ? where user_id = ?";
        int resultCode = jdbcTemplate.update(sql, userDto.getFullName(), userId);

        return resultCode > 0 ? userDto : null;
    }

    public Boolean deleteUser(Long id) {
        String sql = "delete from users where user_id = ?";
        int resultCode = jdbcTemplate.update(sql, id);

        return resultCode > 0 ? Boolean.TRUE : Boolean.FALSE;
    }

}
