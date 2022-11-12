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


public class  ArrayLibro {
    LibroClase[] tablaCliente;
    int indiceArray;
    private ConexionBaseDeDatos conectorBD;
    private Connection conexion;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
    public ArrayLibro(){
        this.tablaCliente = new LibroClase[100];
        this.indiceArray=0;
    }
    
    public void guardarCliente(LibroClase cliente){
        this.tablaCliente[this.indiceArray]=cliente;  
        this.indiceArray=this.indiceArray+1;
        // procedimiento para almacenar en la Base de Datos
    }
    
    public LibroClase[] getClientes(){
        return this.tablaCliente;
    }
    
    public void abrirConexion(){
        conectorBD= new ConexionBaseDeDatos();
        conexion=conectorBD.conectar();
    }    
   
    
    public String guardarCliente2(LibroClase cliente){        
        String sql = "INSERT INTO biblioteca.libro(numero_libro, nombre_libro, pasta, editorial, publicacion, genero_idOtros) ";
             sql += " VALUES(?,?,?,?,?,?)";              
       try{     
            abrirConexion();
            statement = conexion.prepareStatement(sql); 
            statement.setInt(1, cliente.getCodigo());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getCorreo());
            statement.setString(4, cliente.getDireccion());
            statement.setString(5, cliente.getTelefono());
            statement.setInt(6, cliente.getTipo());
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
    
    public void getClientes2(StringBuffer respuesta){   
        String sql="select * from biblioteca.libro";
        try{
        abrirConexion();
        respuesta.setLength(0);       
        statement= conexion.prepareStatement(sql);                        
        result = statement.executeQuery();            
            if (result!=null){
                while (result.next()){
                respuesta.append("<tr>");
                respuesta.append("<td >").append(result.getString("numero_libro")).append("</td>");
                respuesta.append("<td >").append(result.getString("nombre_libro")).append("</td>");
                respuesta.append("<td >").append(result.getString("editorial")).append("</td>");
                respuesta.append("<td >").append(result.getString("publicacion")).append("</td>");
                respuesta.append("<td >").append(result.getString("pasta")).append("</td>");
                respuesta.append("<td id=\"").append(result.getString("numero_libro"))
                        .append("\"  onclick=\"eliminarCliente(this.id);\">") 
                         //.append("\"  onclick=\"eliminarAlumno("+result.getString("numero_carne")+");\">") 
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
    
    public String eliminarCliente(int carne){        
        String sql = "DELETE FROM libro WHERE numero_libro="+carne;              
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

