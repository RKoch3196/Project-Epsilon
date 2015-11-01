package Inside;

import java.io.*;
import java.sql.*;
import javax.swing.*;
import Interface.*;

/**
 * 
 * @author Sergio Segura
 */

public class Logica 
{
    
    Botones bot = new Botones();
    Eliminar del = new Eliminar();
    CambiarDatos cd = new CambiarDatos();
    
    static Connection cn;
    static Statement st;
    static ResultSet rs;
   
    String consulta;
    static int Tipo;
    
    static String bd="XE";
    static String login="epsilondatabase";
    static String password="rk001";
    static String url="jdbc:oracle:thin:@localhost:1521:XE";
     
    public static Connection Enlace(Connection conn)throws SQLException
    {
        try {
         Class.forName("oracle.jdbc.OracleDriver");
         conn=DriverManager.getConnection(url, login, password);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Error al cargar el driver: "+e);
        }
        return conn;
    }
    
    public static Statement sta(Statement st)throws SQLException
    {
        cn=Enlace(cn);
        st=cn.createStatement();
        return st;
    }
    public static ResultSet EnlEst(ResultSet rs, String consulta)throws SQLException
    {
        st=sta(st);
        rs=st.executeQuery(consulta);
        return rs;
    }
    
    public static String generateID (String nombre)
    {
        
        int num = 0;
        
        num = (int) Math.floor(Math.random()*(1-9)+9);
        
        char elem1;
        
        String ID = " ", elem2 = "";
        
        elem1 = nombre.charAt(0);
        
        for(int i = 0;i<nombre.length();i++)
        {
            char letra = nombre.charAt(i);
            if((letra+"").equals(" "))
            {
                elem2 += nombre.charAt(i+1);
            }
        }
        
        ID=elem1+elem2+num;
        
       return ID.toUpperCase();
    }// fin de generateID 
    
    
    public static int  deseaContinuar (String mensaje)
    {
        int resp = 0;
        
        String[] botones = {"No","Si"}; 
        
        resp = JOptionPane.showOptionDialog(null, mensaje, "¿Coninuar?",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, botones, botones[0]);
        
        return resp;
    }
    
    public static void mostarMensaje (String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static String conversionColones (String precio){
        
        String listo = " ";
        
        int num = Integer.parseInt(precio.substring(1, precio.length()));
        
        listo = "¢"+(num*540);
        
        System.out.println(listo);
        
        return listo;  
    }
    
    public static void seleccionarTipo1 ()
    {
        Tipo = 1;
    }
    
    public static void seleccionarTipo2 ()
    {
        Tipo = 2;
    }
    
    public  void  escogerTipo ()
    {
        if (Tipo == 1)
        {
           bot.abrirCambiarDatos();
        }
        else
        {
            bot.abrirEliminar(); 
        }
         
    }
    
    public void pregunta (String mensaje)
    {
        int resp = 0;
        
        String[] botones = {"Si","No"}; 
        
        resp = JOptionPane.showOptionDialog(null, mensaje, "¿Coninuar?",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, botones, botones[0]);
        
        if (resp == 0)
        {
            bot.abrirRegistar();
        }
        else
        {
            bot.abrirMenuPrincipal();
           
        }
    }
    
    public void codRecibido ()
    {
        if (Tipo == 1)
        { 
           cd.setCod(JOptionPane.showInputDialog(null, "Escriba el COD").toUpperCase());
        }
        else
        {
           del.setCod(JOptionPane.showInputDialog(null, "Escriba el COD").toUpperCase());
        }
    }
    
}
