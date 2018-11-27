import java.util.Scanner;

public class Ejer_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String cadena = new String();
		
		System.out.println("Introduce un cadena de caracteres: ");
		cadena = in.nextLine();
		
		
		System.out.println(cadena.toUpperCase());
	}

}
