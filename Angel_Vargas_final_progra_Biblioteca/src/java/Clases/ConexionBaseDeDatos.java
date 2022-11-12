/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* 
    
    Author     : Angel Vargas
*/

package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDeDatos {
    
    private String url="jdbc:mysql://127.0.0.1:3306/biblioteca";//url de MySQL
    private String usuario="root";// usuario de mysql local
    private String clave="Umg$2019";
    private Connection conexion=null;  
    
    public Connection conectar(){   //se creo el metodo conectar
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection( url, usuario,clave);
        }  catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {   
           ex.printStackTrace();
        }         
        return conexion;        
    }
    
}
