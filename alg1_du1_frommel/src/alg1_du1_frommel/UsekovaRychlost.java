package alg1_du1_frommel;

import java.util.Scanner;

/**
 *
 * @author Vojtěch Frömmel
 */
public class UsekovaRychlost {
    
    public static void Uloha9a10(Scanner sc)
    {
        //deklarace a inicializace konstant
        final int POKUTA_ZA_KMH = 1000;
        
        //deklarace proměnných
        double maxPovolenaRychlost;
        double delkaUseku;
        int hodPocatek;
        int minPocatek;
        int secPocatek;
        int hodKonec;
        int minKonec;
        int secKonec;
        double rozdilCasu;
        double rozdilRychlosti;
        double prumRychlost;
        double vysePokuty;
        double prumRychlostKMH;
        String pokuta;
        
        //Input
        System.out.println("--------Úloha č.9 a č.10--------");
        System.out.println("Zadejte maximální povolenou rychlost v úseku [km/h]");
        maxPovolenaRychlost = sc.nextInt();
        System.out.println("Zadejte délku úseku v celých metrech");
        delkaUseku = sc.nextInt();
        System.out.println("Zadejte počáteční časový údaj v tomto pořadí: hodina, minuta, sekunda");
        hodPocatek = sc.nextInt();
        minPocatek = sc.nextInt();
        secPocatek = sc.nextInt();
        System.out.println("Zadejte koncový časový údaj v tomto pořadí: hodina, minuta, sekunda");
        hodKonec = sc.nextInt();
        minKonec = sc.nextInt();
        secKonec = sc.nextInt();
        
        //výpočty
        rozdilCasu = (hodKonec*3600 + minKonec*60 + secKonec) - (hodPocatek*3600 + minPocatek*60 + secPocatek);
        
        prumRychlost = delkaUseku/rozdilCasu;
        prumRychlostKMH = (double)(prumRychlost * 3.6);
        rozdilRychlosti = (int) (Math.floor(prumRychlostKMH) - maxPovolenaRychlost);
        
        vysePokuty = rozdilRychlosti*POKUTA_ZA_KMH;
        
        System.out.println("Průměrná rychlost vozidla v úseku dlouhém " + delkaUseku + "m překonaným za " + rozdilCasu + "s je " + prumRychlost + "m/s či " + prumRychlostKMH + "km/h");
        pokuta = rozdilRychlosti > 0 ? "Řidič vozidla dostane pokutu za rychlost ve výši "+vysePokuty+" !" : "Řidič vozidla nedostane pokutu!";
        
        System.out.println(pokuta);
    }
}
