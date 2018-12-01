import java.util.Scanner;

public class Arrays_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int v1,v2,v3;

		System.out.print("Ingrese el tamaño del vector 1:");
		v1 = in.nextInt();

		int vector1[] = new int[v1];
		for(int i=0; i<vector1.length; i++){
			System.out.print("\nIngrese un numero entero para la posicion " + i + " :");
			vector1[i]=in.nextInt();
		}
		System.out.print("\nIngrese el tamaño del vector 2:");
		v2 = in.nextInt();

		int vector2[] = new int[v2];
		for(int i=0; i<vector2.length; i++){
			System.out.print("\nIngrese un numero entero para la posicion " + i + " :");
			vector2[i]=in.nextInt();
		}
		v3=v1;
		if (v2 > v1)
			v3=v2;
		int[] vector3 = new int[v3];
		//recorremos vector 3 para hacer la suma
		for(int i=0; i<vector3.length; i++){
			int almacen1 = 0;
			if (vector1.length > i){
				almacen1 = vector1[i];
			}
			int almacen2 = 0;
			if (vector2.length > i){
				almacen2 = vector2[i];
			}
			vector3[i] = almacen1 + almacen2;
			System.out.println("\nLa suma de la posicion "+ i + " es:"+vector3[i]);                      
		}
		in.close();
	}
}

