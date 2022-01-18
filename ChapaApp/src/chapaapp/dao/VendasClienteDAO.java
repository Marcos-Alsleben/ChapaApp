/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapaapp.dao;

import chapaapp.jdbc.ConnectionFactory;
import chapaapp.model.VendasCliente;
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
public class VendasClienteDAO {

    private Connection con;

    public VendasClienteDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //Metodo cadastrar
    public void cadastrar(VendasCliente obj) {
        try {
            //Cria comando sql
            String sql = "insert into vendascliente (motivo) values (?)";

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
    public void alterar(VendasCliente obj) {
        try {
            //Cria comando sql
            String sql = "update vendascliente set "
                    + "motivo=? where cod_vend=?";

            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getMotivo());
            stmt.setInt(2, obj.getCod_vend());

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
    public void excluir(VendasCliente obj) {
        try {
            //Cria o comando sql
            String sql = "delete from vendascliente where cod_vend=?";

            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCod_vend());

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
    public List<VendasCliente> listar() {
        try {
            //Cria Lista
            List<VendasCliente> lista = new ArrayList<>();

            //Cria comando sql
            String sql = "select * from vendascliente order by motivo asc";

            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                VendasCliente obj = new VendasCliente();
                obj.setCod_vend(rs.getInt("cod_vend"));
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
