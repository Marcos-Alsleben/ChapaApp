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
public class CadastroChapa {
    
    // Atributos    
    private int cod_cadch;
    private String ordemprod;
    private String situacao;
    private int quantidade;
    private String turno;
    private int cod_hcg;
    private String maquina;
    private String apontamento;
    private String descricao;
    private String obs;
    private String criado;
    private String modificado;
    
    //Getters e Setters
    public int getCod_cadch() {
        return cod_cadch;
    }

    public void setCod_cadch(int cod_cadch) {
        this.cod_cadch = cod_cadch;
    }

    public String getOrdemprod() {
        return ordemprod;
    }

    public void setOrdemprod(String ordemprod) {
        this.ordemprod = ordemprod;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCod_hcg() {
        return cod_hcg;
    }

    public void setCod_hcg(int cod_hcg) {
        this.cod_hcg = cod_hcg;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getApontamento() {
        return apontamento;
    }

    public void setApontamento(String apontamento) {
        this.apontamento = apontamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCriado() {
        return criado;
    }

    public void setCriado(String criado) {
        this.criado = criado;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }
    
}
