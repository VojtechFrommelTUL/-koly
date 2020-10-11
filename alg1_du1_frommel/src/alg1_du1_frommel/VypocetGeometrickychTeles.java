/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg1_du1_frommel;

import java.util.Scanner;

/**
 *
 * @author Vojtěch Frömmel
 */
public class VypocetGeometrickychTeles {
    
    public static void Uloha12(Scanner sc)
    {
        System.out.println("--------Úloha č.12--------");
        System.out.println("Zadejte tři strany KVÁDRU (x,y,z) [cm]:");
        double xKvadr = sc.nextInt();
        double yKvadr = sc.nextInt();
        double zKvadr = sc.nextInt();
        //objem, plocha kvádru
        double objemKvadru = xKvadr*yKvadr*zKvadr;
        System.out.println("objem kv: " + objemKvadru + "cm3");
        //délka strany krychle, poloměr koule, délka strany pravidelného čtyřstěnu ---> Z OBJEMU
        double delkaStranyKrychleObjem = Math.pow(objemKvadru, 1.0 / 3.0);
        System.out.println("delka strany krychle z objemu kvádru: " + delkaStranyKrychleObjem + "cm kontrola: " + Math.round(Math.pow(delkaStranyKrychleObjem,3.0))+ "cm3");
        double polomerKruhuObjem = Math.pow(objemKvadru / (4.0/3.0 * Math.PI), 1.0 / 3.0);
        System.out.println("poloměr koule z objemu kvádru: " + polomerKruhuObjem + "cm kontrola: " + Math.round(Math.round(Math.pow(polomerKruhuObjem,3.0))*(4.0/3.0)*Math.PI) + "cm3");
        double delkaPravidCtyrstenuObjem = Math.pow(objemKvadru / (Math.sqrt(2)/12),1.0/3.0);
        System.out.println("délka pravid. čtyřstěnu z objemu kvádru: " + delkaPravidCtyrstenuObjem + "cm kontrola: " + Math.round(Math.round(Math.pow(delkaPravidCtyrstenuObjem,3.0))*(Math.sqrt(2)/12)) + "cm3");
        
        //délka strany krychle, poloměr koule, délka strany pravidelného čtyřstěnu ---> Z POVRCHU
        double plochaKvadru = 2*(xKvadr*yKvadr + yKvadr*zKvadr + xKvadr*zKvadr);
        System.out.println("plocha kv: " + plochaKvadru + "cm2");
        double delkaStranyKrychlePlocha = Math.sqrt(plochaKvadru/6.0);
        System.out.println("delka strany krychle z plochy kvádru: " + delkaStranyKrychlePlocha + "cm kontrola: " + Math.round(Math.pow(delkaStranyKrychlePlocha, 2.0)*6)+ "cm2");
        double polomerKruhuPlocha = Math.sqrt(plochaKvadru/(4*Math.PI));
        System.out.println("poloměr koule z plochy kvádru: " + polomerKruhuPlocha + "cm kontrola: " + Math.round(Math.pow(polomerKruhuPlocha,2.0)*4.0*Math.PI) + "cm2");
        double delkaPravidCtyrstenuPlocha = Math.sqrt(plochaKvadru/Math.sqrt(3));
        System.out.println("délka pravid. čtyřstěnu z plochy kvádru: " + delkaPravidCtyrstenuPlocha + "cm kontrola: " + Math.round(Math.sqrt(3)*Math.pow(delkaPravidCtyrstenuPlocha,2.0)) + "cm2");
        
    }
    
}
