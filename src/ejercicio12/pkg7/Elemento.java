
package ejercicio12.pkg7;

public class Elemento {
    //Atributos
    TipoSocio socio;
    Elemento sgte;
    public Elemento(TipoSocio e)
    {
    socio = e;
    sgte = null;
    }
    public TipoSocio getSocio()
    {
    return socio;
    }
   
}
