package com.matrix.matrix_160_demo.service;

import com.matrix.matrix_160_demo.dto.LoginReq;
import com.matrix.matrix_160_demo.dto.LoginResponse;
import com.matrix.matrix_160_demo.dto.UserReqDto;
import com.matrix.matrix_160_demo.entity.User;
import com.matrix.matrix_160_demo.enums.Role;
import com.matrix.matrix_160_demo.repositories.UserRepository;
import com.matrix.matrix_160_demo.service.impl.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;


    public void register(UserReqDto userReqDto){
        User user = new User();
        user.setUsername(userReqDto.getUsername());
        user.setPassword(passwordEncoder.encode(userReqDto.getPassword()));
        user.setName(userReqDto.getName());
        user.setRole(Role.USER);
        userRepository.save(user);
    }

    public ResponseEntity<?> login(LoginReq loginReq){
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginReq.getUsername(), loginReq.getPassword()));
        System.out.println(authentication);
        String token = jwtService.createToken(new User(loginReq.getUsername()));
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken(token);
        loginResponse.setUsername(loginReq.getUsername());
        return ResponseEntity.ok(loginResponse);
    }


}
