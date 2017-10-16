package airportSecurityState;
public class parser{
	public void parse(String pas, airport air){
		air.days = Integer.parseInt(pas.substring(pas.indexOf(":") + 1, pas.indexOf(";")));
		String item = pas.substring(pas.indexOf("Item:") + 5);
		if(item.equals("Knife") || item.equals("Blade") || item.equals("NailCutter") || item.equals("Gun"))
			air.prohibItems++;
		air.passengers++;
		air.avgTraffic = air.passengers / air.days;
		air.avgItems = air.prohibItems / air.days;
		//System.out.println("average Traffic: " + air.avgTraffic + "average items: " + air.avgItems);
	}
}
