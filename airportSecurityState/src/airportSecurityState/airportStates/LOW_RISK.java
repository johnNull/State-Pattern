package airportSecurityState;
import java.util.Arrays;
public class LOW_RISK implements AirportStateI{
	airport air;
	parser p;
	int[] ops;
	public LOW_RISK(airport newAir){
		air = newAir;
		p = new parser();
		ops = new int[]{1,3,5,7,9};
	}
	public void tightenOrLoosenSecurity(String pas){
		p.parse(pas, air);
		if(air.avgTraffic > 3 || air.avgItems > 0)
			air.state = air.MODERATE_RISK;
	}

	public void operate(Results r){
		r.append(Arrays.toString(ops) + "\n");
	}
}
