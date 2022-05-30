
package ejercicio12.pkg7;

public class Tabla {
    static final double CONST = 0.618034;
    static final int TAMANTABLA = 97;
    private int numElementos;
    private Elemento [] tabla ; 

    static int dispersion(long x)
    {
        double t;
        int v;
        t = CONST * x - Math.floor(CONST * x); // parte decimal 
        v = (int) (TAMANTABLA * t);
        return v;
    }
    
    public Tabla() // constructor
    {
        tabla = new Elemento[TAMANTABLA];
        for (int k = 0; k < TAMANTABLA; k++)
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

