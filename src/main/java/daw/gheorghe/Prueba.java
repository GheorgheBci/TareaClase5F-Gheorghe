package daw.gheorghe;

/**
 *
 * @author Jorge
 */
public class Prueba {

    public static void main(String[] args) {

        CuadradoMagico cm1 = new CuadradoMagico();

        cm1.imprimirMatriz();
        
        System.out.println("La suma total es: " + cm1.sumarFila(2));
    }
}
