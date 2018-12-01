import java.util.Scanner;

public class Ejer_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int contador=0;
		int suma=0;
		int numero;
		int n; //numeros a leer
		int x=2;
		
		System.out.println("Indica cuantos numeros quieres leer: ");
		n=in.nextInt();
		
		while (contador<n) {
			System.out.println("Introduzca un numero");
			numero=in.nextInt();
			contador++;
			//se suma si el nº no es divisible por x
			if (numero % x != 0) {
				suma = suma + numero;
			}
		}
		System.out.println("La suma de los divisores de " + x + " es " + suma);
		
	}

}
