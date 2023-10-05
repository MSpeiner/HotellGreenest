package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class KaktusarTest {
    Kaktusar kaktus = new Kaktusar("Igge", 0.2);
    double kaktusTestKorrekt = 0.02;
    double kaktusTestInKorrekt = 0.01;
    double kaktusTest = kaktus.setmängdVätska();

    @Test
    void setmängdVätska() {                             //TDD för att testa uträkningsmetoden setmängdVätska för Kaktusar

        assert (kaktusTest == kaktusTestKorrekt);
        assert(kaktusTest != kaktusTestInKorrekt);
    }
}