package dam;

public class HolaMundo {
	public static void main(String[] args) {
		System.out.println("Inicio");
		int cont = 1;
		while (cont <=10) {
			System.out.printf(" %4d > Hola mundo\n", cont);
			cont++;
		}
		System.out.println("¡Fin!");
	}
}
