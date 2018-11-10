
public class Ejer_21 {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		int contador = 0;
		int aux = a; //para que no nos cambie el valor de a al final del bucle
		
		while (aux >= b) {
			aux = aux - b;
			contador++;
		}
		System.out.println(a+ " / " + b + " = " + contador);

	}

}
