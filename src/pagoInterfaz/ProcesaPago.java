package pagoInterfaz;

public class ProcesaPago {

    public static void main(String[] args) {

        System.out.println("Proceso de pagos con interfaz\n");

        PagoTarjeta pago1 = new PagoTarjeta(526.71, "AMEX 330593701");
        PagoPayPal pago2 = new PagoPayPal(104.05, "paco-2804");
        PagoTransferencia pago3 = new PagoTransferencia(831.56, "IBAN ES76 34 2801 68 00174145");

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
    }
}
