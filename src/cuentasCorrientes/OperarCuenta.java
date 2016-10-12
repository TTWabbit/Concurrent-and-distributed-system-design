package cuentasCorrientes;

public class OperarCuenta {

    public static void main(String[] args) {

        CuentaCorriente cuenta = new CuentaCorriente(2000);

        System.out.println("saldo = " + cuenta.getSaldo());

        normal(cuenta);
        System.out.println("saldo = " + cuenta.getSaldo());

        cigarra(cuenta);
        System.out.println("saldo = " + cuenta.getSaldo());

        hormiga(cuenta);
        System.out.println("saldo = " + cuenta.getSaldo());

    }

    // un usuario normal puede ingresar y extraer de la cuenta
    public static void normal(CuentaCorriente cuenta) {
        cuenta.ingresar(70);
        cuenta.gastar(150);
    }

    // la cigarra solo sabe gastar
    public static void cigarra(IGastar cuenta) {
        cuenta.gastar(500);
        cuenta.getSaldo();
    }

    // la hormiga solo sabe ahorrar
    public static void hormiga(IIngresar cuenta) {
        cuenta.ingresar(300);
    }
}
