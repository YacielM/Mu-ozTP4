package Vistas;

import java.util.HashSet;
import javax.swing.JOptionPane;
import Servicios.Alumno;

public class Alta_alumnos extends javax.swing.JInternalFrame {

    private HashSet<Alumno> alumno;

    public Alta_alumnos(HashSet alumno) {

        initComponents();
        this.alumno = alumno;

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
        apellido_label = new javax.swing.JTextField();
        nombre_label = new javax.swing.JTextField();
        legajo_label = new javax.swing.JTextField();
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
        jLabel1.setText("Apellido:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Legajo:");

        guardar_btn.setBackground(new java.awt.Color(255, 0, 0));
        guardar_btn.setForeground(new java.awt.Color(255, 255, 255));
        guardar_btn.setText("Guardar");
        guardar_btn.setBorder(null);
        guardar_btn.setBorderPainted(false);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        salir_btn.setBackground(new java.awt.Color(153, 153, 0));
        salir_btn.setForeground(new java.awt.Color(255, 255, 255));
        salir_btn.setText("Salir");
        salir_btn.setBorder(null);
        salir_btn.setBorderPainted(false);

        nuevo_btn.setBackground(new java.awt.Color(255, 153, 0));
        nuevo_btn.setForeground(new java.awt.Color(255, 255, 255));
        nuevo_btn.setText("Nuevo");
        nuevo_btn.setBorder(null);
        nuevo_btn.setBorderPainted(false);
        nuevo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_btnActionPerformed(evt);
            }
        });

        apellido_label.setBackground(new java.awt.Color(255, 255, 255));
        apellido_label.setBorder(null);

        nombre_label.setBackground(new java.awt.Color(255, 255, 255));
        nombre_label.setBorder(null);

        legajo_label.setBackground(new java.awt.Color(255, 255, 255));
        legajo_label.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monocraft", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FORMULARIO DE ALUMNOS");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(legajo_label, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(apellido_label)
                            .addComponent(jSeparator2)
                            .addComponent(nombre_label)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator1))
                        .addGap(145, 145, 145)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(130, 225, Short.MAX_VALUE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel4)
                .addGap(82, 82, 82)
                .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(legajo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(nombre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(71, 71, 71))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(apellido_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)))
                .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 810, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        // TODO add your handling code here:
        try {
            Alumno al = new Alumno(Integer.parseInt(legajo_label.getText()), apellido_label.getText(), nombre_label.getText());
            alumno.add(al);
            JOptionPane.showMessageDialog(rootPane, "Se ha inscripto correctamente.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Asegúrese de ingresar los datos correctamente.");
        }
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void nuevo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_btnActionPerformed
        // TODO add your handling code here
        legajo_label.setText("");
        apellido_label.setText("");
        nombre_label.setText("");
    }//GEN-LAST:event_nuevo_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_label;
    private javax.swing.JPanel bg;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField legajo_label;
    private javax.swing.JTextField nombre_label;
    private javax.swing.JButton nuevo_btn;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
