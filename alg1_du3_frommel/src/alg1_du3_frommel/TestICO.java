package alg1_du3_frommel;

import java.util.Scanner;

/**
 *
 * @author Vojtěch Frömmel
 * 
 * Pozn.: Pokud jsem správně pochopil zadání, tak mám program správně. Bohužel jsem nenašel vstup, který by vyhovoval daným podmínkám, tudíž nemám odzkoušený správný výstup.
 */
public class TestICO {
    public static Scanner sc = new Scanner(System.in);
    
    public static void SpravnostICO()
    {
        System.out.println("Zadejte IČO k testování - 7číslic");
        int ICO = sc.nextInt();
        int soucetN;
        int moduloSouctuN;
        //kontrola formátu 1234567
        if(String.valueOf(ICO).length() == 7)
        {
            int n1 = ICO/1_000_000;
            int n2 = (ICO-n1*1_000_000)/100_000;
            int n3 = (ICO-(n1*1_000_000 + n2*100_000))/10_000;
            int n4 = (ICO-(n1*1_000_000 + n2*100_000 + n3*10_000))/1_000;
            int n5 = (ICO-(n1*1_000_000 + n2*100_000 + n3*10_000 + n4*1_000))/100;
            int n6 = (ICO-(n1*1_000_000 + n2*100_000 + n3*10_000 + n4*1_000 + n5*100))/10;
            int n7 = (ICO-(n1*1_000_000 + n2*100_000 + n3*10_000 + n4*1_000 + n5*100 + n6*10));
            System.out.println("kontrola číslic(1-7): " + n1 + n2 + n3 + n4 + n5 + n6 + n7);
            n1 *=8;
            n2 *=7;
            n3 *=6;
            n4 *=5;
            n5 *=4;
            n6 *=3;
            n7 *=2;
            System.out.println("kontrola číslic(1-7) po vynásobení: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " " + n7);
            soucetN = n1+n2+n3+n4+n5+n6+n7;
            System.out.println("kontrola součtu číslic(1-7) po vynásobení: " + soucetN);
            moduloSouctuN = soucetN%11;
            System.out.println("modulo součtu číslic(1-7): " + moduloSouctuN);
            
            if(moduloSouctuN == 0 && n7/2 == 1)
            {
                System.out.println("Platné IČO");
            }
            if(moduloSouctuN == 1 && n7/2 == 0)
            {
                System.out.println("Platné IČO");
            }
            if(n7 == 11 - moduloSouctuN)
            {
                System.out.println("Platné IČO");
            }
            else
            {
                System.out.println("IČO je neplatné");
            }
        }
        else System.out.println("Špatný formát");
    }
}
