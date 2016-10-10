package pkgJava_Introduction;

public class Biblioteca {
	
	static int librosPrestados;
	static int librosEnPrestamo;
	static Libro[] librosAlmacenados;
	
	public Biblioteca(){
		librosPrestados = 0;
		librosEnPrestamo = 0;
	}
	
	public void prestar(Libro libro){
		if(!libro.prestado){
			libro.prestado = true;
			Biblioteca.librosPrestados++;
			Biblioteca.librosEnPrestamo++;
		}
		else{
			System.out.println("El libro " + libro.nombre + "está en prestamo.");
		}
	}
	
	public void devolver(Libro libro){
		if(libro.prestado){
			libro.prestado= false;
			librosEnPrestamo--;
		}
		else{
			System.out.println("Error, se intenta devolver un libro que no estaba"+
							  " en préstamo.");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Biblioteca biblioteca1 = new Biblioteca();
	
	}

}
