package cn.teamwang.elk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class ElkLogSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElkLogSystemApplication.class, args);
    }

    @GetMapping("/test")
    public String sayHello(){
        log.info("I don't wanna print logs...");
        log.info("更改应用名");
        return "hello";
    }

}
