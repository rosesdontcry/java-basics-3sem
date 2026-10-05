package lab3.task1;

import java.util.Random;

public class Array2DGenerator {

    public static double[][] generate(int rows, int cols, int minValue, int maxValue) {
        double[][] array = new double[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = minValue + (maxValue - minValue) * random.nextDouble();
            }
        }

        return array;
    }

    public static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }
}