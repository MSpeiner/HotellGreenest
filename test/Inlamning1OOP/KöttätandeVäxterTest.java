package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class KöttätandeVäxterTest {
    KöttätandeVäxter kVäxt = new KöttätandeVäxter("Meatloaf", 0.7);
    double kväxtTest = kVäxt.setmängdVätska();
    double kväxtTestKorrekt = 0.1 + (0.2 * 0.7);
    double kväxtTestEjKorrekt = 5;

    @Test
    void setmängdVätska() {                                 //TDD för att testa uträkningsmetoden setmängdVätska för KöttätandeVäxter
        assert (kväxtTest == kväxtTestKorrekt);
        assert (kväxtTest != kväxtTestEjKorrekt);
    }
}