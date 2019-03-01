package ru.itpark;

public class bonusService {
    public int calculate(int currentPurchase, int totalPurchase){

        int bonus = (totalPurchase/1_000)*70 + (currentPurchase/1_000)*70;
        return bonus;
    }
 }
