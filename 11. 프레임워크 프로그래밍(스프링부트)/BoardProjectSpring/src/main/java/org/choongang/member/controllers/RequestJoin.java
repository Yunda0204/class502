package org.choongang.member.controllers;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestJoin { // 커맨드 객체
    @NotBlank @Email // NotNull, 이메일 형식
    private String email;

    @NotBlank @Size(min=8) // NotNull, 최소 8자리
    private String password;

    @NotBlank
    private String confirmPassword;

    @NotBlank
    private String userName;

    @NotBlank
    private String mobile;

    @AssertTrue // 필수항목, True = 통과
    private boolean agree;
}
