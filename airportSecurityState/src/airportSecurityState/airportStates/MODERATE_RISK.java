package airportSecurityState;
import airportSecurityState.util.MyLogger;
import java.util.Arrays;
public class MODERATE_RISK implements AirportStateI{
	airport air;
	parser p;
	int[] ops;
	public MODERATE_RISK(airport newAir){
		MyLogger.writeMessage("Creating MODERATE_RISK", MyLogger.DebugLevel.CONSTRUCTOR);
		air = newAir;
		p = new parser();
		ops = new int[]{2,3,5,8,9};
	}
	public void tightenOrLoosenSecurity(String pas){
		p.parse(pas, air);
		if(air.avgTraffic < 4 && air.avgItems < 1){
			MyLogger.writeMessage("MODERATE_RISK to LOW_RISK", MyLogger.DebugLevel.IN_RUN);
			air.state = air.LOW_RISK;
		}
		else if(air.avgTraffic > 7 || air.avgItems > 1){
			MyLogger.writeMessage("MODERATE_RISK to HIGH_RISK", MyLogger.DebugLevel.IN_RUN);
			air.state = air.HIGH_RISK;
		}
	}

	public void operate(Results r){
		r.append(Arrays.toString(ops) + "\n");
	}
}
