package com.jojoldu.multi.web.api;

import com.jojoldu.multi.core.domain.Member;
import com.jojoldu.multi.core.domain.MemberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jojoldu@gmail.com on 2018. 3. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RestController
public class MemberApiController {

    private MemberRepository memberRepository;

    public MemberApiController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/members")
    public List<Member> findAll(){
        return memberRepository.findAll();
    }
}
