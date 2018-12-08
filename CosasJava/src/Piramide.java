import java.util.Scanner;
public class Piramide {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int filas = 0;
        
		System.out.print("Introduzca el número de filas: ");
		
		while (teclado.hasNextInt() == false) {
			teclado.next();
			
			System.out.print("Error. Introduzca un número entero: ");
			
		}
		
		filas = teclado.nextInt();
        
        for (int i = 1; i < filas+1; i++) {
        	
        	for (int a = 0; a < i; a++) {
        		System.out.print((a+1) + " ");
        	}
        	
        	System.out.print("\n");
     
        }
        
        teclado.close();
	}
}