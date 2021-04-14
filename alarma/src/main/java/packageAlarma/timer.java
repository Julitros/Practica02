package packageAlarma;

import java.util.TimerTask;

public class timer extends TimerTask {
	private Alarmas contexto;
	public timer (Alarmas contexto) {
		this.contexto = contexto;
	}
	
	@Override
	public void run() {
		contexto.apagar();
	}
}
