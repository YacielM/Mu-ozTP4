
package Vistas;

import java.util.HashSet;
import javax.swing.JOptionPane;
import Servicios.Materias;

public class Alta_materias extends javax.swing.JInternalFrame {

    private HashSet<Materias> materia;
    public Alta_materias(HashSet<Materias> materias) {
        initComponents();
        this.materia = materias;
        
        guardar_btn.addActionListener(e -> {
            try{
                Materias m = new Materias(Integer.parseInt(codigo_label.getText()),materia_label.getText(), Integer.parseInt(anio_label.getText()));
                materia.add(m);
                JOptionPane.showMessageDialog(rootPane, "Se registro la materia.");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, "Asegúrese de ingresar los datos correctamente.");
                codigo_label.setText("");
                materia_label.setText("");
                anio_label.setText("");
            }
        });
        
        nuevo_btn.addActionListener(e ->{
            codigo_label.setText("");
            materia_label.setText("");
            anio_label.setText("");
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        guardar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        nuevo_btn = new javax.swing.JButton();
        materia_label = new javax.swing.JTextField();
        anio_label = new javax.swing.JTextField();
        codigo_label = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(830, 672));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(810, 630));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Materia:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Año:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código:");

        guardar_btn.setBackground(new java.awt.Color(102, 102, 255));
        guardar_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        guardar_btn.setForeground(new java.awt.Color(255, 255, 255));
        guardar_btn.setText("Guardar");
        guardar_btn.setBorder(null);
        guardar_btn.setBorderPainted(false);

        salir_btn.setBackground(new java.awt.Color(51, 0, 204));
        salir_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salir_btn.setForeground(new java.awt.Color(255, 255, 255));
        salir_btn.setText("Salir");
        salir_btn.setBorder(null);
        salir_btn.setBorderPainted(false);

        nuevo_btn.setBackground(new java.awt.Color(102, 0, 255));
        nuevo_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nuevo_btn.setForeground(new java.awt.Color(255, 255, 255));
        nuevo_btn.setText("Nuevo");
        nuevo_btn.setBorder(null);
        nuevo_btn.setBorderPainted(false);

        materia_label.setBackground(new java.awt.Color(255, 255, 255));
        materia_label.setBorder(null);

        anio_label.setBackground(new java.awt.Color(255, 255, 255));
        anio_label.setBorder(null);
        anio_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anio_labelActionPerformed(evt);
            }
        });

        codigo_label.setBackground(new java.awt.Color(255, 255, 255));
        codigo_label.setBorder(null);
        codigo_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_labelActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monocraft", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FORMULARIO DE MATERIAS");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(196, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigo_label, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(materia_label)
                            .addComponent(jSeparator2)
                            .addComponent(anio_label)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator1))
                        .addGap(117, 117, 117)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(anio_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(71, 71, 71))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(materia_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)))
                .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 810, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anio_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anio_labelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anio_labelActionPerformed

    private void codigo_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_labelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_labelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anio_label;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField codigo_label;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField materia_label;
    private javax.swing.JButton nuevo_btn;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
