/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package old;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Segura
 */
public class Logic {
    
    public String generarID (String nombre)
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
        
        return ID;
    }// fin de generarID 
    
    
    public boolean deseaContinuar (String mensaje)
    {
        boolean resp = true;
        
        String[] botones = {"No","Si"}; 
        
        JOptionPane.showOptionDialog(null, mensaje, "¿Coninuar?",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, botones, botones[0]);
        
        return resp;
        
    }
}
