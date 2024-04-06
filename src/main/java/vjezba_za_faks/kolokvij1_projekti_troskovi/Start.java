/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vjezba_za_faks.kolokvij1_projekti_troskovi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Meeeyo
 */
public class Start {

    private List<Projekt> projekti;

    public Start() {
        projekti = new ArrayList<>();
        Pomocno.ulaz = new Scanner(System.in);
        
        ucitajProjekte();
        ispisProjekata();
        ispisProsjekPlace();
        

        Pomocno.ulaz.close();
    }

    public static void main(String[] args) {
        new Start(); // izvodi sve ostale metodu u klasi
    }

    
    
    
    
    private void ucitajProjekte() {
        
        do{
            ucitajProjekt();
        }while(!Pomocno.ucitajString("Gotov s unosom projekta(g)?").equalsIgnoreCase("g"));
    }

    private void ucitajProjekt() {
        System.out.println("Unos novog projekta");
        
        Projekt p = new Projekt();
        
        p.setSifra(Pomocno.ucitajString("Upiši šifru projekta"));
        p.setNaziv(Pomocno.ucitajString("Upiši naziv projekta"));
        p.setZavrsen(Pomocno.ucitajBoolean("Je li projekt gotov (true/false)"));
        p.setVoditelj(ucitajVoditelja());
        projekti.add(p);
    }

    private Voditelj ucitajVoditelja() {
        
        Voditelj v = new Voditelj();
        
        v.setIme(Pomocno.ucitajString("Unesi ime voditelja"));
        v.setPrezime(Pomocno.ucitajString("Unesi prezime voditelja"));
        v.setGodisnja_placa(Pomocno.ucitajFloat("Unesi godišnju plaću voditelja"));
        
        return v;
        
    }

    private void ispisProjekata() {
        
        for (Projekt p: projekti){
            System.out.println(p.getNaziv() + ": " + (p.getVoditelj().getGodisnja_placa()/12));
        }
    
    
    }

    private void ispisProsjekPlace() {
        
        float suma = 0;
        int projektZavrsen = 0;
        for (Projekt p : projekti){
            if(p.isZavrsen() == true){
                suma += p.getVoditelj().getGodisnja_placa()/12;
                projektZavrsen++;
            }
        }
        System.out.println("Prosjek mjesečnih plaća završenih projekata: " + suma/projektZavrsen);
        
    }
}
