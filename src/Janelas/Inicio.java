/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;
import BD.Conexao;
import Banco.*;
import Classes.*;
import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Italo Guilherme - PC
 */
public class Inicio extends javax.swing.JFrame{
    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setName("menu"); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Escolha uma opção:");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setText("1 - Criar Conta");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel3.setText("2 - Procurar Conta");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel4.setText("3 - Apagar Conta");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel5.setText("4 - Gerar relatório ");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel6.setText("0 - Sair");

        campo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campo1FocusGained(evt);
            }
        });
        campo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campo1MouseClicked(evt);
            }
        });

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo1MouseClicked
        // TODO add your handling code here:
        campo1.setText("");
    }//GEN-LAST:event_campo1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int opcao = Integer.parseInt(campo1.getText());
        
        switch(opcao){
            case 1:
                this.setVisible(false);
                new Cadastro().setVisible(true);
            break;
            case 2:
                int conta = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE O NUMERO DA CONTA:"));
                
                Object retorno = Banco.ProcurarConta(conta);
                
                if(retorno!=null){
                    String menu [] = { "1 - DEPOSITAR  ", "2 - SACAR", "3 - TRANSFERIR", "4 - GERAR RELATORIO", "0 - VOLTAR" };
                    
                    int opcao2;
                    do{
                       opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null, menu,"Digite sua opção ",JOptionPane.WARNING_MESSAGE));

                    }while(opcao2<1 && opcao2>4);
                switch(opcao2){
                    case 1:
                        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null,"DIGITE O VALOR R$:","DEPOSITO",JOptionPane.INFORMATION_MESSAGE));
                        if(retorno instanceof ContaCorrente){
                                ((ContaCorrente) retorno).depositar(deposito);
                                Banco.atualizarSaldo(conta, ((ContaCorrente) retorno).getSaldo());
                                
                                JOptionPane.showMessageDialog(null, "Novo saldo:"+((ContaCorrente) retorno).getSaldo());
                        }else if(retorno instanceof ContaPoupanca){
                                ((ContaPoupanca) retorno).depositar(deposito);
                                Banco.atualizarSaldo(conta, ((ContaPoupanca) retorno).getSaldo());
                                JOptionPane.showMessageDialog(null, "Novo saldo:"+((ContaPoupanca) retorno).getSaldo());
                        }
                    break;
                    case 2:
                        double saque = Double.parseDouble(JOptionPane.showInputDialog(null,"DIGITE O VALOR R$:","SAQUE",JOptionPane.INFORMATION_MESSAGE));
                        if(retorno instanceof ContaCorrente){
                                ((ContaCorrente) retorno).sacar(saque);
                                Banco.atualizarSaldo(conta, ((ContaCorrente) retorno).getSaldo());
                                JOptionPane.showMessageDialog(null, "Novo saldo:"+((ContaCorrente) retorno).getSaldo());
                        }else if(retorno instanceof ContaPoupanca){
                                ((ContaPoupanca) retorno).sacar(saque);
                                 Banco.atualizarSaldo(conta, ((ContaPoupanca) retorno).getSaldo());
                                JOptionPane.showMessageDialog(null, "Novo saldo:"+((ContaPoupanca) retorno).getSaldo());
                        }
                    break;
                    case 3:
                        int contaTransferir = (Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE O NUMERO DA CONTA DESTINATÁRIA:","TRANSFERIR",JOptionPane.INFORMATION_MESSAGE)));
                        
                        if(Banco.ProcurarConta(contaTransferir)!=null){
                            double transferir = Double.parseDouble(JOptionPane.showInputDialog(null,"DIGITE O VALOR R$:","SAQUE",JOptionPane.INFORMATION_MESSAGE));
                            if(retorno instanceof ContaCorrente){
                                ((ContaCorrente) retorno).transferir(transferir,retorno , Banco.ProcurarConta(contaTransferir));
                                Banco.atualizarSaldo(conta, ((ContaCorrente) retorno).getSaldo()); 
                                Banco.atualizarSaldo(contaTransferir, Banco.ProcurarConta(contaTransferir).getSaldo());
                                JOptionPane.showMessageDialog(null, "TRANSFERÊNCIA EFETUADA!");
                            }else if(retorno instanceof ContaPoupanca){
                                ((ContaPoupanca) retorno).transferir(transferir, retorno, Banco.ProcurarConta(contaTransferir));
                                 Banco.atualizarSaldo(conta, ((ContaPoupanca) retorno).getSaldo());
                                 Banco.atualizarSaldo(contaTransferir, Banco.ProcurarConta(contaTransferir).getSaldo());
                                JOptionPane.showMessageDialog(null, "TRANSFERÊNCIA EFETUADA!");
                            }
                        }
                        else{
                                JOptionPane.showMessageDialog(null, "TRANSFERÊNCIA NÃO EFETUADA! \nCONTA DESTINATÁRIA NÃO EXISTE.");
                        }
                    break;
                    case 4:
                        if(retorno instanceof ContaCorrente){
                                JOptionPane.showMessageDialog(null, ((ContaCorrente) retorno).MostrarDados());
                        }else if(retorno instanceof ContaPoupanca){
                                JOptionPane.showMessageDialog(null, ((ContaPoupanca) retorno).MostrarDados());
                        }
                        
                    break;
                    case 0:
                        JOptionPane.showMessageDialog(null,"SAINDO...","ERROR",JOptionPane.WARNING_MESSAGE);
                        


                    break;
                    default:
                        JOptionPane.showMessageDialog(null,"SELECIONE NOVAMENTE","ERROR",JOptionPane.ERROR_MESSAGE);
                        
                    break;
                }
                
                
                
                }else{
                    JOptionPane.showMessageDialog(null, "CONTA INEXISTENTE!");
                }
                

                
            break;
            case 3:
                int apagar = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITE O NÚMERO DA CONTA:","INFORME",JOptionPane.INFORMATION_MESSAGE));
                Object contaApagar = Banco.ProcurarConta(apagar);
                if(contaApagar!=null){
                    Banco.ApagarConta(apagar);
                    Banco.deletarConta(apagar);
                    JOptionPane.showMessageDialog(null, "CONTA "+apagar+" APAGADA!");
                }else{
                    JOptionPane.showMessageDialog(null, "CONTA INEXISTENTE.");
                }
            break;
            case 4:
                Banco.MostrarTodosDados();
            break;
            default:
                JOptionPane.showMessageDialog(null,"SAINDO","XXX",JOptionPane.ERROR_MESSAGE);
                this.dispose();
            break;
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campo1FocusGained
        // TODO add your handling code here:
        campo1.setText("");
    }//GEN-LAST:event_campo1FocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Banco.carregarDados();
           
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
