package org.choongang.member.services;

import lombok.RequiredArgsConstructor;
import org.choongang.member.entities.Member;
import org.choongang.member.repositories.MemberRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberLoginService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean login(String email, String password) {
        Optional<Member> memberOpt = memberRepository.findByEmail(email);
        if (memberOpt.isPresent()) {
            Member member = memberOpt.get();
            return passwordEncoder.matches(password, member.getPassword());
        }
        return false;
    }
}
