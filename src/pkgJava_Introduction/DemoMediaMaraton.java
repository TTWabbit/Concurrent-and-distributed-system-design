package pkgJava_Introduction;

public class DemoMediaMaraton {

	public static void main(String[] args) {
		
		double[] tiempos={7.4, 3.4, 6.7, 2.3, 3.1, 3.2, 3.3, 1.6, 7.6, 8.3};
		int index = 0;
		DosPrimeros dosprimeros = new DosPrimeros();
		
		System.out.println("RESULTADOS DE LA MEDIA MARATON");
		System.out.println();
		System.out.println("Hemos participado "+tiempos.length+" corredores");
		System.out.println("con los siguientes resultados:");
		System.out.println();
		
		for(double tiempo:tiempos){
			index++;
			System.out.println("Tiempo del corredor "+index+": "+tiempo);
		}
		
		System.out.println();
		int primero = dosprimeros.arrayPrimeroSegundo(tiempos)[0];
		System.out.println("El mejor ha sido el corredor número "+ (primero+1));
		System.out.println("con un tiempo de "+tiempos[primero]);
		System.out.println();
		int segundo = dosprimeros.arrayPrimeroSegundo(tiempos)[1];
		System.out.println("El segundo mejor ha sido el corredor "+ (segundo+1));
		System.out.println("con un tiempo de "+tiempos[segundo]);
	}

}
