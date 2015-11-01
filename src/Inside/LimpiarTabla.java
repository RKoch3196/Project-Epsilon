package Inside;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Sergio Segura
 */

public class LimpiarTabla {
    
    static Connection cn;
    static Statement st;
    static ResultSet rs;
    
    Botones bot = new Botones();
    
    String consulta = "DELETE CLIENTES";
    
    public void pregunta ()
    {
        if (Logica.deseaContinuar("Esta seguro que desea \n purgar la base de datos?") == 1)
        {
            purgarTabla();
        }
        else
        {
            bot.abrirAdministrar();
        }
    }
    
    public void purgarTabla()
    {
        try
        {
           cn = Logica.Enlace(cn);
           rs=Logica.EnlEst(rs,consulta);
           JOptionPane.showMessageDialog(null, "Se han eliminado todos los \n datos satisfactoriamente");
           bot.abrirAdministrar();
           rs.close();
           cn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "se ha producido un erro al purgar \n la tabla :"+e);
        }
    } 
    
    
    
}
