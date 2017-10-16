package airportSecurityState.driver;
import airportSecurityState.*;

public class Driver{
	public static void main(String args[]){
		if(args == null || args.length != 3)
				throw new IllegalArgumentException("Three arguments are required, input.txt, output.txt, and debug level");
		else{
			FileProcessor fp = new FileProcessor(args[0]);
			Results results = new Results(args[1]);
			airport air = new airport();
			for(String s = fp.readLine(); s != "-1"; s = fp.readLine()){
				air.tightenOrLoosenSecurity(s);
				air.operate(results);
			}
			results.writeToFile();
		}
	}
}
