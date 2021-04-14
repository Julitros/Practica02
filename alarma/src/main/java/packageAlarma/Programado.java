/**
 * @(#) Programado.java
 */

package packageAlarma;

import java.util.Date;

public class Programado extends AlarmaEstado
{
	public void nuevaAlarma( String id, Date hora, Alarmas contexto )
	{
		Alarma a = new Alarma (id, hora);
		if (a != null) contexto.anhadeAlarma(a);
	}
	
	public void borraAlarma( String id, Alarmas contexto )
	{
		Alarma a = contexto.getAlarma (id);
		if (a != null) contexto.eliminaAlarma (a);
		if (contexto.alarmasActivas () == 0) {
			contexto.estado().exitAction(contexto);
			contexto.setEstado(desprogramado);
			contexto.estado().entryAction(contexto);
			contexto.estado().doAction(contexto);
		}
	}
	
	public void alarmaOff( String id, Alarmas contexto )
	{
		Alarma a = contexto.getAlarma (id);
		if (a != null) contexto.desactivaAlarma (a);
		if (contexto.alarmasActivas () == 0) {
			contexto.estado().exitAction(contexto);
			contexto.setEstado(desprogramado);
			contexto.estado().entryAction(contexto);
			contexto.estado().doAction(contexto);
		}
	}

	public void alarmaOn( String id, Alarmas contexto )
	{
		Alarma a = contexto.getAlarma (id);
		if (a != null) contexto.activaAlarma (a);
	}
	
}
