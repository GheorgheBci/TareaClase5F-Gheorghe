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

    public int sumarFila(int fila) {
        int acumulador = 0;

        for (int i = 0; i < matrizMagico[fila].length; i++) {
            acumulador += matrizMagico[fila][i];
        }

        return acumulador;
    }

    public int sumarColumna(int columna) {
        int acumulador = 0;

        for (int j = 0; j < matrizMagico.length; j++) {
            acumulador += matrizMagico[j][columna];
        }

        return acumulador;
    }

    public int sumarDiagonalPrincipal() {
        int acumulador = 0;

        for (int j = 0; j < matrizMagico.length; j++) {
            acumulador += matrizMagico[j][j];
        }

        return acumulador;
    }

    public int sumarDiagonalSecundaria() {
        int acumulador = 0;

        int contador = 2;

        for (int i = 0; i < matrizMagico.length; i++) {
            acumulador += matrizMagico[i][contador];
            contador--;
        }

        return acumulador;
    }

    public boolean esCuadradoMagico() {

        boolean si = true;

        for (int i = 0; i < matrizMagico.length; i++) {
            for (int j = 0; j < matrizMagico[i].length; j++) {

                if ((sumarFila(i) == sumarColumna(j))) {

                    if (sumarFila(i) == sumarDiagonalPrincipal()) {

                        if (sumarDiagonalPrincipal() == sumarDiagonalSecundaria()) {
                            si = true;
                        }
                    }
                    
                } else {
                    si = false;
                }
            }
        }

        return si;
    }
}
