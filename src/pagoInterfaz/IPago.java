package pagoInterfaz;

public interface IPago {

    double getCantidad();

    void cargar();

    void revertir();

    boolean autorizar();
}
