import java.util.Scanner;

public class Pares_Próximos {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int x;
		int par1;
		int par2;
		
		System.out.println("Introduce un numero para el cual quiera adivinar los dos pares más próximos; ");
		x = in.nextInt();
		
		if (x % 2 == 0) {
			par1 = x + 2;
			par2 = x - 2;
			
		}
		else {
			par1 = x + 1;
			par2 = x - 1;
		}
		System.out.println("Los numeros pares mas próximos son " + par1 + " y " + par2);
		in.close();
	}
}
