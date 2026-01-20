package org.example;

public class Array_stat {
    public static int find_min(int[] array){
        if(array.length == 0){
            throw new IllegalArgumentException("array is empty");
        }else if(array == null){
            throw new IllegalArgumentException("array is null");
        }
        int min = 0;
        for(int i: array){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public static int find_max(int[] array){
        if(array.length == 0){
            throw new IllegalArgumentException("array is empty");
        }else if(array == null){
            throw new IllegalArgumentException("array is null");
        }
        int max = 0;
        for(int i: array){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    public static double calculate_avg(int[] array){
        if(array.length == 0){
            throw new IllegalArgumentException("array is empty");
        }else if(array == null){
            throw new IllegalArgumentException("array is null");
        }
        double sum = 0;
        for(int i: array){
            sum += i;
        }
        return sum/array.length;
    }
}
