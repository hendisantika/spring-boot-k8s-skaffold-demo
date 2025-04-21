package id.my.hendisantika.k8sskaffolddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-k8s-skaffold-demo
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 21/04/25
 * Time: 21.59
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String hello() {
        return "Welcome to Skaffold! " + LocalDateTime.now();
    }
}
