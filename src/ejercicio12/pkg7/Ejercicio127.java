
package ejercicio12.pkg7;
import java.util.Scanner;
public class Ejercicio127 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        //Menú
        do{
            System.out.println("¡Buenos dias!");
            System.out.println("Ingrese 1 para insertar un socio");
            System.out.println("Ingrese 2 para eliminar un socio");
            System.out.println("Ingrese 3 para buscar un socio");
            System.out.println("Ingrese 4 para salir");
            respuesta=sc.nextInt();
            sc.nextLine();
                while(respuesta<1 || respuesta>4){
                System.out.println("Error: La opcion ingresa no es válida");
                System.out.println("Ingrese 1 para insertar un socio");
                System.out.println("Ingrese 2 para eliminar un socio");
                System.out.println("Ingrese 3 para buscar un socio");
                System.out.println("Ingrese 4 para salir");
                respuesta=sc.nextInt();
                sc.nextLine();
                }
            switch(respuesta){
               case 1:
                    //TipoSocio casaInsertar = new TipoSocio();
                    //tablaHash.insertar(casaInsertar);
                    break;
                   case 2:
                    System.out.print("Ingrese la clave de la casa que desea Eliminar \n");
                    //clave=sc.nextLine();
                    //tablaHash.eliminar(clave);
                    break;
                    case 3:
                   // CasaRural casaMostrar = new CasaRural();
                    System.out.print("Ingrese la clave de la casa que desea Buscar \n");
                    //clave=sc.nextLine();
                    //casaMostrar = tablaHash.buscar(clave);
                    //casaMostrar.muestra();
                    break;
                }    
        }while(respuesta<4);
    }
  }
    

