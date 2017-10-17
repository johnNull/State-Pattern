package airportSecurityState;
import airportSecurityState.util.MyLogger;

public class airport{
	AirportStateI LOW_RISK;
	AirportStateI MODERATE_RISK;
	AirportStateI HIGH_RISK;
	
	AirportStateI state;
	int days, passengers, prohibItems;
	int avgTraffic, avgItems;

	public airport(){
		MyLogger.writeMessage("Creating airport", MyLogger.DebugLevel.CONSTRUCTOR);
		LOW_RISK = new LOW_RISK(this);
		MODERATE_RISK = new MODERATE_RISK(this);
		HIGH_RISK = new HIGH_RISK(this);
		days = 0;
		passengers = 0;
		prohibItems = 0;
		state = LOW_RISK;
	}

	public void tightenOrLoosenSecurity(String pas){
		state.tightenOrLoosenSecurity(pas);
	}

	public void operate(Results r){
		state.operate(r);
	}
}
