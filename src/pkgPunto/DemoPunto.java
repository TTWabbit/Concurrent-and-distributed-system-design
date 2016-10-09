package pkgPunto;

public class DemoPunto {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto(0.3, 3.0);
		Punto punto2 = new Punto();
		
		punto2.setX(0.0);
		punto2.setY(0.0);
		
		System.out.println("Coordenada x = " + punto1.getX() + " coordenada y = " + punto1.getY());
		System.out.println("Coordenada x = " + punto2.getX() + " coordenada y = " + punto2.getY());
		
		traslacion(punto1, 10, 5);
		traslacion(punto2, 10, 5);
		
		System.out.println("Coordenada x = " + punto1.getX() + " coordenada y = " + punto1.getY());
		System.out.println("Coordenada x = " + punto2.getX() + " coordenada y = " + punto2.getY());
		
		Punto.traslacionStatic(punto2, 10, 5);
		System.out.println("Coordenada x = " + punto2.getX() + " coordenada y = " + punto2.getY());
		
		punto1.trasladarPunto(5, 10);
		System.out.println("Coordenada x = " + punto1.getX() + " coordenada y = " + punto1.getY());


	}
	
	public static void traslacion(Punto p, int dx, int dy){
		p.setX(p.getX()+dx);
		p.setY(p.getY()+dy);
	}

}
