package in.coforge.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.coforge.request.PassengerDetails;
import in.coforge.response.PassengerTicket;

@RestController	
@RequestMapping("/irctc")
public class IrctcController {

	@PostMapping("/ticket")
	public ResponseEntity<PassengerTicket> getTicket(@RequestBody PassengerDetails request){
		PassengerTicket ticket=new PassengerTicket();
		
		BeanUtils.copyProperties(request, ticket);
		ticket.setFare(1500.0);
		ticket.setStatus("CONFIRMED");
		
		ResponseEntity<PassengerTicket> response=new ResponseEntity<PassengerTicket>(ticket, HttpStatus.OK);
		
		return response;
	}
}
