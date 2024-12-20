/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Paciente;
import Persistencia.PacienteData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FrancoPC
 */
public class VistaPaciente extends javax.swing.JPanel {
    
    private PacienteData pacienteData;
    private DefaultTableModel modelo;
    private ArrayList<Modelo.Paciente> listaPacientes;

    /**
     * Creates new form Paciente
     */
    public VistaPaciente() {
        initComponents();
        pacienteData = new PacienteData();
        modelo = new DefaultTableModel();
        listaPacientes = (ArrayList<Modelo.Paciente>) pacienteData.obtenerTodosLosPacientes();
        //configurarTabla();
        habilitarCampos(true);
        cargarTablaPacientes();
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
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfEdad = new javax.swing.JTextField();
        jtfDNI = new javax.swing.JTextField();
        jtfAltura = new javax.swing.JTextField();
        jtfPesoA = new javax.swing.JTextField();
        jtfPesoO = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        jrbEstado = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(750, 430));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(750, 430));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));

        jbGuardar.setBackground(new java.awt.Color(51, 153, 0));
        jbGuardar.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\guardar.png")); // NOI18N
        jbGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(51, 153, 0));
        jbNuevo.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\nuevo.png")); // NOI18N
        jbNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbBorrar.setBackground(new java.awt.Color(51, 153, 0));
        jbBorrar.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\tacho.png")); // NOI18N
        jbBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbEditar.setBackground(new java.awt.Color(51, 153, 0));
        jbEditar.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\editar.png")); // NOI18N
        jbEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(51, 153, 0));
        jbBuscar.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\persona buscar.png")); // NOI18N
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\paciente.png")); // NOI18N
        jLabel1.setText("PACIENTE");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Edad:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("D.N.I:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Altura (cm):");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Peso Actual (kg):");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Peso Objetivo (kg):");

        jtfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));

        jtfApellido.setBackground(new java.awt.Color(255, 255, 255));
        jtfApellido.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfApellido.setForeground(new java.awt.Color(0, 0, 0));

        jtfEdad.setBackground(new java.awt.Color(255, 255, 255));
        jtfEdad.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfEdad.setForeground(new java.awt.Color(0, 0, 0));

        jtfDNI.setBackground(new java.awt.Color(255, 255, 255));
        jtfDNI.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfDNI.setForeground(new java.awt.Color(0, 0, 0));

        jtfAltura.setBackground(new java.awt.Color(255, 255, 255));
        jtfAltura.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfAltura.setForeground(new java.awt.Color(0, 0, 0));

        jtfPesoA.setBackground(new java.awt.Color(255, 255, 255));
        jtfPesoA.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfPesoA.setForeground(new java.awt.Color(0, 0, 0));

        jtfPesoO.setBackground(new java.awt.Color(255, 255, 255));
        jtfPesoO.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfPesoO.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Estado:");

        jtPacientes.setBackground(new java.awt.Color(255, 255, 255));
        jtPacientes.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtPacientes.setForeground(new java.awt.Color(0, 0, 0));
        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "D.N.I.", "Edad", "Altura ", "P. Act.", "P. Obj.", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPacientes.getTableHeader().setReorderingAllowed(false);
        jtPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPacientes);
        if (jtPacientes.getColumnModel().getColumnCount() > 0) {
            jtPacientes.getColumnModel().getColumn(0).setMinWidth(20);
            jtPacientes.getColumnModel().getColumn(0).setMaxWidth(20);
            jtPacientes.getColumnModel().getColumn(3).setMinWidth(70);
            jtPacientes.getColumnModel().getColumn(3).setMaxWidth(70);
            jtPacientes.getColumnModel().getColumn(4).setMinWidth(40);
            jtPacientes.getColumnModel().getColumn(4).setMaxWidth(40);
            jtPacientes.getColumnModel().getColumn(5).setMinWidth(45);
            jtPacientes.getColumnModel().getColumn(5).setMaxWidth(45);
            jtPacientes.getColumnModel().getColumn(6).setMinWidth(45);
            jtPacientes.getColumnModel().getColumn(6).setMaxWidth(45);
            jtPacientes.getColumnModel().getColumn(7).setMinWidth(40);
            jtPacientes.getColumnModel().getColumn(7).setMaxWidth(40);
            jtPacientes.getColumnModel().getColumn(8).setMinWidth(60);
            jtPacientes.getColumnModel().getColumn(8).setMaxWidth(60);
        }

        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("ID:");

        jtfID.setBackground(new java.awt.Color(255, 255, 255));
        jtfID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jtfID.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfID, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jtfNombre)
                            .addComponent(jtfApellido)
                            .addComponent(jtfEdad)
                            .addComponent(jtfDNI))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfPesoO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jtfPesoA, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfAltura)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbEstado)))
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbEditar)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbBorrar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jtfPesoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jtfPesoO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jrbEstado))
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBorrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       buscarPaciente();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
       editarPaciente();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
       habilitarCampos(true);
        limpiarCampos();
        jtfDNI.requestFocus();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       guardarPaciente();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        borrarPacientes();
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        //cambiarEstadoPaciente();
        //actualizarTabla(listaPacientes);
    }//GEN-LAST:event_jrbEstadoActionPerformed

    private void jtPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacientesMouseClicked
        if (evt.getClickCount()==2) {
            int renglon = jtPacientes.getSelectedRow();
            
            jtfID.setText(jtPacientes.getValueAt(renglon, 0).toString());
            jtfNombre.setText(jtPacientes.getValueAt(renglon, 1).toString());
            jtfApellido.setText(jtPacientes.getValueAt(renglon,2).toString());
            jtfDNI.setText(jtPacientes.getValueAt(renglon, 3).toString());
            jtfEdad.setText(jtPacientes.getValueAt(renglon, 4).toString());
            jtfAltura.setText(jtPacientes.getValueAt(renglon, 5).toString());
            jtfPesoA.setText(jtPacientes.getValueAt(renglon,6).toString());
            jtfPesoO.setText(jtPacientes.getValueAt(renglon, 7).toString());
            
            if (jtPacientes.getValueAt(renglon, 8).toString().equalsIgnoreCase("Activo")) {
                      jrbEstado.setSelected(true);
                      
                  }else if (jtPacientes.getValueAt(renglon, 8).toString().equalsIgnoreCase("Inactivo"))
                      jrbEstado.setSelected(false);
        }
    }//GEN-LAST:event_jtPacientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField jtfAltura;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfEdad;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPesoA;
    private javax.swing.JTextField jtfPesoO;
    // End of variables declaration//GEN-END:variables

    
private void cargarTablaPacientes() {
    List<Paciente> pacientes = pacienteData.obtenerTodosLosPacientes();
    DefaultTableModel model = (DefaultTableModel) jtPacientes.getModel();
    model.setRowCount(0);
    
    for (Paciente p : pacientes) {
        model.addRow(new Object[]{
            p.getIdPaciente(), p.getNombre(), p.getApellido(), 
            p.getDni(), p.getEdad(), p.getAltura(), 
            p.getPesoActual(), p.getPesoBuscado(), p.isActivo() ? "Activo" : "Inactivo"
        });
    }
}

    
  /*  private void configurarTabla() {
        modelo = new DefaultTableModel(new String[]{"ID", "Nombre", "Apellido", "DNI", "Edad", "Altura" ,"Peso Actual", "Peso Objetivo", "Estado"}, 0);
        jtPacientes.setModel(modelo);
    }*/
    
    private void habilitarCampos(boolean habilitar) {
        jtfDNI.setEnabled(habilitar);
        jtfNombre.setEnabled(habilitar);
        jtfApellido.setEnabled(habilitar);
        jtfAltura.setEnabled(habilitar);
        jtfEdad.setEnabled(habilitar);
        jtfPesoA.setEnabled(habilitar);
        jtfPesoO.setEnabled(habilitar);
        jrbEstado.setEnabled(habilitar);
    }

    private void limpiarCampos() {
        jtfID.setText("");
        jtfDNI.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfAltura.setText("");
        jtfEdad.setText("");
        jtfPesoA.setText("");
        jtfPesoO.setText("");
        jrbEstado.setSelected(false);
    }
    
    private void borrarPacientes(){
         int filaSeleccionada = jtPacientes.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un paciente para eliminar.");
        return;
    }

    try {
        int id = (int) jtPacientes.getValueAt(filaSeleccionada, 0);
        pacienteData.borrarPaciente(id);
        cargarTablaPacientes();
        JOptionPane.showMessageDialog(this, "Paciente eliminado con éxito.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar paciente: " + e.getMessage());
    }
    }
    
    private void guardarPaciente(){
         try {
        Paciente paciente = new Paciente();
        paciente.setNombre(jtfNombre.getText());
        paciente.setApellido(jtfApellido.getText());
        paciente.setDni(Integer.parseInt(jtfDNI.getText()));
        paciente.setEdad(Integer.parseInt(jtfEdad.getText()));
        paciente.setAltura(Double.parseDouble(jtfAltura.getText()));
        paciente.setPesoActual(Double.parseDouble(jtfPesoA.getText()));
        paciente.setPesoBuscado(Double.parseDouble(jtfPesoO.getText()));
        paciente.setActivo(jrbEstado.isSelected());

        pacienteData.guardarPaciente(paciente);
        cargarTablaPacientes();
        JOptionPane.showMessageDialog(this, "Paciente guardado con éxito.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al guardar paciente: " + e.getMessage());
    }
    }
    
    private void editarPaciente(){
        int filaSeleccionada = jtPacientes.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un paciente para editar.");
        return;
    }

    try {
        int id = (int) jtPacientes.getValueAt(filaSeleccionada, 0);
        Paciente paciente = pacienteData.buscarPacientePorId(id);
        
        paciente.setNombre(jtfNombre.getText());
        paciente.setApellido(jtfApellido.getText());
        paciente.setDni(Integer.parseInt(jtfDNI.getText()));
        paciente.setEdad(Integer.parseInt(jtfEdad.getText()));
        paciente.setAltura(Double.parseDouble(jtfAltura.getText()));
        paciente.setPesoActual(Double.parseDouble(jtfPesoA.getText()));
        paciente.setPesoBuscado(Double.parseDouble(jtfPesoO.getText()));
        paciente.setActivo(jrbEstado.isSelected());

        pacienteData.actualizarPaciente(paciente);
        cargarTablaPacientes();
        JOptionPane.showMessageDialog(this, "Paciente actualizado con éxito.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al editar paciente: " + e.getMessage());
    }
    }
    
    private void buscarPaciente(){
            String dniBuscado = JOptionPane.showInputDialog(this, "Ingrese el DNI del paciente:");
    if (dniBuscado != null && !dniBuscado.trim().isEmpty()) {
        try {
            int dni = Integer.parseInt(dniBuscado.trim());
            // Buscar el paciente en la base de datos
            Paciente paciente = pacienteData.buscarPacientePorDni(dni);
            if (paciente != null) {
                // Si el paciente fue encontrado, actualizar los campos
                jtfID.setText(String.valueOf(paciente.getIdPaciente()));
                jtfDNI.setText(String.valueOf(paciente.getDni()));
                jtfNombre.setText(paciente.getNombre());
                jtfApellido.setText(paciente.getApellido());
                jtfAltura.setText(String.valueOf(paciente.getAltura()));
                jtfEdad.setText(String.valueOf(paciente.getEdad()));
                jtfPesoA.setText(String.valueOf(paciente.getPesoActual()));
                jtfPesoO.setText(String.valueOf(paciente.getPesoBuscado()));
                jrbEstado.setSelected(paciente.isActivo());
                habilitarCampos(true);
            } else {
                // Si no fue encontrado, mostrar mensaje
                JOptionPane.showMessageDialog(this, "Paciente no encontrado.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "DNI inválido. Ingrese solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Debe ingresar un DNI.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }
}