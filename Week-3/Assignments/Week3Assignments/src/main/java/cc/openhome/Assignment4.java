package cc.openhome;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.net.URLEncoder;
import javax.servlet.http.Cookie;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpHeaders;

@Controller
public class Assignment4 {

	@GetMapping("/myName")
	public String myName(@CookieValue(name = "userName", defaultValue = "") String encodedUserName, Model model) {
		String userName = URLDecoder.decode(encodedUserName, StandardCharsets.UTF_8);

		if (!userName.isEmpty()) {
			model.addAttribute("userName", userName);
			return "myName";
		} else {
			return "nameForm";
		}
	}

	@PostMapping("/trackName")
	public ResponseEntity<String> trackName(@RequestParam String name) {
		String encodedName = URLEncoder.encode(name, StandardCharsets.UTF_8);
		Cookie cookie = new Cookie("userName", encodedName);
		HttpHeaders headers = new HttpHeaders();

		headers.add("Set-Cookie", cookie.getName() + "=" + cookie.getValue());
		return ResponseEntity.status(302).headers(headers).header("Location", "/myName").body("Redirecting to /myName");
	}

}