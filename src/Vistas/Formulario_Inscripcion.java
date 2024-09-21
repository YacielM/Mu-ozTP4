package Vistas;

import java.util.HashSet;
import javax.swing.JOptionPane;
import Servicios.Alumno;
import Servicios.Materias;

public class Formulario_Inscripcion extends javax.swing.JInternalFrame {

    private HashSet<Alumno> alum;
    private HashSet<Materias> mat;

    public Formulario_Inscripcion(HashSet<Materias> materia, HashSet<Alumno> alumno) {
        initComponents();
        this.alum = alumno;
        this.mat = materia;
        llenarCombo();
//        //Combobox materias
//        Iterator<Materias> materias = m.iterator();
//        while(materias.hasNext()){
//               materia_jComboBox.addItem(materias.next().getNombre());
//        }
//        
//        //Combobox alumnos
//        Iterator<Alumno> alumno = a.iterator();
//        while(alumno.hasNext()){
//               alumno_jComboBox.addItem(alumno.next().getNombre());
//        }
//    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salir_btn = new javax.swing.JButton();
        nuevo_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        materia_jComboBox = new javax.swing.JComboBox<>();
        alumno_jComboBox = new javax.swing.JComboBox<>();
        mostrar_btn = new javax.swing.JButton();

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
        jLabel1.setText("Elija un alumno:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Elija una materia:");

        salir_btn.setBackground(new java.awt.Color(102, 204, 255));
        salir_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salir_btn.setForeground(new java.awt.Color(255, 255, 255));
        salir_btn.setText("Salir");
        salir_btn.setBorder(null);
        salir_btn.setBorderPainted(false);

        nuevo_btn.setBackground(new java.awt.Color(0, 153, 153));
        nuevo_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nuevo_btn.setForeground(new java.awt.Color(255, 255, 255));
        nuevo_btn.setText("Inscribirse");
        nuevo_btn.setBorder(null);
        nuevo_btn.setBorderPainted(false);
        nuevo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_btnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monocraft", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FORMULARIO DE INSCRIPCIÓN");

        materia_jComboBox.setBackground(new java.awt.Color(204, 204, 255));
        materia_jComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        alumno_jComboBox.setBackground(new java.awt.Color(204, 204, 255));
        alumno_jComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        mostrar_btn.setBackground(new java.awt.Color(0, 204, 255));
        mostrar_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mostrar_btn.setForeground(new java.awt.Color(255, 255, 255));
        mostrar_btn.setText("Mostrar");
        mostrar_btn.setBorder(null);
        mostrar_btn.setBorderPainted(false);
        mostrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_btnActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(materia_jComboBox, 0, 263, Short.MAX_VALUE)
                            .addComponent(alumno_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(bgLayout.createSequentialGroup()
                            .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(materia_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(alumno_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 810, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_btnActionPerformed
        // TODO add your handling code here:
         Alumno alumno = (Alumno) alumno_jComboBox.getSelectedItem();
        Materias materia = (Materias) materia_jComboBox.getSelectedItem();

        if (alumno != null && materia != null) {
            if (alumno.cantidadMateria(materia)) {
                JOptionPane.showMessageDialog(rootPane, "El alumno: " + alumno + " se ha inscrito en la materia: " + materia);
            } else {
                JOptionPane.showMessageDialog(rootPane, "El alumno: " + alumno + " ya está inscrito en 3 materias o no pudo inscribirse en la materia seleccionada");
            }
        }
    }//GEN-LAST:event_nuevo_btnActionPerformed

    private void mostrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_btnActionPerformed
        // TODO add your handling code here:
         Alumno alumno = (Alumno) alumno_jComboBox.getSelectedItem();

        if (alumno != null) {
            StringBuilder materiasInscritas = new StringBuilder();
            for (Materias materia : alumno.getMaterias()) {
                materiasInscritas.append(materia.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(rootPane, "El alumno: " + alumno + " esta inscripto en las siguientes materias: \n\t" + materiasInscritas.toString());
        }
    }//GEN-LAST:event_mostrar_btnActionPerformed

    public void llenarCombo() {
        for (Alumno alumn : alum) {
            alumno_jComboBox.addItem(alumn);
        }
        for (Materias mater : mat) {
            materia_jComboBox.addItem(mater);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> alumno_jComboBox;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<Materias> materia_jComboBox;
    private javax.swing.JButton mostrar_btn;
    private javax.swing.JButton nuevo_btn;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
