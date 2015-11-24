
package pkg2015;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import projecte.Articles;
import projecte.Proveidors;

public class ArticlesGui extends javax.swing.JFrame {

    public ArticlesGui() {
        initComponents();
        initComponentsMeus();
    }
    
    String stringProveidors = "asd ,qwe ,pwpwpw";
    
    private void initComponentsMeus(){

        
        //Posem un listener a la taula de articles per modificar que actualitze els jtextfileds al canviar de fila seleccionada
        taulaModelArticle.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Si seleccionem un article posem les seues dades als jtextfields corresponents i els activem 
                int i=taulaModelArticle.getSelectedRow();
                if(i!=-1){
                    
                    //modNomCom.setText(vector.get(i).get2nomCom());
                    modCodi.setText(taulaModelArticle.getModel().getValueAt(i, 0).toString());
                    modDataAlta.setText(taulaModelArticle.getModel().getValueAt(i, 1).toString());
                    modProveidor.setText(taulaModelArticle.getModel().getValueAt(i, 2).toString());
                    modRef.setText(taulaModelArticle.getModel().getValueAt(i, 3).toString());
                    modNom.setText(taulaModelArticle.getModel().getValueAt(i, 4).toString());
                    modDescripcio.setText(taulaModelArticle.getModel().getValueAt(i, 5).toString());
                    modAcabat.setText(taulaModelArticle.getModel().getValueAt(i, 6).toString());
                    modAlt.setText((String)taulaModelArticle.getModel().getValueAt(i, 7).toString());
                    modAmple.setText((String)taulaModelArticle.getModel().getValueAt(i, 8).toString());
                    modFondo.setText(taulaModelArticle.getModel().getValueAt(i, 9).toString()); 
                    modPreuProv.setText(taulaModelArticle.getModel().getValueAt(i, 10).toString()); 
                    modPreuVenda.setText((String)taulaModelArticle.getModel().getValueAt(i, 11).toString()); 
                          
                    
                    modCodi.setEnabled(true);
                    modDataAlta.setEnabled(false);
                    modProveidor.setEnabled(true);
                    modRef.setEnabled(true);
                    modNom.setEnabled(true);
                    modDescripcio.setEnabled(true);
                    modAcabat.setEnabled(true);
                    modAlt.setEnabled(true);
                    modAmple.setEnabled(true);
                    modFondo.setEnabled(true);
                    modPreuProv.setEnabled(true);
                    modPreuVenda.setEnabled(true); 
                                        
                }
                
                //Si no hem seleccionat cap fila resetejem els jtextfields i els desactivem
                else{
                    modCodi.setText("");
                    modDataAlta.setText("");
                    modProveidor.setText("");
                    modRef.setText("");
                    modNom.setText("");
                    modDescripcio.setText("");
                    modAcabat.setText("");
                    modAlt.setText("");
                    modAmple.setText("");
                    modFondo.setText("");
                    modPreuProv.setText("");
                    modPreuVenda.setText(""); 
                    
                    modCodi.setEnabled(false);
                    modDataAlta.setEnabled(false);
                    modProveidor.setEnabled(false);
                    modRef.setEnabled(false);
                    modNom.setEnabled(false);
                    modDescripcio.setEnabled(false);
                    modAcabat.setEnabled(false);
                    modAlt.setEnabled(false);
                    modAmple.setEnabled(false);
                    modFondo.setEnabled(false);
                    modPreuProv.setEnabled(false);
                    modPreuVenda.setEnabled(false); 
                    
                }

                //Sempre que cliquem la taula desactivem el botó d'actualitzar fins que no es canvien els valors dels jtextfields
                btn_actualitzar.setEnabled(false);
            }
        });      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        button_add = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        button_modificar = new javax.swing.JButton();
        first_panel = new javax.swing.JLayeredPane();
        panel_modificar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taulaModelArticle = new javax.swing.JTable();
        btn_actualitzar = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        modDataAlta = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        modAlt = new javax.swing.JTextField();
        modProveidor = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        modNom = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        modAmple = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        modFondo = new javax.swing.JTextField();
        modRef = new javax.swing.JTextField();
        modCodi = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        modDescripcio = new javax.swing.JTextArea();
        jTextField49 = new javax.swing.JTextField();
        modPreuProv = new javax.swing.JTextField();
        modAcabat = new javax.swing.JTextField();
        modPreuVenda = new javax.swing.JTextField();
        panel_insert = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jTextField32 = new javax.swing.JTextField();
        addFondo = new javax.swing.JTextField();
        addAmple = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        addAlt = new javax.swing.JTextField();
        addAcabat = new javax.swing.JTextField();
        addRef = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        addNom = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        addPreuVenda = new javax.swing.JTextField();
        addPreuProv = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        addDescripcio = new javax.swing.JTextArea();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        desplegableProveidors = new javax.swing.JComboBox();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manteniment d'alumnes");
        setMinimumSize(new java.awt.Dimension(1200, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMaximumSize(new java.awt.Dimension(96, 229));
        jPanel2.setMinimumSize(new java.awt.Dimension(96, 229));
        jPanel2.setPreferredSize(new java.awt.Dimension(96, 229));

        button_add.setBackground(new java.awt.Color(255, 153, 255));
        button_add.setText("Afegir");
        button_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addMouseClicked(evt);
            }
        });
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(255, 102, 102));
        btn_exit.setText("Sortir");
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });

        button_modificar.setBackground(new java.awt.Color(255, 153, 255));
        button_modificar.setText("Modificar");
        button_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_modificarMouseClicked(evt);
            }
        });
        button_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_modificar)
                .addGap(120, 120, 120)
                .addComponent(btn_exit))
        );

        first_panel.setMaximumSize(new java.awt.Dimension(1000, 800));
        first_panel.setMinimumSize(new java.awt.Dimension(1000, 800));
        first_panel.setPreferredSize(new java.awt.Dimension(1000, 524));

        panel_modificar.setMaximumSize(new java.awt.Dimension(1000, 800));
        panel_modificar.setMinimumSize(new java.awt.Dimension(1000, 800));
        panel_modificar.setPreferredSize(new java.awt.Dimension(1000, 800));
        panel_modificar.setVisible(false);

        taulaModelArticle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codi", "Data d'alta", "Proveidor", "Ref", "Nom", "Descripcio", "Acabat", "Alt", "Ample", "Fondo", "Preu Proveidor", "Preu Venda", "Index"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        taulaModelArticle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(taulaModelArticle);
        if (taulaModelArticle.getColumnModel().getColumnCount() > 0) {
            taulaModelArticle.getColumnModel().getColumn(1).setPreferredWidth(45);
            taulaModelArticle.getColumnModel().getColumn(3).setPreferredWidth(8);
            taulaModelArticle.getColumnModel().getColumn(4).setPreferredWidth(25);
            taulaModelArticle.getColumnModel().getColumn(5).setPreferredWidth(25);
            taulaModelArticle.getColumnModel().getColumn(6).setPreferredWidth(8);
            taulaModelArticle.getColumnModel().getColumn(7).setPreferredWidth(10);
            taulaModelArticle.getColumnModel().getColumn(8).setPreferredWidth(8);
            taulaModelArticle.getColumnModel().getColumn(9).setPreferredWidth(10);
            taulaModelArticle.getColumnModel().getColumn(10).setPreferredWidth(8);
            taulaModelArticle.getColumnModel().getColumn(11).setPreferredWidth(8);
            taulaModelArticle.getColumnModel().getColumn(12).setPreferredWidth(8);
        }

        btn_actualitzar.setText("Modificar");
        btn_actualitzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualitzarActionPerformed(evt);
            }
        });

        jTextField15.setBackground(new java.awt.Color(204, 204, 255));
        jTextField15.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("Modificar articles");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        modDataAlta.setText("DataAlta");

        jTextField44.setEditable(false);
        jTextField44.setBackground(new java.awt.Color(255, 255, 204));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setText("Descricipcio");
        jTextField44.setFocusable(false);

        modAlt.setBackground(new java.awt.Color(204, 255, 255));
        modAlt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modAltKeyTyped(evt);
            }
        });

        modProveidor.setBackground(new java.awt.Color(204, 255, 255));
        modProveidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modProveidorKeyTyped(evt);
            }
        });

        jTextField45.setEditable(false);
        jTextField45.setBackground(new java.awt.Color(255, 255, 204));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setText("Ample (mm)");
        jTextField45.setFocusable(false);
        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(255, 255, 204));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("Acabat");
        jTextField21.setFocusable(false);

        jTextField46.setEditable(false);
        jTextField46.setBackground(new java.awt.Color(255, 255, 204));
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setText("Alt (mm)");
        jTextField46.setFocusable(false);

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 204));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Proveidor");
        jTextField10.setFocusable(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField22.setEditable(false);
        jTextField22.setBackground(new java.awt.Color(255, 255, 204));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("Nom");
        jTextField22.setFocusable(false);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 204));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Codi");
        jTextField6.setFocusable(false);

        modNom.setBackground(new java.awt.Color(204, 255, 255));
        modNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modNomKeyTyped(evt);
            }
        });

        jTextField47.setEditable(false);
        jTextField47.setBackground(new java.awt.Color(255, 255, 204));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setText("Preu Venda (€)");
        jTextField47.setFocusable(false);
        jTextField47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField47ActionPerformed(evt);
            }
        });

        modAmple.setBackground(new java.awt.Color(204, 255, 255));
        modAmple.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modAmpleKeyTyped(evt);
            }
        });

        jTextField23.setEditable(false);
        jTextField23.setBackground(new java.awt.Color(255, 255, 204));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setText("Referencia");
        jTextField23.setFocusable(false);
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jTextField48.setEditable(false);
        jTextField48.setBackground(new java.awt.Color(255, 255, 204));
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setText("Fondo (mm)");
        jTextField48.setFocusable(false);

        modFondo.setBackground(new java.awt.Color(204, 255, 255));
        modFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modFondoKeyTyped(evt);
            }
        });

        modRef.setBackground(new java.awt.Color(204, 255, 255));
        modRef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modRefKeyTyped(evt);
            }
        });

        modCodi.setBackground(new java.awt.Color(204, 255, 255));
        modCodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modCodiActionPerformed(evt);
            }
        });
        modCodi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modCodiKeyTyped(evt);
            }
        });

        modDescripcio.setColumns(20);
        modDescripcio.setRows(5);
        jScrollPane8.setViewportView(modDescripcio);

        jTextField49.setEditable(false);
        jTextField49.setBackground(new java.awt.Color(255, 255, 204));
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setText("Preu Proveidor (€)");
        jTextField49.setFocusable(false);

        modPreuProv.setBackground(new java.awt.Color(204, 255, 255));
        modPreuProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPreuProvActionPerformed(evt);
            }
        });
        modPreuProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modPreuProvKeyTyped(evt);
            }
        });

        modAcabat.setBackground(new java.awt.Color(204, 255, 255));
        modAcabat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modAcabatActionPerformed(evt);
            }
        });
        modAcabat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modAcabatKeyTyped(evt);
            }
        });

        modPreuVenda.setBackground(new java.awt.Color(204, 255, 255));
        modPreuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPreuVendaActionPerformed(evt);
            }
        });
        modPreuVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modPreuVendaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_modificarLayout = new javax.swing.GroupLayout(panel_modificar);
        panel_modificar.setLayout(panel_modificarLayout);
        panel_modificarLayout.setHorizontalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modDataAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarLayout.createSequentialGroup()
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_modificarLayout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel_modificarLayout.createSequentialGroup()
                                        .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modPreuProv, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_modificarLayout.createSequentialGroup()
                                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modNom, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(modAcabat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modAmple, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_modificarLayout.createSequentialGroup()
                                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_modificarLayout.createSequentialGroup()
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modProveidor, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modRef, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modPreuVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_actualitzar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_modificarLayout.setVerticalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarLayout.createSequentialGroup()
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_actualitzar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modCodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modProveidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modPreuProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modPreuVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modAmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modAcabat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modDataAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
        );

        panel_insert.setMaximumSize(new java.awt.Dimension(1000, 800));
        panel_insert.setMinimumSize(new java.awt.Dimension(1000, 800));
        panel_insert.setPreferredSize(new java.awt.Dimension(1000, 800));
        panel_insert.setVisible(false);

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 204, 255));
        jTextField13.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Afegir nous articles");
        jTextField13.setFocusable(false);
        jTextField13.setRequestFocusEnabled(false);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        btn_save.setText("Guardar");
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveMouseClicked(evt);
            }
        });

        jTextField32.setEditable(false);
        jTextField32.setBackground(new java.awt.Color(255, 255, 204));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setText("Preu Proveidor (€)");
        jTextField32.setFocusable(false);

        addFondo.setBackground(new java.awt.Color(204, 255, 255));
        addFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addFondoKeyTyped(evt);
            }
        });

        addAmple.setBackground(new java.awt.Color(204, 255, 255));
        addAmple.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addAmpleKeyTyped(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 204));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Proveidor");
        jTextField9.setFocusable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 204));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Acabat");
        jTextField11.setFocusable(false);

        addAlt.setBackground(new java.awt.Color(204, 255, 255));
        addAlt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addAltKeyTyped(evt);
            }
        });

        addAcabat.setBackground(new java.awt.Color(204, 255, 255));
        addAcabat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAcabatActionPerformed(evt);
            }
        });
        addAcabat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addAcabatKeyTyped(evt);
            }
        });

        addRef.setBackground(new java.awt.Color(204, 255, 255));
        addRef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addRefKeyTyped(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 204));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("Referencia");
        jTextField12.setFocusable(false);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        addNom.setBackground(new java.awt.Color(204, 255, 255));
        addNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addNomKeyTyped(evt);
            }
        });

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(255, 255, 204));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("Nom");
        jTextField18.setFocusable(false);

        jTextField34.setEditable(false);
        jTextField34.setBackground(new java.awt.Color(255, 255, 204));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setText("Alt (mm)");
        jTextField34.setFocusable(false);

        jTextField35.setEditable(false);
        jTextField35.setBackground(new java.awt.Color(255, 255, 204));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setText("Ample (mm)");
        jTextField35.setFocusable(false);
        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });

        addPreuVenda.setBackground(new java.awt.Color(204, 255, 255));
        addPreuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPreuVendaActionPerformed(evt);
            }
        });
        addPreuVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addPreuVendaKeyTyped(evt);
            }
        });

        addPreuProv.setBackground(new java.awt.Color(204, 255, 255));
        addPreuProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPreuProvActionPerformed(evt);
            }
        });
        addPreuProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addPreuProvKeyTyped(evt);
            }
        });

        jTextField36.setEditable(false);
        jTextField36.setBackground(new java.awt.Color(255, 255, 204));
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setText("Descricipcio");
        jTextField36.setFocusable(false);

        addDescripcio.setColumns(20);
        addDescripcio.setRows(5);
        jScrollPane6.setViewportView(addDescripcio);

        jTextField37.setEditable(false);
        jTextField37.setBackground(new java.awt.Color(255, 255, 204));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setText("Fondo (mm)");
        jTextField37.setFocusable(false);

        jTextField38.setEditable(false);
        jTextField38.setBackground(new java.awt.Color(255, 255, 204));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setText("Preu Venda (€)");
        jTextField38.setFocusable(false);
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });

        desplegableProveidors.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1" }));
        desplegableProveidors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegableProveidorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_insertLayout = new javax.swing.GroupLayout(panel_insert);
        panel_insert.setLayout(panel_insertLayout);
        panel_insertLayout.setHorizontalGroup(
            panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_insertLayout.createSequentialGroup()
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6))
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addNom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addAcabat, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(desplegableProveidors, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField34)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addRef, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(addAlt)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField35)
                                    .addComponent(jTextField32, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addAmple)
                                    .addComponent(addPreuProv, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_insertLayout.createSequentialGroup()
                                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addPreuVenda)
                                    .addComponent(addFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel_insertLayout.setVerticalGroup(
            panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_insertLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save))
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPreuProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPreuVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desplegableProveidors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAcabat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(644, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout first_panelLayout = new javax.swing.GroupLayout(first_panel);
        first_panel.setLayout(first_panelLayout);
        first_panelLayout.setHorizontalGroup(
            first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
            .addGroup(first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, first_panelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(first_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(765, Short.MAX_VALUE)))
        );
        first_panelLayout.setVerticalGroup(
            first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(first_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, first_panelLayout.createSequentialGroup()
                    .addGap(0, 806, Short.MAX_VALUE)
                    .addComponent(panel_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        first_panel.setLayer(panel_modificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        first_panel.setLayer(panel_insert, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(first_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(first_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, 800, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addMouseClicked
        //Ocultem els altres jpanels

        panel_modificar.setVisible(false);

        //Resetejem els camps de text.
                    modCodi.setText("");
                    modDataAlta.setText("");
                    modProveidor.setText("");
                    modRef.setText("");
                    modNom.setText("");
                    modDescripcio.setText("");
                    modAcabat.setText("");
                    modAlt.setText("");
                    modAmple.setText("");
                    modFondo.setText("");
                    modPreuProv.setText("");
                    modPreuVenda.setText("");
                    
        //Fem visible el jpanel d'afegir
        panel_insert.setVisible(true);

    }//GEN-LAST:event_button_addMouseClicked

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked


        //Creem l'objecte article recuperant les dades introduïdes per l'usuari
        //Miro la data actual i la guardo a date.
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        
        String dataAlta;
        dataAlta = date.toString().trim();
        
        int Alt;
        Alt=Integer.parseInt(addAmple.getText());
        
        int Ample;
        Ample=Integer.parseInt(addFondo.getText());
        
        int Fondo;
        Fondo=Integer.parseInt(addPreuProv.getText());
        
        float PreuProv;
        PreuProv=Integer.parseInt(addPreuVenda.getText());
        
        float PreuVenda;
        PreuVenda=Integer.parseInt(addPreuVenda.getText());
               
    }//GEN-LAST:event_btn_saveMouseClicked

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        //En apretar el botó Sortir tanquem el programa en el mètode dispose() que fa que s'execute el mètode formWindowClosed()
        this.dispose();
    }//GEN-LAST:event_btn_exitMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Mètode que s'executa quan obrim l'aplicació

        //Si el fixer existix creem un vector i l'omplim en les dades del fitxer i en cas contrari el dixem sense dades     
        if (f.exists()) {
            ObjectInputStream entrada = null;

            //LLegim el fitxer i omplim el vector en els articles continguts dins ell
            try {
                //Obrim el fitxer per lectura
                entrada = new ObjectInputStream(new FileInputStream(f));

                //Index del vector per guardar els articles trobats
                int i = 0;
                while (true) {
                    try {
                        vector.add((Articles) entrada.readObject());
                        System.out.println(vector);
                    } catch (EOFException e) {
                        break;
                    } catch (IOException|ClassNotFoundException ex) {
                        Logger.getLogger(ArticlesGui.class.getName()).log(Level.SEVERE, null, ex);
                    }
                       
                }

            } catch (IOException e) {
                //Si hi ha un error de lectura del fitxer mostrem avís i tanquem l'aplicació
                JOptionPane.showMessageDialog(this, "Error en obrir el fitxer :" + e.getMessage() + "\nL'aplicació es tancarà!!");
                System.exit(-1);
            } finally {
                if (entrada != null) {
                    try {
                        entrada.close();
                    } catch (IOException e) {
                        //Si hi ha un error de tancament del fitxer mostrem avís i tanquem l'aplicació
                        JOptionPane.showMessageDialog(this, "Error en tancar el fitxer :" + e.getMessage() + "\nL'aplicació es tancarà!!");
                        System.exit(-1);
                    }
                }
            }
        } else {
            System.out.println("Fitxer nou");
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Quan tanquem l'aplicació guardem els articles vàlids al fixer

        //Declarem el article
        ObjectOutputStream sortida = null;
        //Capturem l'excepció i escrivim
        try {
            //Pes escriure des de 0
            sortida = new ObjectOutputStream(new FileOutputStream(f));
            int i;
            for (i = 0; i < vector.size(); i++) //Escrivim els objectes al fitxer
            {
                sortida.writeObject(vector.get(i));
            }
        } catch (IOException e) {
            //Mostrem avís
            JOptionPane.showMessageDialog(this, "Error a l'escriure al fitxer:" + e.getMessage());
        } finally {
            if (sortida != null) {
                try {
                    sortida.close();
                } catch (IOException ex) {
                    //Mostremos avís
                    JOptionPane.showMessageDialog(this, "Error al tancar el fitxer:" + ex.getMessage());
                }
            }
        }

    }//GEN-LAST:event_formWindowClosed

     
    private void button_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_modificarMouseClicked
        //Ocultem els altres jpanels
        panel_insert.setVisible(false);
        panel_modificar.setVisible(true);
        
//Fem visible el jpanel de modificar i inicialment desactivem el botó d'actualitzar canvis i els quadres de text

        btn_actualitzar.setEnabled(false);
        modCodi.setEnabled(false);
        modDataAlta.setEnabled(false);
        modProveidor.setEnabled(false);
        modRef.setEnabled(false);
        modNom.setEnabled(false);
        modDescripcio.setEnabled(false);
        modAcabat.setEnabled(false);
        modAlt.setEnabled(false);
        modAmple.setEnabled(false);
        modFondo.setEnabled(false);
        modPreuProv.setEnabled(false);
        modPreuVenda.setEnabled(false);
                
        //Omplim la taula en els articles del vector

        //LLegim el vector i anem omplint la taula
        //Index del vector
        int i;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        
        String dataAlta;
        dataAlta = date.toString().trim();
        
    }//GEN-LAST:event_button_modificarMouseClicked

    private void button_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modificarActionPerformed
        ModelTaula<Articles> mt = new ModelTaula(vector);
        
        //Li assigno el model a la taula
        taulaModelArticle.setModel(mt);
    }//GEN-LAST:event_button_modificarActionPerformed

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void addFondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addFondoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addFondoKeyTyped

    private void addAmpleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addAmpleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addAmpleKeyTyped

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void addAltKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addAltKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addAltKeyTyped

    private void addAcabatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAcabatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addAcabatActionPerformed

    private void addAcabatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addAcabatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addAcabatKeyTyped

    private void addRefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addRefKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addRefKeyTyped

    private void addNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addNomKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addNomKeyTyped

    private void addPreuVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addPreuVendaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addPreuVendaKeyTyped

    private void addPreuProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPreuProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPreuProvActionPerformed

    private void addPreuProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addPreuProvKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addPreuProvKeyTyped

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void btn_actualitzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualitzarActionPerformed
        //Ocultem els altres jpanels
        panel_insert.setVisible(false);

        int index=0;

        //Resetejem els camps de text.
        modCodi.setText("");
        modDataAlta.setText("");
        modProveidor.setText("");
        modRef.setText("");
        modNom.setText("");
        modDescripcio.setText("");
        modAcabat.setText("");
        modAlt.setText("");
        modAmple.setText("");
        modFondo.setText("");
        modPreuProv.setText("");
        modPreuVenda.setText("");

        vector.get(index).set01dataAlta(modDataAlta.getText().trim());
        //vector.get(index).set02proveidor(modProveidor.getText().trim()); /*objecte*/
        vector.get(index).set03ref(modRef.getText().trim());
        vector.get(index).set04nom(modNom.getText().trim());
        vector.get(index).set05descripcio(modDescripcio.getText().trim());
        vector.get(index).set06acabat(modAcabat.getText().trim());
        vector.get(index).set07alt(Integer.parseInt(modAlt.getText().trim()));
        vector.get(index).set08ample(Integer.parseInt(modAmple.getText().trim()));
        vector.get(index).set09fondo(Integer.parseInt(modFondo.getText().trim()));
        vector.get(index).set10preuProv(Integer.parseInt(modPreuProv.getText().trim()));
        vector.get(index).set11preuVenda(Integer.parseInt(modPreuVenda.getText().trim()));

        //I ara actualitzo la taula

        taulaModelArticle.setValueAt(vector.get(index).get01dataAlta(),taulaModelArticle.getSelectedRow(), 0);
        taulaModelArticle.setValueAt(vector.get(index).get02proveidor(),taulaModelArticle.getSelectedRow(), 1); /*objecte*/
        taulaModelArticle.setValueAt(vector.get(index).get03ref(),taulaModelArticle.getSelectedRow(), 2);
        taulaModelArticle.setValueAt(vector.get(index).get04nom(),taulaModelArticle.getSelectedRow(), 3);
        taulaModelArticle.setValueAt(vector.get(index).get05descripcio(),taulaModelArticle.getSelectedRow(), 4);
        taulaModelArticle.setValueAt(vector.get(index).get06acabat(),taulaModelArticle.getSelectedRow(), 5);
        taulaModelArticle.setValueAt(vector.get(index).get07alt(),taulaModelArticle.getSelectedRow(), 6);
        taulaModelArticle.setValueAt(vector.get(index).get08ample(),taulaModelArticle.getSelectedRow(), 7);
        taulaModelArticle.setValueAt(vector.get(index).get09fondo(),taulaModelArticle.getSelectedRow(), 8);
        taulaModelArticle.setValueAt(vector.get(index).get10preuProv(),taulaModelArticle.getSelectedRow(), 9);
        taulaModelArticle.setValueAt(vector.get(index).get11preuVenda(),taulaModelArticle.getSelectedRow(), 10);

        // Finalment desactivo jtextfields i botó d'actualitzar
        modCodi.setEnabled(false);
        modDataAlta.setEnabled(false);
        modProveidor.setEnabled(false);
        modRef.setEnabled(false);
        modNom.setEnabled(false);
        modDescripcio.setEnabled(false);
        modAcabat.setEnabled(false);
        modAlt.setEnabled(false);
        modAmple.setEnabled(false);
        modFondo.setEnabled(false);
        modPreuProv.setEnabled(false);
        modPreuVenda.setEnabled(false);

    }//GEN-LAST:event_btn_actualitzarActionPerformed

    private void addPreuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPreuVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPreuVendaActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void modAltKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modAltKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modAltKeyTyped

    private void modProveidorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modProveidorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modProveidorKeyTyped

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void modNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modNomKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modNomKeyTyped

    private void jTextField47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47ActionPerformed

    private void modAmpleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modAmpleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modAmpleKeyTyped

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void modFondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modFondoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modFondoKeyTyped

    private void modRefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modRefKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modRefKeyTyped

    private void modCodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modCodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modCodiActionPerformed

    private void modCodiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modCodiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modCodiKeyTyped

    private void modPreuProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPreuProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modPreuProvActionPerformed

    private void modPreuProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modPreuProvKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modPreuProvKeyTyped

    private void modAcabatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modAcabatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modAcabatActionPerformed

    private void modAcabatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modAcabatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modAcabatKeyTyped

    private void modPreuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPreuVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modPreuVendaActionPerformed

    private void modPreuVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modPreuVendaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modPreuVendaKeyTyped

    private void desplegableProveidorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegableProveidorsActionPerformed

    }//GEN-LAST:event_desplegableProveidorsActionPerformed

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
            java.util.logging.Logger.getLogger(ArticlesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArticlesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArticlesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArticlesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArticlesGui().setVisible(true);
            }
        });
    }

    //Variables nostres
    //Vector per guardar els articles durant l'execució
    private static ArrayList<Articles> vector=new ArrayList<>();

    //Nom del fitxer de articles
    private static final File f = new File("articles.dat");
     
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addAcabat;
    private javax.swing.JTextField addAlt;
    private javax.swing.JTextField addAmple;
    private javax.swing.JTextArea addDescripcio;
    private javax.swing.JTextField addFondo;
    private javax.swing.JTextField addNom;
    private javax.swing.JTextField addPreuProv;
    private javax.swing.JTextField addPreuVenda;
    private javax.swing.JTextField addRef;
    private javax.swing.JButton btn_actualitzar;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_modificar;
    private javax.swing.JComboBox desplegableProveidors;
    private javax.swing.JLayeredPane first_panel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField modAcabat;
    private javax.swing.JTextField modAlt;
    private javax.swing.JTextField modAmple;
    private javax.swing.JTextField modCodi;
    private javax.swing.JTextField modDataAlta;
    private javax.swing.JTextArea modDescripcio;
    private javax.swing.JTextField modFondo;
    private javax.swing.JTextField modNom;
    private javax.swing.JTextField modPreuProv;
    private javax.swing.JTextField modPreuVenda;
    private javax.swing.JTextField modProveidor;
    private javax.swing.JTextField modRef;
    private javax.swing.JPanel panel_insert;
    private javax.swing.JPanel panel_modificar;
    private javax.swing.JTable taulaModelArticle;
    // End of variables declaration//GEN-END:variables
}
