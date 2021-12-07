/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapaapp.dao;

import chapaapp.jdbc.ConnectionFactory;
import chapaapp.model.Programacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ProgramacaoDAO {
    
    private Connection con;
    
    public ProgramacaoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    //Metodo cadastrar
    public void cadastrar(Programacao obj){
        try {
            //Cria comando sql
            String sql = "insert into programacao (motivo) values (?)";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getMotivo());
                     
            //Executa o comando sql
            stmt.execute();
            stmt.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //Metodo Alterar
    public void alterar(Programacao obj){
        try {
            //Cria comando sql
            String sql = "update programacao set "
                    +"motivo=? where cod_prog=?";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getMotivo());
            stmt.setInt(2, obj.getCod_prog());
                     
            //Executa o comando sql
            stmt.execute();
            stmt.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //Metodo Excluir
    public void excluir(Programacao obj){
        try {
            //Cria o comando sql
            String sql = "delete from programacao where cod_prog=?";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCod_prog());
            
            //Executa o comando sql
            stmt.execute();
            stmt.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //Metodo Listar
    public List<Programacao> listar(){
        try {
            //Cria Lista
            List<Programacao> lista = new ArrayList<>();
            
            //Cria comando sql
            String sql = "select * from programacao";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Programacao obj = new Programacao();
                obj.setCod_prog(rs.getInt("cod_prog"));
                obj.setMotivo(rs.getString("motivo"));
                
                //Executa
                lista.add(obj);
            }
            con.close();
            return lista;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return null;
        }
    }
    
}
