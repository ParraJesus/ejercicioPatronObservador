package Controlador;

import Modelo.Usuario;
import java.util.ArrayList;
import Modelo.IObservador;

/**
 *
 * @author Jesus Gabriel Parra Dugarte
 * @author Elkin Ariel Morillo Quenguan
 * 
 */
public class SMS_System implements IObservador
{
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    public SMS_System(ArrayList<Usuario> usuarios)
    {
        this.usuarios = usuarios;
    }
    
    public void sendMessage(String nombre, String telefono)
    {
        
        System.out.println("Saludos, " + nombre + ". El precio de una acción a la que se ha suscrito, ha rebasado los umbrales");
    }

    @Override
    public void actualizar()
    {
        for(Usuario o: usuarios)
        {
            sendMessage(o.getNombre(), o.getTelefono());
        }
    }
}
