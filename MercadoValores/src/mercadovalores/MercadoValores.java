package mercadovalores;

import java.util.ArrayList;

/**
 *
 * @author Jesus Gabriel Parra Dugarte
 */
public class MercadoValores {

    public static void main(String[] args) 
    {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>()
        {
            {
                add(new Usuario("Ramon", "123"));
            }
        };
        
        SMS_System sistemaMensajeria = new SMS_System(usuarios);
        
        ArrayList<Accion> acciones = new ArrayList<Accion>() {
            {
                add(new Accion("Café Juan el pez", 100000.0, 90000.0, 50000.0, 200000.0));
                add(new Accion("Café Juan Valdez", 500000.0, 480000.0, 450000.0, 600000.0));
                add(new Accion("Café Mi vaquita", 50000.0, 45000.0, 40000.0, 60000.0));
            }
        };
        
        for (Accion accion : acciones) {
            accion.suscribir(sistemaMensajeria);
        }
        
        acciones.get(0).setPrecioActual(210000.0);
        acciones.get(1).setPrecioActual(710000.0);
    }
    
}
