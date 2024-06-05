package productoValorMaximo;
import java.util.Scanner;
//Proposito: un programa que lea una lista  con un máximo de 11 números enteros
//          y calcule su productos y el valor máximo.
//Autor: Marco Felix
//Fecha: 05/06/2024
public class ProductoValorMaximo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[11];
        int elementos = entrada(arreglo, scanner);
        int producto = productoEnteros(arreglo, elementos);
        int maximo = maximo(arreglo, elementos);

        System.out.println("El producto de los elementos es: " + producto);
        System.out.println("El valor máximo es: " + maximo);
    }

    public static int entrada(int[] arreglo, Scanner scanner) {
        System.out.println("Ingrese hasta 11 números enteros (ingrese -1 para terminar): ");
        int i;
        for (i = 0; i < arreglo.length; i++) {
            int numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            arreglo[i] = numero;
        }
        return i; // Retorna el número de elementos leídos
    }

    public static int productoEnteros(int[] arreglo, int elementos) {
        int producto = 1;
        for (int i = 0; i < elementos; i++) {
            producto *= arreglo[i];
        }
        return producto;
    }

    public static int maximo(int[] arreglo, int elementos) {
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < elementos; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }
}