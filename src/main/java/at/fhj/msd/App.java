package at.fhj.msd;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Umejr Dzinovic
 */
public class App {

    public static void main(String[] args) {

        //Generate integer numbers
        Random rnd = new Random();
        //Integer[] numbers = new Integer[10];
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100);
        }

        //Generate Double numbers
        double[] numbers2 = new double[10];

        for (int i = 0; i < numbers2.length; i++) {

            double number = rnd.nextDouble(100.0);
            double roundedNumber = Math.round(number * 100.0) / 100.0;
            numbers2[i] = roundedNumber;
        }

        System.out.println("Before:");
        printArray(numbers);
        printArrayDouble(numbers2);

        System.out.println("After:");
        insertionSort(numbers);
        insertionSort2(numbers2);
        printArray(numbers);
        printArrayDouble(numbers2);
    }

    //?Methods to print Array

    public static void printArray(int[] array) {

        System.out.println(Arrays.toString(array));

    }

    public static void printArrayDouble(double[] array) {

        System.out.println(Arrays.toString(array));

    }

    //? Insertion Sort

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {  //start at i=1, because the first elemenent at index = 0 is always sorted with itself!

            int currentValue = array[i]; //We are copying the value to a temp variable!

            int j = i - 1;  //use new iteration variable and set it's index one before the current i

            //? Use new j-iteration varialbe to go backwards in the array. 
            // it should terminate when...
            // 1. j >= is symbolizing the first element of the array
            // 2. if array[j] is actually smaller then array[i]
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];  //if array[j] > currentValue, swap the elements 
                j--;

            }
            array[j + 1] = currentValue; //set empty field to current value

        }

    }

    public static void insertionSort2(double[] array) {

        for (int i = 1; i < array.length; i++) {

            double currentValue = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = currentValue;

        }

    }

}
