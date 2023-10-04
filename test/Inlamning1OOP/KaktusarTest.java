package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class KaktusarTest {
    Kaktusar kaktus = new Kaktusar("Igge", 0.2);

    @Test
    void setmängdVätska() {                             //TDD för att testa uträkningsmetoden setmängdVätska för Kaktusar
        double kaktusTest = kaktus.setmängdVätska();
        assert (kaktusTest == 0.02);
        assert(kaktusTest != 0.01);
    }
}