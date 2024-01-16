/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.messenger.desktop;



import edu.messenger.client.ComMyMessengerClient;
import edu.messenger.client.UpdateMyMessengerClient;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ebertonsm
 */
public class MyMessengerClient extends javax.swing.JFrame {

    private String ipCnn = "";
    private String nickName = "";
    private ComMyMessengerClient comMyMessegerClient = null;
    private UpdateMyMessengerClient updateMyMessengerClient = null;

    /**
     * Creates new form MyMessenger
     */
    public MyMessengerClient() {
        initComponents();

        inicializarVariaveis();
    }

    public void inicializarVariaveis() {

        comMyMessegerClient = null;
        updateMyMessengerClient = null;

        taConversas.setEditable(false);
        taMensagem.setEditable(false);
        btEnviar.setEnabled(false);

        this.setTitle("My Messenger");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taConversas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taMensagem = new javax.swing.JTextArea();
        btEnviar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taConversas.setEditable(false);
        taConversas.setColumns(20);
        taConversas.setRows(5);
        jScrollPane1.setViewportView(taConversas);

        taMensagem.setEditable(false);
        taMensagem.setColumns(20);
        taMensagem.setRows(5);
        jScrollPane2.setViewportView(taMensagem);

        btEnviar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEnviar.setText("Enviar");
        btEnviar.setEnabled(false);
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Conectar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Desconectar");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Sair");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void conectarAoServidor(String ipCnn, String nickName) {
        int error1, error2;
        comMyMessegerClient = new ComMyMessengerClient(ipCnn, nickName);
        error1 = comMyMessegerClient.conectar();

        updateMyMessengerClient = new UpdateMyMessengerClient(ipCnn, this);
        error2 = updateMyMessengerClient.conectar();

        if (error1 != 0 || error2 != 0) {
            JOptionPane.showMessageDialog(this, "A conex�o n�o pode ser estabelecida. "
                    + "\nVerifique o endere�o IP digitado.");
        } else {
            String msgCnn = nickName + ", conex�o realizada com sucesso.";
            String titleForm = "My Messenger - User: " + nickName;

            this.setTitle(titleForm);
            JOptionPane.showMessageDialog(this, msgCnn);
            iniciarConversacao();
        }
    }

    public void iniciarConversacao() {

        taConversas.setEditable(false);
        taMensagem.setEditable(true);
        btEnviar.setEnabled(true);
    }
    
    public void atualizarConversas(String nickName, String msg) {
        
        taConversas.append(nickName + ": " + msg + "\n");

    }

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed

        int error;

        error = comMyMessegerClient.enviar(taMensagem.getText());
        taMensagem.setText("");
        if (error != 0) {
            JOptionPane.showMessageDialog(this, 
                    "Erro ao tentar se conectar ao servidor.");
        }
    }//GEN-LAST:event_btEnviarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ipCnn = JOptionPane.showInputDialog(this, "Digite o IP de conex�o:");
        nickName = JOptionPane.showInputDialog(this, "Digite o seu Nick Name:");
        if (ipCnn != null) {
            conectarAoServidor(ipCnn, nickName);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MyMessengerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyMessengerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyMessengerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyMessengerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyMessengerClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea taConversas;
    private javax.swing.JTextArea taMensagem;
    // End of variables declaration//GEN-END:variables
}
