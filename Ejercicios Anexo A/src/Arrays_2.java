
public class Arrays_2 {

	public static void main(String[] args) {
		
		int [] a = {2,5,8};
		int [] b = {4,6,2};
		int escalar = 0;
		
		if (a.length != b.length) {
			System.out.println("La operación no se puede realizar.");
		}
		else {
			for (int i = 0; i<a.length;i++) { //recorremos cualquiera de los dos vectores ya que tienen la misma long
				escalar = escalar + (a[i]*b[i]);
			}
			System.out.println("El producto escalar es: " + escalar);
		}

	}

}
