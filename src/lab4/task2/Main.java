package lab4.task2;

public class Main {
    public static void main(String[] args) {
        MyString2 str1 = new MyString2(new char[]{'f', 'i', 'n', 'a', 'l'});
        MyString2 str2 = new MyString2("final bobi!".toCharArray());

        System.out.println("substring:");
        System.out.println(str2.substring(5).toChars());
        System.out.println(str2.substring(2, 5).toChars());

        System.out.printf("%nequals:%n");
        System.out.println(str1.equals("final"));
        System.out.println(str1.equals(new MyString2("final".toCharArray())));

        System.out.println("compareTo:");
        System.out.println(str1.compareTo(new MyString2("final".toCharArray())));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(new MyString2("fi".toCharArray())));

        System.out.printf("%nvalueOf%n");
        System.out.println(MyString2.valueOf(true));
        System.out.println(MyString2.valueOf(false));

    }
}

