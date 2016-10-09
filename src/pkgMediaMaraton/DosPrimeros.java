package pkgMediaMaraton;

public class DosPrimeros {
	
	public int[] arrayPrimeroSegundo (double[] tiempos){
		//Este metodo obtiene los indices del menor y segundo menor valor
		//del array de tiempos que se le pasa y los devuelve en un array.
		int index=0, primero = 0, segundo = 0;
		
		for(double tiempo: tiempos){
			if(tiempo < tiempos[primero]){ 
				segundo = primero;
				primero = index;
			}
			else if(tiempo <= tiempos[segundo]){
				segundo = index;
			}	
			index++;
		}
		
		int[] primeroSegundo = {primero,segundo};
		return primeroSegundo;	
	}
}
