package airportSecurityState;

public class airport{
	AirportStateI state;
	int days, passengers, prohibItems;
	int avgTraffic, avgItems;

	public airport(){
		days = 0;
		passengers = 0;
		prohibItems = 0;
		state = new LOW_RISK(this);
	}

	public void tightenOrLoosenSecurity(String pas){
		state.tightenOrLoosenSecurity(pas);
	}
}
