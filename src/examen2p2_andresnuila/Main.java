/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_andresnuila;

import java.awt.Color;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;

/**
 *
 * @author enuil
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        CrearPC = new javax.swing.JDialog();
        tf_materialBateria = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_materialTeclado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jb_colorTeclado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rb_Tactil = new javax.swing.JRadioButton();
        tf_nSerie = new javax.swing.JFormattedTextField();
        rb_noTactil = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jb_color = new javax.swing.JButton();
        tf_tipoPantalla = new javax.swing.JTextField();
        tf_materialPC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        sp_nucleosProcesador = new javax.swing.JSpinner();
        tf_tamRAM = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_VeloProcesador = new javax.swing.JFormattedTextField();
        tf_marcaRAM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_tamaDD = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_marcaDD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sp_horasBateria = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jy_año = new com.toedter.calendar.JYearChooser();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tf_instalacionRAM = new javax.swing.JTextField();
        tf_instalacionDD = new javax.swing.JTextField();
        tf_instalacionBateria = new javax.swing.JTextField();
        tf_instalacionTeclado = new javax.swing.JTextField();
        tf_instalacionPantalla = new javax.swing.JTextField();
        tf_instalacionProcesador = new javax.swing.JTextField();
        tactiloNo = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        Tecnico = new javax.swing.JMenu();
        Computadora = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jLabel17.setText("Material:");

        jLabel6.setText("Disco Duro:");

        jLabel7.setText("Bateria:");

        jLabel18.setText("Color:");

        jLabel8.setText("Teclado:");

        jb_colorTeclado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_colorTecladoMouseClicked(evt);
            }
        });

        jLabel9.setText("Pantalla:");

        jLabel19.setText("Tactil:");

        jLabel10.setText("Procesador:");

        tactiloNo.add(rb_Tactil);
        rb_Tactil.setText("Si");

        tf_nSerie.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        tactiloNo.add(rb_noTactil);
        rb_noTactil.setText("No");

        jLabel20.setText("Tipo:");

        jb_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_colorActionPerformed(evt);
            }
        });

        jLabel11.setText("Tamaño:");

        jLabel21.setText("No. de nucleos:");

        jLabel22.setText("Velocidad:");

        jLabel12.setText("Marca:");

        tf_VeloProcesador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel13.setText("Tamaño:");

        jLabel14.setText("Marca:");

        jLabel1.setText("No. de Serie");

        jLabel15.setText("Horas:");

        jLabel2.setText("Año");

        jLabel3.setText("Color");

        jLabel16.setText("Material:");

        jLabel4.setText("Material");

        jLabel5.setText("RAM:");

        jButton1.setText("Añadir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel23.setText("Tiempo de instalacion (segundos)");

        jLabel24.setText("Tiempo de instalacion (segundos)");

        jLabel25.setText("Tiempo de instalacion (segundos)");

        jLabel26.setText("Tiempo de instalacion (segundos)");

        jLabel27.setText("Tiempo de instalacion (segundos)");

        jLabel28.setText("Tiempo de instalacion (segundos)");

        javax.swing.GroupLayout CrearPCLayout = new javax.swing.GroupLayout(CrearPC.getContentPane());
        CrearPC.getContentPane().setLayout(CrearPCLayout);
        CrearPCLayout.setHorizontalGroup(
            CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearPCLayout.createSequentialGroup()
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(5, 5, 5)
                        .addComponent(tf_materialTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel18)
                        .addGap(5, 5, 5)
                        .addComponent(jb_colorTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_instalacionTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CrearPCLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tf_nSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CrearPCLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jy_año, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CrearPCLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jb_color, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CrearPCLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tf_materialPC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CrearPCLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(5, 5, 5)
                                .addComponent(tf_tamRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel12)
                                .addGap(5, 5, 5)
                                .addComponent(tf_marcaRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel23)
                                .addGap(39, 39, 39)
                                .addComponent(tf_instalacionRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CrearPCLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(12, 12, 12)
                                .addComponent(sp_horasBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel16)
                                .addGap(7, 7, 7)
                                .addComponent(tf_materialBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel27)
                                .addGap(36, 36, 36)
                                .addComponent(tf_instalacionBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)
                        .addComponent(tf_tamaDD, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel14)
                        .addGap(5, 5, 5)
                        .addComponent(tf_marcaDD, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel24)
                        .addGap(39, 39, 39)
                        .addComponent(tf_instalacionDD))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(1, 1, 1)
                        .addComponent(rb_Tactil)
                        .addGap(0, 0, 0)
                        .addComponent(rb_noTactil)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(5, 5, 5)
                        .addComponent(tf_tipoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_instalacionPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(5, 5, 5)
                        .addComponent(sp_nucleosProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel22)
                        .addGap(5, 5, 5)
                        .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CrearPCLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(CrearPCLayout.createSequentialGroup()
                                .addComponent(tf_VeloProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_instalacionProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        CrearPCLayout.setVerticalGroup(
            CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearPCLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(tf_nSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2))
                    .addComponent(jy_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(jb_color, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(tf_materialPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tf_tamRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tf_marcaRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel23))
                    .addComponent(tf_instalacionRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tf_tamaDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_marcaDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24)
                                .addComponent(tf_instalacionDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(sp_horasBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tf_materialBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(tf_instalacionBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel17))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tf_materialTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel18))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jb_colorTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_instalacionTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel19))
                    .addComponent(rb_Tactil)
                    .addComponent(rb_noTactil)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel20))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tf_tipoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(tf_instalacionPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21))
                    .addComponent(sp_nucleosProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel22))
                    .addComponent(tf_VeloProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CrearPCLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(CrearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tf_instalacionProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tecnico.setText("Tecnicos");
        jMenuBar1.add(Tecnico);

        Computadora.setText("Computadoras");

        jMenuItem1.setText("Crear PC");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Computadora.add(jMenuItem1);

        jMenuBar1.add(Computadora);

        jMenu3.setText("Ensamblaje");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_colorTecladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_colorTecladoMouseClicked
        JColorChooser jc = new JColorChooser();
        Color color = jc.showDialog(null, "Ingrese el color", Color.yellow);
        jb_colorTeclado.setBackground(color);
    }//GEN-LAST:event_jb_colorTecladoMouseClicked

    private void jb_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_colorActionPerformed
        // TODO add your handling code here:
        JColorChooser jc = new JColorChooser();
        Color color = jc.showDialog(null, "Ingrese el color", Color.yellow);
        jb_color.setBackground(color);
    }//GEN-LAST:event_jb_colorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CrearPC.pack();
        CrearPC.setModal(true);
        CrearPC.setLocationRelativeTo(null);
        CrearPC.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            String serie = tf_nSerie.getText();
            int año = jy_año.getYear();
            Color color = jb_color.getBackground();
            String material = tf_materialPC.getText();
            RAM r = new RAM(Integer.parseInt(tf_tamRAM.getText()), tf_marcaRAM.getText(),
                    Integer.parseInt(tf_instalacionRAM.getText()));
            Disco dd = new Disco(Integer.parseInt(tf_tamaDD.getText()), tf_marcaDD.getText(),
                    Integer.parseInt(tf_instalacionDD.getText()));
            Bateria b = new Bateria(Integer.parseInt(sp_horasBateria.getValue().toString()),
                    tf_materialBateria.getText(), Integer.parseInt(tf_instalacionBateria.getText()));
            Teclado t = new Teclado(tf_materialTeclado.getText(), jb_colorTeclado.getBackground(),
                    Integer.parseInt(tf_instalacionTeclado.getText()));
            String tactil = "";
            if (rb_Tactil.isSelected()) {
                tactil = "TACTIL";
            } else if (rb_noTactil.isSelected()) {
                tactil = " NO TACTIL";
            }
            Pantalla p = new Pantalla(tactil, tf_tipoPantalla.getText(), Integer.parseInt(tf_instalacionPantalla.getText()));
            Procesador pr = new Procesador(Integer.parseInt(sp_nucleosProcesador.getValue().toString()),
                    Double.parseDouble(tf_VeloProcesador.getText()), Integer.parseInt(tf_instalacionProcesador.getText()));
            Computadora c = new Computadora(serie, material, color, año, r, dd, b, t, p, pr);
            adminCompus ac = new adminCompus("./Computadoras.dna");
            ac.getComputadoras().add(c);
            ac.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Computadora;
    private javax.swing.JDialog CrearPC;
    private javax.swing.JMenu Tecnico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton jb_color;
    private javax.swing.JButton jb_colorTeclado;
    private com.toedter.calendar.JYearChooser jy_año;
    private javax.swing.JRadioButton rb_Tactil;
    private javax.swing.JRadioButton rb_noTactil;
    private javax.swing.JSpinner sp_horasBateria;
    private javax.swing.JSpinner sp_nucleosProcesador;
    private javax.swing.ButtonGroup tactiloNo;
    private javax.swing.JFormattedTextField tf_VeloProcesador;
    private javax.swing.JTextField tf_instalacionBateria;
    private javax.swing.JTextField tf_instalacionDD;
    private javax.swing.JTextField tf_instalacionPantalla;
    private javax.swing.JTextField tf_instalacionProcesador;
    private javax.swing.JTextField tf_instalacionRAM;
    private javax.swing.JTextField tf_instalacionTeclado;
    private javax.swing.JTextField tf_marcaDD;
    private javax.swing.JTextField tf_marcaRAM;
    private javax.swing.JTextField tf_materialBateria;
    private javax.swing.JTextField tf_materialPC;
    private javax.swing.JTextField tf_materialTeclado;
    private javax.swing.JFormattedTextField tf_nSerie;
    private javax.swing.JTextField tf_tamRAM;
    private javax.swing.JTextField tf_tamaDD;
    private javax.swing.JTextField tf_tipoPantalla;
    // End of variables declaration//GEN-END:variables
}
