
package Conexiones;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Procedimientos {
    
    /**USUARIO**/
    //LOGIN
    public static String OBTEN_USU(String N_USUARIO, String CONTRASEÑA)throws SQLException{
        String IDusuario="";
        
        CallableStatement Obten = Conexion.getConexion().prepareCall("{call OBTEN_USU(?,?)}");
        Obten.setString(1, N_USUARIO);
        Obten.setString(2, CONTRASEÑA);
        
        ResultSet rs =Obten.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("IDUSUARIO"));
            IDusuario=rs.getString("IDUSUARIO");
        }
        rs.close();
        Obten.close();
        
        if (IDusuario.length() == 0 )
                return "nada";
        else
            return IDusuario;
    }
    //REGISTRO
    public static void ALTA_USU(String N_USUARIO, String CONTRASEÑA, String NOMBRE, String A_PATERNO, String A_MATERNO, String CORREO_E, String CELULAR, String TELEFONO)throws SQLException{
        CallableStatement EntradaUsuario = Conexion.getConexion().prepareCall("{call ALTA_USU(?,?,?,?,?,?,?,?)}");
        EntradaUsuario.setString(1,N_USUARIO);
        EntradaUsuario.setString(2,CONTRASEÑA);
        EntradaUsuario.setString(3,NOMBRE);
        EntradaUsuario.setString(4,A_PATERNO);
        EntradaUsuario.setString(5,A_MATERNO);
        EntradaUsuario.setString(6,CORREO_E);
        EntradaUsuario.setString(7,CELULAR);
        EntradaUsuario.setString(8,TELEFONO);
        EntradaUsuario.execute();
    }
    //CAMBIAR DATOS
    public static void CAMB_USU(String IDUSUARIO, String CORREO_E, String CELULAR, String TELEFONO, String CONTRASEÑA)throws SQLException{
        CallableStatement CamU = Conexion.getConexion().prepareCall("{call CAMB_USU(?,?,?,?,?)}");
        CamU.setString(1, IDUSUARIO);
        CamU.setString(2, CORREO_E);
        CamU.setString(3, CELULAR);
        CamU.setString(4, TELEFONO);
        CamU.setString(5, CONTRASEÑA);
        CamU.execute();
    }
    //VER PERFIL
    public static void PERFIL_USU(String IDUSUARIO)throws SQLException{
        CallableStatement PerU = Conexion.getConexion().prepareCall("{call PERFIL_USU(?)}");
        PerU.setString(1, IDUSUARIO);
        PerU.execute();
    }
    //ver eventos del usuario logueado
    public static void TODOS_EVENTOS_USU(String IDUSUARIO)throws SQLException{
        CallableStatement TEU = Conexion.getConexion().prepareCall("{call TODOS_EVENTOS_USU(?)}");
        TEU.setString(1, IDUSUARIO);
        TEU.execute();
    }
    //mostrar todo el evento seleccionado
    public static void EVENTO_ID(String IDE)throws SQLException{
        CallableStatement EID = Conexion.getConexion().prepareCall("{call EVENTO_ID(?)}");
        EID.setString(1, IDE);
        EID.execute();
    }
    //MOSTRAR BEBIDAS DEL EVENTO
    public static void TODAS_BEBIDAS_EVENTO(String IDE)throws SQLException{
        CallableStatement TBE = Conexion.getConexion().prepareCall("{call TODAS_BEBIDAS_EVENTO(?)}");
        TBE.setString(1, IDE);
        TBE.execute();
    }
    //DAR DE ALTA BEBIDAS
    public static void ALTA_EVENTOBEBIDAS(String IDE, String IDB)throws SQLException{
        CallableStatement AEB = Conexion.getConexion().prepareCall("{call ALTA_EVENTOBEBIDAS(?,?)}");
        AEB.setString(1, IDE);
        AEB.setString(2, IDB);
        AEB.execute();
    }
    //DAR DE BAJA BEBIDAS
    public static void BAJA_EVENTOBEBIDAS(String IDE, String IDB)throws SQLException{
        CallableStatement BEB = Conexion.getConexion().prepareCall("{call BAJA_EVENTOBEBIDAS(?,?)}");
        BEB.setString(1, IDE);
        BEB.setString(2, IDB);
        BEB.execute();
    }
    //Ver Menu de Evento
    public static void MENU_IDEVENTO(String IDE)throws SQLException{
        CallableStatement MIE = Conexion.getConexion().prepareCall("{call MENU_IDEVENTO(?)}");
        MIE.setString(1, IDE);
        MIE.execute();
    }
    //Crear evento
    public static void ALTA_EVENTO(String TIPO_EVENTO, String HORA_INICIO, String HORA_FIN, String FECHA, String NUM_PERSONAS, String PLAYLIST, String IDMANTEL, String IDMONTAJE, String NOMBRE_PAQUETE, String IDUSUARIO)throws SQLException{
        CallableStatement AE = Conexion.getConexion().prepareCall("{call CAMB_USU(?,?,?,?,?,?,?,?,?)}");
        AE.setString(1, TIPO_EVENTO);
        AE.setString(2, HORA_INICIO);
        AE.setString(3, HORA_FIN);
        AE.setString(4, FECHA);
        AE.setString(5, NUM_PERSONAS);
        AE.setString(6, PLAYLIST);
        AE.setString(7, IDMANTEL);
        AE.setString(8, IDMONTAJE);
        AE.setString(9, NOMBRE_PAQUETE);
        AE.setString(10, IDUSUARIO);
        AE.execute();
    }
    
    //VER MANTELES
    public static void TODOS_PAQUETES()throws SQLException{
        CallableStatement PA = Conexion.getConexion().prepareCall("{call TODOS_EVENTOS()}");
        PA.execute();
    }
    //VER MONTAJES
    public static void TODOS_MONTAJES()throws SQLException{
        CallableStatement MO = Conexion.getConexion().prepareCall("{call TODOS_EVENTOS()}");
        MO.execute();
    }
    //VER PAQUETES
    public static void TODOS_MANTEL()throws SQLException{
        CallableStatement MA = Conexion.getConexion().prepareCall("{call TODOS_EVENTOS()}");
        MA.execute();
    }
    //Cosot total
    public static void CR_EVENTO(String IDE)throws SQLException{
        CallableStatement CRE = Conexion.getConexion().prepareCall("{call CR_EVENTO(?)}");
        CRE.setString(1, IDE);
        CRE.execute();
    }
    //DEUDA
    public static void CR_EVENTO_DEUDA(String IDE)throws SQLException{
        CallableStatement CRD = Conexion.getConexion().prepareCall("{call CR_EVENTO_DEUDA(?)}");
        CRD.setString(1, IDE);
        CRD.execute();
    }
    //DAR DE ALTA BEBIDAS
    public static void ALTA_CAMB_MENU(String IDE, String IDP)throws SQLException{
        CallableStatement ACM = Conexion.getConexion().prepareCall("{call ALTA_CAMB_MENU(?,?)}");
        ACM.setString(1, IDE);
        ACM.setString(2, IDP);
        ACM.execute();
    }
    //DAR DE BAJA BEBIDAS
    public static void BAJA_MENU(String IDE, String IDP)throws SQLException{
        CallableStatement BEM = Conexion.getConexion().prepareCall("{call BAJA_MENU(?,?)}");
        BEM.setString(1, IDE);
        BEM.setString(2, IDP);
        BEM.execute();
    }
    //DAR DE ALTA contrataciones
    public static void ALTA_CONTRATA(String IDE, String IDC)throws SQLException{
        CallableStatement ACR = Conexion.getConexion().prepareCall("{call ALTA_CONTRATA(?,?)}");
        ACR.setString(1, IDE);
        ACR.setString(2, IDC);
        ACR.execute();
    }
    //DAR DE BAJA CONTRATACIONES
    public static void BAJA_CONTRATA(String IDE, String IDC)throws SQLException{
        CallableStatement BEC = Conexion.getConexion().prepareCall("{call BAJA_CONTRATA(?,?)}");
        BEC.setString(1, IDE);
        BEC.setString(2, IDC);
        BEC.execute();
    }
    //modificardetalles
    public static void CAMB_EVENTO(String IDE, String MUSIC, String MANTELES, String MONTAJES)throws SQLException{
        CallableStatement CEV = Conexion.getConexion().prepareCall("{call CAMB_EVENTO(?,?,?,?)}");
        CEV.setString(1, IDE);
        CEV.setString(2, MUSIC);
        CEV.setString(3, MANTELES);
        CEV.setString(4, MONTAJES);
        CEV.execute();
    }
    //DAR DE BAJA UN EVENTO
    public static void BAJA_EVENTO(String IDE)throws SQLException{
        CallableStatement BEC = Conexion.getConexion().prepareCall("{call BAJA_EVENTO(?)}");
        BEC.setString(1, IDE);
        BEC.execute();
    }
    
    
    /**ADMIN**/
    public static void BAJA_USU(String IDUsu)throws SQLException{
        CallableStatement BU = Conexion.getConexion().prepareCall("{call BAJA_USU(?)}");
        BU.setString(1, IDUsu);
        BU.execute();
        JOptionPane.showMessageDialog(null, "ELiminado correctamente");
    }
    //DAR DE ALTA BEBIDAS
    public static void ALTA_BEBIDAS(String NOMBRE,int ALCHOL,String DESCRIPCION,String IDP)throws SQLException{
        CallableStatement ACM = Conexion.getConexion().prepareCall("{call ALTA_BEBIDAS(?,?,?,?)}");
        ACM.setString(1, NOMBRE);
        ACM.setInt(2, ALCHOL);
        ACM.setString(3, DESCRIPCION);
        ACM.setString(4, IDP);
        ACM.execute();
    }
    //DAR DE BAJA BEBIDAS
    public static void BAJA_BEBIDAS(String IDB)throws SQLException{
        CallableStatement BEM = Conexion.getConexion().prepareCall("{call BAJA_BEBIDAS(?)}");
        BEM.setString(1, IDB);
        BEM.execute();
    }
    //ACTUALIZAR BEBIDAS
    public static void CAMB_BEBIDAS(String NOMBRE,int ALCHOL,String DESCRIPCION,String IDP)throws SQLException{
        CallableStatement ACM = Conexion.getConexion().prepareCall("{call CAMB_BEBIDAS(?,?,?,?)}");
        ACM.setString(1, NOMBRE);
        ACM.setInt(2, ALCHOL);
        ACM.setString(3, DESCRIPCION);
        ACM.setString(4, IDP);
        ACM.execute();
    }
    //DAR DE ALTA SERVICIOS
    public static void ALTA_SERVICIOS(Float COSTO,Float TIEMPO,String DESCRIPCION, String IDS)throws SQLException{
        CallableStatement ACR = Conexion.getConexion().prepareCall("{call ALTA_SERVICIOS(?,?,?,?)}");
        ACR.setFloat(1, COSTO);
        ACR.setFloat(2, TIEMPO);
        ACR.setString(3, DESCRIPCION);
        ACR.setString(4, IDS);
        ACR.execute();
    }
    //DAR DE BAJA SERVICIOS
    public static void BAJA_SERVICIOS(String IDS)throws SQLException{
        CallableStatement BEC = Conexion.getConexion().prepareCall("{call BAJA_SERVICIOS(?)}");
        BEC.setString(1, IDS);
        BEC.execute();
    }
    //CAMBIAR SERVICIOS
    public static void CAMB_SERVICIOS(Float COSTO, String IDS)throws SQLException{
        CallableStatement ACR = Conexion.getConexion().prepareCall("{call CAMB_SERVICIOS(?,?)}");
        ACR.setFloat(1, COSTO);
        ACR.setString(2, IDS);
        ACR.execute();
    }
    //DAR DE ALTA SERVICIOS
    public static void ALTA_SILLAS(String NOMBRE, String IDS)throws SQLException{
        CallableStatement ACR = Conexion.getConexion().prepareCall("{call ALTA_SILLAS(?,?)}");
        ACR.setString(1, NOMBRE);
        ACR.setString(2, IDS);
        ACR.execute();
    }
    //DAR DE BAJA SERVICIOS
    public static void BAJA_SILLAS(String IDS)throws SQLException{
        CallableStatement BEC = Conexion.getConexion().prepareCall("{call BAJA_SILLAS(?)}");
        BEC.setString(1, IDS);
        BEC.execute();
    }
    //CAMBIAR SERVICIOS
    public static void CAMB_SILLAS(String NOMBRE, String IDS)throws SQLException{
        CallableStatement ACR = Conexion.getConexion().prepareCall("{call CAMB_SILLAS(?,?)}");
        ACR.setString(1, NOMBRE);
        ACR.setString(2, IDS);
        ACR.execute();
    }
    public static String CR_EVENTOS_REALI()throws SQLException{
        String NUM="";
        
        CallableStatement Obten = Conexion.getConexion().prepareCall("{call CR_EVENTOS_REALI}");
        
        ResultSet rs =Obten.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("EVENTOS"));
            NUM=rs.getString("EVENTOS");
        }
        rs.close();
        Obten.close();
        
        return NUM;
    }
    public static String CR_EVENTOS_FALT()throws SQLException{
        String NUM="";
        
        CallableStatement Obten = Conexion.getConexion().prepareCall("{call CR_EVENTOS_FALT}");
        
        ResultSet rs =Obten.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("EVENTOS"));
            NUM=rs.getString("EVENTOS");
        }
        rs.close();
        Obten.close();
        
        return NUM;
    }
    public static String CR_PERSONAS_REALI()throws SQLException{
        String NUM="";
        
        CallableStatement Obten = Conexion.getConexion().prepareCall("{call CR_PERSONAS_REALI}");
        
        ResultSet rs =Obten.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("NUMPERSONAS"));
            NUM=rs.getString("NUMPERSONAS");
        }
        rs.close();
        Obten.close();
        
        return NUM;
    }
    
    
    public static void TODOS_EVENTOS()throws SQLException{
        CallableStatement TE = Conexion.getConexion().prepareCall("{call TODOS_EVENTOS()}");
        TE.execute();
    }
    
    public static void ALTA_PAQUETE(String NOMBRE,Float PRECIO,Integer MAX_PER,Integer MIN_PER,Integer  TIME_FOOD, String SILLAS, Integer COMIDA)throws SQLException{
    CallableStatement APQ = Conexion.getConexion().prepareCall("{call ALTA_ PAQUETE (?,?,?,?,?,?,?)}");
    APQ.setString(1, NOMBRE);
    APQ.setFloat(2, PRECIO);
    APQ.setFloat(3, MAX_PER);
    APQ.setFloat(4, MIN_PER);
    APQ.setInt(5, TIME_FOOD);
    APQ.setString(6, SILLAS);
    APQ.setInt(7, COMIDA);
    APQ.execute();
    }
    
    public static void CAMB_PAQUETE(String NOMBRE,String PRECIO,Integer MAX,Integer MIN,Integer HORAS,String SILLAS,Integer TIEMPOS)throws SQLException{
        CallableStatement APQ = Conexion.getConexion().prepareCall("{call CAMB_PAQUETE(?,?,?,?,?,?,?)}");
        APQ.setString(1, NOMBRE);
        APQ.setString(2, PRECIO);
        APQ.setInt(3, MAX);
        APQ.setInt(4, MIN);
        APQ.setInt(5, HORAS);
        APQ.setString(6, SILLAS);
        APQ.setInt(7, TIEMPOS);
        APQ.execute();
    }
    //ALTA MONTAJE
    public static void ALTA_MONTAJE(String NOMBRE,String DESCRIPCION)throws SQLException{
        CallableStatement APQ = Conexion.getConexion().prepareCall("{call ALTA_MONTAJE(?,?)}");
        APQ.setString(1, NOMBRE);
        APQ.setString(2, DESCRIPCION);
        APQ.execute();
    }
    
    //BAJA MONTAJE
    public static void BAJA_MONTAJE(String ID)throws SQLException{
        CallableStatement APQ = Conexion.getConexion().prepareCall("{call BAJA_MONTAJE(?)}");
        APQ.setString(1, ID);
        APQ.execute();
    }
    
    //CAMB MONTAJE
    public static void CAMB_MONTAJE(String ID, String NOMBRE, String DESCRIPCION)throws SQLException{
        CallableStatement APQ = Conexion.getConexion().prepareCall("{call CAMB_MONTAJE(?,?,?)}");
        APQ.setString(1, ID);
        APQ.setString(2, NOMBRE);
        APQ.setString(3, DESCRIPCION);
        APQ.execute();
    }
    
    //DAR DE ALTA PLATILLO
    public static void ALTA_PLATILLO(String CLASIFICACION, String DESCRIPCION)throws SQLException{
        CallableStatement AP = Conexion.getConexion().prepareCall("{call ALTA_ PLATILLO (?,?)}");
        AP.setString(1, CLASIFICACION);
        AP.setString(2, DESCRIPCION);
        AP.execute();
    }
    
    //BAJA PLATILLO
    public static void BAJA_PLATILLO(String ID)throws SQLException{
        CallableStatement BP = Conexion.getConexion().prepareCall("{call BAJA_PLATILLO(?)}");
        BP.setString(1, ID);
        BP.execute();
    }
    
    //CAMB MONTAJE
    public static void CAMB_PLATILLO(String ID, String CLASIFICACION, String DESCRIPCION)throws SQLException{
        CallableStatement CP = Conexion.getConexion().prepareCall("{call CAMB_PLATILLO(?,?,?)}");
        CP.setString(1, ID);
        CP.setString(2, CLASIFICACION);
        CP.setString(3, DESCRIPCION);
        CP.execute();
    }
    
    //DAR DE ALTA PAGO
    public static void ALTA_PAGO(Float DINERO,String EVENTO)throws SQLException{
    CallableStatement APG = Conexion.getConexion().prepareCall("{call ALTA_PAGO (?,?)}");
    APG.setFloat(1, DINERO);
    APG.setString(2, EVENTO);
    APG.execute();
    }
    
    //DAR DE ALTA MANTELERIA
    public static void ALTA_MANTELERIA(String MATERIAL, String COLOR, String IMAGEN)throws SQLException{
    CallableStatement AM = Conexion.getConexion().prepareCall("{call ALTA_ MANTEL (?,?,?)}");
    AM.setString(1, MATERIAL);
    AM.setString(2, COLOR);
    AM.setString(3, IMAGEN);
    AM.execute();
    }
    
    //DAR DE BAJA MANTELERIA
    public static void BAJA_MANTELERIA(String MANTEL)throws SQLException{
    CallableStatement BM = Conexion.getConexion().prepareCall("{call BAJA_MANTEL (?)}");
    BM.setString(1, MANTEL);
    BM.execute();
    }


    //DAR DE CAMBIO MANTELERIA
    public static void CAMB_MANTELERIA(String IDMANTEL ,String MATERIAL, String COLOR, String IMAGEN)throws SQLException{
    CallableStatement CM = Conexion.getConexion().prepareCall("{call CAMB_ MANTEL (?,?,?)}");
    CM.setString(1, MATERIAL);
    CM.setString(1, MATERIAL);
    CM.setString(2, COLOR);
    CM.setString(3, IMAGEN);
    CM.execute();
    }
}
