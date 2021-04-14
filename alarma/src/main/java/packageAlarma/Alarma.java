/**
 * @(#) Alarma.java
 */

package packageAlarma;

import java.util.*;

public class Alarma implements Comparable <Alarma>
{
	private Alarmas contexto;
	
	private String id;
	
	private Date hora;

	private Timer timer = new Timer ();
	
	public Alarma(String id, Date hora) {
		this.id = id;
		this.hora = hora;
	}
	
	public void anhadeContexto (Alarmas contexto) {
		this.contexto = contexto;
	}
	
	public String id () {
		return id;
	}
	
	public Date date () {
		return hora;
	}
	
	public TimerTask activaAlarma () {
		timer = new Timer ();
		timer.schedule(new Activador (contexto),this.hora);
		return null;
	}
	
	public void cancelaTimer () {
		timer.cancel();
	}

	public int compareTo(Alarma a) {
	    return hora.compareTo(a.date());
	}
}
