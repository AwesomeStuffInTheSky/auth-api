package pt.caleia.auth.api;


import java.io.Serializable;
import java.util.Set;


public interface UserPrincipal<T extends Serializable> {


	public T getUserId();


	public Set<Role> getRoles();

}
