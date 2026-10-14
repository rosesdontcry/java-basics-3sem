package lab4.task1;

public class MyCharacter {
    private final char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    /**
     * Возвращает значение символа, хранимое в этом объекте.
     *
     * @return примитивное значение {@code char}, обёрнутое данным объектом
     */
    public char charValue() {
        return value;
    }

    /**
     * Сравнивает данный символ с другим символом в числовом порядке
     * (по коду символа в таблице Unicode).
     *
     * @param anotherCharacter символ, с которым производится сравнение
     * @return отрицательное число, если данный символ меньше переданного;
     * ноль, если символы равны;
     * положительное число, если данный символ больше переданного
     */
    public int compareTo(MyCharacter anotherCharacter) {
        return this.value - anotherCharacter.charValue();
    }

    /**
     * Сравнивает данный объект с другим объектом на равенство.
     * Два объекта {@code MyCharacter} считаются равными, если они
     * хранят одно и то же значение {@code char}.
     *
     * @param anotherCharacter объект для сравнения
     * @return {@code true}, если переданный объект является экземпляром
     * {@code MyCharacter} и хранит то же значение символа;
     * {@code false} в противном случае
     */
    public boolean equals(Object anotherCharacter) {
        if (anotherCharacter instanceof MyCharacter) {
            MyCharacter ch = (MyCharacter) anotherCharacter;
            return (ch.charValue() == this.value);
        }
        return false;
    }


    /**
     * Проверяет, является ли данный символ десятичной цифрой
     * (символом из диапазона {@code '0'}–{@code '9'}).
     *
     * @return {@code true}, если символ является цифрой; {@code false} иначе
     */
    public boolean isDigit() {
        return (this.value >= '0') && (this.value <= '9');
    }

    /**
     * Проверяет, является ли переданный символ десятичной цифрой
     * (символом из диапазона {@code '0'}–{@code '9'}).
     *
     * @param ch объект {@code MyCharacter} для проверки
     * @return {@code true}, если символ является цифрой; {@code false} иначе
     */
    public static boolean isDigit(MyCharacter ch) {
        char c = ch.charValue();
        return c >= '0' && c <= '9';
    }

    /**
     * Проверяет, является ли переданный символ латинской буквой
     * (строчной {@code 'a'}–{@code 'z'} или заглавной {@code 'A'}–{@code 'Z'}).
     *
     * @param ch объект {@code MyCharacter} для проверки
     * @return {@code true}, если символ является буквой; {@code false} иначе
     */
    public static boolean isLetter(MyCharacter ch) {
        char c = ch.charValue();
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    /**
     * Проверяет, является ли переданный символ буквой или цифрой.
     *
     * @param ch объект {@code MyCharacter} для проверки
     * @return {@code true}, если символ является буквой или цифрой;
     * {@code false} иначе
     */
    public static boolean isLetterOrDigit(MyCharacter ch) {
        return isDigit(ch) && isLetter(ch);
    }
}
