package com.jojoldu.multi.web.api;

import com.jojoldu.multi.core.domain.Member;
import com.jojoldu.multi.core.domain.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Created by jojoldu@gmail.com on 2018. 3. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MemberApiControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private MemberRepository memberRepository;

    @Test
    public void API호출하면_전체Member가_조회된다() {
        //given
        given(memberRepository.findAll())
                .willReturn(Arrays.asList(new Member("jojoldu", "jojoldu@gmail.com")));
        //when
        List<Member> body = this.restTemplate.getForObject("/members", List.class);

        //then
        assertThat(body.size()).isEqualTo(1);
    }
}
