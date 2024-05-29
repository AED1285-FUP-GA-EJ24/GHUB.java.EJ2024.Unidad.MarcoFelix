package arreglosMultidimensionales;
//Proposito: demostrar el uso de arreglos de ,as de una dimesion
//
//
public class ArreglosMultidimensionales{
    public void arreglosMultidimensionales(){
        //sintaxis
        /*
         * forma 1
         * <tipo de datoElemento> <nombre arreglo> {}[];
         * forma 2
         * <tipo de datoElemento> {}[] <nombre arreglo> ;
         */
        char pantalla[][];
        int puesto[][];
        double [][]matriz;
        //Las operaiones de arriba son referencias
        //para crearlas y asignarles memoria se requiere lo siguiente
        /*
         * sintaxis para arreglar memorias a la matriz
         * <tipo de datoElemento> <nombre arreglo> [][] =
         *          new <tipo de datoElemento>[<numero de Filas]>}[<numero de Columnas>]
         * 
         */
        pantalla = new char[80][24]; //matriz con 80 filas y 24 columnas
        puesto = new int[10][5]; //matriz de de 10 filas y 5 columnas
        final int N=4;
        matriz = new double[N][N]; //matriz cuadrada de N*N elementos
        //inicializar matriz puesto
        puesto[0][0]= 1;
        puesto[0][1]= 2;
        puesto[0][2]= 3;
        puesto[0][3]= 4;
        puesto[0][4]= 5;

        puesto[1][0]= 1;
        puesto[1][1]= 2;
        puesto[1][2]= 3;
        puesto[1][3]= 4;
        puesto[1][4]= 5;

        puesto[2][0]= 1; 
        puesto[2][1]= 2;
        puesto[2][2]= 3;
        puesto[2][3]= 4;
        puesto[2][4]= 5;

        puesto[3][0]= 1;
        puesto[3][1]= 2;
        puesto[3][2]= 3;
        puesto[3][3]= 4;
        puesto[3][4]= 5;

        puesto[4][0]= 1;
        puesto[0][1]= 2;
        puesto[0][2]= 3;
        puesto[0][3]= 4;
        puesto[0][4]= 5;

        puesto[5][0]= 1;
        puesto[5][1]= 2;
        puesto[5][2]= 3;
        puesto[5][3]= 4;
        puesto[5][4]= 5;

        puesto[6][0]= 1;
        puesto[6][1]= 2;
        puesto[6][2]= 3;
        puesto[6][3]= 4;
        puesto[6][4]= 5;

        puesto[7][0]= 1;
        puesto[7][1]= 2;
        puesto[7][2]= 3;
        puesto[7][3]= 4;
        puesto[7][4]= 5;

        puesto[8][0]= 1;
        puesto[8][1]= 2;
        puesto[8][2]= 3;
        puesto[8][3]= 4;
        puesto[8][4]= 5;

        puesto[9][0]= 1;
        puesto[9][1]= 2;
        puesto[9][2]= 3;
        puesto[9][3]= 4;
        puesto[9][4]= 5;

        //Recorrer arreglos
        for(int i=0;i<10;i++)
        {
            System.out.println("Valores de renglon "+i+": ");
            System.out.println(puesto[i][0]+" "+puesto[i][1]+puesto[i][2]+puesto[i][3]);
        }

        //inicializacion de
    }
}