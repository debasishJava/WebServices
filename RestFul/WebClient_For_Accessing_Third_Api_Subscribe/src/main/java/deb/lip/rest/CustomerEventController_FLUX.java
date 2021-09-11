package deb.lip.rest;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import deb.lip.bindings.CustomerEvent;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

@RestController
public class CustomerEventController_FLUX {

	@GetMapping(
			value = "/getFluxEvents",
			produces = MediaType.TEXT_EVENT_STREAM_VALUE
			)
	public ResponseEntity<Flux<CustomerEvent>> getCustomerEventByInterval(){
		//creating object
		CustomerEvent event = new CustomerEvent("deblip",new Date());
		//creating a stream
		Stream<CustomerEvent> stream=Stream.generate(()->event);
		//passing stream to flux
		Flux<CustomerEvent> streamFlux=Flux.fromStream(stream);
		//setting response interval
		Flux<Long> interval=Flux.interval(Duration.ofSeconds(2));
		//combining intervalflux and customereventflux
		Flux<Tuple2<Long, CustomerEvent>> zip=Flux.zip(interval, streamFlux);
		//getting second tuple value as flux obj
		Flux<CustomerEvent> fluxMap=zip.map(Tuple2::getT2);
		//creating response with flux containing only customerevent and httpstatus
		ResponseEntity<Flux<CustomerEvent>> res = new ResponseEntity<Flux<CustomerEvent>>(fluxMap,HttpStatus.OK);
		
		return res;
	}
}
