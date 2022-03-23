package com.tutorial.jwtsecurity.controller;


import com.tutorial.jwtsecurity.dto.MemberRequestDto;
import com.tutorial.jwtsecurity.dto.TokenRequestDto;
import com.tutorial.jwtsecurity.dto.TokenDto;
import com.tutorial.jwtsecurity.dto.TokenWithMemberResponseDTO;
import com.tutorial.jwtsecurity.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

/*
    @PostMapping("/signup")
    public ResponseEntity<TokenDto> signup(@RequestBody MemberRequestDto memberRequestDto) {
        return ResponseEntity.ok(authService.signup(memberRequestDto));
    }
 */

    @PostMapping("/login")
    public ResponseEntity<TokenWithMemberResponseDTO> login(@Valid @RequestBody MemberRequestDto memberRequestDto) {
        return ResponseEntity.ok(authService.signup(memberRequestDto));
    }

    @PostMapping("/reissue")
    public ResponseEntity<TokenDto> reissue(@Valid @RequestBody TokenRequestDto tokenRequestDto) {
        return ResponseEntity.ok(authService.reissue(tokenRequestDto));
    }
}
