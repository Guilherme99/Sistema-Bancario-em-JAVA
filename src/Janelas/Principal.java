/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;
import Banco.*;
import Classes.*;

/**
 *
 * @author Italo Guilherme - PC
 */
public class Principal {
    public static void main(String [] args){
        ContaCorrente contaCorrenteA = new ContaCorrente();
        ContaPoupanca contaPoupancaA = new ContaPoupanca();
        Relatorio obRelatorioA = new Relatorio();
        
        // System.out.println("-----------------------------"); 
        
        
        // System.out.println("Saldo conta poupança: "+contaPoupancaA.getSaldo());
        //System.out.println("------------SALDO POUPANÇA COM SAQUE-----------------");
        //System.out.println("Saldo conta poupança: "+contaPoupancaA.Sacar(500));
        //System.out.println("Limite: "+ContaPoupanca.limite);
        
        //System.out.println("-------------RELATÓRIO----------------");
        //System.out.println(obRelatorioA.GerarRelatorio(contaPoupancaA.MostrarDados()));
        
        //System.out.println("saldo antes da transf:"+contaCorrenteA.getSaldo());
        //System.out.println("Conta corrente:"+contaPoupancaA.Transferir(150, contaCorrenteA));
        //System.out.println("Saque conta corrente: "+contaCorrenteA.Sacar(400));
        //System.out.println("Conta corrente:"+contaPoupancaA.Transferir(100, contaCorrenteA));
        //System.out.println("Saldo conta poupança: "+contaPoupancaA.getSaldo());
        
        Inicio jf = new Inicio();
        jf.setVisible(true);
        
        
        
    }

}
    