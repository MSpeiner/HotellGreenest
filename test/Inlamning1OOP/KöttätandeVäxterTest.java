package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class KöttätandeVäxterTest {
    KöttätandeVäxter kVäxt = new KöttätandeVäxter("Meatloaf", 0.7);

    @Test
    void setmängdVätska() {
        assert (kVäxt.setmängdVätska() == 0.1+ (0.2*0.7));
    }
}