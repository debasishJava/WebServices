package deb.lip.rest;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import deb.lip.bindings.CustomerEvent;
import reactor.core.publisher.Mono;

@RestController
public class CustomerEventController {

	@GetMapping(
			value = "/getevents",
			produces = "application/json"
			)
	public ResponseEntity<Mono<CustomerEvent>> getCustomerEvent(){
		
		CustomerEvent event=new CustomerEvent("John", new Date());
		//in the just pass the produced class 
		Mono<CustomerEvent> cMono=Mono.just(event);
		//pass the response entity
		ResponseEntity<Mono<CustomerEvent>> res=new ResponseEntity<Mono<CustomerEvent>>(cMono,HttpStatus.OK);
		//return the response
		return res;
	}
}
