package daw.gheorghe;

/**
 *
 * @author Jorge
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        CuadradoMagico cm1 = new CuadradoMagico();
        
        cm1.imprimirMatriz();
        
        System.out.println("La suma total de la fila es: " + cm1.sumarFila(0));
        
        System.out.println("La suma total de la columna es: " + cm1.sumarColumna(1));
        
        System.out.println("La suma total de la diagonal principal es: " + cm1.sumarDiagonalPrincipal());
        
        System.out.println("La suma total de la diagonal secundaria es: " + cm1.sumarDiagonalSecundaria());
    }
}
