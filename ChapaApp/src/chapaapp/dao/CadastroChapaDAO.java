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

    public CadastroChapaDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //Metodo cadastrar
    public void cadastrar(CadastroChapa obj) {
        try {
            //Cria comando sql
            String sql = "insert into cadastrochapa (ordemprod, situacao, quantidade, turno,"
                    + "cod_hcg, maquina, apontamento, descricao, obs, criado, modificado) "
                    + "values (?,?,?,?,?,?,?,?,?,?,?)";

            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getOrdemprod());
            stmt.setString(2, obj.getSituacao());
            stmt.setInt(3, obj.getQuantidade());
            stmt.setString(4, obj.getTurno());
            stmt.setInt(5, obj.getCod_hcg());
            stmt.setString(6, obj.getMaquina());
            stmt.setString(7, obj.getApontamento());
            stmt.setString(8, obj.getDescricao());
            stmt.setString(9, obj.getObs());
            stmt.setString(10, obj.getCriado());
            stmt.setString(11, obj.getModificado());

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
    public void alterar(CadastroChapa obj) {
        try {
            //Cria comando sql
            String sql = "update cadastrochapa set "
                    + "ordemprod=?, situacao=?, quantidade=?, turno=?, cod_hcg=?, "
                    + "maquina=?, apontamento=?, descricao=?, obs=?,"
                    + "criado=?, modificado=? where cod_cadch=?";

            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getOrdemprod());
            stmt.setString(2, obj.getSituacao());
            stmt.setInt(3, obj.getQuantidade());
            stmt.setString(4, obj.getTurno());
            stmt.setInt(5, obj.getCod_hcg());
            stmt.setString(6, obj.getMaquina());
            stmt.setString(7, obj.getApontamento());
            stmt.setString(8, obj.getDescricao());
            stmt.setString(9, obj.getObs());
            stmt.setString(10, obj.getCriado());
            stmt.setString(11, obj.getModificado());
            stmt.setInt(12, obj.getCod_cadch());

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
    public void excluir(CadastroChapa obj) {
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
    public List<CadastroChapa> listar(String sit) {
        try {
            //Cria Lista
            List<CadastroChapa> lista = new ArrayList<>();

            //Cria comando sql
            String sql = "select * from cadastrochapa where situacao like? order by criado desc";

            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, sit);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                CadastroChapa obj = new CadastroChapa();
                obj.setCod_cadch(rs.getInt("cod_cadch"));
                obj.setOrdemprod(rs.getString("ordemprod"));
                obj.setSituacao(rs.getString("situacao"));
                obj.setQuantidade(rs.getInt("quantidade"));
                obj.setTurno(rs.getString("turno"));
                obj.setCod_hcg(rs.getInt("cod_hcg"));
                obj.setMaquina(rs.getString("maquina"));
                obj.setApontamento(rs.getString("apontamento"));
                obj.setDescricao(rs.getString("descricao"));
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

//Metodo Pesquisar
    public List<CadastroChapa> pesquisar(String rp, String situacao) {
        try {
            //Cria Lista
            List<CadastroChapa> lista = new ArrayList<>();

            //Cria comando sql
            String sql = "select * from cadastrochapa where ordemprod like? and situacao like? order by criado desc";

            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, rp);
            stmt.setString(2, situacao);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                CadastroChapa obj = new CadastroChapa();
                obj.setCod_cadch(rs.getInt("cod_cadch"));
                obj.setOrdemprod(rs.getString("ordemprod"));
                obj.setSituacao(rs.getString("situacao"));
                obj.setQuantidade(rs.getInt("quantidade"));
                obj.setTurno(rs.getString("turno"));
                obj.setCod_hcg(rs.getInt("cod_hcg"));
                obj.setMaquina(rs.getString("maquina"));
                obj.setApontamento(rs.getString("apontamento"));
                obj.setDescricao(rs.getString("descricao"));
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
