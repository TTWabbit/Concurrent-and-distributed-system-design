package pkgJava_Introduction;

public class Libro {
	
	String nombre;
	
	public Libro(String nombre){
		this.nombre = nombre;
	}
	
	public static void prestar(Libro libro) {

		Biblioteca.librosPrestados++;
	}

	public static void devolver(Libro libro) {
		
		Biblioteca.librosPrestados--;
	}
}
