package cc.before30.test.heroku;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Log4j2
public class HerokuApplication {

    @GetMapping("/hello")
    public String hello() {
        log.info("hello");
        return "world";
    }

    @GetMapping("/hi")
    public String hi(@RequestParam("arg1") String arg1, @RequestParam("arg2") String arg2) {
       log.info("hi {} {}", arg1, arg2);
       return "hi" + arg1 + " " + arg2;
    }

    @GetMapping("/hello2")
    public String hello2() {
        log.info("hello2");
        return "world2";
    }

    public static void main(String[] args) {
        SpringApplication.run(HerokuApplication.class, args);
    }
}
