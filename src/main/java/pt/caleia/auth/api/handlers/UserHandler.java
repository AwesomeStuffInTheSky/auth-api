package pt.caleia.auth.api.handlers;


import pt.caleia.auth.api.UserPrincipal;
import pt.caleia.auth.api.exceptions.InvalidPasswordException;
import pt.caleia.auth.api.exceptions.InvalidUserException;
import pt.caleia.auth.api.exceptions.InvalidUsernameException;
import pt.caleia.auth.api.exceptions.InvalidUsernamePasswordException;
import pt.caleia.auth.api.exceptions.UsernameAlreadyExistsException;


/**
 * 
 * @author Pedro Caleia
 *
 */
public interface UserHandler<U extends UserPrincipal<?>> {


	/**
	 * Verifies if a username exists.
	 * 
	 * @param username The username to be checked for existance.
	 * @return {@code true} if the username exists, {@code false} otherwise.
	 */
	public boolean usernameExists( String username );


	/**
	 * Verifies if a user exists.
	 * 
	 * @param user The user to be checked for existance.
	 * @return {@code true} if the user exists, {@code false} otherwise.
	 */
	public boolean userExists( U user );


	// TODO
	public U identifyUsername( String username, String plainPassword ) throws InvalidUsernamePasswordException;


	/**
	 * Creates the user with the given credentials and returns a new {@link UserPrincipal} representing the user.
	 * 
	 * @param username The username.
	 * @param plainPassword The password in plain text.
	 * @return A {@link UserPrincipal} that identifies the user.
	 * @throws InvalidUsernameException If the username has an invalid format.
	 * @throws InvalidPasswordException If the password has an invalid format.
	 */
	public U createUser( String username, String plainPassword )
			throws InvalidUsernameException, InvalidPasswordException, UsernameAlreadyExistsException;
	
	
	// TODO
	public void disableUser( U user ) throws InvalidUserException;


	/**
	 * Deletes a given user.
	 * 
	 * @param user The user to be deleted.
	 * @throws InvalidUserException If the user provided is invalid.
	 */
	public void deleteUser( U user ) throws InvalidUserException;

}
