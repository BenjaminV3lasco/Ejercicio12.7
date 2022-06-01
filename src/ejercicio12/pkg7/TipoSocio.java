
package ejercicio12.pkg7;
import java.io.*;
import java.util.Scanner;
public class TipoSocio {
     
    class Fecha
    {
    int dia;
    int mes;
    int anno;
    Fecha (int d, int m, int a)
    {
    dia = d;
    mes = m;
    anno = a;
    }
    {
    asigna();
    }
     public void asigna() {
            Scanner entrada = new Scanner(System.in);
            System.out.print(" Ingrese el dia \n");
            int dia =  entrada.nextInt();
            entrada.nextLine();
            System.out.print(" Ingrese el mes \n");
            int mes =  entrada.nextInt();
            entrada.nextLine();
            System.out.print(" Ingrese el año \n");
            int anno = entrada.nextInt();
            entrada.nextLine(); 
            
            entrada.close();
            
            this.dia = dia;
            this.mes = mes;
            this.anno = anno;
           }
    
    public String toString()
    {
    return " " + dia + "-" + mes + "-" + anno;
        }
    };
    int codigo;
    private String nombre;
    private int edad;
    Fecha f;
    public TipoSocio(String n, int c, int e, int d, int m, int a)
    {
    codigo = c;
    nombre = n;
    edad = e;
    f = new Fecha(d, m, a);
    }
    public TipoSocio()
    {
        asigna ();
    }

    public void asigna (){
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Código del Socio: ");
            this.codigo = Integer.parseInt(entrada.readLine());
            System.out.print("Nombre: ");
            this.nombre = entrada.readLine(); 
            System.out.print("Edad: ");
            this.edad = Integer.parseInt(entrada.readLine());
            System.out.print("Fecha: ");
            
        }
        catch (IOException e)
        {
            System.out.println(" Excepcion en la entrada de datos " + e.getMessage()+ " . No se da de alta");
        }
        
    }
    
    
    public int getCodigo()
    {
    return codigo;
    }
    
    //Método mostrar
    void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha: " + f);
        
    }
 }
