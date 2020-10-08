package alg1_du1_frommel;

import java.util.Scanner;

/**
 * @author Vojtěch Frömmel
 * zdroj DU: alg1_u02_pocitame.pdf
 * cvičení: 9,10,12
 * 
 * Poznámka č.1: Pro takto jednoduchá cvičení jsem úlohy nedělil do samostatných tříd (z nich bych poté volal příslušné metody)-> zbytečné zesložitění.
 * Poznámka č.2: Počítám s tím, že mi uživatel zadá smyslné údaje -> nepočítám s vadným vstupem
 */
public class Alg1_du1_frommel {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Uloha9a10();
    }
    
    
    private static void Uloha9a10()
    {
        final int POKUTA_ZA_KMH = 1000;
        
        System.out.println("--------Úloha č.9--------");
        System.out.println("Zadejte maximální povolenou rychlost v úseku");
        int maxPovolenaRychlost = sc.nextInt();
        System.out.println("Zadejte délku úseku v metrech");
        int delkaUseku = sc.nextInt();
        System.out.println("Zadejte počáteční časový údaj v tomto pořadí: hodina, minuta, sekunda");
        int hodPocatek = sc.nextInt();
        int minPocatek = sc.nextInt();
        int secPocatek = sc.nextInt();
        System.out.println("Zadejte koncový časový údaj v tomto pořadí: hodina, minuta, sekunda");
        int hodKonec = sc.nextInt();
        int minKonec = sc.nextInt();
        int secKonec = sc.nextInt();
        
    }
    
    private static void Uloha12()
    {
    
    }
}
