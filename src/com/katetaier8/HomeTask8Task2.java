package com.katetaier8;

public class HomeTask8Task2 {
    public static void main (String[] args){
      /*Найти количество счастливых билетиков на трамвай от 000001 до 999999 - те у которых сумма первых 3 цифр
          равна сумме последних 3*/
        int countTickets = 0;
        System.out.println("The number of happy tickets is " + happyTickets(countTickets) + ".");

    }

    private static int happyTickets(int countTickets) {
        for (int i = 0; i <= 999; i++) {
            for (int j = 0; j <= 999; j++) {
                if (i / 100 + i / 10 % 10 + i % 10 == j / 100 + j / 10 % 10 + j % 10) {
                    countTickets++;
                }
            }
        }
        return countTickets;
    }
}