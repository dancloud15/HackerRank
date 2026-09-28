package br.com.dna.hackerrank.backToBasic;

import java.util.Scanner;

public class JavaGenerics {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);
    }
}
