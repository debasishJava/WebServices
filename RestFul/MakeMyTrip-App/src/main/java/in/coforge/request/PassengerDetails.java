package in.coforge.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDetails {

	private String dob;
	private String doj;
	private String fname;
	private String fstation;
	private String lname;
	private String tstation;
}
