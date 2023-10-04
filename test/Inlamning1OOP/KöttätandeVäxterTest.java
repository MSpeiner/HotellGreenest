package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class KöttätandeVäxterTest {
    KöttätandeVäxter kVäxt = new KöttätandeVäxter("Meatloaf", 0.7);

    @Test
    void setmängdVätska() {                                 //TDD för att testa uträkningsmetoden setmängdVätska för KöttätandeVäxter
        double kväxtTest = kVäxt.setmängdVätska();

        assert (kväxtTest == 0.1 + (0.2 * 0.7));
        assert (kväxtTest != 5);
    }
}