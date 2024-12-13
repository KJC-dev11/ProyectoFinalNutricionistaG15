/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.MenuDiario;
import Persistencia.MenuDiarioData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FrancoPC
 */
public class VistaMenuDiario extends javax.swing.JPanel {


    private MenuDiarioData menuDiarioData;
    private DefaultTableModel modelo;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public VistaMenuDiario() {
        initComponents();
        menuDiarioData = new MenuDiarioData();
        modelo = (DefaultTableModel) jtMenuDiario.getModel();
        cargarTabla();
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfCodMenu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMenuDiario = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbDesayuno = new javax.swing.JComboBox<>();
        jcbAlmuerzo = new javax.swing.JComboBox<>();
        jcbMerienda = new javax.swing.JComboBox<>();
        jcbCena = new javax.swing.JComboBox<>();
        jtfNombreMenu = new javax.swing.JTextField();
        jbNuevo3 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(750, 430));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(750, 430));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\MenuDiario2.png")); // NOI18N
        jLabel1.setText("MENU DIARIO");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código Del Menu:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");

        jtfCodMenu.setBackground(new java.awt.Color(255, 255, 255));
        jtfCodMenu.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfCodMenu.setForeground(new java.awt.Color(0, 0, 0));
        jtfCodMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodMenuActionPerformed(evt);
            }
        });

        jtMenuDiario.setBackground(new java.awt.Color(255, 255, 255));
        jtMenuDiario.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jtMenuDiario.setForeground(new java.awt.Color(0, 0, 0));
        jtMenuDiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod.", "Nombre", "Desayuno", "Almuerzo", "Merienda", "Cena"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMenuDiario.getTableHeader().setReorderingAllowed(false);
        jtMenuDiario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMenuDiarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMenuDiario);
        if (jtMenuDiario.getColumnModel().getColumnCount() > 0) {
            jtMenuDiario.getColumnModel().getColumn(0).setMinWidth(30);
            jtMenuDiario.getColumnModel().getColumn(0).setPreferredWidth(5);
            jtMenuDiario.getColumnModel().getColumn(0).setMaxWidth(30);
            jtMenuDiario.getColumnModel().getColumn(1).setMinWidth(110);
            jtMenuDiario.getColumnModel().getColumn(1).setPreferredWidth(20);
            jtMenuDiario.getColumnModel().getColumn(1).setMaxWidth(110);
            jtMenuDiario.getColumnModel().getColumn(2).setMinWidth(130);
            jtMenuDiario.getColumnModel().getColumn(2).setPreferredWidth(20);
            jtMenuDiario.getColumnModel().getColumn(2).setMaxWidth(130);
            jtMenuDiario.getColumnModel().getColumn(3).setMinWidth(120);
            jtMenuDiario.getColumnModel().getColumn(3).setPreferredWidth(20);
            jtMenuDiario.getColumnModel().getColumn(3).setMaxWidth(120);
            jtMenuDiario.getColumnModel().getColumn(4).setMinWidth(130);
            jtMenuDiario.getColumnModel().getColumn(4).setPreferredWidth(25);
            jtMenuDiario.getColumnModel().getColumn(4).setMaxWidth(130);
            jtMenuDiario.getColumnModel().getColumn(5).setMinWidth(130);
            jtMenuDiario.getColumnModel().getColumn(5).setPreferredWidth(25);
            jtMenuDiario.getColumnModel().getColumn(5).setMaxWidth(130);
        }

        jbBuscar.setBackground(new java.awt.Color(0, 153, 0));
        jbBuscar.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\lupa.png")); // NOI18N
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(0, 153, 0));
        jbGuardar.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\guardar.png")); // NOI18N
        jbGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(0, 153, 0));
        jbModificar.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\editar.png")); // NOI18N
        jbModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBorrar.setBackground(new java.awt.Color(0, 153, 0));
        jbBorrar.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\tacho.png")); // NOI18N
        jbBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Desayuno:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Almuerzo:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Merienda:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cena:");

        jcbDesayuno.setBackground(new java.awt.Color(255, 255, 255));
        jcbDesayuno.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jcbDesayuno.setForeground(new java.awt.Color(0, 0, 0));
        jcbDesayuno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jcbAlmuerzo.setBackground(new java.awt.Color(255, 255, 255));
        jcbAlmuerzo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jcbAlmuerzo.setForeground(new java.awt.Color(0, 0, 0));
        jcbAlmuerzo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jcbMerienda.setBackground(new java.awt.Color(255, 255, 255));
        jcbMerienda.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jcbMerienda.setForeground(new java.awt.Color(0, 0, 0));
        jcbMerienda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jcbCena.setBackground(new java.awt.Color(255, 255, 255));
        jcbCena.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jcbCena.setForeground(new java.awt.Color(0, 0, 0));
        jcbCena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtfNombreMenu.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombreMenu.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfNombreMenu.setForeground(new java.awt.Color(0, 0, 0));

        jbNuevo3.setBackground(new java.awt.Color(51, 153, 0));
        jbNuevo3.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\nuevo.png")); // NOI18N
        jbNuevo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNuevo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfNombreMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jtfCodMenu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbNuevo3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(319, 319, 319)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel9))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcbCena, 0, 150, Short.MAX_VALUE)
                                            .addComponent(jcbMerienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcbAlmuerzo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcbDesayuno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(222, 222, 222)))
                                .addComponent(jbBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbBorrar, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfCodMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfNombreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcbDesayuno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jcbAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jcbMerienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jcbCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbNuevo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodMenuActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       guardar();
       cargarTabla();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       buscar();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
       modificar();
       cargarTabla();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        eliminar();
       cargarTabla();
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbNuevo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevo3ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbNuevo3ActionPerformed

    private void jtMenuDiarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMenuDiarioMouseClicked
        if (evt.getClickCount()==2) {
            int renglon = jtMenuDiario.getSelectedRow();
            
            jtfCodMenu.setText(jtMenuDiario.getValueAt(renglon, 0).toString());
            jtfNombreMenu.setText(jtMenuDiario.getValueAt(renglon, 1).toString());
            jcbDesayuno.setSelectedItem(jtMenuDiario.getValueAt(renglon, 2).toString());
            jcbAlmuerzo.setSelectedItem(jtMenuDiario.getValueAt(renglon, 3).toString());
            jcbMerienda.setSelectedItem(jtMenuDiario.getValueAt(renglon, 4).toString());
            jcbCena.setSelectedItem(jtMenuDiario.getValueAt(renglon, 5).toString());}
            
    }//GEN-LAST:event_jtMenuDiarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo3;
    private javax.swing.JComboBox<String> jcbAlmuerzo;
    private javax.swing.JComboBox<String> jcbCena;
    private javax.swing.JComboBox<String> jcbDesayuno;
    private javax.swing.JComboBox<String> jcbMerienda;
    private javax.swing.JTable jtMenuDiario;
    private javax.swing.JTextField jtfCodMenu;
    private javax.swing.JTextField jtfNombreMenu;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
            
        modelo.setRowCount(0);
        List<MenuDiario> menus = menuDiarioData.obtenerTodosLosMenusDiarios();
        
        for (MenuDiario menu : menus) {
            modelo.addRow(new Object[]{
                menu.getCodMenu(),
                menu.getNombreMenu(),
                menu.getDesayuno(),
                menu.getAlmuerzo(),
                menu.getMerienda(),
                menu.getCena(),
            });
        }
    }
 
    private void limpiarCampos() {
        jtfCodMenu.setText("");
        jtfNombreMenu.setText("");
        jcbDesayuno.setSelectedIndex(-1);
        jcbAlmuerzo.setSelectedIndex(-1);
        jcbMerienda.setSelectedIndex(-1);
        jcbCena.setSelectedIndex(-1);
    }
    
    private void guardar(){
        try {
            MenuDiario menu = new MenuDiario();
            menu.setCodMenu(Integer.parseInt(jtfCodMenu.getText()));
            menu.setNombreMenu(jtfNombreMenu.getText());
            menu.setDesayuno(jcbDesayuno.getSelectedItem().toString());
            menu.setAlmuerzo(jcbAlmuerzo.getSelectedItem().toString());
            menu.setMerienda(jcbMerienda.getSelectedItem().toString());
            menu.setCena(jcbCena.getSelectedItem().toString());
            
            boolean exito = menuDiarioData.agregarMenuDiario(menu);
            
            if (exito) {
                JOptionPane.showMessageDialog(this, "Menú diario guardado correctamente.");
                limpiarCampos();
                
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el menú diario.");
            }
                
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos en todos los campos.");
        }
    } 
    
    private void modificar(){
        try {
            MenuDiario menu = new MenuDiario();
            menu.setCodMenu(Integer.parseInt(jtfCodMenu.getText()));
            menu.setNombreMenu(jtfNombreMenu.getText());
            menu.setDesayuno(jcbDesayuno.getSelectedItem().toString());
            menu.setAlmuerzo(jcbAlmuerzo.getSelectedItem().toString());
            menu.setMerienda(jcbMerienda.getSelectedItem().toString());
            menu.setCena(jcbCena.getSelectedItem().toString());

            boolean exito = menuDiarioData.actualizarMenuDiario(menu);
            
            if (exito) {
                JOptionPane.showMessageDialog(this, "Menú diario modificado correctamente.");
                cargarDatos();
                limpiarCampos();
                
            } else {
                   JOptionPane.showMessageDialog(this, "Error al modificar el menú diario.");
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos en todos los campos.");
        }
    }                                         

    private void eliminar(){
        if (jtfCodMenu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un código de menú válido para eliminar.");
            return;
        }

        try {
            int codMenu = Integer.parseInt(jtfCodMenu.getText());
            boolean exito = menuDiarioData.eliminarMenuDiario(codMenu);
            
            if (exito) {
                JOptionPane.showMessageDialog(this, "Menú diario eliminado correctamente.");
                limpiarCampos();
                
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar el menú diario.");
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.");
        }
    }
    
    private void buscar(){

        try {
            
            String nombMenu = jtfNombreMenu.getText();
            
            List<MenuDiario> menus = menuDiarioData.buscarMenuDiarioPorNombre(nombMenu);
            DefaultTableModel model = (DefaultTableModel) jtMenuDiario.getModel();
            model.setRowCount(0);

            if (!(menus.isEmpty())) {
                for (MenuDiario menu : menus) {
            
                    

               model.addRow(new Object[]{
                menu.getCodMenu(),
                menu.getNombreMenu(),
                menu.getDesayuno(),
                menu.getAlmuerzo(),
                menu.getMerienda(),
                menu.getCena(),
                    });}
                
            } else {
                JOptionPane.showMessageDialog(this, "Menu no encontrado.");
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de renglón válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargarDatos() {
        
        List<String> desayunos = menuDiarioData.obtenerDesayunos();
        List<String> almuerzos = menuDiarioData.obtenerAlmuerzos();
        List<String> meriendas = menuDiarioData.obtenerMeriendas();
        List<String> cenas = menuDiarioData.obtenerCenas();
                
        
        jcbMerienda.removeAllItems();
        jcbAlmuerzo.removeAllItems();
        jcbMerienda.removeAllItems();
        jcbCena.removeAllItems();
        
        for (String desayuno : desayunos) {
            jcbDesayuno.addItem(desayuno);
        }
        
        for (String almuerzo : almuerzos) {
            jcbAlmuerzo.addItem(almuerzo);
            }
        
        for (String merienda : meriendas) {
                jcbMerienda.addItem(merienda);
            }
        
        for (String cena : cenas) {
                jcbCena.addItem(cena);
            }
    }
}
