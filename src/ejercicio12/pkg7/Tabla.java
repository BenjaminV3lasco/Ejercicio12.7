
package ejercicio12.pkg7;

public class Tabla {
    //Clase Elemento
    public class Elemento
{
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
    
    private int numElementos,M;
    private Elemento [] tabla;
    static final double R = 0.618034;
    static int dispersion(long x)
    {
    double t;
    int v,M;
    M=1024;
    t = R * x - Math.floor(R * x); // parte decimal
    v = (int) (M * t);
    return v;
    }
   public void TablaDispersaEnlazada() // constructor
    {
    tabla = new Elemento[M];
    for (int k = 0; k < M; k++)
    tabla[k] = null;
    numElementos = 0;
    }
   //Método Insertar
   public void insertar(TipoSocio s)
    {
    int posicion;
    Elemento nuevo;
    posicion = dispersion(s.getCodigo());
    nuevo = new Elemento(s);
    nuevo.sgte = tabla[posicion];
    tabla[posicion] = nuevo;
    numElementos++;
    }
    //Método Eliminar 
    //boolean conforme(TipoSocio a);
    public void eliminar(int codigo)
    {
    int posicion;
    posicion = dispersion(codigo);
    if (tabla[posicion] != null) // no está vacía
    {
    Elemento anterior, actual;
    anterior = null;
    actual = tabla[posicion];
    while ((actual.sgte != null) &&
    actual.getSocio().getCodigo() != codigo)
    {
    anterior = actual;
    actual = actual.sgte;
    }
    if (actual.getSocio().getCodigo() != codigo)
    System.out.println("No se encuentra en la tabla el socio "
    + codigo);
    else if (conforme (actual.getSocio())) //se retira el nodo
    {
    if (anterior == null) // primer nodo
    tabla[posicion] = actual.sgte;
    else
    anterior.sgte = actual.sgte;
    actual = null;
    numElementos--;
            }
        }
    }
   
   //Método Buscar
   public Elemento buscar(int codigo)
    {
    Elemento p = null;
    int posicion;
    posicion = dispersion(codigo);
    if (tabla[posicion] != null)
    {
    p = tabla[posicion];
    while ((p.sgte != null) && p.socio.codigo != codigo)
    p = p.sgte;
    if (p.socio.codigo != codigo)
    p = null;
    }
    return p;
    }
}

