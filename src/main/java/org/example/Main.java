package org.example;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 1, 2, 2, 4, 4, 7, 7, 15, 15, 26, 26, 27, 27, 38, 38, 39, 39, 50, 50, 51, 55, 55};
        findElement(mas);
    }

    //space complexity=1+1=1
    public static int findElement(int mas[]) {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] == mas[i + 1]) {
                i++;
            } else {
                System.out.println(mas[i]);
                return mas[i];
            }
        }
        System.out.println(mas[mas.length - 1]);
        return mas[mas.length - 1];
    }
}