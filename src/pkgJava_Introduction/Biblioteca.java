package pkgJava_Introduction;

public class Biblioteca {
	
	static int librosPrestados;
	
	public Biblioteca(){
		librosPrestados = 0;
	}
	
	public static void main(String[] args) {
		
		Biblioteca biblioteca1 = new Biblioteca();
		Libro libro1 = new Libro("La isla del tesoro");
		Libro libro2 = new Libro("Señales y sistemas");
		Libro libro3 = new Libro("Java para principiantes");
		
		Libro.prestar(libro1);
		Libro.prestar(libro2);
		Libro.devolver(libro3);
		
		Libro.prestar(libro1);
		Libro.prestar(libro2);
		Libro.devolver(libro3);
		
		
		System.out.println("El total de libros prestados actualmente es de " +
		                    Biblioteca.librosPrestados);
	
	}

}
