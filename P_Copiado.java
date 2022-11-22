

package p_copiado;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class P_Copiado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombreSO = "os.name";
        String versionSO = "os.version";
        String arquitecturaSO = "os.arch";
        String path = "java.class.path";
        String home = "java.home";
        String vendor = "java.vendor";
        String vendor_url = "java.vendor.url";
        String J_version = "java.version";
        String user_dir = "user.dir";
        String user_home = "user.home";
        String user_name = "user.name";
        
        
        
        System.out.println("\n Informacion sobre el sistema operativo: ");
        
        System.out.println("\n nombre del SO: "+System.getProperty(nombreSO));
            
        System.out.println("\n version del SO: "+System.getProperty(versionSO));
        
        System.out.println("\n Arquitectura del SO: "+System.getProperty(arquitecturaSO));
            
        System.out.println("\n Ruta utilizada para buscar directorios y archivos JAR que contienen archivos de clase: "+System.getProperty(path));
        
        System.out.println("\n Directorio de instalación para Java Runtime Environment (JRE): "+System.getProperty(home));
        
        System.out.println("\n Nombre del proveedor de JRE: "+System.getProperty(vendor));
            
        System.out.println("\n URL del proveedor de JRE: "+System.getProperty(vendor_url));
            
        System.out.println("\n Número de versión de JRE: "+System.getProperty(J_version));
            
        System.out.println("\n Directorio de trabajo de usuarios: "+System.getProperty(user_dir));
            
        System.out.println("\n Directorio de inicio de usuario: "+System.getProperty(user_home));
            
        System.out.println("\n Nombre de cuenta de usuario: "+System.getProperty(user_name));
    }

}
