package pagoInterfaz;

public class PagoPayPal implements IPago {

    private double cantidad;
    private String cuentaPayPal;

    public PagoPayPal(double cantidad, String cuentaPayPal) {
        this.cantidad = cantidad;
        this.cuentaPayPal = cuentaPayPal;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void cargar() {
        System.out.println("cargando " + getCantidad() + " euros en la cuenta PayPal "
                + cuentaPayPal);
    }

    public void revertir() {
        System.out.println("devolviendo " + getCantidad() + " euros a la cuenta PayPal "
                + cuentaPayPal);
    }

    public boolean autorizar() {
        System.out.println("autorizando cargo de " + getCantidad() + " euros en la cuenta Paypal "
                + cuentaPayPal);
        return true;
    }
}
