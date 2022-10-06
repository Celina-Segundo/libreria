/*
En general se crea un servicio para administrar las operaciones CRUD
(Create, Remove, Update, Delete) cada una de las entidades y las consultas de cada
entidad.
 */
package servicios;

import entidades.Autor;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class autor_servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Autor crearAutor() {
        Autor a = new Autor();
        System.out.println("Ingrese el nombre del autor.");
        String nombre = leer.next();
        if (nombre != null) {
          a.setNombre(nombre);  
        }
        
        return a;
    }
    
    public void eliminarAutor() {
        
    }
    
}
