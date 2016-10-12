package pagoHerencia;

public class PagoPayPal extends Pago {

    private String cuentaPayPal;

    public PagoPayPal(double c, String cuentaPayPal) {
        super(c);
        this.cuentaPayPal = cuentaPayPal;
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
