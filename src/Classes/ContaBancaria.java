/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Banco.Banco;


import javax.swing.JOptionPane;

/**
 *
 * @author Italo Guilherme - PC
 */
public abstract class ContaBancaria{
    private int numeroConta;
    private double saldo;
    
    public abstract void sacar(double valor);
    
    public abstract void depositar(double valor);
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
     public void transferir(double valor, Object contaAtual, Object contaRecebe){
        if(contaAtual instanceof ContaCorrente){
            ((ContaCorrente) contaAtual).sacar(valor);
            if(contaRecebe instanceof ContaCorrente){
                ((ContaCorrente) contaRecebe).depositar(valor);
            }else if(contaRecebe instanceof ContaPoupanca){
                ((ContaPoupanca) contaRecebe).depositar(valor);
            }
        }else if(contaAtual instanceof ContaPoupanca){
            ((ContaPoupanca) contaAtual).sacar(valor);
            if(contaRecebe instanceof ContaPoupanca){
                ((ContaPoupanca) contaRecebe).depositar(valor);
            }else if(contaRecebe instanceof ContaCorrente){
                ((ContaCorrente) contaRecebe).depositar(valor);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "TRANSFERÊNCIA NÃO EFETUADA! TENTE NOVAMENTE.");
        }
    
}
     
}
