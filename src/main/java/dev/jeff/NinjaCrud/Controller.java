package dev.jeff.NinjaCrud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/hello_world")
    public String Welcome() {
        return "Hello world";
    }





}
