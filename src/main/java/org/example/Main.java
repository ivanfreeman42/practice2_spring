package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var bank1 = new Bank_account("ID1488", 228.1337);
        IO.println(bank1.getBalance());
        bank1.deposit(500);
        bank1.withdraw(200);
        IO.println(bank1.getBalance());
        int[] array1 = new int[10];
        var rand  = new Random();
        var res = new String("");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(10);
            res += array1[i];
            res += " ";
        }
        IO.println(res);
        IO.println(Array_stat.calculate_avg(array1));
        IO.println(Array_stat.find_min(array1));
        IO.println(Array_stat.find_max(array1));
        int[] array2 = null;
        //IO.println(Array_stat.calculate_avg(array2));
        int[] array3 = new int[0];
        //IO.println(Array_stat.calculate_avg(array3));

    }
}
