/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapaapp.dao;

import chapaapp.jdbc.ConnectionFactory;
import chapaapp.model.Outros;
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
public class OutrosDAO {
    
    private Connection con;
    
    public OutrosDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    //Metodo cadastrar
    public void cadastrar(Outros obj){
        try {
            //Cria comando sql
            String sql = "insert into outros (motivo) values (?)";
            
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
    public void alterar(Outros obj){
        try {
            //Cria comando sql
            String sql = "update outros set "
                    +"motivo=? where cod_out=?";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getMotivo());
            stmt.setInt(2, obj.getCod_out());
                     
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
    public void excluir(Outros obj){
        try {
            //Cria o comando sql
            String sql = "delete from outros where cod_out=?";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCod_out());
            
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
    public List<Outros> listar(){
        try {
            //Cria Lista
            List<Outros> lista = new ArrayList<>();
            
            //Cria comando sql
            String sql = "select * from outros";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Outros obj = new Outros();
                obj.setCod_out(rs.getInt("cod_out"));
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
