package airportSecurityState.driver;
import airportSecurityState.*;
import airportSecurityState.util.MyLogger;

public class Driver{
	public static void main(String args[]){
		if(args == null || args.length != 3)
				throw new IllegalArgumentException("Three arguments are required, input.txt, output.txt, and debug level");
		else{
			try{
				int debug = Integer.parseInt(args[2]);
				if(debug > 0 && debug < 5)
					MyLogger.setDebugValue(Integer.parseInt(args[2]));	
				else
					throw new IllegalArgumentException("debug level must be 0-4");
			}
			catch(Exception e){
				System.err.println("Incorrect debug level format");
				e.printStackTrace(System.out);
			}
			MyLogger.writeMessage("Creating FileProcessor", MyLogger.DebugLevel.IN_RESULTS);
			FileProcessor fp = new FileProcessor(args[0]);
			MyLogger.writeMessage("Creating Results instance", MyLogger.DebugLevel.IN_RESULTS);
			Results results = new Results(args[1]);
			MyLogger.writeMessage("Creating airport", MyLogger.DebugLevel.CONSTRUCTOR);
			airport air = new airport();

			MyLogger.writeMessage("Reading file", MyLogger.DebugLevel.IN_RESULTS);
			for(String s = fp.readLine(); s != "-1"; s = fp.readLine()){
				air.tightenOrLoosenSecurity(s);
				air.operate(results);
			}
			MyLogger.writeMessage("Writing to file", MyLogger.DebugLevel.IN_RESULTS);
			results.writeToFile();
		}
	}
}
