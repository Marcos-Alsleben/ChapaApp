/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapaapp.dao;

import chapaapp.jdbc.ConnectionFactory;
import chapaapp.model.CadastroChapa;
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
public class CadastroChapaDAO {
    
    private Connection con;
    
    public CadastroChapaDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    //Metodo cadastrar
    public void cadastrar(CadastroChapa obj){
        try {
            //Cria comando sql
            String sql = "insert into cadastrochapa (ordemprod, situacao, turno,"
                    + "cod_hcg, obs, criado, modificado) values (?,?,?,?,?,?,?)";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getOrdemprod());
            stmt.setString(2, obj.getSituacao());
            stmt.setString(3, obj.getTurno());
            stmt.setInt(4, obj.getCod_hcg());
            stmt.setString(5, obj.getObs());
            stmt.setString(6, obj.getCriado());
            stmt.setString(7, obj.getModificado());
                     
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
    public void alterar(CadastroChapa obj){
        try {
            //Cria comando sql
            String sql = "update cadastrochapa set "
                    +"ordemprod=?, situacao=?, turno=?, cod_hcg=?, obs=?,"
                    + "criado=?, modificado=? where cod_cadch=?";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getOrdemprod());
            stmt.setString(2, obj.getSituacao());
            stmt.setString(3, obj.getTurno());
            stmt.setInt(4, obj.getCod_hcg());
            stmt.setString(5, obj.getObs());
            stmt.setString(6, obj.getCriado());
            stmt.setString(7, obj.getModificado());
            stmt.setInt(8, obj.getCod_cadch());
                     
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
    public void excluir(CadastroChapa obj){
        try {
            //Cria o comando sql
            String sql = "delete from cadastrochapa where cod_cadch=?";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCod_cadch());
            
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
    public List<CadastroChapa> listar(){
        try {
            //Cria Lista
            List<CadastroChapa> lista = new ArrayList<>();
            
            //Cria comando sql
            String sql = "select * from cadastrochapa";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                
                CadastroChapa obj = new CadastroChapa();
                obj.setCod_cadch(rs.getInt("cod_cadch"));
                obj.setOrdemprod(rs.getString("ordemprod"));
                obj.setSituacao(rs.getString("situacao"));
                obj.setTurno(rs.getString("turno"));
                obj.setCod_hcg(rs.getInt("cod_lch"));
                obj.setObs(rs.getString("obs"));
                obj.setCriado(rs.getString("criado"));
                obj.setModificado(rs.getString("modificado"));
                
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
