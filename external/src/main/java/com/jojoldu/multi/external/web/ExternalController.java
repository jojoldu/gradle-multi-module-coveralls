package com.jojoldu.multi.external.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jojoldu@gmail.com on 2018. 3. 10.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RestController
public class ExternalController {

    @GetMapping("/external")
    public String hello() {
        return "external API를 호출했습니다.";
    }
}
