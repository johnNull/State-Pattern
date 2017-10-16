package airportSecurityState;
import java.util.Arrays;
public class HIGH_RISK implements AirportStateI{
	airport air;
	parser p;
	int[] ops;
	public HIGH_RISK(airport newAir){
		air = newAir;
		p = new parser();
		ops = new int[]{2,4,6,8,10};
	}	

	public void tightenOrLoosenSecurity(String pas){
		p.parse(pas, air);
		if(air.avgTraffic < 8 && air.avgItems < 2)
			air.state = air.MODERATE_RISK;
	}

	public void operate(Results r){
		r.append(Arrays.toString(ops) + "\n");
	}
}
