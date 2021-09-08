package lgs.lviv.ua;

public class WrongInputConsoleParametersException extends Exception {

	private String message;

	public WrongInputConsoleParametersException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}