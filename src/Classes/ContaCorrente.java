/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Banco.*;

/**
 *
 * @author Italo Guilherme - PC
 */
public class ContaCorrente extends ContaBancaria implements MostrarDados{
    static double taxaOperacao = 8;

    @Override
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - (valor + (taxaOperacao/100)));
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor - (taxaOperacao/100));  
    }

    @Override
    public String MostrarDados() {
        return "Número da conta: "+this.getNumeroConta()+"\n "+"Saldo da conta: "+this.getSaldo()+"\n"+"Taxa de Operação: "+this.taxaOperacao;
        
    }
}
