package factoria;

import negocio.BayesImp;
import negocio.KMediasImp;
import negocio.LloydImp;

/**
 * @author Ana Laura Corral Descargue
 */
public abstract class FactoriaNegocio {

	private static FactoriaNegocio instance;
	
	public static FactoriaNegocio getInstance() {
		if(instance == null) {
			instance = new FactoriaNegocioImp();
		}
		return instance;
	}
	
	public abstract KMediasImp crearKMedias();

	public abstract LloydImp crearLloyd();

	public abstract BayesImp crearBayes();
}
