package com.matrix.matrix_160_demo.controller;

import com.matrix.matrix_160_demo.dto.LoginReq;
import com.matrix.matrix_160_demo.dto.UserReqDto;
import com.matrix.matrix_160_demo.service.AuthService;
import com.matrix.matrix_160_demo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth")
@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @ResponseBody
    @PostMapping("/sign-in")
    public ResponseEntity<?> login(@RequestBody @Valid LoginReq loginReq)  {
        return authService.login(loginReq);
    }

    @PostMapping("/register")
    public void register(@RequestBody @Valid UserReqDto userReqDto)  {
        authService.register(userReqDto);
    }
}

