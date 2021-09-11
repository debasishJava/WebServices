package in.coforge.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerTicket {

	private String dob;
	private String doj;
	private Double fare;
	private String fname;
	private String fstation;
	private String lname;
	private String status;
	private String tstation;
}
