package Inside;

import Interface.*;

/**
 * @author Sergio Segura
 */

public class Botones {
    
    public void abrirMenuPrincipal()
    {
        MenuPrincipal abrir = new MenuPrincipal();
        abrir.setVisible(true);
    }
    
    public void abrirRegistar() 
    {                                             
        Registro abrir = new Registro();
        abrir.setVisible(true);
    }
    
    
    public void abrirBusqueda()
    {                                            
        Busqueda abrir = new Busqueda();
        abrir.setVisible(true);
    } 
    
    public void abrirResultado()
    {                                            
        Resultado abrir = new Resultado();
        abrir.setVisible(true); 
    } 
    
    public void abrirAdministrar() 
    {                                               
        Administar abrir = new Administar();
        abrir.setVisible(true);
    } 
    
     public void abrirEstadisticas() 
    {                                                
        Estadisticas abrir = new Estadisticas();
        abrir.setVisible(true);
    }
    
    public void abrirInformacion() 
    {                                               
        Informacion abrir = new Informacion();
        abrir.setVisible(true);
    }                                              
   
    public void abrirCambiarDatos() 
    {                                               
        CambiarDatos abrir = new CambiarDatos();
        abrir.setVisible(true);
    } 
    
    public void abrirCorrerSentencia() 
    {                                               
        CorrerSentencia abrir = new CorrerSentencia();
        abrir.setVisible(true);
    }
    
    public void abrirBorrarCliente() 
    {                                               
        MenuCOD abrir = new MenuCOD();
        abrir.setVisible(true);
    }
    
    public void abrirContraseñaT1() 
    {                                               
        ContraseñaT1 abrir = new ContraseñaT1();
        abrir.setVisible(true); 
    }
    
    public void abrirContraseñaT2() 
    {                                               
        ContraseñaT2 abrir = new ContraseñaT2();
        abrir.setVisible(true); 
    }
   
    public void abrirEliminar() 
    {                                               
        Eliminar abrir = new Eliminar();
        abrir.setVisible(true); 
    }
      
    public void abrirMenuCOD ()
    {
        MenuCOD gen = new MenuCOD();
        gen.setVisible(true);
    }
    
    public void abirBucarUsuario ()
    {
        BuscarUsuario bu = new BuscarUsuario();
        bu.setVisible(true);
    }
}
