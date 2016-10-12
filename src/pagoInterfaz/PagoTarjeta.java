package pagoInterfaz;

public class PagoTarjeta implements IPago {

    private double cantidad;
    private String numTarjeta;

    public PagoTarjeta(double cantidad, String numTarjeta) {
        this.cantidad = cantidad;
        this.numTarjeta = numTarjeta;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void cargar() {
        System.out.println("cargando " + getCantidad() + " euros en la tarjeta " + numTarjeta);
    }

    public void revertir() {
        System.out.println("devolviendo " + getCantidad() + " euros a la tarjeta " + numTarjeta);
    }

    public boolean autorizar() {
        System.out.println("autorizando cargo de " + getCantidad() + " euros en la tarjeta "
                + numTarjeta);
        return true;
    }
}
