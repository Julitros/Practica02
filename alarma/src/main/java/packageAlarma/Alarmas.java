/**
 * @(#) Alarmas.java
 */

package packageAlarma;

import java.util.ArrayList;
import java.util.Date;
import java.util.PriorityQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Alarmas
{
	private int INTERVALO_SONAR;
	
	//private Alarma alarmasDesactivadas;
	
	//private Alarma alarmasActivas;
	
	private AlarmaEstado estado;
	
	private PriorityQueue<Alarma> alarmasActivadas = new PriorityQueue<Alarma>();
	
	private ArrayList<Alarma> alarmasDesactivadas = new ArrayList<Alarma>();
	
	public Alarma alarma( String id )
	{
		return null;
	}
	
	public AlarmaEstado estado () {
		return estado;
	}
	
	public int Intervalo () {
		return INTERVALO_SONAR;
	}
	
	/**
	 * Añade una nueva alarma preparada para sonar. Retorna true si ese añade y false si no se añade porque ya existe una alarma para la misma hora.
	 */
	public boolean anhadeAlarma( Alarma a )
	{
		if (getAlarma(a.id()) == null) {
			alarmasActivadas.add(a);
			a.anhadeContexto(this);
			return true;
		}
		return false;
	}
	
	public boolean eliminaAlarma( Alarma a )
	{
		if (alarmasActivadas.contains (a)) {
			alarmasActivadas.remove(a);
			return true;
		}
		else if (alarmasDesactivadas.contains (a)) {
			alarmasDesactivadas.remove(a);
			return true;
		}
		
		return false;
	}
	
	public Alarma alarmaMasProxima( )
	{
		return alarmasActivadas.peek();
	}
	
	public void desactivaAlarma( Alarma a )
	{
		if (alarmasActivadas.contains (a)) {
			alarmasActivadas.remove(a);
			alarmasDesactivadas.add (a);
		}
	}
	
	public void activaAlarma( Alarma a )
	{
		if (alarmasDesactivadas.contains (a)) {
			alarmasActivadas.add (a);
			alarmasDesactivadas.remove (a);
		}
	}
	
	/*public Alarma alarmasActivas( )
	{
		return null;
	}
	
	public Alarma alarmasDesactivadas( )
	{
		return null;
	}*/
	
	public int alarmasActivas( )
	{
		return alarmasActivadas.size();
	}
	
	public int alarmasDesactivadas( )
	{
		return alarmasDesactivadas.size();
	}
	
	
	
	
	public void activarMelodía( )
	{
		System.out.println("Sonando Daddy Yankee");
	}
	
	public void desactivarMelodía( )
	{
		System.out.println("Ya no suena Daddy Yankee");
		
	}
	
	public void alarmaOn( String id )
	{
		//Alarma a = getAlarma (id);
		estado.alarmaOn(id, this);
		
	}
	
	public void alarmaOff( String id )
	{
		//Alarma a = getAlarma (id);
		estado.alarmaOff(id, this);
		
	}
	
	public void apagar( )
	{
		estado.apagar(this);
	}
	
	public void setEstado( AlarmaEstado estado )
	{
		this.estado = estado;
	}
	
	public Alarma getAlarma (String id) {
		Alarma a;
		for (int i = 0; i < alarmasDesactivadas.size(); i++) {
			a = alarmasDesactivadas.get(i);
			if (a.id ().equals(id)) {
				return a;
			}
		}

		for (Alarma a1 : alarmasActivadas) {
			if (a1.id ().equals(id)) return a1;
		}

		return null;
	}
	
	
}
