package productoArreglo;
import java.util.Scanner;
//Proposito: Leer un arreglo y mostrar el producto de sus elementos en pantalla
//Autor:Marco Felix
//Fecha: 22/05/2024
public class ProductoArreglo {
    public void productoArreglo(){
        //creo objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //declaracion de arreglo
        int []a; //declarando el arreglo a
        a = new int[5]; //creando el arreglo
        //lectura de los elementos del arreglo
        for(int i=0;i<5;i++){
            System.out.print("Proporciona elemento "+i+":");
            a[i]=teclado.nextInt();
        }
        //multiplicar de los elementos del arreglo
        int acum = 0;
        for(int i=0;i<a.length; i++){
            acum = acum + a[i];
        }
            //muestre el producto por pantalla
            System.out.println("El producto = "+acum);
    }
    
}   
    

