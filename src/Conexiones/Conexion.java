
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Finanzas_CDMX
 */
public class Conexion {
    
    static Connection contacto=null;
    
    public static Connection getConexion(){
        String url="jdbc:sqlserver://LocalHost:1433;databaseName=DOG_BASE_MEDUSASHOUSE";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se establece conexion, revisa el driver"+ e.getMessage(),
                    "Error de Conexion",JOptionPane.ERROR_MESSAGE);
            
        }
        try{
            contacto=DriverManager.getConnection(url,"user","password");
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error"+ e.getMessage(),
                    "Error de Conexion",JOptionPane.ERROR_MESSAGE);
            
        }
        return contacto;
    }
    
    public static ResultSet Consulta(String Consulta){
        Connection con=getConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta=declara.executeQuery(Consulta);
            return respuesta;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error"+ e.getMessage(),
                    "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public int Login(String User, String Pass) {
        Integer resultado=0;
        try{
            Statement ejecutor = contacto.createStatement();
            ResultSet rs= ejecutor.executeQuery("Select * from USUARIO where N_USUARIO = '"+User+"' and CONTRASENA = '"+Pass+"'");
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Bienvenido");
                resultado=1;
            }else{
                JOptionPane.showMessageDialog(null, "Problema con usuario y/o contraseña");
                resultado=0;
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al conectar "+e.getMessage(), e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    /*public boolean Login(JTextField TxtUsuario, JPasswordField TxtpPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
