package Inlamning1OOP;

public class KöttätandeVäxter extends Växter implements VäxtKrav {          //extends växter (arv) & implementerar interface HotellGreenest

    public KöttätandeVäxter(String namn, double längd) {
        super(namn, längd);
        this.vätska = VäxternasVätskor.PROTEINDRYCK.vätskaFörVäxt;        //Använder enum för att sätta värdet på string variabeln vätska
        this.mängdVätska = setmängdVätska();
    }

    public double setmängdVätska( ){
        this.mängdVätska= 0.1 + (0.2*längd);
        return mängdVätska;
    }
}
