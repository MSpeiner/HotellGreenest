package Inlamning1OOP;

import org.junit.jupiter.api.Test;



class PalmerTest {
    Palmer palm1 = new Palmer("Olof", 1);
    Palmer palm2 = new Palmer("Laura", 5);

    @Test
    void setmängdVätska() {
        assert (palm1.setmängdVätska() == 0.5 && palm2.setmängdVätska()== 2.5);
    }
}