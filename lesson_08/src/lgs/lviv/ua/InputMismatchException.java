package lgs.lviv.ua;

public class InputMismatchException extends Exception { 
	private String message;

	public InputMismatchException(String message) {
	
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
