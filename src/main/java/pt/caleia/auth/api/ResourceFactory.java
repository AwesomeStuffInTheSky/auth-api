package pt.caleia.auth.api;


/**
 * 
 * @author Pedro Caleia
 *
 * @param <T> TODO
 * @param <R> TODO
 */
public interface ResourceFactory<T, R extends Resource> {


	public R generateResource( T input );

}
