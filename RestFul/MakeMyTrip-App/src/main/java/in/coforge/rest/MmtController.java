package in.coforge.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.coforge.request.PassengerDetails;
import in.coforge.response.PassengerTicket;
import in.coforge.service.TicketService;

@RestController
@RequestMapping("/mmt")
public class MmtController {
	
	@Autowired
	private TicketService service;
	
	@PostMapping("/bookTicket")
	public PassengerTicket getTicket(@RequestBody PassengerDetails request) {
		return service.initiateTicketBookProcess(request); 
	}
}
