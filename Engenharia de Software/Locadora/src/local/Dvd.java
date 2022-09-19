/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

/**
 *
 * @author Fatec
 */
public class Dvd {
    private String titulo;
    private Especificacao espec;

    public Dvd(String titulo, Especificacao espec) {
        this.titulo = titulo;
        this.espec = espec;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Especificacao getEspec() {
        return espec;
    }

    public void setEspec(Especificacao espec) {
        this.espec = espec;
    }
    
    
}
