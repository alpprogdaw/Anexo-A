import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		char[]alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M'};
		int i = 0;
		int limite = 0;
		char c;
		System.out.println("Introduzca un caracter del alfabeto: ");
		c = in.nextLine().toUpperCase().trim().charAt(0);
		
		while (alfabeto[i] != c && i<alfabeto.length) {
			i++;
		}
		if (i < alfabeto.length) {
			limite = i;
		}
		for (int j = 0; j <= limite; j++) {
			for (int t = 0; t <= j; t++) {
				System.out.print(alfabeto[j]);
			}
			System.out.println();
		}

				
	}
		
		
}
