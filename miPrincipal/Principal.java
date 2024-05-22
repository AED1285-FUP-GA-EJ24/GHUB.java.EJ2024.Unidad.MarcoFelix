package miPrincipal;
import demoArreglos.DemoArreglos;
import sumaArreglo.SumaArreglo;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("**************************************");
            System.out.println("      MENU DE OPCIONES UNIDAD IV      ");
            System.out.println("**************************************");
            System.out.println("* 1) Demo de arreglos unidimensionales"); 
            System.out.println("* 2) Suma de un arreglo               "); 
            System.out.println("* 3) "); 
            System.out.println("* 4) "); 
            System.out.println("* 5) "); 
            System.out.println();
            System.out.println("* 99) Salir"); 
            System.out.println("**************************************");
            System.out.print("Seleccion Opcion:");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                   //creo el objeto
                   DemoArreglos objDemoArreglos = new DemoArreglos();
                   objDemoArreglos.demoArreglos();
                   break;
                case 2:
                  //creo el objeto
                  SumaArreglo objSumaArreglo = new SumaArreglo();
                  objSumaArreglo.sumaArreglo();
                  break;
                case 3:
                  // crea el objeto
                  ProductoArreglo objProductoArreglo = new ProductoArreglo();
                  objProductoArreglo.productoArreglo();
                  break;
                case 4:
                case 5:

                case 99:
                    System.out.println("Hasta luego");
                    break;
                default:
                 System.out.println("Opción inválida");
            }

        }while(opcion != 99);
        entrada.close();
    }
}