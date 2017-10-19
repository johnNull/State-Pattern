package airportSecurityState;
import airportSecurityState.util.MyLogger;
import java.util.Arrays;
public class LOW_RISK implements AirportStateI{
	airport air;
	parser p;
	int[] ops;
	public LOW_RISK(airport newAir){
		MyLogger.writeMessage("Creating LOW_RISK", MyLogger.DebugLevel.CONSTRUCTOR);
		air = newAir;
		p = new parser();
		ops = new int[]{1,3,5,7,9};
	}

	//Changes to MODERATE_RISK if average traffic or prohibited items are high enough.
	public void tightenOrLoosenSecurity(String pas){
		p.parse(pas, air);
		if(air.avgTraffic > 3 || air.avgItems > 0){
			MyLogger.writeMessage("LOW_RISK to MODERATE_RISK", MyLogger.DebugLevel.IN_RUN);
			air.state = air.MODERATE_RISK;
		}
	}

	//Adds operations for this day to Results instance.
	public void operate(Results r){
		r.append(Arrays.toString(ops) + "\n");
	}
}
