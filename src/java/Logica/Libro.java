
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable {
    @Id
    String cod_libro;
    
    @Basic
    String titulo;
    String autor;
    String genero;
    String estado;

    public Libro() {
    }

    public Libro(String cod_libro, String titulo, String autor, String genero, String estado) {
        this.cod_libro = cod_libro;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.estado = estado;
    }

    public String getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(String cod_libro) {
        this.cod_libro = cod_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
