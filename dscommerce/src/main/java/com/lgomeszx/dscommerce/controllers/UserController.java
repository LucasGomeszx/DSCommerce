package com.lgomeszx.dscommerce.controllers;

import com.lgomeszx.dscommerce.dto.UserDTO;
import com.lgomeszx.dscommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/me")
    public ResponseEntity<UserDTO> findMe() {
        UserDTO dto = service.getMe();
        return ResponseEntity.ok(dto);
    }

}
