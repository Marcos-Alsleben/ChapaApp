/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapaapp.dao;

import chapaapp.jdbc.ConnectionFactory;
import chapaapp.model.LoteChapa;
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
public class LoteChapaDAO {
    
    private Connection con;
    
    public LoteChapaDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    //Metodo cadastrar
    public void cadastrar(LoteChapa obj){
        try {
            //Cria comando sql
            String sql = "insert into lotechapa (lote, situacao, cod_cadch) values (?,?,?)";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getLote());
            stmt.setString(2, obj.getSituacao());
            stmt.setInt(3, obj.getCod_cadch());
                     
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
    public void alterar(LoteChapa obj){
        try {
            //Cria comando sql
            String sql = "update lotechapa set "
                    +"lote=?, situacao=?, cod_cadch? where cod_lch=?";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getLote());
            stmt.setString(2, obj.getSituacao());
            stmt.setInt(3, obj.getCod_cadch());
            stmt.setInt(4, obj.getCod_lch());
                     
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
    public void excluir(LoteChapa obj){
        try {
            //Cria o comando sql
            String sql = "delete from lotechapa where cod_lch=?";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCod_lch());
            
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
    public List<LoteChapa> listar(){
        try {
            //Cria Lista
            List<LoteChapa> lista = new ArrayList<>();
            
            //Cria comando sql
            String sql = "select * from lotechapa";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                
                LoteChapa obj = new LoteChapa();
                obj.setCod_lch(rs.getInt("cod_lch"));
                obj.setLote(rs.getString("lote"));
                obj.setSituacao(rs.getString("situacao"));
                obj.setCod_cadch(rs.getInt("cod_cadch"));
                
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
