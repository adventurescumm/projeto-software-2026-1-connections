package br.insper.conexoes.connections;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping("/hello-world")
    public String teste() {
        return "hello-world";
    }
}
