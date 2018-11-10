import java.util.Scanner;

public class Cadenas_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int a;
		int b;
		char c;

		System.out.println("Introduce numero a: ");
		a = in.nextInt();
		System.out.println("Introduce numero b");
		b = in.nextInt();
		System.out.println("Introduzca la operación a relaizar (+,-,*,/,):  ");
		c = in.next().charAt(0); //obtener el primer caracter del string que se lee 

		switch(c) {
			case '+': System.out.println(a +  " + " + b + " = " + (a+b)); 
			break;
			case '-': System.out.println(a + " - " + b + " = " + (a-b) );
			break;
			case '*': System.out.println(a + " * "+ b + " = " + (a*b));
			break;
			case '/': System.out.println(a + " / "+ b + " = " + ((float)a/(float)b)); //para cambiar a tipo float
			break;
			default: System.out.println("Fin");
			break;
		}

	}

}
