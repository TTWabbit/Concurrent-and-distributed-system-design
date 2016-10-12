package pagoEnumerado;

public class ProcesaPago {

    public static void main(String[] args) {

        System.out.println("Proceso de pagos con tipo enumerado\n");

        Pago pago1 = new Pago(526.71, MedioDePago.Tarjeta, "AMEX 330593701");
        Pago pago2 = new Pago(104.05, MedioDePago.PayPal, "paco-2804");
        Pago pago3 = new Pago(831.56, MedioDePago.Transferencia, "IBAN ES76 34 2801 68 00174145");
        Pago pago4 = new Pago(333.44, MedioDePago.Movil, "666666666");

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
        
        System.out.println("----------------------------------");

        if (pago4.autorizar()) {
            pago4.cargar();
        }
    }
}
