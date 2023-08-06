package ru.otus.java.basic.hw3;

public class MainApp {

    public static void main(String[] args) {
        System.out.println(sumOfPositiveElements(new int[][]{{1, 2, 3, -1}, {4, 5, -2, 4}}));
        printSquare(4);
        clearDiagonal(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {1, 2, 3, 4}, {5, 6, 7, 8}});
        System.out.println(findMax(new int[][]{{1, 23, 3, 4}, {5, 6, 92, 8}, {1, 2, 3, 4}, {51, 51, 7, 8}}));
        System.out.println(getSecondLineSum(new int[][]{{1, 2, 3}}));
        System.out.println(getSecondColumnSum(new int[][]{{1, 23, 3, 4}, {5, 6, 92, 8}, {1, 2, 3, 4}, {51, 51, 7, 8}}));
    }

    /* Метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный
    массив, метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0 */
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j <array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    /* Метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из
    символов * со сторонами соответствующей длины */
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }


    /* Метод, принимающий в качестве аргумента квадратный двумерный целочисленный массив, и
    зануляющий его диагональные элементы */
    public static void clearDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
                array[i][i] = 0;
            }
    }

    /* Метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива */
    public static int findMax(int[][] array) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        return maxElement;
    }

    /* Метод, который считает сумму элементов второй строки двумерного массива */
    public static int getSecondLineSum(int[][] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < arr[1].length; i++) {
            sum += arr[1][i];
        }
        return sum;
    }

    /* Метод, который считает сумму элементов второго столбца двумерного массива */
    public static int getSecondColumnSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length < 2) {
                return -1;
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][1];
        }
        return sum;
    }
}