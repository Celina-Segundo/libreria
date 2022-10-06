package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.Scanner;

/*
En general se crea un servicio para administrar las operaciones CRUD
(Create, Remove, Update, Delete) cada una de las entidades y las consultas de cada
entidad.
*/
public class servicio_libro {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
   
   public Libro crearLibro() {
       System.out.println("Ingrese el NOMBRE del libro:");
       String nombre = leer.next();
       
       System.out.println("Ingrese el AUTOR del libro");
       String nomAut = leer.next();
       Autor autor = new Autor();
       autor.setNombre(nomAut);
       
       System.out.println("Ingrese el AÑO de impresion del libro:");
       int anio = leer.nextInt();
       
       System.out.println("Ingrese la EDITORIAL del libro:");
       String nomEdit = leer.next();
       Editorial editorial = new Editorial();
       editorial.setNombre(nomEdit);
       
       System.out.println("Ingrese la CANTIDAD DE EJEMPLARES del libro en la libreria:");
       int ejemplares = leer.nextInt();
       
       System.out.println("Ingrse la CANTIDAD DE EJEMPLARES PRESTADOS:");
       int ejemplaresPrestados = leer.nextInt();
       
       int ejemplaresRestantes = ejemplares - ejemplaresPrestados;
       
      //public Libro(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Autor autor, Editorial editorial)  
       Libro libro = new Libro(1, nombre, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, true, autor, editorial);
       
       System.out.println(libro.toString());
       return libro;
   }
    
   public void eliminarLibro(Libro libro) {
       libro.setAlta(false);
   }
   
   
}
