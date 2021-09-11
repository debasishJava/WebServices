package in.coforge.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerTicket {

	private String fName; 
	private String lName;
	private String dob;
	private String doj;
	private String fStation;
	private String tStation;
	
	private Double fare;
	private String status;
}
