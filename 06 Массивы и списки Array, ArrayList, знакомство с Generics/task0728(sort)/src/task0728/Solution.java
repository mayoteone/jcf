package task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.


Requirements:
1. Программа должна считывать 20 целых чисел с клавиатуры.
2. Программа должна выводить 20 чисел.
3. В классе Solution должен быть метод public static void sort(int[] array).
4. Метод main должен вызывать метод sort.
5. Метод sort должен сортировать переданный массив по убыванию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int n = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = n;
        }

        /*
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        for (int i = 0; i < arrayCopy.length; i++) {
            array[i] = arrayCopy[arrayCopy.length - 1 - i];
        }*/

    }
}
