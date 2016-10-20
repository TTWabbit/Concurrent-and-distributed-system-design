package pkgJava_Introduction;

import java.util.*;

public class DemoExcepciones {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		boolean success = false;
		
		while (!success){

			try{
				
				System.out.println("Introduzca el primer n�mero: ");
				int a = console.nextInt(); 

				System.out.println("Introduzca el segundo n�mero: ");
				int b = console.nextInt();

				int resultado = a/b;
				
				success = true;

				System.out.println("El resultado de la divisi�n es: "+ resultado);
			}

			catch(InputMismatchException exc1){
				console.nextLine();
				System.err.println("Capturada excepci�n: " + exc1.getMessage());
				exc1.printStackTrace();
				
			}
			
			catch(ArithmeticException exc2){
				console.nextLine();
				System.err.println("Capturada excepci�n: " + exc2.getMessage());
				exc2.printStackTrace();
				
			}
			
			finally{}
			
		}
		
		console.close();
	}

}
