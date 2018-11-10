import java.util.Scanner;

public class Cadenas_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		char c;
		String cadena = new String();
		
		System.out.println("Introduzca un caracter: ");
		c = in.next().charAt(0);
		
		while ( c != 'b') {
			cadena = cadena + c;
			System.out.println("Introduzca el siguiente caracter: ");
			c = in.next().charAt(0);
		}
		System.out.println("Secuencia de caracteres leidos: " + cadena);
	}
}
