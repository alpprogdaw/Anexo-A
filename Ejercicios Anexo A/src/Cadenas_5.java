import java.util.Scanner;

public class Cadenas_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String[] cadenas = new String[10];
		
		System.out.println("Introduce unas cadenas de caracteres: ");
		
		for (int i = 0; i < cadenas.length; i++) {
			System.out.println("Introduzca cadena " + i);
			cadenas[i] = in.nextLine();
		}
		System.out.println("Las cadenas de las posiciones pares son: ");
		for (int i = 0; i < cadenas.length; i = i + 2) {
			System.out.println(cadenas[i]);
		}
		System.out.println("Las cadenas de las posiciones impares son: ");
		for (int i = 1; i < cadenas.length; i = i + 2) {
			System.out.println(cadenas[i]);
		}
		in.close();
	}
}
