package Inlamning1OOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VäxterTest {

    Kaktusar testVäxtEtt = new Kaktusar("Igge", 0.2);


    @Test
    void vilkenPlantaSkaVattnas() {
        assert(testVäxtEtt.vilkenPlantaSkaVattnas().equals("Igge"));
    }

    @Test
    void finnsValdPlanta() {
    }

    @Test
    void skrivUtBeskrivning() {
    }

    @Test
    void växtenFinnsInte() {
    }
}