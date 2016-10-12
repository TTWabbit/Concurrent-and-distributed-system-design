package pagoInterfaz;

public class PagoTransferencia implements IPago {

    private double cantidad;
    private String cuentaCorriente;

    public PagoTransferencia(double cantidad, String cuentaCorriente) {
        this.cantidad = cantidad;
        this.cuentaCorriente = cuentaCorriente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void cargar() {
        System.out.println("cargando " + getCantidad() + " euros en la cuenta corriente "
                + cuentaCorriente);
    }

    public void revertir() {
        System.out.println("reintegrando " + getCantidad() + " euros a la cuenta corriente "
                + cuentaCorriente);
    }

    public boolean autorizar() {
        System.out.println("autorizando cargo de " + getCantidad()
                + " euros en la cuenta corriente " + cuentaCorriente);
        return true;
    }
}
