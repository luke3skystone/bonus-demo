package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bonusServiceTest {

    @Test
    void calculate() {
        bonusService service = new bonusService();
        service.calculate(5_000,49_000);
        assertEquals(3_780,3_780);


    }
}