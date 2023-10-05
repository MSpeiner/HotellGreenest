package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class KöttätandeVäxterTest {
    private KöttätandeVäxter kVäxt = new KöttätandeVäxter("Meatloaf", 0.7);
    private double kväxtTest = kVäxt.setmängdVätska();
    private double kväxtTestKorrekt = 0.1 + (0.2 * 0.7);
    private double kväxtTestEjKorrekt = 5;

    @Test
    void setmängdVätska() {                                 //TDD för att testa uträkningsmetoden setmängdVätska för KöttätandeVäxter
        assert (kväxtTest == kväxtTestKorrekt);
        assert (kväxtTest != kväxtTestEjKorrekt);
    }
}