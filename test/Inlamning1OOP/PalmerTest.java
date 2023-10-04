package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class PalmerTest {
    Palmer palm1 = new Palmer("Olof", 1);
    Palmer palm2 = new Palmer("Laura", 5);

    @Test
    void setmängdVätska() {                           //TDD för att testa uträkningsmetoden setmängdVätska för Palmer
        double palm1Test =palm1.setmängdVätska();
        double palm2Test = palm2.setmängdVätska();

        assert (palm1Test== 0.5 && palm2Test== 2.5);
        assert (palm1Test!= 0.3);
        assert (palm2Test!= 2.7);
    }
}