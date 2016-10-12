package pagoHerencia;

public class PagoTarjeta extends Pago {

    private String numTarjeta;

    public PagoTarjeta(double c, String numTarjeta) {
        super(c);
        this.numTarjeta = numTarjeta;
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
