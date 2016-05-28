package planeSimulation;

@SuppressWarnings("serial")
public class GeneralFlightSimulatorException extends Exception {

	// exception data: message & reason
	private String message;

	// constructor: default
	public GeneralFlightSimulatorException(){
		super();
		PlaneSimulationMenu.exception_general++;
	}

	// constructor: fleshed out
	public GeneralFlightSimulatorException(String message){
		this.message = message;
		PlaneSimulationMenu.exception_general++;
	}

	// AUXILIARY METHODS
	public String toString(){
		return "GeneralFlightSimulatorException: " + message;
	}

	// GETTER & SETTER
	public String getMessage(){
		return message;
	}
}
