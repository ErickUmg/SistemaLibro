package modelo.entidad;
// Generated 8/10/2022 11:54:35 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tipo generated by hbm2java
 */
public class Tipo  implements java.io.Serializable {


     private Integer idTipo;
     private String tipo;
     private int estado;
     private Set<Libro> libros = new HashSet<Libro>(0);

    public Tipo() {
    }

	
    public Tipo(String tipo, int estado) {
        this.tipo = tipo;
        this.estado = estado;
    }
    public Tipo(String tipo, int estado, Set<Libro> libros) {
       this.tipo = tipo;
       this.estado = estado;
       this.libros = libros;
    }
   
    public Integer getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public Set<Libro> getLibros() {
        return this.libros;
    }
    
    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }




}


