package mercadovalores;

/**
 *
 * @author Jesus
 */
public interface IObservable 
{
    public void notificar();
    public void suscribir(IObservador o);
    public void desuscribir(IObservador o);
}
