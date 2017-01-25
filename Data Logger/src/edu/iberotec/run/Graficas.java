/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iberotec.run;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.*;

import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;

import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Eduadro
 */
public class Graficas extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;

    public Graficas() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.lineas.setVisible(false);
        this.barras.setVisible(false);
        this.pastel.setVisible(false);

        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        l = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        jbnGraficar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        capas = new javax.swing.JLayeredPane();
        barras = new javax.swing.JPanel();
        pastel = new javax.swing.JPanel();
        lineas = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X", "Y"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(datos);

        l.setText("Lineas");
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });

        b.setText("Barras");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        jbnGraficar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbnGraficar.setText("Graficar");
        jbnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnGraficarActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de Grafico");

        capas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        barras.setPreferredSize(new java.awt.Dimension(460, 401));

        javax.swing.GroupLayout barrasLayout = new javax.swing.GroupLayout(barras);
        barras.setLayout(barrasLayout);
        barrasLayout.setHorizontalGroup(
            barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        barrasLayout.setVerticalGroup(
            barrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pastel.setPreferredSize(new java.awt.Dimension(460, 381));

        javax.swing.GroupLayout pastelLayout = new javax.swing.GroupLayout(pastel);
        pastel.setLayout(pastelLayout);
        pastelLayout.setHorizontalGroup(
            pastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        pastelLayout.setVerticalGroup(
            pastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        lineas.setPreferredSize(new java.awt.Dimension(460, 401));

        javax.swing.GroupLayout lineasLayout = new javax.swing.GroupLayout(lineas);
        lineas.setLayout(lineasLayout);
        lineasLayout.setHorizontalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        lineasLayout.setVerticalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barras, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pastel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barras, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pastel, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        capas.setLayer(barras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(pastel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(lineas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Abrir ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l)
                        .addGap(18, 18, 18)
                        .addComponent(b))
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbnGraficar)))
                .addGap(44, 44, 44)
                .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l)
                            .addComponent(b))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbnGraficar)
                            .addComponent(jButton1))
                        .addGap(0, 217, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        lineas.setVisible(true);
        capas.setLayer(lineas, 0, 0);
        b.setSelected(false);

    }//GEN-LAST:event_lActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        barras.setVisible(true);
        capas.setLayer(barras, 0, 0);
        l.setSelected(false);

    }//GEN-LAST:event_bActionPerformed

    private void jbnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnGraficarActionPerformed
        ChartPanel panel;
        JFreeChart chart = null;

        if (l.isSelected()) {
            //Grafico de lineas
            int validar = 1;
            XYSplineRenderer renderer = new XYSplineRenderer();
            XYSeriesCollection dataset = new XYSeriesCollection();

            ValueAxis x = new NumberAxis();
            ValueAxis y = new NumberAxis();

            XYSeries serie = new XYSeries("Datos");

            XYPlot plot;
            lineas.removeAll();

            try {
                for (int fila = 0; fila < (datos.getRowCount()); fila++) {
                    serie.add(Float.parseFloat(String.valueOf(datos.getValueAt(fila, 0))),
                            Float.parseFloat(String.valueOf(datos.getValueAt(fila, 1))));
                }
            } catch (Exception e) {
                validar = 0;
            }
            if (validar == 1) {
                dataset.addSeries(serie);

                x.setLabel("Eje X");
                y.setLabel("Eje Y");
                plot = new XYPlot(dataset, x, y, renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("Grafico de Lineas");
            } else {
                JOptionPane.showMessageDialog(this, "Debe llenar la tabla con datos numericos");
            }
        } else if (b.isSelected()) {

            //if(b.isSelected()){
            //Grafico de barras
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            String producto1 = "Eje X";
            String producto2 = "Eje Y";

            String dia1 = "Dia 1";
            String dia2 = "Dia 2";
            String dia3 = "Dia 3";
            String dia4 = "Dia 4";
            //18 = cantida del producto1 en el dia1
            data.addValue(18, producto1, dia1);
            data.addValue(15, producto1, dia2);
            data.addValue(14, producto1, dia3);
            data.addValue(1, producto1, dia4);

            data.addValue(50, producto2, dia1);
            data.addValue(45, producto2, dia2);
            data.addValue(31, producto2, dia3);
            data.addValue(10, producto2, dia4);

            chart = ChartFactory.createBarChart(
                    "Grafico de Barras",
                    "Dia",
                    "cantidad",
                    data,
                    PlotOrientation.VERTICAL,
                    true,
                    true,
                    true);
            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setDomainGridlinesVisible(true);
            //}
            //else{

            //}
        } else {
            JOptionPane.showMessageDialog(this, "No ha selecionado el tipo de grafica");
        }
        panel = new ChartPanel(chart);
        panel.setBounds(5, 10, 460, 410);

        if (l.isSelected()) {
            //lineas
            lineas.add(panel);
            lineas.repaint();
        } else {
            if (b.isSelected()) {
                //barras
                barras.add(panel);
                barras.repaint();

            }
        }
    }//GEN-LAST:event_jbnGraficarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (seleccionado.showDialog(this, "Abrir achivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    DefaultTableModel df = ((DefaultTableModel) datos.getModel());
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new FileReader(archivo));
                        String line = br.readLine();

                        for (int row = 0; row < 10; row++) {
                            for (int column = 0; column < 5; column++) {
                                while (line != null) {
                                    String[] rowfields = line.split("\\s+");
                                    df.addRow(rowfields);
                                    line = br.readLine();
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Este formato es incorrecto, elija un txt");
                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b;
    private javax.swing.JPanel barras;
    private javax.swing.JLayeredPane capas;
    private javax.swing.JTable datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnGraficar;
    private javax.swing.JRadioButton l;
    private javax.swing.JPanel lineas;
    private javax.swing.JPanel pastel;
    // End of variables declaration//GEN-END:variables
}
