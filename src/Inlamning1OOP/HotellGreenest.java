package Inlamning1OOP;

import java.util.ArrayList;
import java.util.List;

public class HotellGreenest {
    public HotellGreenest() {
        Växter växtEtt = new Kaktusar("Igge", 0.2);                     //Polymorfism
        Växter växtTvå = new KöttätandeVäxter("Meatloaf", 0.7);         //Polymorfism
        Växter växtTre = new Palmer("Laura", 5);                        //Polymorfism
        Växter växtFyra = new Palmer("Olof", 1);                        //Polymorfism

        List<Växter> boendePlantor = new ArrayList<>();
        boendePlantor.add(växtEtt);
        boendePlantor.add(växtTvå);
        boendePlantor.add(växtTre);
        boendePlantor.add(växtFyra);


        Växter växten = new Växter();
        String valdPlanta = växten.vilkenPlantaSkaVattnas();


        boolean finns = Växter.finnsValdPlanta(boendePlantor, valdPlanta);
        if (finns && valdPlanta.equals(växtEtt.namn)) {
            växtEtt.skrivUtBeskrivning();
        } else if (finns && valdPlanta.equals(växtTvå.namn)) {
            växtTvå.skrivUtBeskrivning();
        } else if (finns && valdPlanta.equals(växtTre.namn)) {
            växtTre.skrivUtBeskrivning();
        } else if (finns && valdPlanta.equals(växtFyra.namn)) {
            växtFyra.skrivUtBeskrivning();
        } else
            växten.växtenFinnsInte();
    }

    public static void main(String[] args) {
        HotellGreenest hk = new HotellGreenest();
    }
}
