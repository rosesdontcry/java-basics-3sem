package lab6.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Triangle[] arr = new Triangle[10];
        Random random = new Random(); //как работает очистка
        for (int i = 0; i < 10; i++) {
            try {
                arr[i] = new Triangle(random.nextDouble(10),
                        random.nextDouble(10),
                        random.nextDouble(10));
                System.out.println("треугольник " + i + " создан");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
    }
}
