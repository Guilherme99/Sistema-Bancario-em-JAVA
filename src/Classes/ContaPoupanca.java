/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Banco.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Italo Guilherme - PC
 */
public class ContaPoupanca extends ContaBancaria implements MostrarDados{
    static double limite = -3000;

    
    @Override
    public void depositar(double valor){
        this.setSaldo(this.getSaldo()+valor);
    }

    @Override
    public String MostrarDados() {
        return "Número da conta: "+this.getNumeroConta()+"\n"+"Saldo da conta: "+this.getSaldo()+"\n"+"Limite: "+((this.getSaldo()>0)?(-this.limite):(-this.limite+(this.getSaldo())));
        
    }

    @Override
    public void sacar(double valor) {
        if(((this.getSaldo()-valor) >= this.limite)){
            
            this.setSaldo(this.getSaldo() - valor);
            
            
        }else{ 
            JOptionPane.showMessageDialog(null, "Limite excedito! Limite disponível para saque: "+((-this.limite) + this.getSaldo()));
        }
    }
    
}
