package com.jojoldu.multi.external.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by jojoldu@gmail.com on 2018. 3. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ExternalControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void external테스트() {
        String body = this.restTemplate.getForObject("/external", String.class);
        assertThat(body).isEqualTo("external API를 호출했습니다.");
    }
}
