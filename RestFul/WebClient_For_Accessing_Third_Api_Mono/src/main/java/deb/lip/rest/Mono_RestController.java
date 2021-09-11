package deb.lip.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import deb.lip.config.MonoService;
import reactor.core.publisher.Mono;

@RestController
public class Mono_RestController {

	@Autowired
	private MonoService service;
	
	@GetMapping(
			  value = "/productList",
			  produces = "application/json"
			)
	public Mono<String> getAllProducts() {
		return service.productAPI();
	}
}
