package alg1_du1_frommel;

import java.util.Scanner;

/**
 * @author Vojtěch Frömmel
 * zdroj DU: alg1_u02_pocitame.pdf
 * cvičení: 9,10,12
 * 
 * Poznámka č.1: kvůli reálným číslům výsledky zaokrouhluji (většinou se jedná o chybu v řádu 10e-2)
 * Poznámka č.2: Počítám s tím, že mi uživatel zadá smyslné údaje -> nepočítám s vadným vstupem
 */
public class Alg1_du1_frommel {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //UsekovaRychlost.Uloha9a10(sc);
        VypocetGeometrickychTeles.Uloha12(sc);
    }
}