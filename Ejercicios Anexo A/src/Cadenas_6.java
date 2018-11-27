
public class Cadenas_6 {

	public static void main(String[] args) {
		String cadena = "anitalavalatina";
		//converti un string en array de char
		char[] cc=cadena.toCharArray();
		
		char[] cadena_inv = new char[cadena.length()];
		
		int j;
		
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			j = (cadena.length()-1) -i;
			cadena_inv[j] = cc[i];
		}
		//convertir el array de char a string
		String cv=String.valueOf(cadena_inv);
		
		if(cadena.equals(cv)) {
			System.out.println("La cadena " + cadena + " es palindroma");
			
		}
		else {
			System.out.println("La cadena " + cadena + " no es palindroma");
			
			
		}
		
		

	}

}
