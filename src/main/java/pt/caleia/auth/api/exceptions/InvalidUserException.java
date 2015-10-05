package pt.caleia.auth.api.exceptions;


/**
 * 
 * @author Pedro Caleia
 *
 */
public class InvalidUserException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Default constructor.
	 */
	public InvalidUserException() {
		
	}
	
	
	/**
	 * 
	 * @param message //TODO
	 */
	public InvalidUserException( String message ) {
		super( message );
	}

}
