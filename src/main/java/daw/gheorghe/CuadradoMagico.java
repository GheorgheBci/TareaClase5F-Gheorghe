package daw.gheorghe;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class CuadradoMagico {

    private static Random ra = new Random();

    private int[][] matrizMagico;

    public CuadradoMagico() {
        this.matrizMagico = new int[3][3];

        for (int i = 0; i < matrizMagico.length; i++) {
            for (int j = 0; j < matrizMagico[i].length; j++) {
                matrizMagico[i][j] = ra.nextInt(9 - 1 + 1) + 1;
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matrizMagico.length; i++) {
            for (int j = 0; j < matrizMagico[i].length; j++) {
                System.out.print(matrizMagico[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public int sumarFila(int fila){
        int acumulador = 0;
        
        for (int i = 0; i < matrizMagico[fila].length; i++) {
            acumulador += matrizMagico[fila][i];
        }
        
        return acumulador;
    }
}
