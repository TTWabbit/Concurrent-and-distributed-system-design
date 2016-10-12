package pagoEnumerado;

public class Pago {

    private double cantidad;
    private MedioDePago medio;
    private String numTarjeta;
    private String codigoIBAN;
    private String idPayPal;
    private String idMovil;

    public Pago(double c, MedioDePago m, String infoMedioPago) { // Constructor
        cantidad = c;
        medio = m;
        switch (medio) {
        case Tarjeta:
            numTarjeta = infoMedioPago;
            break;
        case Transferencia:
            codigoIBAN = infoMedioPago;
            break;
        case PayPal:
            idPayPal = infoMedioPago;
            break;
        case Movil:
        	idMovil = infoMedioPago;
        	break;
		default:
			System.out.println("Medio de pago no reconocido.");
			break;
        }
    }

    public double getCantidad() {
        return cantidad;
    }

    public MedioDePago getMedioDePago() {
        return medio;
    }

    public void cargar() {
        switch (medio) {
        case Tarjeta:
            System.out.println("cargando " + cantidad + " euros en la tarjeta " + numTarjeta);
            break;
        case Transferencia:
            System.out.println("cargando " + cantidad + " euros en la cuenta corriente "
                    + codigoIBAN);
            break;
        case PayPal:
            System.out.println("cargando " + cantidad + " euros en la cuenta PayPal " + idPayPal);
            break;
        case Movil:
        	System.out.println("cargando " + cantidad + " euros en el movil número " + idMovil);
        	break;
        default:
            break;
        }
    }

    public void revertir() {
        switch (medio) {
        case Tarjeta:
            System.out.println("reembolsando " + cantidad + " euros en la tarjeta " + numTarjeta);
            break;
        case Transferencia:
            System.out.println("reintegrando " + cantidad + " euros en la cuenta corriente "
                    + codigoIBAN);
            break;
        case PayPal:
            System.out.println("devolviendo " + cantidad + " euros a la cuenta de PayPal "
                    + idPayPal);
            break;
        case Movil:
        	System.out.println("devolviendo " + cantidad + " euros a la cuenta del movil "
        			+ idMovil);
        default:
            break;
        }
    }

    public boolean autorizar() {
        switch (medio) {
        case Tarjeta:
            System.out.println("solicitando autorización para cargo en la tarjeta " + numTarjeta);
            break;
        case Transferencia:
            System.out.println("enviando orden de cargo a la cuenta corriente " + codigoIBAN);
            break;
        case PayPal:
            System.out.println("solicitando acceso a la cuenta de PayPal " + idPayPal);
            break;
        case Movil:
        	System.out.println("solicitando acceso a la cuenta de movil " + idMovil);
        	break;
        default:
            break;
        }
        return true;
    }
}
