/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapaapp.view;

import chapaapp.dao.CopiaChapaDAO;
import chapaapp.dao.PreImpressaoDAO;
import chapaapp.dao.ProgramacaoDAO;
import chapaapp.dao.VendasClienteDAO;
import chapaapp.model.CopiaChapa;
import chapaapp.model.PreImpressao;
import chapaapp.model.Programacao;
import chapaapp.model.VendasCliente;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    
    

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        PersonalizarTabelas();
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
        jPanelCard1 = new javax.swing.JPanel();
        jPanelGrav = new javax.swing.JPanel();
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
        jScrollvendascliente4 = new javax.swing.JScrollPane();
        tb_vendascliente4 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txt_codVend_cad10 = new javax.swing.JTextField();
        txt_motivoVend_cad10 = new javax.swing.JTextField();
        btn_addVend10 = new javax.swing.JButton();
        btn_altVend10 = new javax.swing.JButton();
        btn_exclVend10 = new javax.swing.JButton();
        btn_limpVend10 = new javax.swing.JButton();
        jPanelOutros = new javax.swing.JPanel();
        jScrollvendascliente5 = new javax.swing.JScrollPane();
        tb_vendascliente5 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txt_codVend_cad11 = new javax.swing.JTextField();
        txt_motivoVend_cad11 = new javax.swing.JTextField();
        btn_addVend11 = new javax.swing.JButton();
        btn_altVend11 = new javax.swing.JButton();
        btn_exclVend11 = new javax.swing.JButton();
        btn_limpVend11 = new javax.swing.JButton();
        jPanelMaquina = new javax.swing.JPanel();
        jScrollvendascliente6 = new javax.swing.JScrollPane();
        tb_vendascliente6 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txt_codVend_cad12 = new javax.swing.JTextField();
        txt_motivoVend_cad12 = new javax.swing.JTextField();
        btn_addVend12 = new javax.swing.JButton();
        btn_altVend12 = new javax.swing.JButton();
        btn_exclVend12 = new javax.swing.JButton();
        btn_limpVend12 = new javax.swing.JButton();

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
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jButton1)
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

        javax.swing.GroupLayout jPanelGravLayout = new javax.swing.GroupLayout(jPanelGrav);
        jPanelGrav.setLayout(jPanelGravLayout);
        jPanelGravLayout.setHorizontalGroup(
            jPanelGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanelGravLayout.setVerticalGroup(
            jPanelGravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanelCard1.add(jPanelGrav, "grav");
        jPanelGrav.getAccessibleContext().setAccessibleName("grav");

        jPanelRegrav.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout jPanelRegravLayout = new javax.swing.GroupLayout(jPanelRegrav);
        jPanelRegrav.setLayout(jPanelRegravLayout);
        jPanelRegravLayout.setHorizontalGroup(
            jPanelRegravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanelRegravLayout.setVerticalGroup(
            jPanelRegravLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanelCard1.add(jPanelRegrav, "regrav");
        jPanelRegrav.getAccessibleContext().setAccessibleName("regrav");

        jPanelLote.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout jPanelLoteLayout = new javax.swing.GroupLayout(jPanelLote);
        jPanelLote.setLayout(jPanelLoteLayout);
        jPanelLoteLayout.setHorizontalGroup(
            jPanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanelLoteLayout.setVerticalGroup(
            jPanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
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
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollvendascliente, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
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
            .addComponent(jScrollprogramacao, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
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
            .addComponent(jScrollpreimpressao, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
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
            .addComponent(jScrollcopiachapa, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
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

        tb_vendascliente4.setBackground(new java.awt.Color(63, 63, 63));
        tb_vendascliente4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_vendascliente4.setForeground(new java.awt.Color(255, 255, 255));
        tb_vendascliente4.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_vendascliente4.setGridColor(new java.awt.Color(63, 63, 63));
        tb_vendascliente4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_vendascliente4MouseClicked(evt);
            }
        });
        jScrollvendascliente4.setViewportView(tb_vendascliente4);
        if (tb_vendascliente4.getColumnModel().getColumnCount() > 0) {
            tb_vendascliente4.getColumnModel().getColumn(0).setMinWidth(0);
            tb_vendascliente4.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_vendascliente4.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cadastro Impressão");

        txt_codVend_cad10.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codVend_cad10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codVend_cad10.setForeground(new java.awt.Color(255, 255, 255));
        txt_codVend_cad10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_codVend_cad10.setBorder(null);
        txt_codVend_cad10.setEnabled(false);

        txt_motivoVend_cad10.setBackground(new java.awt.Color(63, 63, 63));
        txt_motivoVend_cad10.setForeground(new java.awt.Color(255, 255, 255));
        txt_motivoVend_cad10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_motivoVend_cad10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_motivoVend_cad10KeyPressed(evt);
            }
        });

        btn_addVend10.setBackground(new java.awt.Color(22, 22, 22));
        btn_addVend10.setForeground(new java.awt.Color(255, 255, 255));
        btn_addVend10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_addVend10.setToolTipText("Adicionar novo!");
        btn_addVend10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addVend10.setBorderPainted(false);
        btn_addVend10.setEnabled(false);
        btn_addVend10.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_addVend10.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_addVend10.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_addVend10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addVend10ActionPerformed(evt);
            }
        });

        btn_altVend10.setBackground(new java.awt.Color(22, 22, 22));
        btn_altVend10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_altVend10.setToolTipText("Alterar!");
        btn_altVend10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_altVend10.setBorderPainted(false);
        btn_altVend10.setEnabled(false);
        btn_altVend10.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_altVend10.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_altVend10.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_altVend10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altVend10ActionPerformed(evt);
            }
        });

        btn_exclVend10.setBackground(new java.awt.Color(22, 22, 22));
        btn_exclVend10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_exclVend10.setToolTipText("Excluir!");
        btn_exclVend10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclVend10.setBorderPainted(false);
        btn_exclVend10.setEnabled(false);
        btn_exclVend10.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_exclVend10.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_exclVend10.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_exclVend10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclVend10ActionPerformed(evt);
            }
        });

        btn_limpVend10.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpVend10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpVend10.setToolTipText("Limpar!");
        btn_limpVend10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpVend10.setBorderPainted(false);
        btn_limpVend10.setEnabled(false);
        btn_limpVend10.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpVend10.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpVend10.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpVend10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpVend10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelImpressLayout = new javax.swing.GroupLayout(jPanelImpress);
        jPanelImpress.setLayout(jPanelImpressLayout);
        jPanelImpressLayout.setHorizontalGroup(
            jPanelImpressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImpressLayout.createSequentialGroup()
                .addComponent(jScrollvendascliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelImpressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImpressLayout.createSequentialGroup()
                        .addComponent(btn_addVend10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_altVend10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclVend10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpVend10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_motivoVend_cad10)
                    .addComponent(txt_codVend_cad10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelImpressLayout.setVerticalGroup(
            jPanelImpressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollvendascliente4, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
            .addGroup(jPanelImpressLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codVend_cad10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_motivoVend_cad10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelImpressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_altVend10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exclVend10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpVend10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addVend10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelCard2.add(jPanelImpress, "impress");
        jPanelImpress.getAccessibleContext().setAccessibleName("impress");

        jPanelOutros.setBackground(new java.awt.Color(65, 65, 65));

        tb_vendascliente5.setBackground(new java.awt.Color(63, 63, 63));
        tb_vendascliente5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_vendascliente5.setForeground(new java.awt.Color(255, 255, 255));
        tb_vendascliente5.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_vendascliente5.setGridColor(new java.awt.Color(63, 63, 63));
        tb_vendascliente5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_vendascliente5MouseClicked(evt);
            }
        });
        jScrollvendascliente5.setViewportView(tb_vendascliente5);
        if (tb_vendascliente5.getColumnModel().getColumnCount() > 0) {
            tb_vendascliente5.getColumnModel().getColumn(0).setMinWidth(0);
            tb_vendascliente5.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_vendascliente5.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cadastro Outros");

        txt_codVend_cad11.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codVend_cad11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codVend_cad11.setForeground(new java.awt.Color(255, 255, 255));
        txt_codVend_cad11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_codVend_cad11.setBorder(null);
        txt_codVend_cad11.setEnabled(false);

        txt_motivoVend_cad11.setBackground(new java.awt.Color(63, 63, 63));
        txt_motivoVend_cad11.setForeground(new java.awt.Color(255, 255, 255));
        txt_motivoVend_cad11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_motivoVend_cad11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_motivoVend_cad11KeyPressed(evt);
            }
        });

        btn_addVend11.setBackground(new java.awt.Color(22, 22, 22));
        btn_addVend11.setForeground(new java.awt.Color(255, 255, 255));
        btn_addVend11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_addVend11.setToolTipText("Adicionar novo!");
        btn_addVend11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addVend11.setBorderPainted(false);
        btn_addVend11.setEnabled(false);
        btn_addVend11.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_addVend11.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_addVend11.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_addVend11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addVend11ActionPerformed(evt);
            }
        });

        btn_altVend11.setBackground(new java.awt.Color(22, 22, 22));
        btn_altVend11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_altVend11.setToolTipText("Alterar!");
        btn_altVend11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_altVend11.setBorderPainted(false);
        btn_altVend11.setEnabled(false);
        btn_altVend11.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_altVend11.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_altVend11.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_altVend11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altVend11ActionPerformed(evt);
            }
        });

        btn_exclVend11.setBackground(new java.awt.Color(22, 22, 22));
        btn_exclVend11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_exclVend11.setToolTipText("Excluir!");
        btn_exclVend11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclVend11.setBorderPainted(false);
        btn_exclVend11.setEnabled(false);
        btn_exclVend11.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_exclVend11.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_exclVend11.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_exclVend11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclVend11ActionPerformed(evt);
            }
        });

        btn_limpVend11.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpVend11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpVend11.setToolTipText("Limpar!");
        btn_limpVend11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpVend11.setBorderPainted(false);
        btn_limpVend11.setEnabled(false);
        btn_limpVend11.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpVend11.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpVend11.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpVend11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpVend11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOutrosLayout = new javax.swing.GroupLayout(jPanelOutros);
        jPanelOutros.setLayout(jPanelOutrosLayout);
        jPanelOutrosLayout.setHorizontalGroup(
            jPanelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOutrosLayout.createSequentialGroup()
                .addComponent(jScrollvendascliente5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOutrosLayout.createSequentialGroup()
                        .addComponent(btn_addVend11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_altVend11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclVend11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpVend11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_motivoVend_cad11)
                    .addComponent(txt_codVend_cad11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOutrosLayout.setVerticalGroup(
            jPanelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollvendascliente5, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
            .addGroup(jPanelOutrosLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codVend_cad11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_motivoVend_cad11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_altVend11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exclVend11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpVend11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addVend11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelCard2.add(jPanelOutros, "outros");
        jPanelOutros.getAccessibleContext().setAccessibleName("outros");

        jPanelMaquina.setBackground(new java.awt.Color(65, 65, 65));

        tb_vendascliente6.setBackground(new java.awt.Color(63, 63, 63));
        tb_vendascliente6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_vendascliente6.setForeground(new java.awt.Color(255, 255, 255));
        tb_vendascliente6.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_vendascliente6.setGridColor(new java.awt.Color(63, 63, 63));
        tb_vendascliente6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_vendascliente6MouseClicked(evt);
            }
        });
        jScrollvendascliente6.setViewportView(tb_vendascliente6);
        if (tb_vendascliente6.getColumnModel().getColumnCount() > 0) {
            tb_vendascliente6.getColumnModel().getColumn(0).setMinWidth(0);
            tb_vendascliente6.getColumnModel().getColumn(0).setPreferredWidth(0);
            tb_vendascliente6.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cadastro Máquina Offset");

        txt_codVend_cad12.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_codVend_cad12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_codVend_cad12.setForeground(new java.awt.Color(255, 255, 255));
        txt_codVend_cad12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_codVend_cad12.setBorder(null);
        txt_codVend_cad12.setEnabled(false);

        txt_motivoVend_cad12.setBackground(new java.awt.Color(63, 63, 63));
        txt_motivoVend_cad12.setForeground(new java.awt.Color(255, 255, 255));
        txt_motivoVend_cad12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_motivoVend_cad12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_motivoVend_cad12KeyPressed(evt);
            }
        });

        btn_addVend12.setBackground(new java.awt.Color(22, 22, 22));
        btn_addVend12.setForeground(new java.awt.Color(255, 255, 255));
        btn_addVend12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Adicionar_32px.png"))); // NOI18N
        btn_addVend12.setToolTipText("Adicionar novo!");
        btn_addVend12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addVend12.setBorderPainted(false);
        btn_addVend12.setEnabled(false);
        btn_addVend12.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_addVend12.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_addVend12.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_addVend12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addVend12ActionPerformed(evt);
            }
        });

        btn_altVend12.setBackground(new java.awt.Color(22, 22, 22));
        btn_altVend12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Alterar_32px.png"))); // NOI18N
        btn_altVend12.setToolTipText("Alterar!");
        btn_altVend12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_altVend12.setBorderPainted(false);
        btn_altVend12.setEnabled(false);
        btn_altVend12.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_altVend12.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_altVend12.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_altVend12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altVend12ActionPerformed(evt);
            }
        });

        btn_exclVend12.setBackground(new java.awt.Color(22, 22, 22));
        btn_exclVend12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Remover_32px.png"))); // NOI18N
        btn_exclVend12.setToolTipText("Excluir!");
        btn_exclVend12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exclVend12.setBorderPainted(false);
        btn_exclVend12.setEnabled(false);
        btn_exclVend12.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_exclVend12.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_exclVend12.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_exclVend12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exclVend12ActionPerformed(evt);
            }
        });

        btn_limpVend12.setBackground(new java.awt.Color(22, 22, 22));
        btn_limpVend12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar_32px.png"))); // NOI18N
        btn_limpVend12.setToolTipText("Limpar!");
        btn_limpVend12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpVend12.setBorderPainted(false);
        btn_limpVend12.setEnabled(false);
        btn_limpVend12.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limpVend12.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limpVend12.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limpVend12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpVend12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMaquinaLayout = new javax.swing.GroupLayout(jPanelMaquina);
        jPanelMaquina.setLayout(jPanelMaquinaLayout);
        jPanelMaquinaLayout.setHorizontalGroup(
            jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                .addComponent(jScrollvendascliente6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMaquinaLayout.createSequentialGroup()
                        .addComponent(btn_addVend12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_altVend12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exclVend12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpVend12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_motivoVend_cad12)
                    .addComponent(txt_codVend_cad12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMaquinaLayout.setVerticalGroup(
            jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollvendascliente6, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codVend_cad12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_motivoVend_cad12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_altVend12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_exclVend12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpVend12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addVend12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanelCard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
        listarVendasCliente();
        listarProgramacao();
        listarPreImpressao();
        listarCopiaChapa();
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

    private void tb_vendascliente4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_vendascliente4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_vendascliente4MouseClicked

    private void tb_vendascliente5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_vendascliente5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_vendascliente5MouseClicked

    private void tb_vendascliente6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_vendascliente6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_vendascliente6MouseClicked

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

    private void txt_motivoVend_cad10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_motivoVend_cad10KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_motivoVend_cad10KeyPressed

    private void btn_addVend10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addVend10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addVend10ActionPerformed

    private void btn_altVend10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altVend10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_altVend10ActionPerformed

    private void btn_exclVend10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclVend10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exclVend10ActionPerformed

    private void btn_limpVend10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpVend10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpVend10ActionPerformed

    private void txt_motivoVend_cad11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_motivoVend_cad11KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_motivoVend_cad11KeyPressed

    private void btn_addVend11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addVend11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addVend11ActionPerformed

    private void btn_altVend11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altVend11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_altVend11ActionPerformed

    private void btn_exclVend11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclVend11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exclVend11ActionPerformed

    private void btn_limpVend11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpVend11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpVend11ActionPerformed

    private void txt_motivoVend_cad12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_motivoVend_cad12KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_motivoVend_cad12KeyPressed

    private void btn_addVend12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addVend12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addVend12ActionPerformed

    private void btn_altVend12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altVend12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_altVend12ActionPerformed

    private void btn_exclVend12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exclVend12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exclVend12ActionPerformed

    private void btn_limpVend12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpVend12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpVend12ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btn_addPre;
    private javax.swing.JButton btn_addProg;
    private javax.swing.JButton btn_addVend;
    private javax.swing.JButton btn_addVend10;
    private javax.swing.JButton btn_addVend11;
    private javax.swing.JButton btn_addVend12;
    private javax.swing.JButton btn_altCopChapa;
    private javax.swing.JButton btn_altPre;
    private javax.swing.JButton btn_altProg;
    private javax.swing.JButton btn_altVend;
    private javax.swing.JButton btn_altVend10;
    private javax.swing.JButton btn_altVend11;
    private javax.swing.JButton btn_altVend12;
    private javax.swing.JButton btn_exclCopChapa;
    private javax.swing.JButton btn_exclPre;
    private javax.swing.JButton btn_exclProg;
    private javax.swing.JButton btn_exclVend;
    private javax.swing.JButton btn_exclVend10;
    private javax.swing.JButton btn_exclVend11;
    private javax.swing.JButton btn_exclVend12;
    private javax.swing.JButton btn_limpCopChapa;
    private javax.swing.JButton btn_limpPre;
    private javax.swing.JButton btn_limpProg;
    private javax.swing.JButton btn_limpVend;
    private javax.swing.JButton btn_limpVend10;
    private javax.swing.JButton btn_limpVend11;
    private javax.swing.JButton btn_limpVend12;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JScrollPane jScrollpreimpressao;
    private javax.swing.JScrollPane jScrollprogramacao;
    private javax.swing.JScrollPane jScrollvendascliente;
    private javax.swing.JScrollPane jScrollvendascliente4;
    private javax.swing.JScrollPane jScrollvendascliente5;
    private javax.swing.JScrollPane jScrollvendascliente6;
    private javax.swing.JTable tb_copiaChapa;
    private javax.swing.JTable tb_preImpressao;
    private javax.swing.JTable tb_programacao;
    private javax.swing.JTable tb_vendascliente;
    private javax.swing.JTable tb_vendascliente4;
    private javax.swing.JTable tb_vendascliente5;
    private javax.swing.JTable tb_vendascliente6;
    private javax.swing.JTextField txt_codCopChapa_cad;
    private javax.swing.JTextField txt_codPre_cad;
    private javax.swing.JTextField txt_codProg_cad;
    private javax.swing.JTextField txt_codVend_cad;
    private javax.swing.JTextField txt_codVend_cad10;
    private javax.swing.JTextField txt_codVend_cad11;
    private javax.swing.JTextField txt_codVend_cad12;
    private javax.swing.JTextField txt_motivoCopChapa_cad;
    private javax.swing.JTextField txt_motivoPre_cad;
    private javax.swing.JTextField txt_motivoProg_cad;
    private javax.swing.JTextField txt_motivoVend_cad;
    private javax.swing.JTextField txt_motivoVend_cad10;
    private javax.swing.JTextField txt_motivoVend_cad11;
    private javax.swing.JTextField txt_motivoVend_cad12;
    // End of variables declaration//GEN-END:variables
}
