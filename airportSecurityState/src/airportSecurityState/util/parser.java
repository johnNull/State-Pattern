package airportSecurityState;
import airportSecurityState.util.MyLogger;
public class parser{
	//Take in line from input file and set the number of days and update # of prohibited items. Recalculate averages accordingly.
	public void parse(String pas, airport air){
		air.days = Integer.parseInt(pas.substring(pas.indexOf(":") + 1, pas.indexOf(";")));
		String item = pas.substring(pas.indexOf("Item:") + 5);
		if(item.equals("Knife") || item.equals("Blade") || item.equals("NailCutter") || item.equals("Gun")){
			MyLogger.writeMessage("Prohibited item: " + item, MyLogger.DebugLevel.FROM_RESULTS);
			air.prohibItems++;
		}
		air.passengers++;
		air.avgTraffic = air.passengers / air.days;
		air.avgItems = air.prohibItems / air.days;
	}
}
