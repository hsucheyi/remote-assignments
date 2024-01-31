package cc.openhome;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.http.Cookie;

@Controller
public class Assignment4 {

	@ModelAttribute
	public void addAttributes(Model model, @CookieValue(value = "userName", defaultValue = "") String userName) {
		model.addAttribute("userName", userName);
	}

	@GetMapping("/myName")
	public String getMyNamePage(@ModelAttribute("userName") String userName) {
		if (!userName.isEmpty()) {
			return "myName";
		} else {
			return "nameForm";
		}
	}

	@PostMapping("/trackName")
	public ResponseEntity<String> trackName(@RequestParam String name) {
		Cookie cookie = new Cookie("userName", name);
		cookie.setMaxAge(3600);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Set-Cookie", cookie.getName() + "=" + URLEncoder.encode(cookie.getValue(), StandardCharsets.UTF_8) + "; Max-Age=" + cookie.getMaxAge());
		return ResponseEntity.status(302).headers(headers).header("Location", "/myName").body("Redirecting to /myName");
	}
}