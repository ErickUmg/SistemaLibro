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
import modelo.dao.TipoDao;
import modelo.entidad.Tipo;


/**
 *
 * @author FERNANDO
 */
@ManagedBean
@ViewScoped
public class TipoControl {

    /**
     * Creates a new instance of TipoControl
     */
    private List<Tipo> listaTipo;
    private Tipo tipo;

    public TipoControl() {
        tipo = new Tipo();
    }

    public List<Tipo> getListaTipo() {
        TipoDao ad = new TipoDao();
        listaTipo = ad.listarTipo();
        return listaTipo;
    }

    public void setListaTipo(List<Tipo> listaTipo) {
        this.listaTipo = listaTipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void limpiarTipo() {
        tipo = new Tipo();
    }

    public void agregarTipo() {
        TipoDao ad = new TipoDao();
        ad.agregar(tipo);
    }

    public void modificarTipo() {
        TipoDao ad = new TipoDao();
        ad.modificar(tipo);
        limpiarTipo();
    }

    public void eliminarTipo() {
        TipoDao ad = new TipoDao();
        ad.eliminar(tipo);
        limpiarTipo();
    }
}
