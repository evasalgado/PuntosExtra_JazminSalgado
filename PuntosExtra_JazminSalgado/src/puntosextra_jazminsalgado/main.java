/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package puntosextra_jazminsalgado;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author evaja
 */
public class main extends javax.swing.JFrame {

    /**
     * 
     * Creates new form main
     */
    public main() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pm_tree = new javax.swing.JPopupMenu();
        mi_listaequipos = new javax.swing.JMenuItem();
        mi_tablaposiciones = new javax.swing.JMenuItem();
        jd_equipos = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        l_equipos = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_partidos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jd_posiciones = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_pos = new javax.swing.JTable();
        tab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        bt_torneo = new javax.swing.JButton();
        bt_equipo = new javax.swing.JButton();
        bt_deporte = new javax.swing.JButton();
        bt_partido = new javax.swing.JButton();
        pn_equipo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_equiponame = new javax.swing.JTextField();
        bt_addqeuipi = new javax.swing.JButton();
        pn_partido = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_addpart = new javax.swing.JButton();
        pn_torneo = new javax.swing.JPanel();
        tf_nombretorn = new javax.swing.JTextField();
        cb_teamtorn = new javax.swing.JComboBox<>();
        cb_partidotorn = new javax.swing.JComboBox<>();
        bt_agregarsport = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pn_deporte = new javax.swing.JPanel();
        cb_tornoes = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_periodos = new javax.swing.JTree();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        mi_listaequipos.setText("Listar Equipos Participantes");
        mi_listaequipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_listaequiposActionPerformed(evt);
            }
        });
        pm_tree.add(mi_listaequipos);

        mi_tablaposiciones.setText("Mostrar Tabla de posiciones");
        mi_tablaposiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_tablaposicionesActionPerformed(evt);
            }
        });
        pm_tree.add(mi_tablaposiciones);

        jd_equipos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_equipos.setModel(new DefaultListModel<>()
        );
        jScrollPane2.setViewportView(l_equipos);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 150, 340));

        jButton1.setText("Mostrar Partidos");
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 162, 150, 50));

        tb_partidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipos", "Puntaje"
            }
        ));
        jScrollPane3.setViewportView(tb_partidos);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 6, 410, 360));

        jLabel4.setText("Lista de equipos");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        jd_equipos.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tb_pos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Puntaje", "Equipo"
            }
        ));
        jScrollPane4.setViewportView(tb_pos);

        javax.swing.GroupLayout jd_posicionesLayout = new javax.swing.GroupLayout(jd_posiciones.getContentPane());
        jd_posiciones.getContentPane().setLayout(jd_posicionesLayout);
        jd_posicionesLayout.setHorizontalGroup(
            jd_posicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_posicionesLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jd_posicionesLayout.setVerticalGroup(
            jd_posicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_posicionesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabStateChanged(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_torneo.setText("Torneo");
        bt_torneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_torneoMouseClicked(evt);
            }
        });
        jPanel2.add(bt_torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 205, 56));

        bt_equipo.setText("Equipo");
        bt_equipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_equipoMouseClicked(evt);
            }
        });
        jPanel2.add(bt_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 205, 56));

        bt_deporte.setText("Deporte");
        jPanel2.add(bt_deporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 205, 56));

        bt_partido.setText("Partido");
        jPanel2.add(bt_partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 205, 56));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre del Equipo:");

        tf_equiponame.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_equiponame.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bt_addqeuipi.setText("Agregar Equipo");
        bt_addqeuipi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addqeuipiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_equipoLayout = new javax.swing.GroupLayout(pn_equipo);
        pn_equipo.setLayout(pn_equipoLayout);
        pn_equipoLayout.setHorizontalGroup(
            pn_equipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_equipoLayout.createSequentialGroup()
                .addGroup(pn_equipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_equipoLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(pn_equipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_equiponame)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)))
                    .addGroup(pn_equipoLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(bt_addqeuipi, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        pn_equipoLayout.setVerticalGroup(
            pn_equipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_equipoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_equiponame, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(bt_addqeuipi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jPanel2.add(pn_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 6, -1, -1));

        jLabel5.setText("Equipo 1:");

        jLabel6.setText("Equipo 2:");

        bt_addpart.setText("Agregar Partido");
        bt_addpart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addpartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_partidoLayout = new javax.swing.GroupLayout(pn_partido);
        pn_partido.setLayout(pn_partidoLayout);
        pn_partidoLayout.setHorizontalGroup(
            pn_partidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_partidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_partidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(pn_partidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pn_partidoLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(bt_addpart, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_partidoLayout.setVerticalGroup(
            pn_partidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_partidoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pn_partidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_partidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(bt_addpart, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel2.add(pn_partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 14, 490, -1));

        pn_torneo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_torneo.add(tf_nombretorn, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 58, 218, 73));

        pn_torneo.add(cb_teamtorn, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 200, 218, 62));

        pn_torneo.add(cb_partidotorn, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 289, 218, 62));

        bt_agregarsport.setText("Agregar");
        bt_agregarsport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarsportMouseClicked(evt);
            }
        });
        pn_torneo.add(bt_agregarsport, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 413, -1, -1));

        jLabel7.setText("Name");
        pn_torneo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 36, 72, -1));

        jLabel8.setText("Equipo");
        pn_torneo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 72, -1));

        jLabel9.setText("Partido");
        pn_torneo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 72, -1));

        jPanel2.add(pn_torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 14, 490, -1));

        pn_deporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_deporte.add(cb_tornoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 35, 222, 68));
        pn_deporte.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 153, 222, 78));

        jButton3.setText("Agregar");
        pn_deporte.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 361, 138, 52));

        jPanel2.add(pn_deporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 14, 490, -1));

        tab.addTab("Agregar", jPanel2);

        jLabel1.setText("Arbol de periodos");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Periodos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("q1");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("q2");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("q3");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("q4");
        treeNode1.add(treeNode2);
        jt_periodos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_periodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_periodosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_periodos);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puntosextra_jazminsalgado/dancing hoar hoar.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(115, 115, 115))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        tab.addTab("Datos", jPanel1);

        getContentPane().add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_periodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_periodosMouseClicked
        if (!jt_periodos.isSelectionEmpty()) {
            if (evt.isMetaDown()) {
                pm_tree.show(jt_periodos.getComponentAt(evt.getX(), evt.getY()), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_periodosMouseClicked

    private void mi_listaequiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_listaequiposActionPerformed
        jd_equipos.setModal(true);
        jd_equipos.pack();
        jd_equipos.setLocationRelativeTo(this);
        jd_equipos.setVisible(true);
    }//GEN-LAST:event_mi_listaequiposActionPerformed

    private void mi_tablaposicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_tablaposicionesActionPerformed
        jd_posiciones.setModal(true);
        jd_posiciones.pack();
        jd_posiciones.setLocationRelativeTo(this);
        jd_posiciones.setVisible(true);
    }//GEN-LAST:event_mi_tablaposicionesActionPerformed

    private void bt_equipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_equipoMouseClicked
        pn_torneo.setVisible(false);
        pn_equipo.setVisible(true);
        pn_deporte.setVisible(false);
        pn_partido.setVisible(false);

    }//GEN-LAST:event_bt_equipoMouseClicked

    private void bt_agregarsportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarsportMouseClicked
        bt_deporte.setEnabled(true);
    }//GEN-LAST:event_bt_agregarsportMouseClicked

    private void bt_torneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_torneoMouseClicked
        pn_torneo.setVisible(true);
        pn_equipo.setVisible(false);
        pn_deporte.setVisible(false);
        pn_partido.setVisible(false);
    }//GEN-LAST:event_bt_torneoMouseClicked

    private void bt_addqeuipiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addqeuipiMouseClicked
        bt_partido.setEnabled(true);
    }//GEN-LAST:event_bt_addqeuipiMouseClicked

    private void bt_addpartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addpartMouseClicked
        bt_torneo.setEnabled(true);
    }//GEN-LAST:event_bt_addpartMouseClicked

    private void tabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabStateChanged
        
    }//GEN-LAST:event_tabStateChanged

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    ArrayList<equipo> e = new ArrayList<>();
    ArrayList<torneo> t = new ArrayList<>();
    ArrayList<deporte> d = new ArrayList<>();
    ArrayList<partido> p = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addpart;
    private javax.swing.JButton bt_addqeuipi;
    private javax.swing.JButton bt_agregarsport;
    private javax.swing.JButton bt_deporte;
    private javax.swing.JButton bt_equipo;
    private javax.swing.JButton bt_partido;
    private javax.swing.JButton bt_torneo;
    private javax.swing.JComboBox<String> cb_partidotorn;
    private javax.swing.JComboBox<String> cb_teamtorn;
    private javax.swing.JComboBox<String> cb_tornoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog jd_equipos;
    private javax.swing.JDialog jd_posiciones;
    private javax.swing.JTree jt_periodos;
    private javax.swing.JList<String> l_equipos;
    private javax.swing.JMenuItem mi_listaequipos;
    private javax.swing.JMenuItem mi_tablaposiciones;
    private javax.swing.JPopupMenu pm_tree;
    private javax.swing.JPanel pn_deporte;
    private javax.swing.JPanel pn_equipo;
    private javax.swing.JPanel pn_partido;
    private javax.swing.JPanel pn_torneo;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tb_partidos;
    private javax.swing.JTable tb_pos;
    private javax.swing.JTextField tf_equiponame;
    private javax.swing.JTextField tf_nombretorn;
    // End of variables declaration//GEN-END:variables
}
