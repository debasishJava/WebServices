package deb.lip.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import deb.lip.config.WebFlux_WebClient;

@RestController
public class ThirdApiAccessingController {

	@Autowired
	private WebFlux_WebClient flux;
	
	@GetMapping(
			  value="/fluxProducts",
			  produces="application/json"
			)
	public String getProductDetailsUsingFlux() {
		return flux.getApi(); 
	}
}
