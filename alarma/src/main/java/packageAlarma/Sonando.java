/**
 * @(#) Sonando.java
 */

package packageAlarma;

import java.util.Timer;

public class Sonando extends AlarmaEstado
{

	private Timer timer = new Timer ();
	
	public void apagar( Alarmas contexto )
	{
		timer.cancel();
		this.exitAction(contexto);
		contexto.estado().entryAction(contexto);
		contexto.estado().doAction(contexto);
		contexto.desactivaAlarma(contexto.alarmaMasProxima());
	}

	
	public void entryAction (Alarmas contexto) {
		timer = new Timer ();
		timer.schedule(new timer (contexto), contexto.Intervalo());
		contexto.activarMelodía();
	}
	public void exitAction (Alarmas contexto) { 
		apagar(contexto);
	}
}
