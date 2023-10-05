package Modelo;

/**
 *
 * @author Jesus Gabriel Parra Dugarte
 * @author Elkin Ariel Morillo Quenguan
 * 
 */
public interface IObservable 
{
    public void notificar();
    public void suscribir(IObservador o);
    public void desuscribir(IObservador o);
}
