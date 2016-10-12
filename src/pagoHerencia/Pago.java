package pagoHerencia;

public abstract class Pago {

    private double cantidad;

    public Pago(double c) { // Constructor
        cantidad = c;
    }

    public double getCantidad() {
        return cantidad;
    }

    public abstract void cargar();

    public abstract void revertir();

    public abstract boolean autorizar();
}
