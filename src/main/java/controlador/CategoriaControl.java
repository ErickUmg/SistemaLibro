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
import modelo.dao.CategoriaDao;
import modelo.entidad.Categoria;


/**
 *
 * @author FERNANDO
 */
@ManagedBean
@ViewScoped
public class CategoriaControl {

    /**
     * Creates a new instance of CategoriaControl
     */
    private List<Categoria> listaCategoria;
    private Categoria categoria;

    public CategoriaControl() {
        categoria = new Categoria();
    }

    public List<Categoria> getListaCategoria() {
        CategoriaDao ad = new CategoriaDao();
        listaCategoria = ad.listarCategoria();
        return listaCategoria;
    }

    public void setListaCategoria(List<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void limpiarCategoria() {
        categoria = new Categoria();
    }

    public void agregarCategoria() {
        CategoriaDao ad = new CategoriaDao();
        ad.agregar(categoria);
    }

    public void modificarCategoria() {
        CategoriaDao ad = new CategoriaDao();
        ad.modificar(categoria);
        limpiarCategoria();
    }

    public void eliminarCategoria() {
        CategoriaDao ad = new CategoriaDao();
        ad.eliminar(categoria);
        limpiarCategoria();
    }
}
