package airportSecurityState;
import airportSecurityState.util.MyLogger;

public class airport{
	AirportStateI LOW_RISK;
	AirportStateI MODERATE_RISK;
	AirportStateI HIGH_RISK;
	
	AirportStateI state;
	int days, passengers, prohibItems;
	int avgTraffic, avgItems;

	//Constructor. Creates state instances, initializes state to LOW_RISK and sets other vars to 0.
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

	//Changes state based on current state and avgTraffic and avgItems
	public void tightenOrLoosenSecurity(String pas){
		state.tightenOrLoosenSecurity(pas);
	}

	//Calls on state to append operations to Results instance.
	public void operate(Results r){
		state.operate(r);
	}
}
