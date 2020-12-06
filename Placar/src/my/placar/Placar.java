package my.placar;

/*@author Bryan
Mat: 1868469-5
*/
public class Placar extends javax.swing.JFrame {

    public Placar() { 
        initComponents();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        placarA = new javax.swing.JTextField();
        placarB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pontosA = new javax.swing.JTextField();
        pontosB = new javax.swing.JTextField();
        Mais3A = new javax.swing.JButton();
        Mais1A = new javax.swing.JButton();
        Menos1A = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Mais3B = new javax.swing.JButton();
        Mais1B = new javax.swing.JButton();
        Menos1B = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Rodada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Vencedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        placarA.setText("0");

        placarB.setText("0");

        jLabel1.setText("Equipe A");

        jLabel2.setText("Equipe B");

        pontosA.setText("0");
        pontosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontosAActionPerformed(evt);
            }
        });

        pontosB.setText("0");

        Mais3A.setText("+3 Pontos");
        Mais3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mais3AActionPerformed(evt);
            }
        });

        Mais1A.setText("+1 Ponto");
        Mais1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mais1AActionPerformed(evt);
            }
        });

        Menos1A.setText("-1 Ponto");
        Menos1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos1AActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Mais3B.setText("+3 Pontos");
        Mais3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mais3BActionPerformed(evt);
            }
        });

        Mais1B.setText("+1 Ponto");
        Mais1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mais1BActionPerformed(evt);
            }
        });

        Menos1B.setText("-1 Ponto");
        Menos1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos1BActionPerformed(evt);
            }
        });

        jLabel3.setText("Placar Geral");

        jLabel4.setText("Pontuação");

        Rodada.setText("1");

        jLabel5.setText("Rodada");

        Vencedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VencedorActionPerformed(evt);
            }
        });

        jLabel6.setText("Vencedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Mais1A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Mais3A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Menos1A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Rodada, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(placarA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pontosA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reset)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Mais3B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mais1B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Menos1B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(placarB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(pontosB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Vencedor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placarB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pontosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pontosB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rodada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(22, 22, 22)
                .addComponent(Vencedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mais3A)
                            .addComponent(Mais3B))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mais1A)
                            .addComponent(Mais1B)))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Menos1A)
                    .addComponent(Menos1B)
                    .addComponent(Reset))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int num, result, resultA, resultB, numA, numB, rodada;
    
    private void Mais3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mais3AActionPerformed
        Vencedor.setText("");
        num = Integer.parseInt(pontosA.getText());
        result = num + 3;
        pontosA.setText(String.valueOf(result));
         
        rodada = Integer.parseInt(Rodada.getText());
        numA = Integer.parseInt(pontosA.getText());
        
        if(numA >= 12) {
            ganhouPontoA();
            if(rodada > 3){
            quemVenceu();
            resetarTudo();
            }
        }
    }//GEN-LAST:event_Mais3AActionPerformed
      
    private void Mais3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mais3BActionPerformed
        Vencedor.setText("");
        num = Integer.parseInt(pontosB.getText());
        result = num + 3;
        pontosB.setText(String.valueOf(result));
        
        rodada = Integer.parseInt(Rodada.getText());
        numB = Integer.parseInt(pontosB.getText());
              
        if(numB >= 12) {
           ganhouPontoB();
           if(rodada > 3){
            quemVenceu();
            resetarTudo();
            }
        }
    }//GEN-LAST:event_Mais3BActionPerformed

    private void Mais1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mais1AActionPerformed
        Vencedor.setText("");
        num = Integer.parseInt(pontosA.getText());
        result = num + 1;
        pontosA.setText(String.valueOf(result));
        
        rodada = Integer.parseInt(Rodada.getText());
        numA = Integer.parseInt(pontosA.getText());
        
        if(numA >= 12) {
            ganhouPontoA();
            if(rodada > 3){
            quemVenceu();
            resetarTudo();
            }
        }
    }//GEN-LAST:event_Mais1AActionPerformed

    private void Menos1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos1AActionPerformed
        if(num >0){
        num = Integer.parseInt(pontosA.getText());
        result = num - 1;
        pontosA.setText(String.valueOf(result));
        }
    }//GEN-LAST:event_Menos1AActionPerformed

    private void Mais1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mais1BActionPerformed
        Vencedor.setText("");
        num = Integer.parseInt(pontosB.getText());
        result = num + 1;
        pontosB.setText(String.valueOf(result));
        
        rodada = Integer.parseInt(Rodada.getText());
        numB = Integer.parseInt(pontosB.getText());
        
        if(numB >= 12) {
            ganhouPontoB();
            if(rodada > 3){
            quemVenceu();
            resetarTudo();
            }
        }
    }//GEN-LAST:event_Mais1BActionPerformed

    private void Menos1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos1BActionPerformed
        num = Integer.parseInt(pontosB.getText());
        if(num >0){
        result = num - 1;
        pontosB.setText(String.valueOf(result));
        }
    }//GEN-LAST:event_Menos1BActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        resetarTudo();
    }//GEN-LAST:event_ResetActionPerformed
    private void ganhouPontoA() {
            resultA = Integer.parseInt(placarA.getText());
            resultA = resultA + 1;
            placarA.setText(Integer.toString(resultA));
            numA = 0;
            numB = 0;
            pontosA.setText(String.valueOf(numA));
            pontosB.setText(String.valueOf(numB));
            rodada +=1;
            Rodada.setText(String.valueOf(rodada));
    }
    
    private void ganhouPontoB() {
            resultB = Integer.parseInt(placarB.getText());
            resultB = resultB + 1;
            placarB.setText(Integer.toString(resultB));
            numA = 0;
            numB = 0;
            pontosA.setText(String.valueOf(numA));
            pontosB.setText(String.valueOf(numB));
            rodada +=1;
            Rodada.setText(String.valueOf(rodada));
    }
    
    private void quemVenceu() {
            resultA = Integer.parseInt(placarA.getText());
            resultB = Integer.parseInt(placarB.getText());
            if(resultA > resultB){
                Vencedor.setText("Equipe A");
            } else {
                Vencedor.setText("Equipe B");
            }
            placarA.setText("0");
            placarB.setText("0");
    }
    
    private void resetarTudo(){
        numA = 0;
        numB = 0;
        rodada = 1;
        placarA.setText(String.valueOf(numA));
        placarB.setText(String.valueOf(numB));
        Rodada.setText (String.valueOf(rodada));
        pontosA.setText(String.valueOf(numA));
        pontosB.setText(String.valueOf(numB));
    }
    private void pontosAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontosAActionPerformed
         
    }//GEN-LAST:event_pontosAActionPerformed

    private void VencedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VencedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VencedorActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Placar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Placar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Placar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Placar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Placar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mais1A;
    private javax.swing.JButton Mais1B;
    private javax.swing.JButton Mais3A;
    private javax.swing.JButton Mais3B;
    private javax.swing.JButton Menos1A;
    private javax.swing.JButton Menos1B;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField Rodada;
    private javax.swing.JTextField Vencedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField placarA;
    private javax.swing.JTextField placarB;
    private javax.swing.JTextField pontosA;
    private javax.swing.JTextField pontosB;
    // End of variables declaration//GEN-END:variables
}
