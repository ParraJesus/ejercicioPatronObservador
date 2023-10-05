package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jesus Gabriel Parra Dugarte
 * @author Elkin Ariel Morillo Quenguan
 * 
 */
public class Accion implements IObservable 
{
    private String nombre;
    private Double precioActual;
    private Double precioAnterior;
    private Double umbralInferior;
    private Double umbralSuperior;
    
    private ArrayList<IObservador> observadores;
    
    public Accion(String nombre, Double precioActual, Double precioAnterior, Double umbralInferior, Double umbralSuperior)
    {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.precioAnterior = precioAnterior;
        this.umbralInferior = umbralInferior;
        this.umbralSuperior = umbralSuperior;
        
        observadores = new ArrayList<IObservador>();
    }
    
    @Override
    public void suscribir(IObservador o)
    {
        observadores.add(o);
    }
    
    @Override
    public void desuscribir(IObservador o)
    {
        observadores.remove(o);
    }
    
    @Override
    public void notificar() 
    {
        if(observadores.isEmpty()) return;
        
        for(IObservador o: observadores)
        {
            o.actualizar();
        }
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
     * @return the precioActual
     */
    public Double getPrecioActual() {
        return precioActual;
    }

    /**
     * @param precioActual the precioActual to set
     */
    public void setPrecioActual(Double precioActual) 
    {
        if (precioActual > umbralSuperior || precioActual < umbralInferior) 
        {
            notificar(); // Notificar solo si se supera el umbral superior o se está por debajo del umbral inferior.
        }
        
        setPrecioAnterior(this.precioActual); //Ajustar el precio anterior tras la llegada del nuevo
        
        this.precioActual = precioActual;
    }

    /**
     * @return the precioAnterior
     */
    public Double getPrecioAnterior() {
        return precioAnterior;
    }

    /**
     * @param precioAnterior the precioAnterior to set
     */
    public void setPrecioAnterior(Double precioAnterior) {
        this.precioAnterior = precioAnterior;
    }

    /**
     * @return the umbralInferior
     */
    public Double getUmbralInferior() {
        return umbralInferior;
    }

    /**
     * @param umbralInferior the umbralInferior to set
     */
    public void setUmbralInferior(Double umbralInferior) {
        this.umbralInferior = umbralInferior;
    }

    /**
     * @return the umbralSuperior
     */
    public Double getUmbralSuperior() {
        return umbralSuperior;
    }
    
    /**
     * @param umbralSuperior the umbralSuperior to set
     */
    public void setUmbralSuperior(Double umbralSuperior) {
        this.umbralSuperior = umbralSuperior;
    }
    //</editor-fold>
}
