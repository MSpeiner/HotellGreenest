package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class PalmerTest {
    Palmer palm1 = new Palmer("Olof", 1);
    Palmer palm2 = new Palmer("Laura", 5);

    private double palm1Test =palm1.setmängdVätska();
    private double palm2Test = palm2.setmängdVätska();
    private double palm1TestKorrekt = 0.5;
    private double palm2TestKorrekt = 2.5;
    private double palmTestInkorrekt = 2.7;

    @Test
    void setmängdVätska() {                           //TDD för att testa uträkningsmetoden setmängdVätska för Palmer
        assert (palm1Test== palm1TestKorrekt && palm2Test == palm2TestKorrekt);
        assert (palm1Test!= palmTestInkorrekt && palm2Test!= palmTestInkorrekt);
    }
}