import java.util.Scanner;

public class Arrays_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int v1,v2;
		
		System.out.print("Ingrese el tamaño del primer vector: ");
		v1 = in.nextInt();
		
		int vector1[] = new int[v1];
		for(int i=0; i<vector1.length; i++){
			System.out.print("\nIntroduzca  el numero entero de la posicion " + i + ": ");
			vector1[i] = in.nextInt();
		}
		
		System.out.print("\nIngrese el tamaño del segundo vector: ");
		v2 = in.nextInt();
		
		int vector2[] = new int[v2];
		for(int j=0; j<vector2.length; j++){
			System.out.print("\nIntroduzca el numero entero de la posicion " + j + ": ");
			vector2[j] = in.nextInt();
		}
		in.close();
	}

}
