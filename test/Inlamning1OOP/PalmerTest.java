package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class PalmerTest {
    Palmer palm1 = new Palmer("Olof", 1);
    Palmer palm2 = new Palmer("Laura", 5);

    double palm1Test =palm1.setmängdVätska();
    double palm2Test = palm2.setmängdVätska();
    double palm1TestKorrekt = 0.5;
    double palm2TestKorrekt = 2.5;
    double palmTestInkorrekt = 2.7;

    @Test
    void setmängdVätska() {                           //TDD för att testa uträkningsmetoden setmängdVätska för Palmer
        assert (palm1Test== palm1TestKorrekt && palm2Test == palm2TestKorrekt);
        assert (palm1Test!= palmTestInkorrekt);
        assert (palm2Test!= palmTestInkorrekt);
    }
}