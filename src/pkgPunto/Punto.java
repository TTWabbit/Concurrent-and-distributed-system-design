package pkgPunto;

public class Punto {
	
	private double x,y;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Punto(){
		
	}
	public static void traslacionStatic(Punto p, int dx, int dy){
		p.setX(p.getX()+dx);
		p.setY(p.getY()+dy);
	}
	
	public void trasladarPunto(int dx, int dy){
		x += dx;
		y += dy;
	}

}
