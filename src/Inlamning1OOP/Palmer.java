package Inlamning1OOP;

public class Palmer extends Växter implements VäxtKrav {           //extends växter (arv) & implementerar interface HotellGreenest
    double basMängdVätska = 0.5;

    public Palmer(String namn, double längd) {
        super(namn, längd);
        this.vätska = VäxternasVätskor.KRANVATTEN.vätskaFörVäxt;      //Använder enum för att sätta värdet på string variabeln vätska
        this.mängdVätska = setmängdVätska();
    }
    public double setmängdVätska() {
        this.mängdVätska = basMängdVätska * längd;
        return mängdVätska;
    }
}
