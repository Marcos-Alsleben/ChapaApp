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
public class Maquina {
    
    // Atributos    
    private int cod_maq;
    private String nome;
    
    //Getters e Setters
    public int getCod_maq() {
        return cod_maq;
    }

    public void setCod_maq(int cod_maq) {
        this.cod_maq = cod_maq;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
