package pagoInterfaz;

import java.util.List;
import java.util.LinkedList;

public class ProcesarPagosPendientes {

    public static void main(String[] args) {

        System.out
                .println("Proceso de una colección de pagos pendientes con interfaces, polimorfismo y vinculación dinámica\n");

        List<IPago> pendientes = new LinkedList<IPago>();

        pendientes.add(new PagoTarjeta(526.71, "AMEX 330593701"));
        pendientes.add(new PagoPayPal(104.05, "paco-2804"));
        pendientes.add(new PagoTransferencia(831.56, "IBAN ES76 34 2801 68 00174145"));
        pendientes.add(new PagoTarjeta(37.50, "VISA 2388960136"));
        pendientes.add(new PagoPayPal(74.31, "eva-1552"));
        pendientes.add(new PagoMovil(74.31, "94394323"));
        pendientes.add(new PagoMovil(31.74, "32349349"));


        procesarPagos(pendientes);
    }

    private static void procesarPagos(List<IPago> pendientes) {
        // polimorfismo de datos

        System.out.println("procesando " + pendientes.size() + " pagos pendientes: \n");
        for (IPago p : pendientes) {
            if (p.autorizar()) { // vinculación dinámica
                p.cargar();
            }
            System.out.println("-------------------");
        }
    }
}
