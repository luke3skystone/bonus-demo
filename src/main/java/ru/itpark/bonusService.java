package ru.itpark;

class bonusService {
    void calculate(int currentPurchase, int totalPurchase){

        int bonus = (totalPurchase/1_000)*70 + (currentPurchase/1_000)*70;
    }
 }
