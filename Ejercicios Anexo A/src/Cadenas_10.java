
public class Cadenas_10 {

	public static void main(String[] args) {
		int n = 53;
		int resto;
		int aux = n;
		int base = 16;
		String cadena = "";
		
		while (n > 0) {
			resto = n % base;
			n = n / base;
			cadena = String.valueOf(resto) + cadena; //este operador mas nos concatena al resto la cadena
		}
		System.out.println(aux + " en base " + base + " = " + cadena);
	}
}
