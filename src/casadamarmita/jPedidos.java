package casadamarmita;

import javax.swing.JOptionPane;

/**
 *
 * @author felipeborges
 */
public class jPedidos extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public int jPedidos(int a) {
        initComponents();
        confirmacao.setVisible(false);
        return a;     
    }
    
    public String Teste(String args[]){

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        int a = 5;
        int b = 5;
        int c = 5;
        int d = 5;
        int e = 0;
        int resultado = 0;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
                resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;
        resultado = a + b; c = resultado * d; resultado = c + a; e = resultado;

        //</editor-fold>

        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        confirmacao = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        subtotal = new javax.swing.JLabel();
        taxa = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pedido = new javax.swing.JLabel();
        painelPedido = new javax.swing.JPanel();
        pequena = new javax.swing.JRadioButton();
        media = new javax.swing.JRadioButton();
        grande = new javax.swing.JRadioButton();
        arroz = new javax.swing.JCheckBox();
        feijao = new javax.swing.JCheckBox();
        carne = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        confirmaPedido = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        confirmacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Confirme seu pedido"));

        jLabel3.setText("Subtotal:");

        jLabel4.setText("Taxa:");

        jLabel5.setText("Total:");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        subtotal.setText("jLabel6");

        taxa.setText("jLabel7");

        total.setText("jLabel8");

        jLabel6.setText("Sua marmita:");

        pedido.setText("jLabel7");

        javax.swing.GroupLayout confirmacaoLayout = new javax.swing.GroupLayout(confirmacao);
        confirmacao.setLayout(confirmacaoLayout);
        confirmacaoLayout.setHorizontalGroup(
            confirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(confirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmacaoLayout.createSequentialGroup()
                        .addGroup(confirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(confirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(confirmacaoLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(65, 65, 65)
                                .addComponent(jButton2))
                            .addComponent(subtotal)
                            .addComponent(taxa)
                            .addComponent(total)))
                    .addComponent(jLabel6)
                    .addComponent(pedido))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        confirmacaoLayout.setVerticalGroup(
            confirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(confirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(subtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(taxa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(confirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(total))
                .addGap(50, 50, 50)
                .addGroup(confirmacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(25, 25, 25))
        );

        painelPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(pequena);
        pequena.setText("Pequena");

        buttonGroup1.add(media);
        media.setText("Media");
        media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaActionPerformed(evt);
            }
        });

        buttonGroup1.add(grande);
        grande.setText("Grande");

        arroz.setText("Arroz");

        feijao.setText("Feijão");

        carne.setText(" Carne");

        jLabel1.setText("Selecione a quantidade de marmita que deseja: ");

        confirmaPedido.setText("OK");
        confirmaPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmaPedidoMouseClicked(evt);
            }
        });
        confirmaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPedidoLayout = new javax.swing.GroupLayout(painelPedido);
        painelPedido.setLayout(painelPedidoLayout);
        painelPedidoLayout.setHorizontalGroup(
            painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedidoLayout.createSequentialGroup()
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPedidoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pequena)
                            .addComponent(arroz))
                        .addGap(84, 84, 84)
                        .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPedidoLayout.createSequentialGroup()
                                .addComponent(feijao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(carne))
                            .addGroup(painelPedidoLayout.createSequentialGroup()
                                .addComponent(media)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(grande)))))
                .addGap(45, 45, 45))
            .addGroup(painelPedidoLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(confirmaPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPedidoLayout.setVerticalGroup(
            painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pequena)
                    .addComponent(media)
                    .addComponent(grande))
                .addGap(34, 34, 34)
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arroz)
                    .addComponent(feijao)
                    .addComponent(carne))
                .addGap(37, 37, 37)
                .addGroup(painelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(confirmaPedido)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public void limpaCampos(){
    
        feijao.setSelected(false);
        carne.setSelected(false);
        arroz.setSelected(false);
        pequena.setSelected(false);
        media.setSelected(false);
        grande.setSelected(false);
        quantidade.setText("");
    
        
    }
    
    
    private void confirmaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaPedidoActionPerformed
        Pedido ped = new Pedido();
        
        if (arroz.isSelected())
            ped.setArroz(true);
        if (feijao.isSelected())
            ped.setFeijao(true);
        if (carne.isSelected())
            ped.setCarne(true);
        if (pequena.isSelected())
            ped.setTamanho("Pequeno");
        if (media.isSelected())
            ped.setTamanho("Media");
        if (grande.isSelected())
            ped.setTamanho("Grande");
        
        ped.setQuantidade(Integer.parseInt(quantidade.getText()));
        
        confirmacao.setVisible(true);
        painelPedido.setEnabled(false);
        
        pedido.setText(ped.listaPedido());
        subtotal.setText("R$ " + ped.calculaSubTotal(ped.getTamanho(),ped.getQuantidade()));
        taxa.setText("R$ 5.00");
        total.setText("R$ " + ped.calculaTotal(ped.getValor()));
        

        
    }//GEN-LAST:event_confirmaPedidoActionPerformed

    private void mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediaActionPerformed

    private void confirmaPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmaPedidoMouseClicked
        //jRelatorio conta = new jRelatorio();
        //conta.setVisible(true);
        //dispose();
    }//GEN-LAST:event_confirmaPedidoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        confirmacao.setVisible(false);
        painelPedido.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        confirmacao.setVisible(false);
        painelPedido.setEnabled(true);
        limpaCampos();
        JOptionPane.showMessageDialog(null, "Obrigado por seu pedido");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(jPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox arroz;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox carne;
    private javax.swing.JButton confirmaPedido;
    private javax.swing.JPanel confirmacao;
    private javax.swing.JCheckBox feijao;
    private javax.swing.JRadioButton grande;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton media;
    private javax.swing.JPanel painelPedido;
    private javax.swing.JLabel pedido;
    private javax.swing.JRadioButton pequena;
    private javax.swing.JTextField quantidade;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel taxa;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
