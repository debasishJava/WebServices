package in.coforge.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDetails {

	private String fName; 
	private String lName;
	private String dob;
	private String doj;
	private String fStation;
	private String tStation;
}
