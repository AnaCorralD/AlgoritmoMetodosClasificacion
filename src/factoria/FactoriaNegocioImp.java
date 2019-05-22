package factoria;

import negocio.BayesImp;
import negocio.KMediasImp;
import negocio.LloydImp;

/**
 * @author Ana Laura Corral Descargue
 */
public class FactoriaNegocioImp extends FactoriaNegocio{

	@Override
	public KMediasImp crearKMedias() {
		return new KMediasImp();
	}
	
	@Override
	public BayesImp crearBayes() {
		return new BayesImp();
	}
	
	@Override
	public LloydImp crearLloyd() {
		return new LloydImp();
	}

}
