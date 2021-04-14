/**
 * @(#) Desprogramado.java
 */

package construccion;

public class Desprogramado extends AlarmaEstado
{
	public void nuevaAlarma( String id, date hora, Alarmas contexto )
	{
		Alarma a = new Alarma (id, hora);
		if (a != null) contexto.anhadeAlarma(a);
	}
	
	public void alarmaOn( String id, Alarmas contexto )
	{
		Alarma a = contexto.getAlarma (id);
		if (a != null) context.activaAlarma (a);
	}
	
	public void borraAlarma( String id, Alarmas contexto )
	{
		Alarma a = contexto.getAlarma (id);
		if (a != null) context.remove (a);
	}
	
	
}
