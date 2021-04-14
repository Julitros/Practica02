/**
 * @(#) Programado.java
 */

package construccion;

public class Programado extends AlarmaEstado
{
	public void nuevaAlarma( String id, date hora, Alarmas contexto )
	{
		Alarma a = new Alarma (id, hora);
		if (a != null) contexto.anhadeAlarma(a);
	}
	
	public void borraAlarma( String id, Alarmas contexto )
	{
		Alarma a = contexto.getAlarma (id);
		if (a != null) context.remove (a);
	}
	
	public void alarmaOff( String id, Alarmas contexto )
	{
		Alarma a = contexto.getAlarma (id);
		if (a != null) context.desactivaAlarma (a);
	}

	public void alarmaOn( String id, Alarmas contexto )
	{
		Alarma a = contexto.getAlarma (id);
		if (a != null) context.activaAlarma (a);
	}
	
}
