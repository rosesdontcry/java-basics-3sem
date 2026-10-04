package lab2.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 100_000;
        int[] array = generateRandomArray(size);

        StopWatch timer = new StopWatch();

        timer.start();

        BubbleSort.sort(array);

        timer.stop();

        System.out.printf("Заняло времени: %d мс%n", timer.getElapsedTime());
    }

    private static int[] generateRandomArray(int size){
        Random random = new Random();
        int [] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1_000_000);
        }
        return arr;
    }
}
