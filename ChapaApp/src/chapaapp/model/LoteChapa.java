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
public class LoteChapa {
    
    // Atributos    
    private int cod_lch;
    private String lote;
    private String situacao;
    private int cod_cadch;
    
    //Getters e Setters

    public int getCod_lch() {
        return cod_lch;
    }

    public void setCod_lch(int cod_lch) {
        this.cod_lch = cod_lch;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getCod_cadch() {
        return cod_cadch;
    }

    public void setCod_cadch(int cod_cadch) {
        this.cod_cadch = cod_cadch;
    }
    
    
}
