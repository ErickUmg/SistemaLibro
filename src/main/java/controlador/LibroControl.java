/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.LibroDao;
import modelo.entidad.Libro;


/**
 *
 * @author FERNANDO
 */
@ManagedBean
@ViewScoped
public class LibroControl {

    /**
     * Creates a new instance of LibroControl
     */
    private List<Libro> listaLibro;
    private Libro libro;

    public LibroControl() {
        libro = new Libro();
    }

    public List<Libro> getListaLibro() {
        LibroDao ad = new LibroDao();
        listaLibro = ad.listarLibro();
        return listaLibro;
    }

    public void setListaLibro(List<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void limpiarLibro() {
        libro = new Libro();
    }

    public void agregarLibro() {
        LibroDao ad = new LibroDao();
        ad.agregar(libro);
    }

    public void modificarLibro() {
        LibroDao ad = new LibroDao();
        ad.modificar(libro);
        limpiarLibro();
    }

    public void eliminarLibro() {
        LibroDao ad = new LibroDao();
        ad.eliminar(libro);
        limpiarLibro();
    }
}
