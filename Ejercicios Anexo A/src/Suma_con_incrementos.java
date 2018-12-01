import java.util.Scanner;

public class Suma_con_incrementos {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a,b;
		int suma;
		
		System.out.println("Introduce dos numeros enteros.");
		
		System.out.println("Introduzca a: ");
		a = in.nextInt();
		
		System.out.println("Introduzca b: ");
		b = in.nextInt();
		
		suma=a; 
		//sumamos a a b veces 1
		
		for (int i =1; i<=b; i++) { //b veces
			suma = suma + 1;
		}
		System.out.println("La suma de " + a + " + " + b + " es " + suma);
		
	}

}
