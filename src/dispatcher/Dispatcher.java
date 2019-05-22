package dispatcher;

import presentacion.Contexto;

/**
 * @author Ana Laura Corral Descargue
 */
public abstract class Dispatcher {

	private static Dispatcher instance;

	public static Dispatcher getInstance() {
		if(instance == null) {
			instance = new DispatcherImp();
		}
		return instance;
	}

	public abstract void generarVista(Contexto contexto);
}