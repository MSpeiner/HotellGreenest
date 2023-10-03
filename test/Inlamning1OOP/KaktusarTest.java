package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class KaktusarTest {
    Kaktusar kaktus = new Kaktusar("Igge", 0.2);

    @Test
    void setmängdVätska() {
        assert (kaktus.setmängdVätska() == 0.02);
    }
}