/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author FrancoPC
 */
public class Nutricionista extends javax.swing.JFrame {

    /**
     * Creates new form Nutricionista
     */
    public Nutricionista() {
        initComponents();
        setDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbMenuPaciente = new javax.swing.JButton();
        jbMenuAlimento = new javax.swing.JButton();
        jbInicio = new javax.swing.JButton();
        jbRenglon = new javax.swing.JButton();
        jbMenuDieta = new javax.swing.JButton();
        jbMenuDiario = new javax.swing.JButton();
        jpHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpContenido = new javax.swing.JPanel();
        jlFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        Background.setBackground(new java.awt.Color(255, 255, 255));

        jpMenu.setBackground(new java.awt.Color(0, 102, 0));
        jpMenu.setForeground(new java.awt.Color(255, 255, 255));
        jpMenu.setPreferredSize(new java.awt.Dimension(270, 640));

        jlTitulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo.setText("Nutricionista");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(70, 10));

        jbMenuPaciente.setBackground(new java.awt.Color(0, 204, 0));
        jbMenuPaciente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbMenuPaciente.setForeground(new java.awt.Color(0, 0, 0));
        jbMenuPaciente.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\MenuAltaPaciente.png")); // NOI18N
        jbMenuPaciente.setText(" Paciente");
        jbMenuPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbMenuPaciente.setBorderPainted(false);
        jbMenuPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMenuPaciente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jbMenuAlimento.setBackground(new java.awt.Color(0, 204, 0));
        jbMenuAlimento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbMenuAlimento.setForeground(new java.awt.Color(0, 0, 0));
        jbMenuAlimento.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\MenuAltaAlimento.png")); // NOI18N
        jbMenuAlimento.setText(" Alimento");
        jbMenuAlimento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbMenuAlimento.setBorderPainted(false);
        jbMenuAlimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMenuAlimento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbMenuAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuAlimentoActionPerformed(evt);
            }
        });

        jbInicio.setBackground(new java.awt.Color(0, 204, 0));
        jbInicio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbInicio.setForeground(new java.awt.Color(0, 0, 0));
        jbInicio.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\Inicio.png")); // NOI18N
        jbInicio.setText(" Inicio");
        jbInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbInicio.setBorderPainted(false);
        jbInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInicioActionPerformed(evt);
            }
        });

        jbRenglon.setBackground(new java.awt.Color(0, 204, 0));
        jbRenglon.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbRenglon.setForeground(new java.awt.Color(0, 0, 0));
        jbRenglon.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\MenuDiario.png")); // NOI18N
        jbRenglon.setText(" Renglon");
        jbRenglon.setBorder(new javax.swing.border.MatteBorder(null));
        jbRenglon.setBorderPainted(false);
        jbRenglon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRenglon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRenglonActionPerformed(evt);
            }
        });

        jbMenuDieta.setBackground(new java.awt.Color(0, 204, 0));
        jbMenuDieta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbMenuDieta.setForeground(new java.awt.Color(0, 0, 0));
        jbMenuDieta.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\MenuAltaDieta.png")); // NOI18N
        jbMenuDieta.setText(" Dieta");
        jbMenuDieta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbMenuDieta.setBorderPainted(false);
        jbMenuDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMenuDieta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbMenuDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuDietaActionPerformed(evt);
            }
        });

        jbMenuDiario.setBackground(new java.awt.Color(0, 204, 0));
        jbMenuDiario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbMenuDiario.setForeground(new java.awt.Color(0, 0, 0));
        jbMenuDiario.setIcon(new javax.swing.ImageIcon("D:\\Franco\\ULP\\02. Materias\\1°Año\\2°Cuatrimestre\\Lab. de Programación\\6-Proyecto Final\\Proyect_Final\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\--PROYECTO-de-la-REALIDAD--NUTRICIONISTA\\NUTRICIONISTAPROYECTOFINALG15\\src\\imagenes\\MenuDiario.png")); // NOI18N
        jbMenuDiario.setText(" Menu Diario");
        jbMenuDiario.setBorder(new javax.swing.border.MatteBorder(null));
        jbMenuDiario.setBorderPainted(false);
        jbMenuDiario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMenuDiario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbMenuDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuDiarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlTitulo))
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbMenuPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbMenuAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbMenuDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbMenuDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbRenglon, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jlTitulo)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jbMenuPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jbMenuAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jbMenuDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jbMenuDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jbRenglon, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpHeader.setBackground(new java.awt.Color(0, 255, 51));
        jpHeader.setPreferredSize(new java.awt.Dimension(683, 150));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bienvenido!");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Administracion Nutricionista");

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(1261, Short.MAX_VALUE))
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpContenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpContenidoLayout = new javax.swing.GroupLayout(jpContenido);
        jpContenido.setLayout(jpContenidoLayout);
        jpContenidoLayout.setHorizontalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpContenidoLayout.setVerticalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jlFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(51, 51, 51));
        jlFecha.setText("Fecha");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 1640, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jpContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbMenuAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbMenuAlimentoActionPerformed

    private void jbRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRenglonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRenglonActionPerformed

    private void jbMenuDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbMenuDietaActionPerformed

    private void jbMenuDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuDiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbMenuDiarioActionPerformed

    private void jbInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbInicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nutricionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbInicio;
    private javax.swing.JButton jbMenuAlimento;
    private javax.swing.JButton jbMenuDiario;
    private javax.swing.JButton jbMenuDieta;
    private javax.swing.JButton jbMenuPaciente;
    private javax.swing.JButton jbRenglon;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpContenido;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpMenu;
    // End of variables declaration//GEN-END:variables

private void setDate(){
    LocalDate now = LocalDate.now();
    Locale spanishLocale = new Locale("es","Es");
    jlFecha.setText(now.format(DateTimeFormatter.ofPattern(" 'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
}
}