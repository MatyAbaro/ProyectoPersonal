
package Logica;
//nexo entre el Servlet y la Controladora de Persistencia:

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

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
    //metodo para comprobar el ingreso desde el login:
     public boolean comprobarIngreso(String usuario, String contra) {
        boolean siOno = false;
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controlPersis.getUsuarios();
        
        for(Usuario usu:listaUsuarios){
            
            if(usu.getNombreUsuario().equals(usuario) && usu.getContrasenia().equals(contra)){
                
                siOno=true;
                return siOno;
            }
        }
        return siOno;
    }
}
