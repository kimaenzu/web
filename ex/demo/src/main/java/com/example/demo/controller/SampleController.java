package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestContoller : 별도의 화면 없이 데이터 전송
@RestController
public class SampleController {
    //@GetMapping : 브라우저 주소창에서 호출이 가능하도록 설정
    @GetMapping("/hello")
    public String[] hello() {
        return new String[] {"hello","World"};
    }
}
