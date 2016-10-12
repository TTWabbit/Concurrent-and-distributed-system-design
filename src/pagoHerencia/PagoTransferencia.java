package pagoHerencia;

public class PagoTransferencia extends Pago {

    private String cuentaCorriente;

    public PagoTransferencia(double c, String cuentaCorriente) {
        super(c);
        this.cuentaCorriente = cuentaCorriente;
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
