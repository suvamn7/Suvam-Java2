package sortingtimes;

import java.util.Arrays;

public class SortingTimes {

    public static void main(String[] args) {
        int[] a = new int[50];
        for (int i = 0; i < 50; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        int[] b = new int[50];
        for (int i = 0; i < 50; i++) {
            b[i] = a[i];
        }
        long startTime = System.nanoTime();
        bubbleSort(a);
        long bubbleSortTime = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        selectionSort(b);
        long selectionSortTime = System.nanoTime() - startTime;
        System.out.println("Bubble Sort time: " + bubbleSortTime + ", Selection Sort time: " + selectionSortTime);
        String[] Array = new String[15];
        Array[0] = "Taylor Swift";
        Array[1] = "Cool";
        Array[2] = "Nice";
        Array[3] = "Hello";
        Array[4] = "Die";
        Array[5] = "Be Alive";
        Array[6] = "Where you going";
        Array[7] = "Give right now";
        Array[8] = "Out of my mind";
        Array[9] = "I don't want to die";
        Array[10] = "Logic?";
        Array[11] = "I don't want to cry";
        Array[12] = "Could  it be you calling me down";
        Array[13] = "All that I am is all that I see";
        Array[14] = "Is there a reason you saying all this";
        Arrays.sort(Array);
        startTime = System.nanoTime();
        selectionSort2(Array);
        long selectionSort2Time = System.nanoTime() - startTime;

        System.out.println("Selection Sort time: " + selectionSort2Time);
        for (int i = 0; i < Array.length; i++) {

            System.out.println(Array[i]);

        }
        
        

    }

    //this is the main function for bubble sort
    public static void bubbleSort(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }

        }
    }

    public static void bubbleSort2(String array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i].compareTo(array[k]) < 0) {
                    String temp;
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;

                }

            }

        }
    }

    //this is the function for selection sort
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int index = i;

                if (arr[j] < arr[index]) {
                    index = j;
                    int smallerNumber = arr[index];
                    arr[index] = arr[i];
                    arr[i] = smallerNumber;
                }
            }

        }
    }
      private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //this is the function for selection sort
    public static void selectionSort2(String[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                    String smallerNumber = arr[index];
                    arr[index] = arr[i];
                    arr[i] = smallerNumber;
                }
            }

        }
    }
    public static void InsertionSort(int [] arr) {
        for (int i=0; i< arr.length -1; i++) {
            int j= i; 
            for (j=0; arr[j] < arr[i]; i--){
                swapNumbers(i,j,arr);
            }
                    
        }
    }

}
