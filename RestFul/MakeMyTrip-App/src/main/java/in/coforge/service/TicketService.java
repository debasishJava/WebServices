package in.coforge.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.coforge.request.PassengerDetails;
import in.coforge.response.PassengerTicket;

@Service
public class TicketService {

	public PassengerTicket initiateTicketBookProcess(PassengerDetails request) {
		String endPointUrl="http://localhost:9090/irctc/ticket";
		
		RestTemplate rt=new RestTemplate();
		
		HttpHeaders headers=new HttpHeaders();
		headers.set("content-Type", "application/json");
		headers.set("Accept", "application/json");
		
		HttpEntity<PassengerDetails> modifiedRequest=new HttpEntity<PassengerDetails>(request, headers);
		
		ResponseEntity<PassengerTicket> response=rt.postForEntity(endPointUrl, modifiedRequest, PassengerTicket.class);
		
		PassengerTicket pt=response.getBody();
		
		return pt;
	}
}
