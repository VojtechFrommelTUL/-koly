package alg1_du2_frommel;

import java.util.Scanner;

/**
 * @author Vojtěch Frömmel
 */

public class KvadratickaRovnice {
    private static Scanner sc = new Scanner(System.in);
    public static void VypocetKVR()
    {
        double[] reseni = new double[2]; //x1,x2
        
        System.out.println("Načti a,b,c v tomto pořadí ze vzoru (y = ax^2 + bx + c)");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        System.out.println("Kontrola diskriminantu:");
        
        //Kontrola D
        double D;
        D = Math.pow(b, 2) - (4*a*c);
        
        //0,1,2 řešení - větvení
        if(D<0)
        {
            System.out.println("Diskriminant je menší, než nula (" + D +") -> Rovnice není řešitelná v oboru R");
        }
        else if(D==0)
        {
            reseni[0] = a/b;
            System.out.println("Diskriminant je nula -> Rovnice má pouze jedno jenidé řešení: " + reseni[0]);
            
            System.out.println("KONTROLA ŘEŠENÍ");
            if(a*Math.pow(reseni[0], 2)+b*reseni[0] + c == 0) System.out.println("Pro x PLATÍ rovnost -> je řešením KVR");
            else System.out.println("Pro x NEPLATÍ rovnost -> není řešením KVR");
        }
        else
        {
            reseni[0] = (-b + Math.sqrt(D)) / (2*a);
            reseni[1] = (-b - Math.sqrt(D)) / (2*a);
            System.out.println("Diskriminant je kladný (" + D +") -> Rovnice má dvě POTENCIONÁLNÍ řešení");
            System.out.println("x1 = " + reseni[0]);
            System.out.println("x2 = " + reseni[1]);
            
            System.out.println("KONTROLA ŘEŠENÍ");
            if(a*Math.pow(reseni[0], 2)+b*reseni[0] + c == 0) System.out.println("Pro x1 PLATÍ rovnost -> je řešením KVR");
            else System.out.println("Pro x1 NEPLATÍ rovnost -> není řešením KVR");
            if(a*Math.pow(reseni[1], 2)+b*reseni[1] + c == 0) System.out.println("Pro x2 PLATÍ rovnost -> je řešením KVR");
            else System.out.println("Pro x2 NEPLATÍ rovnost -> není řešením KVR");
        }
    }
}
