package pagoInterfaz;

public class PagoIndeterminado {

    public static void main(String[] args) {

        System.out.println("Proceso de pago indeterminado\n");

        // IPago indeterminado = new IPago(116.54);
        IPago indeterminado = new PagoTarjeta(116.54, "MC 3414508762");

        if (indeterminado.autorizar()) {
            indeterminado.cargar();
        }
    }

}
