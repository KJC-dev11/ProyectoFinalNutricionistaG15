/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;


import javax.swing.*;
import Modelo.Alimentos;
import Persistencia.AlimentoData;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MOON
 */
public class NewJInternalFrameAltaAlimento extends javax.swing.JInternalFrame {
    
    private AlimentoData alimentoData;

    /**
     * Creates new form NewJInternalFrameAltaAlimento
     */
    public NewJInternalFrameAltaAlimento() {
        alimentoData = new AlimentoData();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCalorias = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        nombreField = new javax.swing.JTextField();
        caloriasField = new javax.swing.JTextField();
        tipoCombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        codComidaField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        detalleTextArea = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabelNombre.setText("Nombre :");

        jLabelCalorias.setText("Calorias (por 100gr) : ");

        jLabelTipo.setText("Tipo :");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        tipoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige uno", "Desayuno", "Almuerzo", "Cena", "Merienda" }));
        tipoCombo.setAutoscrolls(true);
        tipoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoComboActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre de comida", "Calorias", "Tipo", "Detalle"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Borrar.setText("Eliminar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("ALIMENTO");

        jLabel1.setText("Codigo de la comida");

        codComidaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codComidaFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Detalle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(detalleTextArea))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(codComidaField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelTipo)
                                    .addGap(18, 18, 18)
                                    .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelCalorias)
                                    .addGap(18, 18, 18)
                                    .addComponent(caloriasField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelNombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(Buscar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(Modificar)
                                .addGap(18, 18, 18)
                                .addComponent(Borrar))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codComidaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCalorias)
                    .addComponent(caloriasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(detalleTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(Buscar)
                    .addComponent(Modificar)
                    .addComponent(Borrar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
                try {
            int codComida = Integer.parseInt(codComidaField.getText());
            String nombre = nombreField.getText();
            int calorias = Integer.parseInt(caloriasField.getText());
            String tipo = (String) tipoCombo.getSelectedItem();
            String detalle = detalleTextArea.getText();

            Alimentos alimento = new Alimentos(codComida,nombre, calorias, tipo, detalle);
            alimentoData.guardarAlimento(alimento);
            JOptionPane.showMessageDialog(this, "Alimento guardado exitosamente.");
            actualizarTabla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en el ingreso de datos.");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void codComidaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codComidaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codComidaFieldActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
                try {
            int codComida = Integer.parseInt(codComidaField.getText());
            Alimentos alimento = alimentoData.buscarAlimento(codComida);
            if (alimento != null) {
                nombreField.setText(alimento.getNombreComida());
                caloriasField.setText(String.valueOf(alimento.getCaloriasPorPorcion()));
                tipoCombo.setSelectedItem(alimento.getStipoComida());
                detalleTextArea.setText(alimento.getDetalle());
            } else {
                JOptionPane.showMessageDialog(this, "Alimento no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código no válido.");
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
                try {
            int codComida = Integer.parseInt(codComidaField.getText());
            String nombre = nombreField.getText();
            int calorias = Integer.parseInt(caloriasField.getText());
            String tipo = (String) tipoCombo.getSelectedItem();
            String detalle = detalleTextArea.getText();

            Alimentos alimento = new Alimentos(codComida, nombre, calorias, tipo, detalle);
            alimentoData.actualizarAlimento(alimento);
            JOptionPane.showMessageDialog(this, "Alimento modificado exitosamente.");
            actualizarTabla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código no válido.");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        // TODO add your handling code here:
                try {
             int codComida = Integer.parseInt(codComidaField.getText());
            alimentoData.eliminarAlimento(codComida);
            JOptionPane.showMessageDialog(this, "Alimento eliminado exitosamente.");
            actualizarTabla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código no válido.");
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void tipoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField caloriasField;
    private javax.swing.JTextField codComidaField;
    private javax.swing.JTextField detalleTextArea;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCalorias;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nombreField;
    private javax.swing.JComboBox<String> tipoCombo;
    // End of variables declaration//GEN-END:variables

        private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // 
        for (Alimentos alimento : alimentoData.listarAlimentos()) {
            model.addRow(new Object[]{
                alimento.getCodComida(),
                alimento.getNombreComida(),
                alimento.getCaloriasPorPorcion(),
                alimento.getStipoComida(),
                alimento.getDetalle()
            });
        }
    }    
}
