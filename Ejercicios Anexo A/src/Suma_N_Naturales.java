import java.util.Scanner;

public class Suma_N_Naturales {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int n;
		//inicializar la variable suma
		int suma = 0;

		System.out.println("Introduce el numero >0 ");
		n = in.nextInt();
		while(n<0) {
			System.out.println("Introduce un numero n>0  ");
			n = in.nextInt();
		}


		for (int naturales = 1; naturales <= n; naturales++) {
			suma = suma + naturales;
		}
		System.out.println("La suma de " + n + " numeros naturales es " + suma);

		in.close();
	}
}
