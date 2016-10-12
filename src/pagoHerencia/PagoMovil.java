package pagoHerencia;

public class PagoMovil extends Pago{
	
	private String numMovil;
	
	public PagoMovil(double c, String numMovil){
		
		super(c);
		this.numMovil = numMovil;
	}
	
	public void cargar() {
        System.out.println("cargando " + getCantidad() + " euros en la cuenta Movil "
                + numMovil);
    }

    public void revertir() {
        System.out.println("devolviendo " + getCantidad() + " euros a la cuenta Movil "
                + numMovil);
    }

    public boolean autorizar() {
        System.out.println("autorizando cargo de " + getCantidad() + " euros en la cuenta Movil "
                + numMovil);
        return true;
    }
	
	

}
