import java.util.Scanner;
public class Main {
	public static void main(String Args[]) {
		Persona p = new Persona();
		Scanner s = new Scanner(System.in);
		System.out.print("Escriba su edad: ");
		int años = s.nextInt();
		p.CalcularAñosHastaJubilación(años);
	}
}
