package deb.lip.config;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebFlux_WebClient {

	public String getApi() {
		String url="http://localhost:9091/products";
		WebClient wClient=WebClient.create();
		
		String products=wClient.get()
				               .uri(url)
				               .retrieve()
				               .bodyToFlux(String.class)
				               .blockFirst();
		return products;
	}
}
