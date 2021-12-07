/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapaapp.dao;

import chapaapp.jdbc.ConnectionFactory;
import chapaapp.model.Operador;
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
public class OperadorDAO {
    
    private Connection con;
    
    public OperadorDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    //Metodo cadastrar
    public void cadastrar(Operador obj){
        try {
            //Cria comando sql
            String sql = "insert into operador (cadastro, nome) values (?,?)";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCadastro());
            stmt.setString(2, obj.getNome());
                     
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
    public void alterar(Operador obj){
        try {
            //Cria comando sql
            String sql = "update operador set "
                    +"nome=? where cadastro=?";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setInt(2, obj.getCadastro());
                     
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
    public void excluir(Operador obj){
        try {
            //Cria o comando sql
            String sql = "delete from operador where cadastro=?";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCadastro());
            
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
    public List<Operador> listar(){
        try {
            //Cria Lista
            List<Operador> lista = new ArrayList<>();
            
            //Cria comando sql
            String sql = "select * from operador";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Operador obj = new Operador();
                obj.setCadastro(rs.getInt("cadastro"));
                obj.setNome(rs.getString("nome"));
                
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
