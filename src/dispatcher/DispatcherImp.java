package dispatcher;

import presentacion.Contexto;
import presentacion.Events;
import presentacion.GUIMain;

/**
 * @author Ana Laura Corral Descargue
 */

public class DispatcherImp extends Dispatcher {

	@Override
	public void generarVista(Contexto contexto) {
		int evento = contexto.getEvento();
		switch(evento) {
		case(Events.GUI_MAIN):
			GUIMain.getInstance().actualizar(contexto);
		break;
		case(Events.LLOYD_KO):
			GUIMain.getInstance().actualizar(contexto);
		break;
		case(Events.LLOYD_OK):
			GUIMain.getInstance().actualizar(contexto);
		break;
		case(Events.BAYES_KO):
			GUIMain.getInstance().actualizar(contexto);
		break;
		case(Events.BAYES_OK):
			GUIMain.getInstance().actualizar(contexto);
		break;
		case(Events.KMEDIAS_KO):
			GUIMain.getInstance().actualizar(contexto);
		break;
		case(Events.KMEDIAS_OK):
			GUIMain.getInstance().actualizar(contexto);
		break;
		}
	}
}