package leerAccederArreglo;
import java.util.Scanner;
/*
 * Proposito: Dar entrada a los elementos y posterior visualizacion de un
    arreglo bidimensional
 * Autor: Marco Felix
 * Fecha: 31/05/2024
 */
public class LeerAccederArreglo{
    //el metodo declarado
    public static void leerAccederArreglo(){
        int v[][] = new int[3][9];
        //invoca el metodo leer
        leer(v);
    }
    public static void leer(int v[][]){
        int i,j;
        //creo objeto Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entrada de datos de la matriz:");
        for(i=0;i<v.length;i++){
            System.out.println("Fila: "+i);
            for(j=0;j<v[i].length;j++){
                v[i][j]= entrada.nextInt();
            }
        }
    }
    public static void visualizar(int [][]v){
        int i,j;
        System.out.println("\n\t Matriz leida\n");
        for(i=0;i<v.length;i++){
            for(j=0;j<v[i].length;j++){
                System.out.print(v[i][j]+"");
            }
            System.out.println();
        }
    }
}