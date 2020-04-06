/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Italo Guilherme - PC
 */
   public class Conexao {
    
    private String DRIVE = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost:3306/Banco";
    private String USER = "root";
    private String PASSWORD = "";
    public Statement stmt;
    public ResultSet rs;
    public Connection conn;
    
    
    public void getConnection(){
        try{
            Class.forName(DRIVE);           
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Conectado ao banco de dados.");
        }catch(Exception e){
            System.out.println("Conexão banco de dados sem sucesso. Modo offline ativo. \n Poderá ocorrer alguns delays.");
        }
    }
    
    
    public void desconecta () {
        try{
            conn.close();
        }catch(Exception e){
            System.out.println("error ao fechar");
        }
    }
    
}
