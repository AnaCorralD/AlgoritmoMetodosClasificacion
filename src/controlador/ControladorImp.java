package controlador;

import command.Command;
import dispatcher.Dispatcher;
import factoria.FactoriaCommand;
import presentacion.Contexto;

/**
 * @author Ana Laura Corral Descargue
 */
public class ControladorImp extends Controlador {

	@Override
	public void accion(Contexto contexto) {
		Command command = FactoriaCommand.getInstance().generarComando(contexto.getEvento());
		Contexto contextoResult = null;
		if (command != null) {
			contextoResult = command.execute(contexto.getDato());
			Dispatcher.getInstance().generarVista(contextoResult);
		}
		else Dispatcher.getInstance().generarVista(contexto);
	}

}
