package pagoInterfaz;

public class ProcesaPagosPolimorfismo {

    public static void main(String[] args) {

        System.out
                .println("Proceso de pagos con interfaz, polimorfismo de datos y vinculación dinámica\n");

        IPago pago1 = new PagoTarjeta(526.71, "AMEX 330593701");
        IPago pago2 = new PagoPayPal(104.05, "paco-2804");
        IPago pago3 = new PagoTransferencia(831.56, "IBAN ES76 34 2801 68 00174145");

        if (pago1.autorizar()) {
            pago1.cargar();
        }

        System.out.println("----------------------------------");

        if (pago2.autorizar()) {
            pago2.cargar();
        }

        System.out.println("----------------------------------");

        if (pago3.autorizar()) {
            pago3.cargar();
        }

        System.out
                .println("\nAquí procesamos un pago pendiente con polimorfismo y vinculación dinámica");
        System.out.println("haciendo variar el tipo dinámico del pago");

        // tipo estático tipo dinámico
        IPago pendiente = new PagoTarjeta(37.50, "VISA 2388960136");

        // el tipo estático de pendiente es siempre Pago
        // el tipo dinámico de pendiente ahora es PagoTarjeta

        System.out.println("\nAquí el tipo dinámico es " + pendiente.getClass().getName());
        if (pendiente.autorizar()) { // vinculación dinámica
            pendiente.cargar();
        }

        // nos llega un nuevo pago pendiente, esta vez por PayPal

        pendiente = new PagoPayPal(74.31, "eva-1552");

        // el tipo din�mico de pendiente ahora es PagoPayPal

        System.out.println("\nAquí el tipo dinámico es " + pendiente.getClass().getName());
        if (pendiente.autorizar()) {
            pendiente.cargar();
        }
    }
}
