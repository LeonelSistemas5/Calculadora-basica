/*
    Mas o menos Pasable fal signo y porcentaje
    subString = una parte de la cadena como decir (conjunto = string, subconjunto = substring)
 */
package Ventanas;

/**
 *
 * @author ACER
 */
public class main extends javax.swing.JFrame {

    public double[] numeros = new double[2];

    public boolean decimal = true;

    public boolean divicion = false;
    public boolean multiplicacion = false;
    public boolean resta = false;
    public boolean suma = false;

    public boolean porcentaje = false;
    public boolean signo = false;
    
    public boolean controlVentana = false;

    public main() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(315, 550); //modificar tamaño de la ventana de la calculadora
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
        jPanel2 = new javax.swing.JPanel();
        btn_borrar = new javax.swing.JButton();
        btn_signo = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_divi = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Jlabel_ventana = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_borrar.setBackground(new java.awt.Color(102, 102, 102));
        btn_borrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar.setText("AC");
        btn_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_borrar.setFocusable(false);
        btn_borrar.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_borrar.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_borrar.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 65));

        btn_signo.setBackground(new java.awt.Color(102, 102, 102));
        btn_signo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_signo.setForeground(new java.awt.Color(255, 255, 255));
        btn_signo.setText("+/-");
        btn_signo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_signo.setFocusable(false);
        btn_signo.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_signo.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_signo.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_signo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 65));

        btn_porcentaje.setBackground(new java.awt.Color(102, 102, 102));
        btn_porcentaje.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        btn_porcentaje.setText("%");
        btn_porcentaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_porcentaje.setFocusable(false);
        btn_porcentaje.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_porcentaje.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_porcentaje.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 70, 65));

        btn_divi.setBackground(new java.awt.Color(51, 153, 255));
        btn_divi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_divi.setForeground(new java.awt.Color(255, 255, 255));
        btn_divi.setText("/");
        btn_divi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_divi.setFocusable(false);
        btn_divi.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_divi.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_divi.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_divi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diviActionPerformed(evt);
            }
        });
        jPanel2.add(btn_divi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 70, 65));

        btn_7.setBackground(new java.awt.Color(255, 255, 255));
        btn_7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_7.setText("7");
        btn_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_7.setFocusable(false);
        btn_7.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_7.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_7.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 65));

        btn_8.setBackground(new java.awt.Color(255, 255, 255));
        btn_8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_8.setText("8");
        btn_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_8.setFocusable(false);
        btn_8.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_8.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_8.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 70, 65));

        btn_9.setBackground(new java.awt.Color(255, 255, 255));
        btn_9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_9.setText("9");
        btn_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_9.setFocusable(false);
        btn_9.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_9.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_9.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 70, 65));

        btn_mult.setBackground(new java.awt.Color(51, 153, 255));
        btn_mult.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_mult.setForeground(new java.awt.Color(255, 255, 255));
        btn_mult.setText("x");
        btn_mult.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_mult.setFocusable(false);
        btn_mult.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_mult.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_mult.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 70, 65));

        btn_4.setBackground(new java.awt.Color(255, 255, 255));
        btn_4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_4.setText("4");
        btn_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_4.setFocusable(false);
        btn_4.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_4.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_4.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 65));

        btn_5.setBackground(new java.awt.Color(255, 255, 255));
        btn_5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_5.setText("5");
        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_5.setFocusable(false);
        btn_5.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_5.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_5.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 70, 65));

        btn_6.setBackground(new java.awt.Color(255, 255, 255));
        btn_6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_6.setText("6");
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_6.setFocusable(false);
        btn_6.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_6.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_6.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 70, 65));

        btn_resta.setBackground(new java.awt.Color(51, 153, 255));
        btn_resta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(255, 255, 255));
        btn_resta.setText("-");
        btn_resta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_resta.setFocusable(false);
        btn_resta.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_resta.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_resta.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 70, 65));

        btn_1.setBackground(new java.awt.Color(255, 255, 255));
        btn_1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_1.setText("1");
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_1.setFocusable(false);
        btn_1.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_1.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_1.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 70, 65));

        btn_2.setBackground(new java.awt.Color(255, 255, 255));
        btn_2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_2.setText("2");
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_2.setFocusable(false);
        btn_2.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_2.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_2.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 65));

        btn_3.setBackground(new java.awt.Color(255, 255, 255));
        btn_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_3.setText("3");
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_3.setFocusable(false);
        btn_3.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_3.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_3.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 70, 65));

        btn_suma.setBackground(new java.awt.Color(51, 153, 255));
        btn_suma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(255, 255, 255));
        btn_suma.setText("+");
        btn_suma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_suma.setFocusable(false);
        btn_suma.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_suma.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_suma.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 70, 65));

        btn_0.setBackground(new java.awt.Color(255, 255, 255));
        btn_0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_0.setText("0");
        btn_0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_0.setFocusable(false);
        btn_0.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_0.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_0.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, 65));

        btn_punto.setBackground(new java.awt.Color(255, 255, 255));
        btn_punto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_punto.setText(".");
        btn_punto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_punto.setFocusable(false);
        btn_punto.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_punto.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_punto.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 70, 65));

        btn_igual.setBackground(new java.awt.Color(51, 153, 255));
        btn_igual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setText("=");
        btn_igual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_igual.setFocusable(false);
        btn_igual.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_igual.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_igual.setPreferredSize(new java.awt.Dimension(60, 100));
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 70, 65));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 380));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Jlabel_ventana.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addComponent(Jlabel_ventana)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(Jlabel_ventana)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Estandar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        Jlabel_ventana.setText("");

        decimal = true;
        divicion = false;
        multiplicacion = false;
        suma = false;
        resta = false;
        porcentaje = false;

        numeros[0] = 0;
        numeros[1] = 0;
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_signoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signoActionPerformed
        try {
            double cambio;
            String entero;
            cambio = Double.parseDouble(Jlabel_ventana.getText());
            cambio = cambio * -1;
            if (cambio % 1 == 0) { //123.1 % 1 = 0,1 de resto  % hace diviciones exactas para sacar el resto
                entero = Double.toString(cambio);  //1234,0
                Jlabel_ventana.setText(entero.substring(0, entero.length() - 2)); //1234.0 - 2 = 1234
            } else {
                Jlabel_ventana.setText(Double.toString(cambio));
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_signoActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        try {
            numeros[0] = Double.parseDouble(Jlabel_ventana.getText());
            Jlabel_ventana.setText("");
            porcentaje = true;
            decimal = true;
            controlVentana = false;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_diviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diviActionPerformed
        try {
            numeros[0] = Double.parseDouble(Jlabel_ventana.getText());
            Jlabel_ventana.setText("");
            decimal = true;
            divicion = true;
            controlVentana = false;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_diviActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            Jlabel_ventana.setText(Jlabel_ventana.getText() + "7");
        }
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            Jlabel_ventana.setText(Jlabel_ventana.getText() + "8");
        }
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            Jlabel_ventana.setText(Jlabel_ventana.getText() + "9");
        }
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multActionPerformed
        try {
            numeros[0] = Double.parseDouble(Jlabel_ventana.getText());
            Jlabel_ventana.setText("");
            decimal = true;
            multiplicacion = true;
            controlVentana = false;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_multActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            Jlabel_ventana.setText(Jlabel_ventana.getText() + "4");
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            Jlabel_ventana.setText(Jlabel_ventana.getText() + "5");
        }
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            Jlabel_ventana.setText(Jlabel_ventana.getText() + "6");
        }
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        try {
            numeros[0] = Double.parseDouble(Jlabel_ventana.getText());
            Jlabel_ventana.setText("");
            decimal = true;
            resta = true;
            controlVentana = false;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            Jlabel_ventana.setText(Jlabel_ventana.getText() + "1");
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            Jlabel_ventana.setText(Jlabel_ventana.getText() + "2");
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            Jlabel_ventana.setText(Jlabel_ventana.getText() + "3");
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        try {
            numeros[0] = Double.parseDouble(Jlabel_ventana.getText());
            Jlabel_ventana.setText("");
            suma = true;
            decimal = true;
            controlVentana = false;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            Jlabel_ventana.setText(Jlabel_ventana.getText() + "0");
        }
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        ControlarVentana();
        if(controlVentana == false){
            if (decimal == true) {
                Jlabel_ventana.setText(Jlabel_ventana.getText() + ".");
                decimal = false;
            }
        }
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        double resultado = 0;
        String entero;
        try {
            numeros[1] = Double.parseDouble(Jlabel_ventana.getText());

            if (divicion == true) {
                if (numeros[1] == 0.0) {
                    Jlabel_ventana.setText("Error");
                } else {
                    resultado = numeros[0] / numeros[1];
                    if (resultado % 1 == 0) {
                        entero = Double.toString(resultado);
                        Jlabel_ventana.setText(entero.substring(0, entero.length() - 2));
                    } else {
                        Jlabel_ventana.setText(Double.toString(resultado));
                    }
                }
            } else if (multiplicacion == true) {
                resultado = numeros[0] * numeros[1];
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    Jlabel_ventana.setText(entero.substring(0, entero.length() - 2));
                } else {
                    Jlabel_ventana.setText(Double.toString(resultado));
                }
            } else if (resta == true) {
                resultado = numeros[0] - numeros[1];
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    Jlabel_ventana.setText(entero.substring(0, entero.length() - 2));
                } else {
                    Jlabel_ventana.setText(Double.toString(resultado));
                }
            } else if (suma == true) {
                resultado = numeros[0] + numeros[1];
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    Jlabel_ventana.setText(entero.substring(0, entero.length() - 2));
                } else {
                    Jlabel_ventana.setText(Double.toString(resultado));
                }
            } else if (porcentaje == true) {
                resultado = numeros[1] * (numeros[0] / 100.0);
                if (resultado % 1 == 0) {
                    entero = Double.toString(resultado);
                    Jlabel_ventana.setText(entero.substring(0, entero.length() - 2));
                } else {
                    Jlabel_ventana.setText(Double.toString(resultado));
                }
            }

        } catch (Exception e) {

        }

        decimal = true;
        divicion = false;
        multiplicacion = false;
        suma = false;
        resta = false;
        porcentaje = false;

        numeros[0] = 0;
        numeros[1] = 0;
    }//GEN-LAST:event_btn_igualActionPerformed

    public void ControlarVentana(){
        String ventana = Jlabel_ventana.getText();
        if(ventana.length() > 12){
            controlVentana = true;
        }else{
            controlVentana = false;
        }
    } 
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel_ventana;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_divi;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_signo;
    private javax.swing.JButton btn_suma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}