package packageAlarma;

import java.util.*;

public class Activador extends TimerTask {
	
	
	private Alarmas contexto;
	public Activador (Alarmas contexto) {
		this.contexto = contexto;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		contexto.estado().exitAction(contexto);
		contexto.setEstado(AlarmaEstado.getEstadoSonando());
		contexto.estado().entryAction(contexto);
		contexto.estado().doAction(contexto);
	}
}