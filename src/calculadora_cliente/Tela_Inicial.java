package calculadora_cliente;

public class Tela_Inicial extends javax.swing.JFrame {

    public Tela_Inicial() {
    
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Visor_Numeros = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Visor_Resultado = new javax.swing.JTextPane();
        BT_Cinco = new javax.swing.JButton();
        BT_Tres = new javax.swing.JButton();
        BT_Dois = new javax.swing.JButton();
        BT_Quatro = new javax.swing.JButton();
        BT_Oito = new javax.swing.JButton();
        BT_Sete = new javax.swing.JButton();
        BT_Nove = new javax.swing.JButton();
        BT_Seis = new javax.swing.JButton();
        BT_Um = new javax.swing.JButton();
        BT_Ponto = new javax.swing.JButton();
        BT_Zero = new javax.swing.JButton();
        BT_Subtracao = new javax.swing.JButton();
        BT_Divisao = new javax.swing.JButton();
        BT_Multiplicacao = new javax.swing.JButton();
        BT_Soma = new javax.swing.JButton();
        BT_Igualdade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Visor_Numeros.setEditable(false);
        Visor_Numeros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(Visor_Numeros);

        Visor_Resultado.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Visor_Resultado.setForeground(new java.awt.Color(0, 204, 0));
        jScrollPane2.setViewportView(Visor_Resultado);

        BT_Cinco.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Cinco.setText("5");

        BT_Tres.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Tres.setText("3");

        BT_Dois.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Dois.setText("2");

        BT_Quatro.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Quatro.setText("4");

        BT_Oito.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Oito.setText("8");

        BT_Sete.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Sete.setText("7");

        BT_Nove.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Nove.setText("9");

        BT_Seis.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Seis.setText("6");

        BT_Um.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Um.setText("1");
        BT_Um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_UmActionPerformed(evt);
            }
        });

        BT_Ponto.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Ponto.setText(".");

        BT_Zero.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Zero.setText("0");

        BT_Subtracao.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Subtracao.setText("-");

        BT_Divisao.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Divisao.setText("/");

        BT_Multiplicacao.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Multiplicacao.setText("*");

        BT_Soma.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Soma.setText("+");

        BT_Igualdade.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        BT_Igualdade.setText("=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BT_Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BT_Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BT_Um, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BT_Dois, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BT_Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BT_Quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BT_Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BT_Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BT_Sete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BT_Oito, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BT_Nove, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BT_Multiplicacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Subtracao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Divisao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Soma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BT_Igualdade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Sete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Oito, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Nove, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Seis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BT_Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Dois, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Um, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BT_Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BT_Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BT_Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BT_Igualdade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_UmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_UmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_UmActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Cinco;
    private javax.swing.JButton BT_Divisao;
    private javax.swing.JButton BT_Dois;
    private javax.swing.JButton BT_Igualdade;
    private javax.swing.JButton BT_Multiplicacao;
    private javax.swing.JButton BT_Nove;
    private javax.swing.JButton BT_Oito;
    private javax.swing.JButton BT_Ponto;
    private javax.swing.JButton BT_Quatro;
    private javax.swing.JButton BT_Seis;
    private javax.swing.JButton BT_Sete;
    private javax.swing.JButton BT_Soma;
    private javax.swing.JButton BT_Subtracao;
    private javax.swing.JButton BT_Tres;
    private javax.swing.JButton BT_Um;
    private javax.swing.JButton BT_Zero;
    private javax.swing.JTextPane Visor_Numeros;
    private javax.swing.JTextPane Visor_Resultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
