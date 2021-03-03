package daw.gheorghe;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class CuadradoMagico {

    private static Random ra = new Random();

    private int[][] matrizMagico;

    // Constructor que inicializa la matriz con valores aleatorios entre 1 y 9
    public CuadradoMagico() {
        this.matrizMagico = new int[3][3];

        for (int i = 0; i < matrizMagico.length; i++) {
            for (int j = 0; j < matrizMagico[i].length; j++) {
                matrizMagico[i][j] = ra.nextInt(9 - 1 + 1) + 1;
            }
        }
    }

    // Método que imprime el contenido de la matriz
    public void imprimirMatriz() {
        for (int i = 0; i < matrizMagico.length; i++) {
            for (int j = 0; j < matrizMagico[i].length; j++) {
                System.out.print(matrizMagico[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Método que suma la fila de la matriz que indiquemos por parametros
    public int sumarFila(int fila) {
        int acumulador = 0;

        for (int i = 0; i < matrizMagico[fila].length; i++) {
            acumulador += matrizMagico[fila][i];
        }

        return acumulador;
    }

    // Método que suma la columna de la matriz que indiquemos por parametros
    public int sumarColumna(int columna) {
        int acumulador = 0;

        for (int j = 0; j < matrizMagico.length; j++) {
            acumulador += matrizMagico[j][columna];
        }

        return acumulador;
    }

    // Método que suma la primera diagonal de la matriz
    public int sumarDiagonalPrincipal() {
        int acumulador = 0;

        for (int j = 0; j < matrizMagico.length; j++) {
            acumulador += matrizMagico[j][j];
        }

        return acumulador;
    }

    // Método que suma la segunda diagonal de la matriz
    public int sumarDiagonalSecundaria() {
        int acumulador = 0;

        int contador = 2;

        for (int i = 0; i < matrizMagico.length; i++) {
            acumulador += matrizMagico[i][contador];
            contador--;
        }

        return acumulador;
    }

    // Método para saber si el cuadrado es mágico
    public boolean esCuadradoMagico() {

        boolean si = true;

        // Mediante dos bucles for vamos viendo si el resultado de la suma de una fila es igual al resultado de la suma de una columna
        for (int i = 0; i < matrizMagico.length; i++) {
            for (int j = 0; j < matrizMagico[i].length; j++) {

                if ((sumarFila(i) == sumarColumna(j))) {

                    // Si la primera condición se cumple pasamos a comparar el resultado de sumar la diagonal principal
                    if (sumarFila(i) == sumarDiagonalPrincipal()) {

                        // Si se cumple la condición comparamos con el resultado de sumar la diagonal secundaria
                        if (sumarDiagonalPrincipal() == sumarDiagonalSecundaria()) {
                            si = true;
                        }
                    }

                } else { // Si no se cumple la primera condición devolvera un false
                    si = false;
                }
            }
        }

        return si;
    }
}
