package lab3.task2;

public class Main {
    static void main() {
        MyTime tim1 = new MyTime();
        MyTime time2 = new MyTime(555550000);
        MyTime time3 = new MyTime(5, 23, 55);

        System.out.println("Текущее время: " + tim1);
        System.out.println("Время из миллисекунд (555550000): " + time2);
        System.out.println("Заданное время: " + time3);
    }
}
