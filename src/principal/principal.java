
package principal;

import servicios.servicio_libro;

public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicio_libro servLibro = new servicio_libro();
        servLibro.crearLibro();
        
    }
    
}
