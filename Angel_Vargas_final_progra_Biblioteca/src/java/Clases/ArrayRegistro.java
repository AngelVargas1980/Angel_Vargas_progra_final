/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* 
    
    Author     : Angel Vargas
*/


public class ArrayRegistro {
    RegistroClase[] tablaUsuario;
    int indiceArray;
    private ConexionBaseDeDatos conectorBD;
    private Connection conexion;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
    public ArrayRegistro(){
        this.tablaUsuario = new RegistroClase[100];
        this.indiceArray=0;
    }
    
    public void guardarUsuario(RegistroClase usuario){
        this.tablaUsuario[this.indiceArray]=usuario;  
        this.indiceArray=this.indiceArray+1;
        // procedimiento para almacenar en la Base de Datos
    }
    
    public RegistroClase[] getUsuarios(){
        return this.tablaUsuario;
    }
    
    public void abrirConexion(){
        conectorBD= new ConexionBaseDeDatos();
        conexion=conectorBD.conectar();
    }    


public String guardarUsuario2(RegistroClase usuario){        
        String sql = "INSERT INTO biblioteca.registro_usuario(numero_usuario, nombre_usuario, correo, telefono)";
             sql += " VALUES(?,?,?,?)";              
       try{     
            abrirConexion();
            statement = conexion.prepareStatement(sql); 
            statement.setInt(1, usuario.getCodigoUsuario());
            statement.setString(2, usuario.getNombreUsuario());
            statement.setString(3, usuario.getCorreo());
            statement.setString(4, usuario.getTelefono());
            int resultado = statement.executeUpdate(); 
                if(resultado > 0){
                    return String.valueOf(resultado);
                }else{
                    return String.valueOf(resultado);
                }
        }catch(SQLException e){ 
            return e.getMessage();
        }
    }
    

    public void getUsuarios2(StringBuffer respuesta){   
        String sql="select * from biblioteca.registro_usuario";
        try{
        abrirConexion();
        respuesta.setLength(0);       
        statement= conexion.prepareStatement(sql);                        
        result = statement.executeQuery();            
            if (result!=null){
                while (result.next()){
                respuesta.append("<tr>");
                respuesta.append("<td >").append(result.getString("numero_usuario")).append("</td>");
                respuesta.append("<td >").append(result.getString("nombre_usuario")).append("</td>");
                respuesta.append("<td >").append(result.getString("correo")).append("</td>");
                respuesta.append("<td >").append(result.getString("telefono")).append("</td>");
                
                respuesta.append("<td id=\"").append(result.getString("numero_usuario"))
                        .append("\"  onclick=\"eliminarUsuario(this.id);\">") 
                          
                        .append(" <a class=\"btn btn-warning\"'><i class=\"fas fa-edit\"></i>  </a>"
                                +" <a class=\"btn btn-danger\"'> <i class=\"fas fa-trash-alt\"></i> </a>"
                                + " <td></tr>");
                }
            }else{
                respuesta.append("error al consultar");
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public String eliminarUsuario(int carne){        
        String sql = "DELETE FROM registro_usuario WHERE numero_usuario="+carne;              
       try{     
            abrirConexion();
            statement = conexion.prepareStatement(sql); 
            int resultado = statement.executeUpdate();
            if(resultado > 0){
                return String.valueOf(resultado);
            }else{
                return String.valueOf(resultado);
            }
        }catch(SQLException e){ 
            return e.getMessage();
        }
    }
    
    
}
