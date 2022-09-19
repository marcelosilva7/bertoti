/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Fatec
 */
public class Locadora {
    
    private List<Dvd> dvds = new LinkedList<Dvd>();
    
    public void cadastrarDvd(Dvd dvd){
        dvds.add(dvd);
    }
    
    public List<Dvd> buscarDvdPorEspecificacao(Especificacao espec){
        List<Dvd> dvdsencontrados = new LinkedList<Dvd>();
        for(Dvd dvd:dvds){
            if(dvd.getEspec().comparar(espec)){
                dvdsencontrados.add(dvd);
            }                
            } return dvdsencontrados;
        }
        
    public Dvd buscarPorTitulo(String titulo){
        for (Dvd dvd:dvds){
            if(dvd.getTitulo().equals(titulo)){
                return dvd;
            }
        }
        return null;
    }
    
}
