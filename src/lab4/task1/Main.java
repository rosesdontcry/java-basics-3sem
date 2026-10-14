package lab4.task1;

public class Main {
    public static void main(String[] args) {
        MyCharacter ch1 = new MyCharacter('c');
        MyCharacter ch2 = new MyCharacter('2');

        System.out.println("compareTo:");
        System.out.println(ch1.compareTo(new MyCharacter('f')));
        System.out.println(ch1.compareTo(new MyCharacter('a')));
        System.out.println(ch1.compareTo(new MyCharacter('c')));

        System.out.printf("%nequals:%n");
        System.out.println(ch1.equals('c'));
        System.out.println(ch1.equals(new MyCharacter('c')));

        System.out.printf("%nisDigit(object):%n");
        System.out.println(ch1.isDigit());
        System.out.println(ch2.isDigit());

        System.out.printf("%nisDigit:%n");
        System.out.println(MyCharacter.isDigit(new MyCharacter('4')));
        System.out.println(MyCharacter.isDigit(new MyCharacter('d')));

        System.out.printf("%nisLetter:%n");
        System.out.println(MyCharacter.isLetter(new MyCharacter('4')));
        System.out.println(MyCharacter.isLetter(new MyCharacter('d')));

        System.out.printf("%nisLetterOrDigit:%n");
        System.out.println(MyCharacter.isLetterOrDigit(new MyCharacter('4')));
        System.out.println(MyCharacter.isLetterOrDigit(new MyCharacter('d')));
    }
}
