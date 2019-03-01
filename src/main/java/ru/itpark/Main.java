package ru.itpark;

public class Main {
    public static void main(String[] args) {
        bonusService bonusService = new bonusService();
        int bonus = bonusService.calculate(5_000,49_000);
        System.out.println(bonus);
    }
}
