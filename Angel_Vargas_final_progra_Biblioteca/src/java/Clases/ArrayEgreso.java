/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Angel Vargas
 */
public class ArrayEgreso {
    EgresoClase[] tablaEgreso;
    int indiceArray;
    private ConexionBaseDeDatos conectorBD;
    private Connection conexion;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
    public ArrayEgreso(){
        this.tablaEgreso = new EgresoClase[100];
        this.indiceArray=0;
    }
    
    public void guardarEgreso(EgresoClase egreso){
        this.tablaEgreso[this.indiceArray]=egreso;  
        this.indiceArray=this.indiceArray+1;
        // procedimiento para almacenar en la Base de Datos
    }
    
    public EgresoClase[] getEgresos(){
        return this.tablaEgreso;
    }
    
    public void abrirConexion(){
        conectorBD= new ConexionBaseDeDatos();
        conexion=conectorBD.conectar();
    }  
    
     public String guardarEgreso2(EgresoClase egreso){        
        String sql = "INSERT INTO biblioteca.egresos(numero_libro, nombre_libro, usuario, prestamo, entrega) ";
             sql += " VALUES(?,?,?,?,?)";              
       try{     
            abrirConexion();
            statement = conexion.prepareStatement(sql); 
            statement.setInt(1, egreso.getCodigo());
            statement.setString(2, egreso.getNombre());
            statement.setString(3, egreso.getUsuario());
            statement.setString(4, egreso.getPrestamo());
            statement.setString(5, egreso.getEntrega());
            
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
    
    public void getEgresos2(StringBuffer respuesta){   
        String sql="select * from biblioteca.egresos";
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
                respuesta.append("<td >").append(result.getString("usuario")).append("</td>");
                respuesta.append("<td >").append(result.getString("prestamo")).append("</td>");
                respuesta.append("<td >").append(result.getString("entrega")).append("</td>");
                respuesta.append("<td id=\"").append(result.getString("numero_libro"))
                        .append("\"  onclick=\"eliminarEgreso(this.id);\">") 
                         
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
    
    public String eliminarEgreso(int egre){        
        String sql = "DELETE FROM egresos WHERE numero_libro="+egre;              
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
    
   
