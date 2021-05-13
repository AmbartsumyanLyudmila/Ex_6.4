package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.print("Введите целое число(кол-во символов в массиве):");
        Scanner n = new Scanner(System.in);
        int symbol = n.nextInt();
        int[] num1 = new int[symbol];
        System.out.println("Введите " + symbol + " цифр(ы) через пробел и нажмите Enter");

        int i;
        for(i = 0; i < symbol; ++i) {
            num1[i] = n.nextInt();
            System.out.print(num1[i]+" ");
        }

        System.out.println();
        System.out.print("Числа, которые деляться на 5: ");
        for(i = 0; i < symbol; ++i) {
            if (num1[i] % 5 == 0 ) {
                System.out.print( num1[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Числа, которые деляться на 7: ");
        for(i = 0; i < symbol; ++i) {
            if (num1[i] % 7 == 0) {
                System.out.print(num1[i] + " ");
            }
        }
    }
}


