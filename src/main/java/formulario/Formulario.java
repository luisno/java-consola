package formulario;

import clases.Persona;

import javax.swing.*;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnSendInformacion = new javax.swing.JButton();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lblMayorEdad = new javax.swing.JLabel();
        imprimirInformacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnSendInformacion.setText("Imprimir Informacion");
        btnSendInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendInformacionActionPerformed(evt);
            }
        });
        btnSendInformacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnSendInformacionKeyReleased(evt);
            }
        });

        lblEdad.setText("Edad");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        lblSexo.setText("Sexo");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"H", "M"}));

        lblPeso.setText("Peso");

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        lblAltura.setText("Altura");

        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaKeyTyped(evt);
            }
        });

        lblMayorEdad.setForeground(new java.awt.Color(0, 0, 153));

        imprimirInformacion.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setText("cm");

        jLabel2.setText("kg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imprimirInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 238, Short.MAX_VALUE)
                                                                .addComponent(btnSendInformacion))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblNombre)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtNombre)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lblEdad)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblSexo)
                                                .addGap(18, 18, 18)
                                                .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblPeso)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addGap(29, 29, 29)
                                                .addComponent(lblAltura)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(lblMayorEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNombre)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEdad)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSexo)
                                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPeso)
                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAltura)
                                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(btnSendInformacion)
                                .addGap(18, 18, 18)
                                .addComponent(lblMayorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imprimirInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void btnSendInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendInformacionActionPerformed
        // TODO add your handling code here:
        accionesFormulario();

    }//GEN-LAST:event_btnSendInformacionActionPerformed

    public void accionesFormulario(){
        boolean formularioValido = validarFormulario();
        if (formularioValido) {
            Persona persona = new Persona(
                    txtNombre.getText(),
                    Integer.parseInt(txtEdad.getText()),
                    (String) comboSexo.getSelectedItem(),
                    Double.parseDouble(txtPeso.getText()),
                    Double.parseDouble(txtAltura.getText()));

            imprimirInformacion.setText(persona.toString());


            imprimirMensajeMayorOmenor(persona.esMayorDeEdad());
            enviarMensajeIndiceMasaCorporal(persona.calcularIMC());
        }
    }

    private void imprimirMensajeMayorOmenor(boolean mayorOMenor){
        if(mayorOMenor){
            lblMayorEdad.setText("La persona es mayor de edad.");
        } else {
            lblMayorEdad.setText("La persona no es mayor de edad");
        }
    }

    private void enviarMensajeIndiceMasaCorporal(int imc){
        if (imc == -1){
            JOptionPane.showMessageDialog(null, "La persona esta por debajo de su peso");
        } else if(imc == 0){
            JOptionPane.showMessageDialog(null, "La persona esta en su peso ideal");
        } else {
            JOptionPane.showMessageDialog(null, "La persona esta en sobre peso");
        }
    }

    private boolean validarFormulario() {
        if(!imPrimirMensajeErrorInput(txtNombre.getText(), lblNombre.getText())){
            return false;
        }
        if(!imPrimirMensajeErrorInput(txtEdad.getText(), lblEdad.getText())){
            return false;
        }
        if(!imPrimirMensajeErrorInput(txtPeso.getText(), lblPeso.getText())){
            return false;
        }
        return imPrimirMensajeErrorInput(txtAltura.getText(), lblAltura.getText());
    }

    private boolean imPrimirMensajeErrorInput(String valorInput, String nameLbl){
        String labelSinCaracter = nameLbl.replace(":", "");
        if(valorInput.equals("")) {
            JOptionPane.showMessageDialog(null, "Debes ingresar datos en el campo "+ labelSinCaracter, "Dato "+ labelSinCaracter + " requerido", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void txtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        if((key<'0' || key>'9')) evt.consume();

        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) evt.consume();

    }//GEN-LAST:event_txtAlturaKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        // TODO add your handling code here:
        char []p={'1','2','3','4','5','6','7','8','9','0','.'};
        int b=0;
        for(int i=0;i<=10;i++){
            if (p[i]==evt.getKeyChar()){b=1;}

        }
        if(b==0){evt.consume();  getToolkit().beep(); }
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) evt.consume();
    }//GEN-LAST:event_txtEdadKeyTyped

    private void btnSendInformacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSendInformacionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendInformacionKeyReleased

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendInformacion;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel imprimirInformacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblMayorEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
