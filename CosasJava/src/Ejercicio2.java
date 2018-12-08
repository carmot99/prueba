import java.util.Scanner; 

/**

 * Este programa imprime un rombo de asteriscos de una altura igual a un numero entero introducido por teclado.

 * @author: Carlos Mota

 * @version: 1.0

 */

public class Ejercicio2 {
	public static void main(String[] args) {
		//Declaración de variables
		int entrada = 0; 
		int res = 0;
		int numLineas=0; 
		int numEspacios=0; 
		int numEstrellas=0;
		//Scanner
		Scanner input = new Scanner(System.in);
		//Texto a imprimir
		System.out.println("Programa que imprime un rombo de asteriscos de una altura igual a un numero entero introducido por teclado ");
		System.out.println("Introduce un número entero: ");
		//Comprobación de enteros
		while (!input.hasNextInt()) {
			System.out.print("Atencion! Introduce un nÃomero entero: ");
		    input.next();
		}
		
		entrada = input.nextInt();
		//Primera mitad del rombo
		for (numLineas = 1; numLineas <= entrada; numLineas++) {
			for (numEspacios = entrada; numEspacios > numLineas; numEspacios--) {
				System.out.print(" "); //Impresión de espacios en blanco
			}
			
			System.out.print("* "); //Impresión de estrella simple
			for ( numEstrellas = 1; numEstrellas<numLineas; numEstrellas++) {
				System.out.print("* * "); //Impresión de doble estrella
			}
		
			System.out.println(""); //Saltos de línea
		}
		//Segunda mitad del rombo
		for (numLineas = entrada; numLineas>1; numLineas--) {
			for (numEspacios = entrada; numEspacios > numLineas-1; numEspacios--) {
				System.out.print(" "); //Impresión de espacios en blanco
			}
			
			System.out.print("* "); //Impresión de estrella simple
			for (numEstrellas = numLineas-1; numEstrellas>1; numEstrellas--) {
				System.out.print("* * "); //Impresión de doble estrella
			}
		
			System.out.println(""); //Saltos de línea
		}
	} 
}