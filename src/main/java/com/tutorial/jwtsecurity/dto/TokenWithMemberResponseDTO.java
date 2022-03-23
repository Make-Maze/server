package com.tutorial.jwtsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenWithMemberResponseDTO {
    private TokenDto tokenDto;
    private String email;
    private String img;
    private String name;
}
