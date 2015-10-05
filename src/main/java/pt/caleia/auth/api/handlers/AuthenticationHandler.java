package pt.caleia.auth.api.handlers;


import pt.caleia.auth.api.SessionToken;
import pt.caleia.auth.api.UserPrincipal;
import pt.caleia.auth.api.exceptions.InvalidSessionTokenException;
import pt.caleia.auth.api.exceptions.InvalidUserException;
import pt.caleia.auth.api.exceptions.InvalidUsernamePasswordException;
import pt.caleia.auth.api.exceptions.TooManyOpenedSessionsException;


/**
 * 
 * @author Pedro Caleia
 *
 */
public interface AuthenticationHandler<S extends SessionToken<?>, U extends UserPrincipal<?>> {


	/**
	 * Allows the user to do a login and manages the session token.
	 * 
	 * @param username The username.
	 * @param plainPassword The password in plain text.
	 * @return A session token.
	 * @throws InvalidUsernamePasswordException If the username and password combination is invalid.
	 * @throws TooManyOpenedSessionsException //TODO
	 */
	public S doLogin( String username, String plainPassword )
			throws InvalidUsernamePasswordException, TooManyOpenedSessionsException;
	
	
	public S doLogin( String username, String plainPassword, S currentSessionToken )
			throws InvalidUsernamePasswordException, TooManyOpenedSessionsException;


	// TODO
	public U identifySessionToken( S sessionToken ) throws InvalidSessionTokenException;


	// TODO
	public void doLogout( S sessionToken ) throws InvalidSessionTokenException;
	
	
	// TODO
	public void doLogout( U user ) throws InvalidUserException;

}
