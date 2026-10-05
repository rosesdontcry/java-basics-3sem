package lab3.task1;

public class Main {
    public static void main(String[] args) {
        double[][] matrix = Array2DGenerator.generate(5, 5, 0, 99);
        Array2DGenerator.printArray(matrix);


        System.out.printf("%s", Location.locateLargest(matrix));
    }
}
