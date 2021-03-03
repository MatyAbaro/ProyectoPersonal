
package Persistencia;

import Logica.Libro;
import Logica.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    LibroJpaController libroJpa = new LibroJpaController();
    UsuarioJpaController jpaUsuario = new UsuarioJpaController();

    public void crearLibro(Libro libro) {
        try {
            libroJpa.create(libro);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void crearUsuario(Usuario usu){
        try {
            jpaUsuario.create(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Libro> getLibros() {
       return libroJpa.findLibroEntities();
    }
    public List<Usuario> getUsuarios() {
       return jpaUsuario.findUsuarioEntities();
    }
}
