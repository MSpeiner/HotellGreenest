package Inlamning1OOP;

public class Kaktusar extends Växter implements VäxtKrav {         //extends växter (arv) & implementerar interface HotellGreenest
    double basMängdVätska = 0.02;

    public Kaktusar(String namn, double längd) {
        super(namn, längd);
        this.vätska = VäxternasVätskor.MINERALVATTEN.vätskaFörVäxt;         //Använder enum för att sätta värdet på string variabeln vätska
        this.mängdVätska = setmängdVätska();
    }
    public double setmängdVätska( ){
        this.mängdVätska = basMängdVätska;
        return mängdVätska;
    }
}


