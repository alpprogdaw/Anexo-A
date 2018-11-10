import java.util.Scanner;

public class Suma_N_Naturales {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n;
		int suma = 0;
		
		System.out.println("Introduce el numero de numeros naturales a sumar: ");
		n = in.nextInt();
		
		if (n > 0) {
			for (int naturales = 1; naturales <= n; naturales++) {
				suma = suma + naturales;
			}
			System.out.println("La suma de " + n + " naturales es " + suma);
		}
		else {
			System.out.println("El valor introducido no es válido");
		}
				in.close();
	}
}
