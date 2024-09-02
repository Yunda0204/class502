package org.choongang.member.controllers;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RequestLogin {
    @NotEmpty
    @Email // NotNull, 이메일 형식
    private String email;

    @NotEmpty @Size(min=8) // NotNull, 최소 8자리
    private String password;
}
