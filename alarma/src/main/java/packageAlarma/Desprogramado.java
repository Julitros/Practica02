/**
 * @(#) Desprogramado.java
 */

package packageAlarma;

import java.util.Date;

public class Desprogramado extends AlarmaEstado
{
	public void nuevaAlarma( String id, Date hora, Alarmas contexto )
	{
		if (contexto.getAlarma(id) == null) {
			contexto.anhadeAlarma(new Alarma (id, hora));
			contexto.estado().exitAction(contexto);
			contexto.setEstado(programado);
			contexto.estado().entryAction(contexto);
			contexto.estado().doAction(contexto);
		}
	}
	
	public void alarmaOn( String id, Alarmas contexto )
	{
		Alarma a = contexto.getAlarma (id);
		if (a != null) {
			contexto.activaAlarma (a);
			contexto.estado().exitAction(contexto);
			contexto.setEstado(programado);
			contexto.estado().entryAction(contexto);
			contexto.estado().doAction(contexto);
		}
	}
	
	public void borraAlarma( String id, Alarmas contexto )
	{
		Alarma a = contexto.getAlarma (id);
		if (a != null) contexto.eliminaAlarma (a);
	}
	
	
}
