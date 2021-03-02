
package Logica;
//nexo entre el Servlet y la Controladora de Persistencia:

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis =new ControladoraPersistencia();
    
    /*public void crearLibro(){
        //Libro libro = new Libro("3","La Conspiracion","Dan Brown","Novela","Vendido");
        public void crearLibro(String cod_libro, String titulo, String autor, String genero, String estado) {
        Libro libro = new Libro();
        libro.setCod_libro(cod_libro);
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setGenero(genero);
        libro.setEstado(estado);
        
        controlPersis.crearLibro(libro);
        
        
    }
        //controlPersis.crearLibro(libro);
   // }
*/
    public void crearLibro(String cod_libro,String titulo, String autor,String genero, String estado) {
        Libro libro = new Libro();
        libro.setCod_libro(cod_libro);
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setGenero(genero);
        libro.setEstado(estado);
        
        controlPersis.crearLibro(libro);
    }
    
}
