/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapaapp.model;

/**
 *
 * @author usuario
 */
public class Impressao {
    
    // Atributos    
    private int cod_imp;
    private String motivo;
    
    //Getters e Setters
    public int getCod_imp() {
        return cod_imp;
    }

    public void setCod_imp(int cod_imp) {
        this.cod_imp = cod_imp;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
