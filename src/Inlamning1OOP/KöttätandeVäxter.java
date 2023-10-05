package Inlamning1OOP;

public class KöttätandeVäxter extends Växter {          //extends växter (arv) & implementerar interface HotellGreenest
    double basMängdVätska = 0.1;
    double extraTillskottVätska = 0.2;

    public KöttätandeVäxter(String namn, double längd) {
        super(namn, längd);
        this.vätska = VäxternasVätskor.PROTEINDRYCK.vätskaFörVäxt;        //Använder enum för att sätta värdet på string variabeln vätska
        this.mängdVätska = setmängdVätska();
    }

    public double setmängdVätska(){
        this.mängdVätska= basMängdVätska + (extraTillskottVätska*längd);
        return mängdVätska;
    }
}
