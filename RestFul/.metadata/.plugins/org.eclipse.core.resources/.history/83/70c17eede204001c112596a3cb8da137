package deb.lip.config;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class MonoService {

	public Mono<String> productAPI() {
		String url="http://localhost:9091/products";
		
		WebClient client=WebClient.create();
		
		 Mono<String> res=client.get()
				          .uri(url)
				          .retrieve()
				          .bodyToMono(String.class);
		return res;
	}
	
	public static String handlerMethod(String str) {
		System.out.println(str);
		return str;
	}
}
