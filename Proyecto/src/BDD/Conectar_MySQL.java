/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Navarro
 */
public class Conectar_MySQL {
    public String db="Habitaciones";
    public String url="jdbc:mysql://127.0.0.1/" +db;
    public String user="root";
    public String pass="root";

    public Conectar_MySQL() {
    }
       
    public Connection conectar(){
        Connection link=null;
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            
        }    
        
        return link;
    }

    
    
}

       
        