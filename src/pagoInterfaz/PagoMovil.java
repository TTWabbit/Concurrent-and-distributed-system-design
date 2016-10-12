package pagoInterfaz;

public class PagoMovil implements IPago {

	private double cantidad;
    private String numMovil;

    public PagoMovil(double cantidad, String numMovil) {
        this.cantidad = cantidad;
        this.numMovil = numMovil;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void cargar() {
        System.out.println("cargando " + getCantidad() + " euros en el movil numero "
                + numMovil);
    }

    public void revertir() {
        System.out.println("devolviendo " + getCantidad() + " euros a el movil numero "
                + numMovil);
    }

    public boolean autorizar() {
        System.out.println("autorizando cargo de " + getCantidad() + " euros en el movil numero "
                + numMovil);
        return true;
    }

}
