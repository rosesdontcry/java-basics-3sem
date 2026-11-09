package lab8.task1;

public class Main {
    public static void main(String[] args) {
        testBoxAdd();
    }

    private static void testBoxAdd() {
        System.out.println("- Box.add -");

        Box box = new Box(10);
        check("шар (4.19) влезает", box.add(new Ball(1)));
        check("цилиндр (3.14) влезает", box.add(new Cylinder(1, 1)));
        check("пирамида (2) влезает", box.add(new Pyramid(3, 2)));
        check("пирамида (3) не влезает", box.add(new Pyramid(3, 3)));

        System.out.println(box);
    }

    private static void check(String description, boolean condition) {
        System.out.println((condition ? "[OK]   " : "[FAIL] ") + description);
    }
}