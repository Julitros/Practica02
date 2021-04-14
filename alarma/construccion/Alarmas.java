/**
 * @(#) Alarmas.java
 */

package construccion;

public class Alarmas
{
	private int INTERVALO_SONAR;
	
	//private Alarma alarmasDesactivadas;
	
	//private Alarma alarmasActivas;
	
	private AlarmaEstado estado;
	
	//private ArrayList<Alarma> alarmas = new ArrayList<Alarma>();
	
	private PriorityQueue<Alarma> alarmasActivadas = new PriorityQueue<Alarma>();
	
	private ArrayList<Alarma> alarmasDesactivadas = new ArrayList<Alarma>();
	
	public Alarma alarma( String id )
	{
		return null;
	}
	
	/**
	 * Añade una nueva alarma preparada para sonar. Retorna true si ese añade y false si no se añade porque ya existe una alarma para la misma hora.
	 */
	public boolean anhadeAlarma( Alarma a )
	{
		//alarmas.add (a);
		alarmasActivadas.add(a);
		return false;
	}
	
	public boolean eliminaAlarma( Alarma a )
	{
		//alarmas.remove(a);
		if (alarmasActivadas.contains (a)) alarmasActivadas.remove(a);
		else alarmasDesactivadas.remove(a);
		
		return false;
	}
	
	public Alarma alarmaMasProxima( )
	{
		
		
		
		return null;
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
	
	public Alarma alarmasActivas( )
	{
		return null;
	}
	
	public Alarma alarmasDesactivadas( )
	{
		return null;
	}
	
	public void activarMelodía( )
	{
		
	}
	
	public void desactivarMelodía( )
	{
		
	}
	
	public void nuevaAlarma( String id, date hora )
	{
		
	}
	
	public void borrarAlarma( String id )
	{
		
	}
	
	public void alarmaOn( String id )
	{
		
	}
	
	public void alarmaOff( String id )
	{
		
	}
	
	public void apagar( )
	{
		
	}
	
	public void setEstado( AlarmaEstado estado )
	{
		
	}
	
	public int getAlarma (String id) {
		Alarma a;
		for (int i = 0; i < alarmasDesactivadas.size(); i++) {
			a = alarmasDesactivadas.get(i);
			if (a.id () == id) {
				return i;
			}
		}
		for (int i = 0; i < alarmasActivadas.size(); i++) {
			a = alarmasActivadas.get(i);
			if (a.id () == id) {
				return i;
			}
		}
		return null;
	}
}
