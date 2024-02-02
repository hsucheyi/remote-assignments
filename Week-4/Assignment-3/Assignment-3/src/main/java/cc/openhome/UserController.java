package cc.openhome;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@PostMapping("/signup")
	public String signUp(@RequestParam String email, @RequestParam String password, Model model) {
		if (userRepository.existsByEmail(email)) {
			model.addAttribute("emailExists", true);
			return "home";
		}

		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		userRepository.save(user);
		return "redirect:/member";
	}

	@PostMapping("/signin")
	public String signIn(@ModelAttribute("emailSignIn") String email, @ModelAttribute("passwordSignIn") String password,
			Model model) {
		if (userRepository.existsByEmail(email)) {
			Optional<User> userOptional = userRepository.findByEmail(email);
			if (userOptional.isPresent()) {
				User user = userOptional.get();
				if (password.equals(user.getPassword())) {
					return "redirect:/member";
				} else {
					model.addAttribute("passwordIncorrect", true);
					return "home";
				}
			} else {
				model.addAttribute("emailNotRegistered", true);
				return "home";
			}
		} else {
			model.addAttribute("emailNotRegistered", true);
			return "home";
		}

	}

	@GetMapping("/member")
	public String member() {
		return "member";
	}

}