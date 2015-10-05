package pt.caleia.auth.api;


import java.io.Serializable;


public interface SessionToken<T extends Serializable> {


	public T getToken();


	public String getTokenAsString();

}
