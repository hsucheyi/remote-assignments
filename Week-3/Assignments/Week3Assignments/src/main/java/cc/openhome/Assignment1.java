package cc.openhome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignment1 {

	@GetMapping("/")
    public String hello() {
        return "Hello, My Server!";
    }
}