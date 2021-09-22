package com.nisren.missingnumber;

import java.util.Scanner;

public class Main {
    static int[] array = null;
    static int sizeOfArray;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        sizeOfArray = scanner.nextInt();
        array = new int[sizeOfArray];

        for (int i = 0; i<array.length-1; i++) {
            System.out.println("Enter elements of array: ");
            array[i] =scanner.nextInt();
        }
        main.findMissingNumber(array);

    }
    public void findMissingNumber(int[] intArray){
        int sumOfAllNumbers = 0;
        int sumOfGivenNumbers = 0;
        for (int i : intArray){
//            sumOfGivenNumbers = sumOfGivenNumbers + i;
            sumOfGivenNumbers += i;
        }
        sumOfAllNumbers = sizeOfArray*(sizeOfArray+1)/2;
        int missingNumber = sumOfAllNumbers - sumOfGivenNumbers;
        System.out.println();
        System.out.println("The missing number is "+missingNumber);
    }

}
