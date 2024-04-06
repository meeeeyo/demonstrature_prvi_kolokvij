/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vjezba_za_faks.kolokvij1_projekti_troskovi;

import java.util.Scanner;

/**
 *
 * @author Meeeyo
 */
public class Pomocno {
    
    public static Scanner ulaz;
    
    public static String ucitajString(String poruka) {
        String s=new String();
        while(true){
            System.out.println(poruka);
            s = Pomocno.ulaz.nextLine();
            if(!s.trim().isBlank()){
                return s;
            }
            System.out.println("Obavezan unos");	
        }
    }
    
    public static boolean ucitajBoolean(String poruka) {
    while (true) {
        System.out.println(poruka);
        String input = Pomocno.ulaz.nextLine();
        if (input.equalsIgnoreCase("true")) {
            return true;
        } else if (input.equalsIgnoreCase("false")) {
            return false;
        } else {
            System.out.println("Neispravan unos");  
        }
    }
}
    
    public static float ucitajFloat(String poruka) {
        while (true) {
            System.out.println(poruka);
            try {
                return Float.parseFloat(Pomocno.ulaz.nextLine());
            } catch (Exception e) {
                System.out.println("Decimalni broj s točkom");   
            }
        }
    }
    
}
