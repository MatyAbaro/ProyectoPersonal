
package Persistencia;

import Logica.Libro;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    LibroJpaController libroJpa = new LibroJpaController();

    public void crearLibro(Libro libro) {
        try {
            libroJpa.create(libro);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
