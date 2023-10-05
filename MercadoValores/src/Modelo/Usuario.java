package Modelo;

/**
 *
 * @author Jesus Gabriel Parra Dugarte
 * @author Elkin Ariel Morillo Quenguan
 * 
 */
public class Usuario 
{

    private String nombre, telefono;
    
    public Usuario(String nombre,String telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //</editor-fold>
}
