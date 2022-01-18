/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapaapp.view;

import chapaapp.dao.CadastroChapaDAO;
import chapaapp.dao.CopiaChapaDAO;
import chapaapp.dao.HorasCompGrafDAO;
import chapaapp.dao.ImpressaoDAO;
import chapaapp.dao.MaquinaDAO;
import chapaapp.dao.OutrosDAO;
import chapaapp.dao.PreImpressaoDAO;
import chapaapp.dao.ProgramacaoDAO;
import chapaapp.dao.VendasClienteDAO;
import chapaapp.model.CadastroChapa;
import chapaapp.model.CopiaChapa;
import chapaapp.model.HorasCompGraf;
import chapaapp.model.Impressao;
import chapaapp.model.Maquina;
import chapaapp.model.Outros;
import chapaapp.model.PreImpressao;
import chapaapp.model.Programacao;
import chapaapp.model.VendasCliente;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author usuario
 */
public class FrmPrincipal extends javax.swing.JFrame {

    // Metodo Pegar Data
    public String Dh() {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dataFormatada = formatar.format(data);

        return dataFormatada;
    }

    //Metodo mostrar cardLayout 1
    public void MostraCard1(String card) {
        CardLayout cl = (CardLayout) jPanelCard1.getLayout();
        cl.show(jPanelCard1, card);
    }

    //Metodo mostrar cardLayout 2
    public void MostraCard2(String card) {
        CardLayout cl = (CardLayout) jPanelCard2.getLayout();
        cl.show(jPanelCard2, card);
    }

    //Personalizar tabelas
    public void PersonalizarTabelas() {
        JTableHeader Tb1 = tb_vendascliente.getTableHeader();
        Tb1.setBackground(Color.black);
        Tb1.setFont(new Font("Dialog", 1, 12));
        ((DefaultTableCellRenderer) Tb1.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jScrollvendascliente.getViewport().setBackground(Color.DARK_GRAY);
        tb_vendascliente.setBackground(Color.DARK_GRAY);

        JTableHeader Tb2 = tb_programacao.getTableHeader();
        Tb2.setBackground(Color.black);
        Tb2.setFont(new Font("Dialog", 1, 12));
        ((DefaultTableCellRenderer) Tb2.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jScrollprogramacao.getViewport().setBackground(Color.DARK_GRAY);
        tb_programacao.setBackground(Color.DARK_GRAY);

        JTableHeader Tb3 = tb_preImpressao.getTableHeader();
        Tb3.setBackground(Color.black);
        Tb3.setFont(new Font("Dialog", 1, 12));
        ((DefaultTableCellRenderer) Tb3.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jScrollpreimpressao.getViewport().setBackground(Color.DARK_GRAY);
        tb_preImpressao.setBackground(Color.DARK_GRAY);

        JTableHeader Tb4 = tb_copiaChapa.getTableHeader();
        Tb4.setBackground(Color.black);
        Tb4.setFont(new Font("Dialog", 1, 12));
        ((DefaultTableCellRenderer) Tb4.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jScrollcopiachapa.getViewport().setBackground(Color.DARK_GRAY);
        tb_copiaChapa.setBackground(Color.DARK_GRAY);

        JTableHeader Tb5 = tb_impressao.getTableHeader();
        Tb5.setBackground(Color.black);
        Tb5.setFont(new Font("Dialog", 1, 12));
        ((DefaultTableCellRenderer) Tb5.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jScrollimpressao.getViewport().setBackground(Color.DARK_GRAY);
        tb_impressao.setBackground(Color.DARK_GRAY);

        JTableHeader Tb6 = tb_outros.getTableHeader();
        Tb6.setBackground(Color.black);
        Tb6.setFont(new Font("Dialog", 1, 12));
        ((DefaultTableCellRenderer) Tb6.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jScrolloutros.getViewport().setBackground(Color.DARK_GRAY);
        tb_outros.setBackground(Color.DARK_GRAY);

        JTableHeader Tb7 = tb_maquina.getTableHeader();
        Tb7.setBackground(Color.black);
        Tb7.setFont(new Font("Dialog", 1, 12));
        ((DefaultTableCellRenderer) Tb7.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jScrollmaquina.getViewport().setBackground(Color.DARK_GRAY);
        tb_maquina.setBackground(Color.DARK_GRAY);

        JTableHeader Tb8 = tb_grav.getTableHeader();
        Tb8.setBackground(Color.black);
        Tb8.setFont(new Font("Dialog", 1, 12));
        ((DefaultTableCellRenderer) Tb8.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jScrollgrav.getViewport().setBackground(Color.DARK_GRAY);
        tb_grav.setBackground(Color.DARK_GRAY);
    }

    //Metodo listar
    public void listarVendasCliente() {
        VendasClienteDAO dao = new VendasClienteDAO();
        List<VendasCliente> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tb_vendascliente.getModel();
        dados.setNumRows(0);
        for (VendasCliente c : lista) {
            dados.addRow(new Object[]{
                c.getCod_vend(),
                c.getMotivo(),});

        }
    }

    //Metodo listar
    public void listarPreImpressao() {
        PreImpressaoDAO dao = new PreImpressaoDAO();
        List<PreImpressao> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tb_preImpressao.getModel();
        dados.setNumRows(0);
        for (PreImpressao c : lista) {
            dados.addRow(new Object[]{
                c.getCod_pre(),
                c.getMotivo(),});

        }
    }

    //Metodo listar
    public void listarProgramacao() {
        ProgramacaoDAO dao = new ProgramacaoDAO();
        List<Programacao> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tb_programacao.getModel();
        dados.setNumRows(0);
        for (Programacao c : lista) {
            dados.addRow(new Object[]{
                c.getCod_prog(),
                c.getMotivo(),});

        }
    }

    //Metodo listar
    public void listarCopiaChapa() {
        CopiaChapaDAO dao = new CopiaChapaDAO();
        List<CopiaChapa> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tb_copiaChapa.getModel();
        dados.setNumRows(0);
        for (CopiaChapa c : lista) {
            dados.addRow(new Object[]{
                c.getCod_copchapa(),
                c.getMotivo(),});

        }
    }

    //Metodo listar
    public void listarImpressao() {
        ImpressaoDAO dao = new ImpressaoDAO();
        List<Impressao> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tb_impressao.getModel();
        dados.setNumRows(0);
        for (Impressao c : lista) {
            dados.addRow(new Object[]{
                c.getCod_imp(),
                c.getMotivo(),});

        }
    }

    //Metodo listar
    public void listarOutros() {
        OutrosDAO dao = new OutrosDAO();
        List<Outros> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tb_outros.getModel();
        dados.setNumRows(0);
        for (Outros c : lista) {
            dados.addRow(new Object[]{
                c.getCod_out(),
                c.getMotivo(),});

        }
    }

    //Metodo listar
    public void listarMaquina() {
        MaquinaDAO dao = new MaquinaDAO();
        List<Maquina> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tb_maquina.getModel();
        dados.setNumRows(0);
        for (Maquina c : lista) {
            dados.addRow(new Object[]{
                c.getCod_maq(),
                c.getNome(),});

        }
    }

    //Metodo listar
    public void listarGravacao() {
        CadastroChapaDAO dao = new CadastroChapaDAO();
        List<CadastroChapa> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tb_grav.getModel();
        dados.setNumRows(0);
        for (CadastroChapa c : lista) {
            dados.addRow(new Object[]{
                c.getCod_cadch(),
                c.getOrdemprod(),
                c.getSituacao(),
                c.getQuantidade(),
                c.getTurno(),
                c.getCod_hcg(),
                c.getMaquina(),
                c.getApontamento(),
                c.getDescricao(),
                c.getCriado(),
                c.getModificado(),});

        }
    }

    //Metodo Atualiza cbMaquina
    public void AtualizarcbMaquinaGrav() {
        MaquinaDAO dao = new MaquinaDAO();
        List<Maquina> lista = dao.listar();

        cb_maquinaGrav.removeAllItems();
        cb_maquinaGrav.addItem("*");

        for (Maquina c : lista) {
            cb_maquinaGrav.addItem(c.getNome());

        }
    }

    //limpar campos
    public void LimparVendasCliente() {
        txt_codVend_cad.setText("");
        txt_motivoVend_cad.setText("");

        btn_addVend.setEnabled(false);
        btn_altVend.setEnabled(false);
        btn_exclVend.setEnabled(false);
        btn_limpVend.setEnabled(false);

    }

    //limpar campos
    public void LimparProgramacao() {
        txt_codProg_cad.setText("");
        txt_motivoProg_cad.setText("");

        btn_addProg.setEnabled(false);
        btn_altProg.setEnabled(false);
        btn_exclProg.setEnabled(false);
        btn_limpProg.setEnabled(false);

    }

    //limpar campos
    public void LimparPreImpressao() {
        txt_codPre_cad.setText("");
        txt_motivoPre_cad.setText("");

        btn_addPre.setEnabled(false);
        btn_altPre.setEnabled(false);
        btn_exclPre.setEnabled(false);
        btn_limpPre.setEnabled(false);

    }

    //limpar campos
    public void LimparCopiaChapa() {
        txt_codCopChapa_cad.setText("");
        txt_motivoCopChapa_cad.setText("");

        btn_addCopChapa.setEnabled(false);
        btn_altCopChapa.setEnabled(false);
        btn_exclCopChapa.setEnabled(false);
        btn_limpCopChapa.setEnabled(false);

    }

    //limpar campos
    public void LimparImpressao() {
        txt_codImp_cad.setText("");
        txt_motivoImp_cad.setText("");

        btn_addImp.setEnabled(false);
        btn_altImp.setEnabled(false);
        btn_exclImp.setEnabled(false);
        btn_limpImp.setEnabled(false);

    }

    //limpar campos
    public void LimparOutros() {
        txt_codOut_cad.setText("");
        txt_motivoOut_cad.setText("");

        btn_addOut.setEnabled(false);
        btn_altOut.setEnabled(false);
        btn_exclOut.setEnabled(false);
        btn_limpOut.setEnabled(false);

    }

    //limpar campos
    public void LimparMaquina() {
        txt_codMaq_cad.setText("");
        txt_nomeMaq_cad.setText("");

        btn_addMaq.setEnabled(false);
        btn_altMaq.setEnabled(false);
        btn_exclMaq.setEnabled(false);
        btn_limpMaq.setEnabled(false);

    }

    //limpar campos
    public void LimparGravacao() {
        txt_rpGrav.setText("");
        txt_montGrav.setText("");
        txt_qtdGrav.setText("");
        cb_maquinaGrav.setSelectedItem("*");
        txt_operadorGrav.setText("");

        btn_novoGrav.setEnabled(true);
        btn_alteraGrav.setEnabled(false);
        btn_excluiGrav.setEnabled(false);
        btn_limpaGrav.setEnabled(true);

    }

    /**
     * Creates new form FrmPrincipal
     */
    String datacriacao = null;

    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        PersonalizarTabelas();
        AtualizarcbMaquinaGrav();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cb_turno = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jPanelCard1 = new javax.swing.JPanel();
        jPanelGrav = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollgrav = new javax.swing.JScrollPane();
        tb_grav = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txt_codGrav = new javax.swing.JTextField();
        txt_rpGrav = new javax.swing.JTextField();
        btn_buscaRpGrav = new javax.swing.JButton();
        cb_maquinaGrav = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txt_qtdGrav = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_montGrav = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_operadorGrav = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btn_preencheData = new javax.swing.JButton();
        btn_novoGrav = new javax.swing.JButton();
        btn_alteraGrav = new javax.swing.JButton();
        btn_excluiGrav = new javax.swing.JButton();
        btn_limpaGrav = new javax.swing.JButton();
        jPanelRegrav = new javax.swing.JPanel();
        jPanelLote = new javax.swing.JPanel();
        jPanelAjustes = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanelCard2 = new javax.swing.JPanel();
        jPanelVendas = new javax.swing.JPanel();
        jScrollvendascliente = new javax.swing.JScrollPane();
        tb_vendascliente = new javax.swing.JTable();
        txt_codVend_cad = new javax.swing.JTextField();
        txt_motivoVend_cad = new javax.swing.JTextField();
        btn_addVend = new javax.swing.JButton();
        btn_altVend = new javax.swing.JButton();
        btn_exclVend = new javax.swing.JButton();
        btn_limpVend = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanelProg = new javax.swing.JPanel();
        jScrollprogramacao = new javax.swing.JScrollPane();
        tb_programacao = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txt_codProg_cad = new javax.swing.JTextField();
        txt_motivoProg_cad = new javax.swing.JTextField();
        btn_addProg = new javax.swing.JButton();
        btn_altProg = new javax.swing.JButton();
        btn_exclProg = new javax.swing.JButton();
        btn_limpProg = new javax.swing.JButton();
        jPanelPreImp = new javax.swing.JPanel();
        jScrollpreimpressao = new javax.swing.JScrollPane();
        tb_preImpressao = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_codPre_cad = new javax.swing.JTextField();
        txt_motivoPre_cad = new javax.swing.JTextField();
        btn_addPre = new javax.swing.JButton();
        btn_altPre = new javax.swing.JButton();
        btn_exclPre = new javax.swing.JButton();
        btn_limpPre = new javax.swing.JButton();
        jPanelCopia = new javax.swing.JPanel();
        jScrollcopiachapa = new javax.swing.JScrollPane();
        tb_copiaChapa = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txt_codCopChapa_cad = new javax.swing.JTextField();
        txt_motivoCopChapa_cad = new javax.swing.JTextField();
        btn_addCopChapa = new javax.swing.JButton();
        btn_altCopChapa = new javax.swing.JButton();
        btn_exclCopChapa = new javax.swing.JButton();
        btn_limpCopChapa = new javax.swing.JButton();
        jPanelImpress = new javax.swing.JPanel();
        jScrollimpressao = new javax.swing.JScrollPane();
        tb_impressao = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txt_codImp_cad = new javax.swing.JTextField();
        txt_motivoImp_cad = new javax.swing.JTextField();
        btn_addImp = new javax.swing.JButton();
        btn_altImp = new javax.swing.JButton();
        btn_exclImp = new javax.swing.JButton();
        btn_limpImp = new javax.swing.JButton();
        jPanelOutros = new javax.swing.JPanel();
        jScrolloutros = new javax.swing.JScrollPane();
        tb_outros = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txt_codOut_cad = new javax.swing.JTextField();
        txt_motivoOut_cad = new javax.swing.JTextField();
        btn_addOut = new javax.swing.JButton();
        btn_altOut = new javax.swing.JButton();
        btn_exclOut = new javax.swing.JButton();
        btn_limpOut = new javax.swing.JButton();
        jPanelMaquina = new javax.swing.JPanel();
        jScrollmaquina = new javax.swing.JScrollPane();
        tb_maquina = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txt_codMaq_cad = new javax.swing.JTextField();
        txt_nomeMaq_cad = new javax.swing.JTextField();
        btn_addMaq = new javax.swing.JButton();
        btn_altMaq = new javax.swing.JButton();
        btn_exclMaq = new javax.swing.JButton();
        btn_limpMaq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(63, 63, 63));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(65, 65, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));

        jButton1.setBackground(new java.awt.Color(25, 25, 25));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Conteudo1_64.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GRAVAÇÃO");

        jButton2.setBackground(new java.awt.Color(25, 25, 25));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Conteudo2_64.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGRAVAÇÃO");

        jButton3.setBackground(new java.awt.Color(25, 25, 25));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Conteudo3_64.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOTE");

        jButton4.setBackground(new java.awt.Color(25, 25, 25));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Config_64.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AJUSTES");

        cb_turno.setBackground(new java.awt.Color(65, 65, 65));
        cb_turno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cb_turno.setForeground(new java.awt.Color(255, 255, 255));
        cb_turno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "*", "1", "2" }));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("TURNO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(cb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel18)
                                .addGap(0, 0, 0)
                                .addComponent(cb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))))
        );

        jPanelCard1.setBackground(new java.awt.Color(65, 65, 65));
        jPanelCard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelCard1.setLayout(new java.awt.CardLayout());

        jPanelGrav.setBackground(new java.awt.Color(65, 65, 65));

        jPanel5.setBackground(new java.awt.Color(65, 65, 65));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        tb_grav.setBackground(new java.awt.Color(63, 63, 63));
        tb_grav.setForeground(new java.awt.Color(255, 255, 255));
        tb_grav.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "cod_cadch", "RP", "Situação", "Qtd", "T", "Operador", "Maq", "Apontamento", "Descrição", "Observação", "Criado em", "Modificado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_grav.getTableHeader().setReorderingAllowed(false);
        tb_grav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_gravMouseClicked(evt);
            }
        });
        jScrollgrav.setViewportView(tb_grav);
        if (tb_grav.getColumnModel().getColumnCount() > 0) {
            tb_grav.getColumnModel().getColumn(0).setMinWidth(0);
            tb_grav.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_grav.getColumnModel().getColumn(0).setMaxWidth(0);
            tb_grav.getColumnModel().getColumn(1).setMinWidth(150);
            tb_grav.getColumnModel().getColumn(1).setPreferredWidth(150);
            tb_grav.getColumnModel().getColumn(1).setMaxWidth(150);
            tb_grav.getColumnModel().getColumn(2).setMinWidth(0);
            tb_grav.getColumnModel().getColumn(2).setPreferredWidth(0);
            tb_grav.getColumnModel().getColumn(2).setMaxWidth(0);
            tb_grav.getColumnModel().getColumn(3).setMinWidth(50);
            tb_grav.getColumnModel().getColumn(3).setPreferredWidth(50);
            tb_grav.getColumnModel().getColumn(3).setMaxWidth(50);
            tb_grav.getColumnModel().getColumn(4).setMinWidth(30);
            tb_grav.getColumnModel().getColumn(4).setPreferredWidth(30);
            tb_grav.getColumnModel().getColumn(4).setMaxWidth(30);
            tb_grav.getColumnModel().getColumn(5).setMinWidth(0);
            tb_grav.getColumnModel().getColumn(5).setPreferredWidth(0);
            tb_grav.getColumnModel().getColumn(5).setMaxWidth(0);
            tb_grav.getColumnModel().getColumn(6).setMinWidth(50);
            tb_grav.getColumnModel().getColumn(6).setPreferredWidth(50);
            tb_grav.getColumnModel().getColumn(6).setMaxWidth(50);
            tb_grav.getColumnModel().getColumn(7).setMinWidth(0);
            tb_grav.getColumnModel().getColumn(7).setPreferredWidth(0);
            tb_grav.getColumnModel().getColumn(7).setMaxWidth(0);
            tb_grav.getColumnModel().getColumn(8).setMinWidth(0);
            tb_grav.getColumnModel().getColumn(8).setPreferredWidth(0);
            tb_grav.getColumnModel().getColumn(8).setMaxWidth(0);
            tb_grav.getColumnModel().getColumn(9).setMinWidth(0);
            tb_grav.getColumnModel().getColumn(9).setPreferredWidth(0);
            tb_grav.getColumnModel().getColumn(9).setMaxWidth(0);
            tb_grav.getColumnModel().getColumn(11).setMinWidth(0);
            tb_grav.getColumnModel().getColumn(11).setPreferredWidth(0);
            tb_grav.getColumnModel().getColumn(11).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollgrav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollgrav, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(65, 65, 65));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GRAVAÇÃO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txt_codGrav.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codGrav.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_codGrav.setForeground(new java.awt.Color(255, 255, 255));
        txt_codGrav.setBorder(null);
        txt_codGrav.setEnabled(false);
        txt_codGrav.setFocusable(false);

        txt_rpGrav.setBackground(new java.awt.Color(63, 63, 63));
        txt_rpGrav.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_rpGrav.setForeground(new java.awt.Color(255, 255, 255));
        txt_rpGrav.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_buscaRpGrav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar2_16.png"))); // NOI18N
        btn_buscaRpGrav.setToolTipText("Pesquisar!");
        btn_buscaRpGrav.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_buscaRpGrav.setBorderPainted(false);
        btn_buscaRpGrav.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_buscaRpGrav.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_buscaRpGrav.setPreferredSize(new java.awt.Dimension(30, 30));

        cb_maquinaGrav.setBackground(new java.awt.Color(65, 65, 65));
        cb_maquinaGrav.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cb_maquinaGrav.setForeground(new java.awt.Color(255, 255, 255));
        cb_maquinaGrav.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "*" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RP:");

        txt_qtdGrav.setBackground(new java.awt.Color(63, 63, 63));
        txt_qtdGrav.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_qtdGrav.setForeground(new java.awt.Color(255, 255, 255));
        txt_qtdGrav.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Qtd:");
        jLabel6.setMaximumSize(new java.awt.Dimension(17, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(17, 15));
        jLabel6.setPreferredSize(new java.awt.Dimension(17, 15));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Máq:");
        jLabel11.setMaximumSize(new java.awt.Dimension(17, 15));
        jLabel11.setMinimumSize(new java.awt.Dimension(17, 15));
        jLabel11.setPreferredSize(new java.awt.Dimension(17, 15));

        txt_montGrav.setBackground(new java.awt.Color(63, 63, 63));
        txt_montGrav.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_montGrav.setForeground(new java.awt.Color(255, 255, 255));
        txt_montGrav.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_montGrav.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_montGravKeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(".");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mt:");

        txt_operadorGrav.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_operadorGrav.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_operadorGrav.setForeground(new java.awt.Color(255, 255, 255));
        txt_operadorGrav.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_operadorGrav.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));
        txt_operadorGrav.setEnabled(false);
        txt_operadorGrav.setFocusable(false);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Operador:");
        jLabel17.setEnabled(false);
        jLabel17.setMaximumSize(new java.awt.Dimension(17, 15));
        jLabel17.setMinimumSize(new java.awt.Dimension(17, 15));
        jLabel17.setPreferredSize(new java.awt.Dimension(17, 15));

        btn_preencheData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Atualiza_16.png"))); // NOI18N
        btn_preencheData.setToolTipText("Preencher com data atual");
        btn_preencheData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_preencheData.setBorderPainted(false);
        btn_preencheData.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_preencheData.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_preencheData.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_preencheData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_preencheDataActionPerformed(evt);
            }
        });

        btn_novoGrav.setBackground(new java.awt.Color(22, 22, 22));
        btn_novoGrav.setForeground(new java.awt.Color(255, 255, 255));
        btn_novoGrav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_novoGrav.setToolTipText("Adicionar novo!");
        btn_novoGrav.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_novoGrav.setBorderPainted(false);
        btn_novoGrav.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_novoGrav.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_novoGrav.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_novoGrav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoGravActionPerformed(evt);
            }
        });

        btn_alteraGrav.setBackground(new java.awt.Color(22, 22, 22));
        btn_alteraGrav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_alteraGrav.setToolTipText("Alterar!");
        btn_alteraGrav.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_alteraGrav.setBorderPainted(false);
        btn_alteraGrav.setEnabled(false);
        btn_alteraGrav.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_alteraGrav.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_alteraGrav.setPreferredSize(new java.awt.Dimension(40, 40));

        btn_excluiGrav.setBackground(new java.awt.Color(22, 22, 22));
        btn_excluiGrav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_excluiGrav.setToolTipText("Excluir!");
        btn_excluiGrav.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_excluiGrav.setBorderPainted(false);
        btn_excluiGrav.setEnabled(false);
        btn_excluiGrav.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_excluiGrav.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_excluiGrav.setPreferredSize(new java.awt.Dimension(40, 40));

        btn_limpaGrav.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpaGrav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpaGrav.setToolTipText("Limpa tudo");
        btn_limpaGrav.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpaGrav.setBorderPainted(false);
        btn_limpaGrav.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpaGrav.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpaGrav.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpaGrav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpaGravActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_operadorGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_preencheData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(txt_rpGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel15)
                    .addGap(0, 0, 0)
                    .addComponent(txt_montGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscaRpGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(txt_codGrav)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(87, 87, 87)
                            .addComponent(jLabel16))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(btn_novoGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_alteraGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_excluiGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_limpaGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_qtdGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addComponent(cb_maquinaGrav, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_rpGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_montGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscaRpGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt_qtdGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cb_maquinaGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_operadorGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_preencheData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(txt_codGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_excluiGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpaGrav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_novoGrav, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_alteraGrav, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelGravLayout = new javax.swing.GroupLayout(jPanelGrav);
        jPanelGrav.setLayout(jPanelGravLayout);
        jPanelGravLayout.setHorizontalGroup(
            jPanelGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGravLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelGravLayout.setVerticalGroup(
            jPanelGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGravLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelCard1.add(jPanelGrav, "grav");
        jPanelGrav.getAccessibleContext().setAccessibleName("grav");

        jPanelRegrav.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout jPanelRegravLayout = new javax.swing.GroupLayout(jPanelRegrav);
        jPanelRegrav.setLayout(jPanelRegravLayout);
        jPanelRegravLayout.setHorizontalGroup(
            jPanelRegravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        jPanelRegravLayout.setVerticalGroup(
            jPanelRegravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPanelCard1.add(jPanelRegrav, "regrav");
        jPanelRegrav.getAccessibleContext().setAccessibleName("regrav");

        jPanelLote.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout jPanelLoteLayout = new javax.swing.GroupLayout(jPanelLote);
        jPanelLote.setLayout(jPanelLoteLayout);
        jPanelLoteLayout.setHorizontalGroup(
            jPanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        jPanelLoteLayout.setVerticalGroup(
            jPanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPanelCard1.add(jPanelLote, "lote");
        jPanelLote.getAccessibleContext().setAccessibleName("lote");

        jPanelAjustes.setBackground(new java.awt.Color(65, 65, 65));

        jPanel3.setBackground(new java.awt.Color(65, 65, 65));

        jButton5.setBackground(new java.awt.Color(25, 25, 25));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CircleYellow_32.png"))); // NOI18N
        jButton5.setText(" Vendas Cliente  ");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(25, 25, 25));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CircleGray_32.png"))); // NOI18N
        jButton6.setText("  Programação  ");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(25, 25, 25));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CircleOrange_32.png"))); // NOI18N
        jButton7.setText(" Pré-Impressão   ");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setBorderPainted(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(25, 25, 25));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CircleGreen_32.png"))); // NOI18N
        jButton8.setText("Cópia de Chapa  ");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setBorderPainted(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(25, 25, 25));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CircleRed_32.png"))); // NOI18N
        jButton9.setText("    Impressão   ");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setBorderPainted(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(25, 25, 25));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CircleBlue_32.png"))); // NOI18N
        jButton10.setText("      Outros   ");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setBorderPainted(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(25, 25, 25));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Colors_32.png"))); // NOI18N
        jButton11.setText(" Máquina Offset");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setBorderPainted(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8)
                            .addComponent(jButton7)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addGap(26, 26, 26)
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCard2.setBackground(new java.awt.Color(65, 65, 65));
        jPanelCard2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelCard2.setLayout(new java.awt.CardLayout());

        jPanelVendas.setBackground(new java.awt.Color(65, 65, 65));

        tb_vendascliente.setBackground(new java.awt.Color(63, 63, 63));
        tb_vendascliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_vendascliente.setForeground(new java.awt.Color(255, 255, 255));
        tb_vendascliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod", "DESCRIÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_vendascliente.setToolTipText("Duplo clicke para alterar ou excluir cadastro");
        tb_vendascliente.setGridColor(new java.awt.Color(63, 63, 63));
        tb_vendascliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_vendasclienteMouseClicked(evt);
            }
        });
        jScrollvendascliente.setViewportView(tb_vendascliente);
        if (tb_vendascliente.getColumnModel().getColumnCount() > 0) {
            tb_vendascliente.getColumnModel().getColumn(0).setMinWidth(0);
            tb_vendascliente.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_vendascliente.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        txt_codVend_cad.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codVend_cad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codVend_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_codVend_cad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_codVend_cad.setBorder(null);
        txt_codVend_cad.setEnabled(false);

        txt_motivoVend_cad.setBackground(new java.awt.Color(63, 63, 63));
        txt_motivoVend_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_motivoVend_cad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_motivoVend_cad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_motivoVend_cadKeyPressed(evt);
            }
        });

        btn_addVend.setBackground(new java.awt.Color(22, 22, 22));
        btn_addVend.setForeground(new java.awt.Color(255, 255, 255));
        btn_addVend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_addVend.setToolTipText("Adicionar novo!");
        btn_addVend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addVend.setBorderPainted(false);
        btn_addVend.setEnabled(false);
        btn_addVend.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_addVend.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_addVend.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_addVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addVendActionPerformed(evt);
            }
        });

        btn_altVend.setBackground(new java.awt.Color(22, 22, 22));
        btn_altVend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_altVend.setToolTipText("Alterar!");
        btn_altVend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_altVend.setBorderPainted(false);
        btn_altVend.setEnabled(false);
        btn_altVend.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_altVend.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_altVend.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_altVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altVendActionPerformed(evt);
            }
        });

        btn_exclVend.setBackground(new java.awt.Color(22, 22, 22));
        btn_exclVend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_exclVend.setToolTipText("Excluir!");
        btn_exclVend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclVend.setBorderPainted(false);
        btn_exclVend.setEnabled(false);
        btn_exclVend.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_exclVend.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_exclVend.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_exclVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclVendActionPerformed(evt);
            }
        });

        btn_limpVend.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpVend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpVend.setToolTipText("Limpar!");
        btn_limpVend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpVend.setBorderPainted(false);
        btn_limpVend.setEnabled(false);
        btn_limpVend.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpVend.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpVend.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpVendActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cadastro Vendas Cliente");

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addComponent(jScrollvendascliente, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVendasLayout.createSequentialGroup()
                        .addComponent(btn_addVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_altVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_motivoVend_cad)
                    .addComponent(txt_codVend_cad)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 432, Short.MAX_VALUE))
        );
        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollvendascliente, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codVend_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_motivoVend_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_altVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exclVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCard2.add(jPanelVendas, "vendas");
        jPanelVendas.getAccessibleContext().setAccessibleName("vendas");

        jPanelProg.setBackground(new java.awt.Color(65, 65, 65));

        tb_programacao.setBackground(new java.awt.Color(63, 63, 63));
        tb_programacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_programacao.setForeground(new java.awt.Color(255, 255, 255));
        tb_programacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod", "DESCRIÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_programacao.setToolTipText("Duplo clicke para alterar ou excluir cadastro");
        tb_programacao.setGridColor(new java.awt.Color(63, 63, 63));
        tb_programacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_programacaoMouseClicked(evt);
            }
        });
        jScrollprogramacao.setViewportView(tb_programacao);
        if (tb_programacao.getColumnModel().getColumnCount() > 0) {
            tb_programacao.getColumnModel().getColumn(0).setMinWidth(0);
            tb_programacao.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_programacao.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cadastro Programação");

        txt_codProg_cad.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codProg_cad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codProg_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_codProg_cad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_codProg_cad.setBorder(null);
        txt_codProg_cad.setEnabled(false);

        txt_motivoProg_cad.setBackground(new java.awt.Color(63, 63, 63));
        txt_motivoProg_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_motivoProg_cad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_motivoProg_cad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_motivoProg_cadKeyPressed(evt);
            }
        });

        btn_addProg.setBackground(new java.awt.Color(22, 22, 22));
        btn_addProg.setForeground(new java.awt.Color(255, 255, 255));
        btn_addProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_addProg.setToolTipText("Adicionar novo!");
        btn_addProg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addProg.setBorderPainted(false);
        btn_addProg.setEnabled(false);
        btn_addProg.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_addProg.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_addProg.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_addProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addProgActionPerformed(evt);
            }
        });

        btn_altProg.setBackground(new java.awt.Color(22, 22, 22));
        btn_altProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_altProg.setToolTipText("Alterar!");
        btn_altProg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_altProg.setBorderPainted(false);
        btn_altProg.setEnabled(false);
        btn_altProg.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_altProg.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_altProg.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_altProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altProgActionPerformed(evt);
            }
        });

        btn_exclProg.setBackground(new java.awt.Color(22, 22, 22));
        btn_exclProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_exclProg.setToolTipText("Excluir!");
        btn_exclProg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclProg.setBorderPainted(false);
        btn_exclProg.setEnabled(false);
        btn_exclProg.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_exclProg.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_exclProg.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_exclProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclProgActionPerformed(evt);
            }
        });

        btn_limpProg.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpProg.setToolTipText("Limpar!");
        btn_limpProg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpProg.setBorderPainted(false);
        btn_limpProg.setEnabled(false);
        btn_limpProg.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpProg.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpProg.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpProgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProgLayout = new javax.swing.GroupLayout(jPanelProg);
        jPanelProg.setLayout(jPanelProgLayout);
        jPanelProgLayout.setHorizontalGroup(
            jPanelProgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgLayout.createSequentialGroup()
                .addComponent(jScrollprogramacao, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProgLayout.createSequentialGroup()
                        .addComponent(btn_addProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_altProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_motivoProg_cad)
                    .addComponent(txt_codProg_cad)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProgLayout.setVerticalGroup(
            jPanelProgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollprogramacao, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
            .addGroup(jPanelProgLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codProg_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_motivoProg_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelProgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_altProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exclProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelCard2.add(jPanelProg, "prog");
        jPanelProg.getAccessibleContext().setAccessibleName("prog");

        jPanelPreImp.setBackground(new java.awt.Color(65, 65, 65));

        tb_preImpressao.setBackground(new java.awt.Color(63, 63, 63));
        tb_preImpressao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_preImpressao.setForeground(new java.awt.Color(255, 255, 255));
        tb_preImpressao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod", "DESCRIÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_preImpressao.setToolTipText("Duplo clicke para alterar ou excluir cadastro");
        tb_preImpressao.setGridColor(new java.awt.Color(63, 63, 63));
        tb_preImpressao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_preImpressaoMouseClicked(evt);
            }
        });
        jScrollpreimpressao.setViewportView(tb_preImpressao);
        if (tb_preImpressao.getColumnModel().getColumnCount() > 0) {
            tb_preImpressao.getColumnModel().getColumn(0).setMinWidth(0);
            tb_preImpressao.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_preImpressao.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cadastro Pré-Impressão");

        txt_codPre_cad.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codPre_cad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codPre_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_codPre_cad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_codPre_cad.setBorder(null);
        txt_codPre_cad.setEnabled(false);

        txt_motivoPre_cad.setBackground(new java.awt.Color(63, 63, 63));
        txt_motivoPre_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_motivoPre_cad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_motivoPre_cad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_motivoPre_cadKeyPressed(evt);
            }
        });

        btn_addPre.setBackground(new java.awt.Color(22, 22, 22));
        btn_addPre.setForeground(new java.awt.Color(255, 255, 255));
        btn_addPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_addPre.setToolTipText("Adicionar novo!");
        btn_addPre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addPre.setBorderPainted(false);
        btn_addPre.setEnabled(false);
        btn_addPre.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_addPre.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_addPre.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_addPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addPreActionPerformed(evt);
            }
        });

        btn_altPre.setBackground(new java.awt.Color(22, 22, 22));
        btn_altPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_altPre.setToolTipText("Alterar!");
        btn_altPre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_altPre.setBorderPainted(false);
        btn_altPre.setEnabled(false);
        btn_altPre.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_altPre.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_altPre.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_altPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altPreActionPerformed(evt);
            }
        });

        btn_exclPre.setBackground(new java.awt.Color(22, 22, 22));
        btn_exclPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_exclPre.setToolTipText("Excluir!");
        btn_exclPre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclPre.setBorderPainted(false);
        btn_exclPre.setEnabled(false);
        btn_exclPre.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_exclPre.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_exclPre.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_exclPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclPreActionPerformed(evt);
            }
        });

        btn_limpPre.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpPre.setToolTipText("Limpar!");
        btn_limpPre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpPre.setBorderPainted(false);
        btn_limpPre.setEnabled(false);
        btn_limpPre.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpPre.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpPre.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpPreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPreImpLayout = new javax.swing.GroupLayout(jPanelPreImp);
        jPanelPreImp.setLayout(jPanelPreImpLayout);
        jPanelPreImpLayout.setHorizontalGroup(
            jPanelPreImpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPreImpLayout.createSequentialGroup()
                .addComponent(jScrollpreimpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPreImpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPreImpLayout.createSequentialGroup()
                        .addComponent(btn_addPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_altPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_motivoPre_cad)
                    .addComponent(txt_codPre_cad)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPreImpLayout.setVerticalGroup(
            jPanelPreImpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollpreimpressao, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
            .addGroup(jPanelPreImpLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codPre_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_motivoPre_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPreImpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_altPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exclPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelCard2.add(jPanelPreImp, "preimp");
        jPanelPreImp.getAccessibleContext().setAccessibleName("preimp");

        jPanelCopia.setBackground(new java.awt.Color(65, 65, 65));

        tb_copiaChapa.setBackground(new java.awt.Color(63, 63, 63));
        tb_copiaChapa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_copiaChapa.setForeground(new java.awt.Color(255, 255, 255));
        tb_copiaChapa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod", "DESCRIÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_copiaChapa.setToolTipText("Duplo clicke para alterar ou excluir cadastro");
        tb_copiaChapa.setGridColor(new java.awt.Color(63, 63, 63));
        tb_copiaChapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_copiaChapaMouseClicked(evt);
            }
        });
        jScrollcopiachapa.setViewportView(tb_copiaChapa);
        if (tb_copiaChapa.getColumnModel().getColumnCount() > 0) {
            tb_copiaChapa.getColumnModel().getColumn(0).setMinWidth(0);
            tb_copiaChapa.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_copiaChapa.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cadastro Cópia de Chapa");

        txt_codCopChapa_cad.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codCopChapa_cad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codCopChapa_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_codCopChapa_cad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_codCopChapa_cad.setBorder(null);
        txt_codCopChapa_cad.setEnabled(false);

        txt_motivoCopChapa_cad.setBackground(new java.awt.Color(63, 63, 63));
        txt_motivoCopChapa_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_motivoCopChapa_cad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_motivoCopChapa_cad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_motivoCopChapa_cadKeyPressed(evt);
            }
        });

        btn_addCopChapa.setBackground(new java.awt.Color(22, 22, 22));
        btn_addCopChapa.setForeground(new java.awt.Color(255, 255, 255));
        btn_addCopChapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_addCopChapa.setToolTipText("Adicionar novo!");
        btn_addCopChapa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addCopChapa.setBorderPainted(false);
        btn_addCopChapa.setEnabled(false);
        btn_addCopChapa.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_addCopChapa.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_addCopChapa.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_addCopChapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCopChapaActionPerformed(evt);
            }
        });

        btn_altCopChapa.setBackground(new java.awt.Color(22, 22, 22));
        btn_altCopChapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_altCopChapa.setToolTipText("Alterar!");
        btn_altCopChapa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_altCopChapa.setBorderPainted(false);
        btn_altCopChapa.setEnabled(false);
        btn_altCopChapa.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_altCopChapa.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_altCopChapa.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_altCopChapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altCopChapaActionPerformed(evt);
            }
        });

        btn_exclCopChapa.setBackground(new java.awt.Color(22, 22, 22));
        btn_exclCopChapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_exclCopChapa.setToolTipText("Excluir!");
        btn_exclCopChapa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclCopChapa.setBorderPainted(false);
        btn_exclCopChapa.setEnabled(false);
        btn_exclCopChapa.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_exclCopChapa.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_exclCopChapa.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_exclCopChapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclCopChapaActionPerformed(evt);
            }
        });

        btn_limpCopChapa.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpCopChapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpCopChapa.setToolTipText("Limpar!");
        btn_limpCopChapa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpCopChapa.setBorderPainted(false);
        btn_limpCopChapa.setEnabled(false);
        btn_limpCopChapa.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpCopChapa.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpCopChapa.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpCopChapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpCopChapaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCopiaLayout = new javax.swing.GroupLayout(jPanelCopia);
        jPanelCopia.setLayout(jPanelCopiaLayout);
        jPanelCopiaLayout.setHorizontalGroup(
            jPanelCopiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCopiaLayout.createSequentialGroup()
                .addComponent(jScrollcopiachapa, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCopiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCopiaLayout.createSequentialGroup()
                        .addComponent(btn_addCopChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_altCopChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclCopChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpCopChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_motivoCopChapa_cad)
                    .addComponent(txt_codCopChapa_cad)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCopiaLayout.setVerticalGroup(
            jPanelCopiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollcopiachapa, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
            .addGroup(jPanelCopiaLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codCopChapa_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_motivoCopChapa_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCopiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_altCopChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exclCopChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpCopChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addCopChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelCard2.add(jPanelCopia, "copia");
        jPanelCopia.getAccessibleContext().setAccessibleName("copia");

        jPanelImpress.setBackground(new java.awt.Color(65, 65, 65));

        tb_impressao.setBackground(new java.awt.Color(63, 63, 63));
        tb_impressao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_impressao.setForeground(new java.awt.Color(255, 255, 255));
        tb_impressao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod", "DESCRIÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_impressao.setToolTipText("Duplo clicke para alterar ou excluir cadastro");
        tb_impressao.setGridColor(new java.awt.Color(63, 63, 63));
        tb_impressao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_impressaoMouseClicked(evt);
            }
        });
        jScrollimpressao.setViewportView(tb_impressao);
        if (tb_impressao.getColumnModel().getColumnCount() > 0) {
            tb_impressao.getColumnModel().getColumn(0).setMinWidth(0);
            tb_impressao.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_impressao.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Cadastro Impressão");

        txt_codImp_cad.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codImp_cad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codImp_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_codImp_cad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_codImp_cad.setBorder(null);
        txt_codImp_cad.setEnabled(false);

        txt_motivoImp_cad.setBackground(new java.awt.Color(63, 63, 63));
        txt_motivoImp_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_motivoImp_cad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_motivoImp_cad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_motivoImp_cadKeyPressed(evt);
            }
        });

        btn_addImp.setBackground(new java.awt.Color(22, 22, 22));
        btn_addImp.setForeground(new java.awt.Color(255, 255, 255));
        btn_addImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_addImp.setToolTipText("Adicionar novo!");
        btn_addImp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addImp.setBorderPainted(false);
        btn_addImp.setEnabled(false);
        btn_addImp.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_addImp.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_addImp.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_addImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addImpActionPerformed(evt);
            }
        });

        btn_altImp.setBackground(new java.awt.Color(22, 22, 22));
        btn_altImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_altImp.setToolTipText("Alterar!");
        btn_altImp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_altImp.setBorderPainted(false);
        btn_altImp.setEnabled(false);
        btn_altImp.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_altImp.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_altImp.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_altImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altImpActionPerformed(evt);
            }
        });

        btn_exclImp.setBackground(new java.awt.Color(22, 22, 22));
        btn_exclImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_exclImp.setToolTipText("Excluir!");
        btn_exclImp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclImp.setBorderPainted(false);
        btn_exclImp.setEnabled(false);
        btn_exclImp.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_exclImp.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_exclImp.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_exclImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclImpActionPerformed(evt);
            }
        });

        btn_limpImp.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpImp.setToolTipText("Limpar!");
        btn_limpImp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpImp.setBorderPainted(false);
        btn_limpImp.setEnabled(false);
        btn_limpImp.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpImp.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpImp.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpImpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelImpressLayout = new javax.swing.GroupLayout(jPanelImpress);
        jPanelImpress.setLayout(jPanelImpressLayout);
        jPanelImpressLayout.setHorizontalGroup(
            jPanelImpressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImpressLayout.createSequentialGroup()
                .addComponent(jScrollimpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelImpressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImpressLayout.createSequentialGroup()
                        .addComponent(btn_addImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_altImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_motivoImp_cad)
                    .addComponent(txt_codImp_cad)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelImpressLayout.setVerticalGroup(
            jPanelImpressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollimpressao, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
            .addGroup(jPanelImpressLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codImp_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_motivoImp_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelImpressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_altImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exclImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelCard2.add(jPanelImpress, "impress");
        jPanelImpress.getAccessibleContext().setAccessibleName("impress");

        jPanelOutros.setBackground(new java.awt.Color(65, 65, 65));

        tb_outros.setBackground(new java.awt.Color(63, 63, 63));
        tb_outros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_outros.setForeground(new java.awt.Color(255, 255, 255));
        tb_outros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod", "DESCRIÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_outros.setToolTipText("Duplo clicke para alterar ou excluir cadastro");
        tb_outros.setGridColor(new java.awt.Color(63, 63, 63));
        tb_outros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_outrosMouseClicked(evt);
            }
        });
        jScrolloutros.setViewportView(tb_outros);
        if (tb_outros.getColumnModel().getColumnCount() > 0) {
            tb_outros.getColumnModel().getColumn(0).setMinWidth(0);
            tb_outros.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_outros.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cadastro Outros");

        txt_codOut_cad.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codOut_cad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codOut_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_codOut_cad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_codOut_cad.setBorder(null);
        txt_codOut_cad.setEnabled(false);

        txt_motivoOut_cad.setBackground(new java.awt.Color(63, 63, 63));
        txt_motivoOut_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_motivoOut_cad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_motivoOut_cad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_motivoOut_cadKeyPressed(evt);
            }
        });

        btn_addOut.setBackground(new java.awt.Color(22, 22, 22));
        btn_addOut.setForeground(new java.awt.Color(255, 255, 255));
        btn_addOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_addOut.setToolTipText("Adicionar novo!");
        btn_addOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addOut.setBorderPainted(false);
        btn_addOut.setEnabled(false);
        btn_addOut.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_addOut.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_addOut.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_addOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addOutActionPerformed(evt);
            }
        });

        btn_altOut.setBackground(new java.awt.Color(22, 22, 22));
        btn_altOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_altOut.setToolTipText("Alterar!");
        btn_altOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_altOut.setBorderPainted(false);
        btn_altOut.setEnabled(false);
        btn_altOut.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_altOut.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_altOut.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_altOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altOutActionPerformed(evt);
            }
        });

        btn_exclOut.setBackground(new java.awt.Color(22, 22, 22));
        btn_exclOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_exclOut.setToolTipText("Excluir!");
        btn_exclOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclOut.setBorderPainted(false);
        btn_exclOut.setEnabled(false);
        btn_exclOut.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_exclOut.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_exclOut.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_exclOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclOutActionPerformed(evt);
            }
        });

        btn_limpOut.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpOut.setToolTipText("Limpar!");
        btn_limpOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpOut.setBorderPainted(false);
        btn_limpOut.setEnabled(false);
        btn_limpOut.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpOut.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpOut.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOutrosLayout = new javax.swing.GroupLayout(jPanelOutros);
        jPanelOutros.setLayout(jPanelOutrosLayout);
        jPanelOutrosLayout.setHorizontalGroup(
            jPanelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOutrosLayout.createSequentialGroup()
                .addComponent(jScrolloutros, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOutrosLayout.createSequentialGroup()
                        .addComponent(btn_addOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_altOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_motivoOut_cad)
                    .addComponent(txt_codOut_cad)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOutrosLayout.setVerticalGroup(
            jPanelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrolloutros, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
            .addGroup(jPanelOutrosLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codOut_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_motivoOut_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_altOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exclOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelCard2.add(jPanelOutros, "outros");
        jPanelOutros.getAccessibleContext().setAccessibleName("outros");

        jPanelMaquina.setBackground(new java.awt.Color(65, 65, 65));

        tb_maquina.setBackground(new java.awt.Color(63, 63, 63));
        tb_maquina.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_maquina.setForeground(new java.awt.Color(255, 255, 255));
        tb_maquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod", "NOME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_maquina.setToolTipText("Duplo clicke para alterar ou excluir cadastro");
        tb_maquina.setGridColor(new java.awt.Color(63, 63, 63));
        tb_maquina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_maquinaMouseClicked(evt);
            }
        });
        jScrollmaquina.setViewportView(tb_maquina);
        if (tb_maquina.getColumnModel().getColumnCount() > 0) {
            tb_maquina.getColumnModel().getColumn(0).setMinWidth(0);
            tb_maquina.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_maquina.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cadastro Máquina Offset");

        txt_codMaq_cad.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codMaq_cad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codMaq_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_codMaq_cad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_codMaq_cad.setBorder(null);
        txt_codMaq_cad.setEnabled(false);

        txt_nomeMaq_cad.setBackground(new java.awt.Color(63, 63, 63));
        txt_nomeMaq_cad.setForeground(new java.awt.Color(255, 255, 255));
        txt_nomeMaq_cad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nomeMaq_cad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nomeMaq_cadKeyPressed(evt);
            }
        });

        btn_addMaq.setBackground(new java.awt.Color(22, 22, 22));
        btn_addMaq.setForeground(new java.awt.Color(255, 255, 255));
        btn_addMaq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_addMaq.setToolTipText("Adicionar novo!");
        btn_addMaq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addMaq.setBorderPainted(false);
        btn_addMaq.setEnabled(false);
        btn_addMaq.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_addMaq.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_addMaq.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_addMaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addMaqActionPerformed(evt);
            }
        });

        btn_altMaq.setBackground(new java.awt.Color(22, 22, 22));
        btn_altMaq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_altMaq.setToolTipText("Alterar!");
        btn_altMaq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_altMaq.setBorderPainted(false);
        btn_altMaq.setEnabled(false);
        btn_altMaq.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_altMaq.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_altMaq.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_altMaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altMaqActionPerformed(evt);
            }
        });

        btn_exclMaq.setBackground(new java.awt.Color(22, 22, 22));
        btn_exclMaq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_exclMaq.setToolTipText("Excluir!");
        btn_exclMaq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclMaq.setBorderPainted(false);
        btn_exclMaq.setEnabled(false);
        btn_exclMaq.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_exclMaq.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_exclMaq.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_exclMaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclMaqActionPerformed(evt);
            }
        });

        btn_limpMaq.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpMaq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpMaq.setToolTipText("Limpar!");
        btn_limpMaq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpMaq.setBorderPainted(false);
        btn_limpMaq.setEnabled(false);
        btn_limpMaq.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpMaq.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpMaq.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpMaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpMaqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMaquinaLayout = new javax.swing.GroupLayout(jPanelMaquina);
        jPanelMaquina.setLayout(jPanelMaquinaLayout);
        jPanelMaquinaLayout.setHorizontalGroup(
            jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                .addComponent(jScrollmaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMaquinaLayout.createSequentialGroup()
                        .addComponent(btn_addMaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_altMaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclMaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpMaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nomeMaq_cad)
                    .addComponent(txt_codMaq_cad)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMaquinaLayout.setVerticalGroup(
            jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollmaquina, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codMaq_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nomeMaq_cad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_altMaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exclMaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpMaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addMaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelCard2.add(jPanelMaquina, "maquina");
        jPanelMaquina.getAccessibleContext().setAccessibleName("maquina");

        javax.swing.GroupLayout jPanelAjustesLayout = new javax.swing.GroupLayout(jPanelAjustes);
        jPanelAjustes.setLayout(jPanelAjustesLayout);
        jPanelAjustesLayout.setHorizontalGroup(
            jPanelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAjustesLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAjustesLayout.setVerticalGroup(
            jPanelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAjustesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanelCard1.add(jPanelAjustes, "ajustes");
        jPanelAjustes.getAccessibleContext().setAccessibleName("ajustes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        MostraCard1("ajustes");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        MostraCard1("grav");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        MostraCard1("regrav");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        MostraCard1("lote");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        MostraCard2("vendas");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        MostraCard2("prog");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        MostraCard2("preimp");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        MostraCard2("copia");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        MostraCard2("impress");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        MostraCard2("outros");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        MostraCard2("maquina");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void tb_vendasclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_vendasclienteMouseClicked

        tb_vendascliente.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String c0 = tb_vendascliente.getValueAt(tb_vendascliente.getSelectedRow(), 0).toString();
                    String c1 = tb_vendascliente.getValueAt(tb_vendascliente.getSelectedRow(), 1).toString();

                    txt_codVend_cad.setText(c0);
                    txt_motivoVend_cad.setText(c1);

                    btn_addVend.setEnabled(false);
                    btn_exclVend.setEnabled(true);
                    btn_altVend.setEnabled(true);
                    btn_limpVend.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_tb_vendasclienteMouseClicked

    private void txt_motivoVend_cadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_motivoVend_cadKeyPressed
        if ("".equals(txt_codVend_cad.getText())) {
            btn_addVend.setEnabled(true);
            btn_altVend.setEnabled(false);
            btn_exclVend.setEnabled(false);
            btn_limpVend.setEnabled(true);
        }
    }//GEN-LAST:event_txt_motivoVend_cadKeyPressed

    private void btn_addVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addVendActionPerformed
        // Criar novo registro Cliente
        VendasCliente obj = new VendasCliente();

        obj.setMotivo(txt_motivoVend_cad.getText());

        VendasClienteDAO dao = new VendasClienteDAO();
        dao.cadastrar(obj);

        LimparVendasCliente();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_addVendActionPerformed

    private void btn_altVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altVendActionPerformed
        // Alterar novo registro Cliente
        VendasCliente obj = new VendasCliente();

        obj.setMotivo(txt_motivoVend_cad.getText());
        obj.setCod_vend(Integer.parseInt(txt_codVend_cad.getText()));
        VendasClienteDAO dao = new VendasClienteDAO();
        dao.alterar(obj);

        LimparVendasCliente();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_altVendActionPerformed

    private void btn_exclVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclVendActionPerformed
        // botao Excluir Clientes

        String mt = txt_motivoVend_cad.getText();
        int resposta = JOptionPane.showConfirmDialog(null, "Excluir " + mt + "?", "", JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {

            VendasCliente obj = new VendasCliente();

            obj.setCod_vend(Integer.parseInt(txt_codVend_cad.getText()));

            VendasClienteDAO dao = new VendasClienteDAO();

            dao.excluir(obj);

            LimparVendasCliente();

            //AtualizarcbClientes();
        }
    }//GEN-LAST:event_btn_exclVendActionPerformed

    private void btn_limpVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpVendActionPerformed

        LimparVendasCliente();
    }//GEN-LAST:event_btn_limpVendActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        listarGravacao();
        listarVendasCliente();
        listarProgramacao();
        listarPreImpressao();
        listarCopiaChapa();
        listarImpressao();
        listarOutros();
        listarMaquina();
    }//GEN-LAST:event_formWindowActivated

    private void tb_programacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_programacaoMouseClicked

        tb_programacao.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String c0 = tb_programacao.getValueAt(tb_programacao.getSelectedRow(), 0).toString();
                    String c1 = tb_programacao.getValueAt(tb_programacao.getSelectedRow(), 1).toString();

                    txt_codProg_cad.setText(c0);
                    txt_motivoProg_cad.setText(c1);

                    btn_addProg.setEnabled(false);
                    btn_exclProg.setEnabled(true);
                    btn_altProg.setEnabled(true);
                    btn_limpProg.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_tb_programacaoMouseClicked

    private void tb_preImpressaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_preImpressaoMouseClicked

        tb_preImpressao.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String c0 = tb_preImpressao.getValueAt(tb_preImpressao.getSelectedRow(), 0).toString();
                    String c1 = tb_preImpressao.getValueAt(tb_preImpressao.getSelectedRow(), 1).toString();

                    txt_codPre_cad.setText(c0);
                    txt_motivoPre_cad.setText(c1);

                    btn_addPre.setEnabled(false);
                    btn_exclPre.setEnabled(true);
                    btn_altPre.setEnabled(true);
                    btn_limpPre.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_tb_preImpressaoMouseClicked

    private void tb_copiaChapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_copiaChapaMouseClicked

        tb_copiaChapa.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String c0 = tb_copiaChapa.getValueAt(tb_copiaChapa.getSelectedRow(), 0).toString();
                    String c1 = tb_copiaChapa.getValueAt(tb_copiaChapa.getSelectedRow(), 1).toString();

                    txt_codCopChapa_cad.setText(c0);
                    txt_motivoCopChapa_cad.setText(c1);

                    btn_addCopChapa.setEnabled(false);
                    btn_exclCopChapa.setEnabled(true);
                    btn_altCopChapa.setEnabled(true);
                    btn_limpCopChapa.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_tb_copiaChapaMouseClicked

    private void tb_impressaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_impressaoMouseClicked

        tb_impressao.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String c0 = tb_impressao.getValueAt(tb_impressao.getSelectedRow(), 0).toString();
                    String c1 = tb_impressao.getValueAt(tb_impressao.getSelectedRow(), 1).toString();

                    txt_codImp_cad.setText(c0);
                    txt_motivoImp_cad.setText(c1);

                    btn_addImp.setEnabled(false);
                    btn_exclImp.setEnabled(true);
                    btn_altImp.setEnabled(true);
                    btn_limpImp.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_tb_impressaoMouseClicked

    private void tb_outrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_outrosMouseClicked

        tb_outros.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String c0 = tb_outros.getValueAt(tb_outros.getSelectedRow(), 0).toString();
                    String c1 = tb_outros.getValueAt(tb_outros.getSelectedRow(), 1).toString();

                    txt_codOut_cad.setText(c0);
                    txt_motivoOut_cad.setText(c1);

                    btn_addOut.setEnabled(false);
                    btn_exclOut.setEnabled(true);
                    btn_altOut.setEnabled(true);
                    btn_limpOut.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_tb_outrosMouseClicked

    private void tb_maquinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_maquinaMouseClicked

        tb_maquina.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String c0 = tb_maquina.getValueAt(tb_maquina.getSelectedRow(), 0).toString();
                    String c1 = tb_maquina.getValueAt(tb_maquina.getSelectedRow(), 1).toString();

                    txt_codMaq_cad.setText(c0);
                    txt_nomeMaq_cad.setText(c1);

                    btn_addMaq.setEnabled(false);
                    btn_exclMaq.setEnabled(true);
                    btn_altMaq.setEnabled(true);
                    btn_limpMaq.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_tb_maquinaMouseClicked

    private void txt_motivoProg_cadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_motivoProg_cadKeyPressed

        if ("".equals(txt_codProg_cad.getText())) {
            btn_addProg.setEnabled(true);
            btn_altProg.setEnabled(false);
            btn_exclProg.setEnabled(false);
            btn_limpProg.setEnabled(true);
        }
    }//GEN-LAST:event_txt_motivoProg_cadKeyPressed

    private void btn_addProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProgActionPerformed
        // Criar novo registro Cliente
        Programacao obj = new Programacao();

        obj.setMotivo(txt_motivoProg_cad.getText());

        ProgramacaoDAO dao = new ProgramacaoDAO();
        dao.cadastrar(obj);

        LimparProgramacao();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_addProgActionPerformed

    private void btn_altProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altProgActionPerformed
        // Alterar novo registro Cliente
        Programacao obj = new Programacao();

        obj.setMotivo(txt_motivoProg_cad.getText());
        obj.setCod_prog(Integer.parseInt(txt_codProg_cad.getText()));
        ProgramacaoDAO dao = new ProgramacaoDAO();
        dao.alterar(obj);

        LimparProgramacao();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_altProgActionPerformed

    private void btn_exclProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclProgActionPerformed
        // botao Excluir Clientes

        String mt = txt_motivoProg_cad.getText();
        int resposta = JOptionPane.showConfirmDialog(null, "Excluir " + mt + "?", "", JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {

            Programacao obj = new Programacao();

            obj.setCod_prog(Integer.parseInt(txt_codProg_cad.getText()));

            ProgramacaoDAO dao = new ProgramacaoDAO();

            dao.excluir(obj);

            LimparProgramacao();

            //AtualizarcbClientes();
        }
    }//GEN-LAST:event_btn_exclProgActionPerformed

    private void btn_limpProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpProgActionPerformed

        LimparProgramacao();
    }//GEN-LAST:event_btn_limpProgActionPerformed

    private void txt_motivoPre_cadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_motivoPre_cadKeyPressed

        if ("".equals(txt_codPre_cad.getText())) {
            btn_addPre.setEnabled(true);
            btn_altPre.setEnabled(false);
            btn_exclPre.setEnabled(false);
            btn_limpPre.setEnabled(true);
        }
    }//GEN-LAST:event_txt_motivoPre_cadKeyPressed

    private void btn_addPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addPreActionPerformed
        // Criar novo registro Cliente
        PreImpressao obj = new PreImpressao();

        obj.setMotivo(txt_motivoPre_cad.getText());

        PreImpressaoDAO dao = new PreImpressaoDAO();
        dao.cadastrar(obj);

        LimparPreImpressao();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_addPreActionPerformed

    private void btn_altPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altPreActionPerformed
        // Alterar novo registro Cliente
        PreImpressao obj = new PreImpressao();

        obj.setMotivo(txt_motivoPre_cad.getText());
        obj.setCod_pre(Integer.parseInt(txt_codPre_cad.getText()));
        PreImpressaoDAO dao = new PreImpressaoDAO();
        dao.alterar(obj);

        LimparPreImpressao();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_altPreActionPerformed

    private void btn_exclPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclPreActionPerformed

        String mt = txt_motivoPre_cad.getText();
        int resposta = JOptionPane.showConfirmDialog(null, "Excluir " + mt + "?", "", JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {

            PreImpressao obj = new PreImpressao();

            obj.setCod_pre(Integer.parseInt(txt_codPre_cad.getText()));

            PreImpressaoDAO dao = new PreImpressaoDAO();

            dao.excluir(obj);

            LimparPreImpressao();

            //AtualizarcbClientes();
        }
    }//GEN-LAST:event_btn_exclPreActionPerformed

    private void btn_limpPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpPreActionPerformed

        LimparPreImpressao();
    }//GEN-LAST:event_btn_limpPreActionPerformed

    private void txt_motivoCopChapa_cadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_motivoCopChapa_cadKeyPressed

        if ("".equals(txt_codCopChapa_cad.getText())) {
            btn_addCopChapa.setEnabled(true);
            btn_altCopChapa.setEnabled(false);
            btn_exclCopChapa.setEnabled(false);
            btn_limpCopChapa.setEnabled(true);
        }
    }//GEN-LAST:event_txt_motivoCopChapa_cadKeyPressed

    private void btn_addCopChapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCopChapaActionPerformed

        CopiaChapa obj = new CopiaChapa();

        obj.setMotivo(txt_motivoCopChapa_cad.getText());

        CopiaChapaDAO dao = new CopiaChapaDAO();
        dao.cadastrar(obj);

        LimparCopiaChapa();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_addCopChapaActionPerformed

    private void btn_altCopChapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altCopChapaActionPerformed

        CopiaChapa obj = new CopiaChapa();

        obj.setMotivo(txt_motivoCopChapa_cad.getText());
        obj.setCod_copchapa(Integer.parseInt(txt_codCopChapa_cad.getText()));
        CopiaChapaDAO dao = new CopiaChapaDAO();
        dao.alterar(obj);

        LimparCopiaChapa();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_altCopChapaActionPerformed

    private void btn_exclCopChapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclCopChapaActionPerformed

        String mt = txt_motivoCopChapa_cad.getText();
        int resposta = JOptionPane.showConfirmDialog(null, "Excluir " + mt + "?", "", JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {

            CopiaChapa obj = new CopiaChapa();

            obj.setCod_copchapa(Integer.parseInt(txt_codCopChapa_cad.getText()));

            CopiaChapaDAO dao = new CopiaChapaDAO();

            dao.excluir(obj);

            LimparCopiaChapa();

            //AtualizarcbClientes();
        }
    }//GEN-LAST:event_btn_exclCopChapaActionPerformed

    private void btn_limpCopChapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpCopChapaActionPerformed

        LimparCopiaChapa();
    }//GEN-LAST:event_btn_limpCopChapaActionPerformed

    private void txt_motivoOut_cadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_motivoOut_cadKeyPressed

        if ("".equals(txt_codOut_cad.getText())) {
            btn_addOut.setEnabled(true);
            btn_altOut.setEnabled(false);
            btn_exclOut.setEnabled(false);
            btn_limpOut.setEnabled(true);
        }
    }//GEN-LAST:event_txt_motivoOut_cadKeyPressed

    private void btn_addOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addOutActionPerformed

        Outros obj = new Outros();

        obj.setMotivo(txt_motivoOut_cad.getText());

        OutrosDAO dao = new OutrosDAO();
        dao.cadastrar(obj);

        LimparOutros();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_addOutActionPerformed

    private void btn_altOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altOutActionPerformed

        Outros obj = new Outros();

        obj.setMotivo(txt_motivoOut_cad.getText());
        obj.setCod_out(Integer.parseInt(txt_codOut_cad.getText()));
        OutrosDAO dao = new OutrosDAO();
        dao.alterar(obj);

        LimparOutros();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_altOutActionPerformed

    private void btn_exclOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclOutActionPerformed

        String mt = txt_motivoOut_cad.getText();
        int resposta = JOptionPane.showConfirmDialog(null, "Excluir " + mt + "?", "", JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {

            Outros obj = new Outros();

            obj.setCod_out(Integer.parseInt(txt_codOut_cad.getText()));

            OutrosDAO dao = new OutrosDAO();

            dao.excluir(obj);

            LimparOutros();

            //AtualizarcbClientes();
        }
    }//GEN-LAST:event_btn_exclOutActionPerformed

    private void btn_limpOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpOutActionPerformed

        LimparOutros();
    }//GEN-LAST:event_btn_limpOutActionPerformed

    private void txt_nomeMaq_cadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomeMaq_cadKeyPressed

        if ("".equals(txt_codMaq_cad.getText())) {
            btn_addMaq.setEnabled(true);
            btn_altMaq.setEnabled(false);
            btn_exclMaq.setEnabled(false);
            btn_limpMaq.setEnabled(true);
        }
    }//GEN-LAST:event_txt_nomeMaq_cadKeyPressed

    private void btn_addMaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addMaqActionPerformed

        Maquina obj = new Maquina();

        obj.setNome(txt_nomeMaq_cad.getText());

        MaquinaDAO dao = new MaquinaDAO();
        dao.cadastrar(obj);

        LimparMaquina();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_addMaqActionPerformed

    private void btn_altMaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altMaqActionPerformed

        Maquina obj = new Maquina();

        obj.setNome(txt_nomeMaq_cad.getText());
        obj.setCod_maq(Integer.parseInt(txt_codMaq_cad.getText()));
        MaquinaDAO dao = new MaquinaDAO();
        dao.alterar(obj);

        LimparMaquina();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_altMaqActionPerformed

    private void btn_exclMaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclMaqActionPerformed

        String mt = txt_nomeMaq_cad.getText();
        int resposta = JOptionPane.showConfirmDialog(null, "Excluir " + mt + "?", "", JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {

            Maquina obj = new Maquina();

            obj.setCod_maq(Integer.parseInt(txt_codMaq_cad.getText()));

            MaquinaDAO dao = new MaquinaDAO();

            dao.excluir(obj);

            LimparMaquina();

            //AtualizarcbClientes();
        }
    }//GEN-LAST:event_btn_exclMaqActionPerformed

    private void btn_limpMaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpMaqActionPerformed

        LimparMaquina();
    }//GEN-LAST:event_btn_limpMaqActionPerformed

    private void txt_motivoImp_cadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_motivoImp_cadKeyPressed

        if ("".equals(txt_codImp_cad.getText())) {
            btn_addImp.setEnabled(true);
            btn_altImp.setEnabled(false);
            btn_exclImp.setEnabled(false);
            btn_limpImp.setEnabled(true);
        }
    }//GEN-LAST:event_txt_motivoImp_cadKeyPressed

    private void btn_addImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addImpActionPerformed

        Impressao obj = new Impressao();

        obj.setMotivo(txt_motivoImp_cad.getText());

        ImpressaoDAO dao = new ImpressaoDAO();
        dao.cadastrar(obj);

        LimparImpressao();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_addImpActionPerformed

    private void btn_altImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altImpActionPerformed

        Impressao obj = new Impressao();

        obj.setMotivo(txt_motivoImp_cad.getText());
        obj.setCod_imp(Integer.parseInt(txt_codImp_cad.getText()));
        ImpressaoDAO dao = new ImpressaoDAO();
        dao.alterar(obj);

        LimparImpressao();

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_altImpActionPerformed

    private void btn_exclImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclImpActionPerformed

        String mt = txt_motivoImp_cad.getText();
        int resposta = JOptionPane.showConfirmDialog(null, "Excluir " + mt + "?", "", JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {

            Impressao obj = new Impressao();

            obj.setCod_imp(Integer.parseInt(txt_codImp_cad.getText()));

            ImpressaoDAO dao = new ImpressaoDAO();

            dao.excluir(obj);

            LimparImpressao();

            //AtualizarcbClientes();
        }
    }//GEN-LAST:event_btn_exclImpActionPerformed

    private void btn_limpImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpImpActionPerformed

        LimparImpressao();
    }//GEN-LAST:event_btn_limpImpActionPerformed

    private void txt_montGravKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_montGravKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_montGravKeyPressed

    private void btn_novoGravActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoGravActionPerformed

        if ("".equals(txt_rpGrav.getText())) {
            JOptionPane.showMessageDialog(null, "RP Inválida!", "", 2);
        } else {
            if ("".equals(txt_montGrav.getText())) {
                JOptionPane.showMessageDialog(null, "Montagem Iválida!", "", 2);
            } else {
                if ("".equals(txt_qtdGrav.getText())) {
                    JOptionPane.showMessageDialog(null, "Quantidade Iválida!", "", 2);
                } else {
                    if ("*".equals(cb_maquinaGrav.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Maquina Iválida!", "", 2);
                    } else {
                        if ("".equals(txt_operadorGrav.getText())) {
                            JOptionPane.showMessageDialog(null, "Operador Iválido!", "", 2);
                        } else {
                            if ("*".equals(cb_turno.getSelectedItem().toString())) {
                                JOptionPane.showMessageDialog(null, "Turno Iválido!", "", 2);
                            } else {

                                int codhcg = 0;

                                HorasCompGrafDAO dao = new HorasCompGrafDAO();
                                List<HorasCompGraf> lista = dao.BuscaOperador(txt_rpGrav.getText());

                                for (HorasCompGraf c : lista) {
                                    codhcg = c.getCod_hcg();

                                }

                                CadastroChapa obj = new CadastroChapa();

                                obj.setOrdemprod(txt_rpGrav.getText() + "." + txt_montGrav.getText());
                                obj.setSituacao("Gravado");
                                obj.setQuantidade(Integer.parseInt(txt_qtdGrav.getText()));
                                obj.setTurno(cb_turno.getSelectedItem().toString());
                                obj.setMaquina(cb_maquinaGrav.getSelectedItem().toString());
                                obj.setCod_hcg(codhcg);
                                obj.setCriado(Dh());
                                obj.setModificado(Dh());

                                CadastroChapaDAO dao2 = new CadastroChapaDAO();
                                dao2.cadastrar(obj);

                                LimparGravacao();
                            }

                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_btn_novoGravActionPerformed

    private void btn_preencheDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_preencheDataActionPerformed

        txt_operadorGrav.setText("");

        HorasCompGrafDAO dao = new HorasCompGrafDAO();
        List<HorasCompGraf> lista = dao.BuscaOperador(txt_rpGrav.getText());

        for (HorasCompGraf c : lista) {
            txt_operadorGrav.setText(c.getNomeoperador().toString());

        }
    }//GEN-LAST:event_btn_preencheDataActionPerformed

    private void btn_limpaGravActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpaGravActionPerformed

        LimparGravacao();
    }//GEN-LAST:event_btn_limpaGravActionPerformed

    private void tb_gravMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_gravMouseClicked

        tb_grav.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    datacriacao = tb_grav.getValueAt(tb_grav.getSelectedRow(), 7).toString();
                    String rp[] = tb_grav.getValueAt(tb_grav.getSelectedRow(), 1).toString().split(".");

                    String c0 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 0).toString();
                    String c1 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 1).toString();
                    String c2 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 2).toString();
                    String c3 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 3).toString();
                    String c4 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 4).toString();
                    String c5 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 5).toString();
                    String c6 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 6).toString();
                    String c7 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 7).toString();
                    String c8 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 8).toString();
                    String c9 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 9).toString();
                    String c10 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 10).toString();
                    String c11 = tb_grav.getValueAt(tb_grav.getSelectedRow(), 11).toString();

                    txt_codGrav.setText(c0);
                    txt_rpGrav.setText(rp[0]);
                    txt_montGrav.setText(rp[1]);
                    txt_qtdGrav.setText(c3);
                    cb_maquinaGrav.setSelectedItem(c6);
                    txt_operadorGrav.setText("");

                    btn_novoGrav.setEnabled(false);
                    btn_excluiGrav.setEnabled(true);
                    btn_alteraGrav.setEnabled(true);
                    btn_limpaGrav.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_tb_gravMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCopChapa;
    private javax.swing.JButton btn_addImp;
    private javax.swing.JButton btn_addMaq;
    private javax.swing.JButton btn_addOut;
    private javax.swing.JButton btn_addPre;
    private javax.swing.JButton btn_addProg;
    private javax.swing.JButton btn_addVend;
    private javax.swing.JButton btn_altCopChapa;
    private javax.swing.JButton btn_altImp;
    private javax.swing.JButton btn_altMaq;
    private javax.swing.JButton btn_altOut;
    private javax.swing.JButton btn_altPre;
    private javax.swing.JButton btn_altProg;
    private javax.swing.JButton btn_altVend;
    private javax.swing.JButton btn_alteraGrav;
    private javax.swing.JButton btn_buscaRpGrav;
    private javax.swing.JButton btn_exclCopChapa;
    private javax.swing.JButton btn_exclImp;
    private javax.swing.JButton btn_exclMaq;
    private javax.swing.JButton btn_exclOut;
    private javax.swing.JButton btn_exclPre;
    private javax.swing.JButton btn_exclProg;
    private javax.swing.JButton btn_exclVend;
    private javax.swing.JButton btn_excluiGrav;
    private javax.swing.JButton btn_limpCopChapa;
    private javax.swing.JButton btn_limpImp;
    private javax.swing.JButton btn_limpMaq;
    private javax.swing.JButton btn_limpOut;
    private javax.swing.JButton btn_limpPre;
    private javax.swing.JButton btn_limpProg;
    private javax.swing.JButton btn_limpVend;
    private javax.swing.JButton btn_limpaGrav;
    private javax.swing.JButton btn_novoGrav;
    private javax.swing.JButton btn_preencheData;
    public javax.swing.JComboBox cb_maquinaGrav;
    public javax.swing.JComboBox cb_turno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelAjustes;
    private javax.swing.JPanel jPanelCard1;
    private javax.swing.JPanel jPanelCard2;
    private javax.swing.JPanel jPanelCopia;
    private javax.swing.JPanel jPanelGrav;
    private javax.swing.JPanel jPanelImpress;
    private javax.swing.JPanel jPanelLote;
    private javax.swing.JPanel jPanelMaquina;
    private javax.swing.JPanel jPanelOutros;
    private javax.swing.JPanel jPanelPreImp;
    private javax.swing.JPanel jPanelProg;
    private javax.swing.JPanel jPanelRegrav;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JScrollPane jScrollcopiachapa;
    private javax.swing.JScrollPane jScrollgrav;
    private javax.swing.JScrollPane jScrollimpressao;
    private javax.swing.JScrollPane jScrollmaquina;
    private javax.swing.JScrollPane jScrolloutros;
    private javax.swing.JScrollPane jScrollpreimpressao;
    private javax.swing.JScrollPane jScrollprogramacao;
    private javax.swing.JScrollPane jScrollvendascliente;
    private javax.swing.JTable tb_copiaChapa;
    private javax.swing.JTable tb_grav;
    private javax.swing.JTable tb_impressao;
    private javax.swing.JTable tb_maquina;
    private javax.swing.JTable tb_outros;
    private javax.swing.JTable tb_preImpressao;
    private javax.swing.JTable tb_programacao;
    private javax.swing.JTable tb_vendascliente;
    private javax.swing.JTextField txt_codCopChapa_cad;
    public javax.swing.JTextField txt_codGrav;
    private javax.swing.JTextField txt_codImp_cad;
    private javax.swing.JTextField txt_codMaq_cad;
    private javax.swing.JTextField txt_codOut_cad;
    private javax.swing.JTextField txt_codPre_cad;
    private javax.swing.JTextField txt_codProg_cad;
    private javax.swing.JTextField txt_codVend_cad;
    public javax.swing.JTextField txt_montGrav;
    private javax.swing.JTextField txt_motivoCopChapa_cad;
    private javax.swing.JTextField txt_motivoImp_cad;
    private javax.swing.JTextField txt_motivoOut_cad;
    private javax.swing.JTextField txt_motivoPre_cad;
    private javax.swing.JTextField txt_motivoProg_cad;
    private javax.swing.JTextField txt_motivoVend_cad;
    private javax.swing.JTextField txt_nomeMaq_cad;
    public javax.swing.JTextField txt_operadorGrav;
    public javax.swing.JTextField txt_qtdGrav;
    public javax.swing.JTextField txt_rpGrav;
    // End of variables declaration//GEN-END:variables
}
