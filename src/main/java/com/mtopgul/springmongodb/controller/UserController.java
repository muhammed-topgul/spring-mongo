package com.mtopgul.springmongodb.controller;

import com.mtopgul.springmongodb.model.UserModel;
import com.mtopgul.springmongodb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 09:55
 */
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @PostMapping
    public ResponseEntity<UserModel> save(@RequestBody UserModel userModel) {
        return ResponseEntity.ok(userRepository.save(userModel));
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> findAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
