package ejercicio.pkg5;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Sorteo {
    
    private double dineroCupon;
    private int pagosRealizados;
    private int pagosPendientes;
    private int totalParticipates;
    private double dineroRecogido;

    public Sorteo(double dineroCupon, int totalPersonas) {
        
        this.dineroCupon = dineroCupon;
        this.totalParticipates = totalPersonas;
        dineroRecogido = totalParticipates * dineroCupon;
        
    }
    
    public void registrarPago(){
    
        this.pagosRealizados++;
    
    }
    
    public void apuntarNuevoParticipante(){
    
        this.totalParticipates++;
        dineroRecogido += dineroCupon;
    
    }
    
    //GETTERS
    
    public double getDineroCupon() {
        return this.dineroCupon;
    }

    public int getPagosRealizados() {
        return this.pagosRealizados;
    }

    public int getPagosPendientes() {
        
        this.pagosPendientes = this.totalParticipates;
        
        this.pagosPendientes = this.getTotalParticipates() - this.getPagosRealizados();
        
        return this.pagosPendientes;
    }

    public int getTotalParticipates() {
        return this.totalParticipates;
    }

    public double getDineroRecogido() {
        return this.dineroRecogido;
    }
    
    //SETTERS

    public void setDineroCupon(double dineroCupon) {
        this.dineroCupon = dineroCupon;
    }  
        
}
