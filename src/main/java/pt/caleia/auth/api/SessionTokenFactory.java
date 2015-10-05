package pt.caleia.auth.api;


public interface SessionTokenFactory<T extends SessionToken<?>> {


	public T generateTokenFromString( String tokenString ) throws IllegalArgumentException;

}
