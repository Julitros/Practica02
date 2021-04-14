/**
 * @(#) AlarmaEstado.java
 */

package construccion;

public abstract class AlarmaEstado
{
	//Estados
	public static Desprogramado  desprogramado = new Desprogramado ();
	public static Programado  programado = new Programado ();
	public static Sonando sonando = new Sonando ();
	
	
	//En las clases hijos se programa esto
	public void nuevaAlarma( String id, date hora, Alarma contexto ){ };
	public void borraAlarma( String id, Alarmas contexto ){	};
	public void alarmaOff( String id, Alarmas contexto ) { };
	public void alarmaOn( String id, Alarmas contexto ){ };
	public void apagar( Alarmas contexto ) { };
	
	
	public void entryAction (Alarmas contexto) { };
	public void exitAction (Alarmas contexto) { };
	public void doAction (Alarmas contexto) { };

	
	public static AlarmaState getEstadoDesprogramado () {
		return desprogramado;
	}
	public static AlarmaState getEstadoProgramado () {
		return programado;
	}
	public static AlarmaState getEstadoSonando () {
		return sonando;
	}
}
