package pt.caleia.auth.api.handlers;


import pt.caleia.auth.api.Resource;
import pt.caleia.auth.api.UserPrincipal;


/**
 * 
 * @author Pedro Caleia
 *
 */
public interface AuthorizationHandler<U extends UserPrincipal<?>, R extends Resource> {
	
	
	//TODO
	public boolean isPublic( R resource );


	/**
	 * Verifies if the user is authorized to access the given resource
	 * 
	 * @param user The user to be checked for authorization.
	 * @param resource The resource to be checked for authorization.
	 * @return {@code true} if the user is authorized to access the resource, {@code false} otherwise.
	 */
	public boolean isAuthorized( U user, R resource );

}
