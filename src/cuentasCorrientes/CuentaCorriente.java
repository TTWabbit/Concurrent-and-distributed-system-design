package cuentasCorrientes;

public class CuentaCorriente implements IIngresar, IGastar {

    private double saldo;

    public CuentaCorriente(double saldoInicial) {
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void gastar(double cantidad) {
        if (saldo >= cantidad) {
            saldo = saldo - cantidad;
        }
    }

    public void ingresar(double cantidad) {
        saldo = saldo + cantidad;
    }
}
