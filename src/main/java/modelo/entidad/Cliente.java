package modelo.entidad;
// Generated 8/10/2022 11:54:35 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private String nombre;
     private String apellido;
     private String dpi;
     private int telefono;
     private int estado;
     private Set<Prestamo> prestamos = new HashSet<Prestamo>(0);

    public Cliente() {
    }

	
    public Cliente(String nombre, String apellido, String dpi, int telefono, int estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.telefono = telefono;
        this.estado = estado;
    }
    public Cliente(String nombre, String apellido, String dpi, int telefono, int estado, Set<Prestamo> prestamos) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.dpi = dpi;
       this.telefono = telefono;
       this.estado = estado;
       this.prestamos = prestamos;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDpi() {
        return this.dpi;
    }
    
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public Set<Prestamo> getPrestamos() {
        return this.prestamos;
    }
    
    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }




}


