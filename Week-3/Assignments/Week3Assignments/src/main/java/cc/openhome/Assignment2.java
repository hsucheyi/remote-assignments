package cc.openhome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignment2 {
	
    @GetMapping("/data")
    public String getDatas(@RequestParam(required = false) String number) {
        if (number == null) {
            return "Lack of Parameter";
        }
        try {
            int n = Integer.parseInt(number);
            return "1+2+...+N: " + (n * (n + 1)) / 2;
        } catch (NumberFormatException e) {
            return "Wrong Parameter";
        }
    }
    
}
