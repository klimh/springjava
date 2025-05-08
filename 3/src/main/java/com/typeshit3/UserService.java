package com.typeshit3;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<Users> findAll() {
        return List.of(
                new Users("Adam"),
                new Users("Marcin"),
                new Users("Marek"),
                new Users("John")
        );
    }
}
