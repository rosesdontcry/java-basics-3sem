package lab4.task1;

public class MyCharacter implements Comparable<MyCharacter> {
    private final char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return value;
    }

    @Override
    public int compareTo(MyCharacter anotherCharacter) {
        return this.value - anotherCharacter.charValue();
    }

    @Override
    public boolean equals(Object anotherCharacter) {
        if (anotherCharacter instanceof MyCharacter) {
            MyCharacter ch = (MyCharacter) anotherCharacter;
            return (ch.charValue() == this.value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Character.hashCode(value);
    }

    public boolean isDigit() {
        return (this.value >= '0') && (this.value <= '9');
    }

    public static boolean isDigit(MyCharacter ch) {
        char c = ch.charValue();
        return c >= '0' && c <= '9';
    }

    public static boolean isLetter(MyCharacter ch) {
        char c = ch.charValue();
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isLetterOrDigit(MyCharacter ch) {
        return isDigit(ch) || isLetter(ch);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
