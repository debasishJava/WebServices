package deb.lip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(
			value="/msg",
			produces="application/json"
			)
	public String getMessage() {
		return "Please God Relieve me of all duties....Want to meet you...My Ultimate Wish";
	}
}
