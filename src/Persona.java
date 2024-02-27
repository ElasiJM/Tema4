public class Persona {
	String edadActual;

	public String getEdadActual() {
		return edadActual;
	}

	public void setEdadActual(String edadActual) {
		this.edadActual = edadActual;
	}
	public void CalcularAñosHastaJubilación (int años) {
		int añosJubilacion = 67-años;
		if (añosJubilacion <= 10) {
			System.out.println("Sólo te quedan "+añosJubilacion+" años. ¡Vamos que ya queda poco!");
		}
		else {
			System.out.println("Te quedan "+añosJubilacion+" años. ¡A seguir trabajando gandul!");
		}
	}
}