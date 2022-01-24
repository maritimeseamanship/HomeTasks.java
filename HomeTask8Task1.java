package com.katetaier8;

public class HomeTask8Task1 {

    public static void main(String[] args) {

        /*Электронные часы показывают время в формате от 00:00 до 23:59.
        Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
         для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
         */
        int count = getCount();
        System.out.println(count);

    }

    private static int getCount() {
        int count = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j <= 59; j++) {
                //Let's compare hours and minutes
                if (i / 10 % 10 == j % 10 && i % 10 == j / 10 % 10) {
                    count++;
                }
            }
        }
        return count;
    }
}



