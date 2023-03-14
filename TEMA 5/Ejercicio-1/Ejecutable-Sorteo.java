package ejercicio.pkg5;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sorteo s1 = new Sorteo(5, 25);
        
        double dineroRecogido = s1.getDineroRecogido();
        int totalParticipantes = s1.getTotalParticipates();
        
        s1.apuntarNuevoParticipante();
        s1.registrarPago();
        
        s1.setDineroCupon(10);
        double dinero = s1.getDineroCupon();
        
        s1.registrarPago();
        int pagosRealizados = s1.getPagosRealizados();
                
        int pagoPendiente = s1.getPagosPendientes();
        
        System.out.println("El cupón cuesta "+dinero+" euros");
        System.out.println("\nSe recogido un total "+dineroRecogido+" euros");
        System.out.println("\nHay "+pagoPendiente+" pagos pendientes");
        System.out.println("\nHay "+pagosRealizados+" pagos realizados");
        System.out.println("\nHay "+totalParticipantes+" participantes");
        
        
       
    }

}
