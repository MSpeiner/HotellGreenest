package Inlamning1OOP;

import org.junit.jupiter.api.Test;

class KaktusarTest {
    private Kaktusar kaktus = new Kaktusar("Igge", 0.2);
    private double kaktusTestKorrekt = 0.02;
    private double kaktusTestInKorrekt = 0.01;
    private double kaktusTest = kaktus.setmängdVätska();

    @Test
    void setmängdVätska() {                             //TDD för att testa uträkningsmetoden setmängdVätska för Kaktusar

        assert (kaktusTest == kaktusTestKorrekt);
        assert(kaktusTest != kaktusTestInKorrekt);
    }
}