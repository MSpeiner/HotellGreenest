package Inlamning1OOP;

import javax.swing.*;
import java.util.List;

public class Växter implements VäxtKrav { //Implementerar interfacet HotellGreenest

    public enum VäxternasVätskor {             //Enum som innehåller ett konstant värde med blommornas olika vätskor
        MINERALVATTEN("Mineralvatten"), PROTEINDRYCK("Proteindryck"), KRANVATTEN("Kranvatten");
    public final String vätskaFörVäxt;
    VäxternasVätskor(String s){

        vätskaFörVäxt = s;
    }
}

    protected String namn;                      //Inkapsling av variabel
    protected double längd;                     //Inkapsling av variabel
    protected double mängdVätska;               //Inkapsling av variabel
    protected String vätska;                    //Inkapsling av variabel

    public Växter() {}

    public Växter(String namn, double längd) {
        this.namn = namn;
        this.längd = längd;
    }

    public String vilkenPlantaSkaVattnas() {                            //Använder metoden som krävs i interface
        try {
            String vP = JOptionPane.showInputDialog(null, "vilken växt ska få vätska?");
            if (vP.equals(null) || vP.isBlank())
                JOptionPane.showMessageDialog(null, "Du måste skriva in växtens namn.");
            String valdPlantaLowCaseTrim = vP.toLowerCase().trim();
            String valdPlanta = valdPlantaLowCaseTrim.substring(0, 1).toUpperCase() + valdPlantaLowCaseTrim.substring(1);
            return valdPlanta;
        }
        catch (StringIndexOutOfBoundsException e) {
            System.exit(0);
        } catch (NullPointerException y){
            System.exit(0);
        }return "";
    }


    public static boolean finnsValdPlanta(List<Växter> plantor, String valdPlanta) {
        for (Växter planta : plantor) {
            if (planta.namn.equals(valdPlanta)) {
                return true;
            }
        }
        return false;
    }



    public void skrivUtBeskrivning() {                              //Använder metoden som krävs i interface
        JOptionPane.showMessageDialog(null, "Du har valt att vattna " + namn + "\nFölj instruktionerna:\n" +
                "Vätska - " + vätska + "\nMängd vätska - " + mängdVätska + " Liter per dag");
    }

    public void växtenFinnsInte() {                                 //Använder metoden som krävs i interface
        JOptionPane.showMessageDialog(null,"Växten finns inte på HotellGreenest");
        System.exit(0);
    }


}
