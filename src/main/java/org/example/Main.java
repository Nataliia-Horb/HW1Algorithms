package org.example;

public class Main {
    public static void main(String[] args) {


        int[] mas1 = new int[]{1, 7, 23, 12, 40, 34, 7, 77, 3, 10};
        findElement1(mas1, 7);


        int[] mas2 = new int[]{1, 1, 2, 2, 4, 4, 7, 7, 15, 15, 26, 26, 27, 27, 38, 38, 39, 39, 50, 50, 51, 55, 55};
        findElement2(mas2);
    }

    public static void findElement1(int mas[], int x) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (x == mas[i]) {
                System.out.println("This element is in array. Index number is " + i);
                count++;
            }
        }
        System.out.println("In total, there were " + count + " elements in the array");
        System.out.println();

    }

    //space complexity=1+1=1
    public static int findElement2(int mas[]) {
        for (int i = 0; i < mas.length - 1; i += 2) {
            if (mas[i] == mas[i + 1]) {
            } else {
                System.out.println("A non-repeating element in an array is " + mas[i]);
                return mas[i];
            }
        }
        System.out.println("A non-repeating element in an array is " + mas[mas.length - 1]);
        return mas[mas.length - 1];
    }

}