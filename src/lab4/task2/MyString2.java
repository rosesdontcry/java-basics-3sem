package lab4.task2;

public class MyString2 {
    private final char[] str;

    public MyString2(char[] str) {
        this.str = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            this.str[i] = str[i];
        }
    }

    /**
     * Возвращает новую строку, содержащую символы данной строки,
     * начиная с указанного индекса и до конца строки.
     *
     * @param begin индекс начала подстроки (включительно)
     * @return новый объект {@code MyString2}, представляющий подстроку
     * @throws StringIndexOutOfBoundsException если {@code begin} отрицателен
     *                                         или превышает длину строки
     */
    public MyString2 substring(int begin) {
        if (begin < 0 || begin > this.str.length) {
            throw new StringIndexOutOfBoundsException();
        }

        char[] result = new char[this.str.length - begin];
        for (int i = begin; i < this.str.length; i++) {
            result[i - begin] = this.str[i];
        }
        return new MyString2(result);

    }

    /**
     * Возвращает новую строку, содержащую символы данной строки
     * в диапазоне от индекса {@code begin} (включительно) до индекса
     * {@code end} (исключительно).
     *
     * @param begin индекс начала подстроки (включительно)
     * @param end   индекс конца подстроки (исключительно)
     * @return новый объект {@code MyString2}, представляющий подстроку
     * @throws StringIndexOutOfBoundsException если {@code begin} отрицателен,
     *                                         {@code end} превышает длину строки, или {@code begin > end}
     */
    public MyString2 substring(int begin, int end) {
        if (begin < 0 || end > this.str.length || begin > end) {
            throw new StringIndexOutOfBoundsException();
        }

        char[] result = new char[end - begin];
        for (int i = begin; i < end; i++) {
            result[i - begin] = this.str[i];
        }
        return new MyString2(result);
    }

    /**
     * Сравнивает данную строку с другим объектом на равенство.
     * Две строки считаются равными, если они имеют одинаковую длину
     * и совпадают посимвольно.
     *
     * @param obj объект для сравнения
     * @return {@code true}, если переданный объект является экземпляром
     * {@code MyString2} с идентичным содержимым; {@code false} иначе
     */
    public boolean quals(Object obj) {
        if (obj instanceof MyString2 other) {
            if (this.str.length != other.str.length) {
                return false;
            }
            for (int i = 0; i < this.str.length; i++) {
                if (this.str[i] != other.str[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    /**
     * Лексикографически сравнивает данную строку с другой строкой.
     * Сравнение производится посимвольно до первого несовпадения;
     * если все сравненные символы совпадают, сравниваются длины строк.
     *
     * @param anotherString строка, с которой производится сравнение
     * @return отрицательное число, если данная строка лексикографически
     * меньше переданной; ноль, если строки равны; положительное
     * число, если данная строка лексикографически больше переданной
     */
    public int compareTo(MyString2 anotherString) {
        int minLen = Math.min(this.str.length, anotherString.str.length);
        for (int i = 0; i < minLen; i++) {
            if (this.str[i] != anotherString.str[i]) {
                return this.str[i] - anotherString.str[i];

            }
        }
        return 0;
    }


    /**
     * Возвращает копию внутреннего массива символов данной строки.
     * Изменение возвращённого массива не влияет на содержимое
     * исходного объекта {@code MyString2}.
     *
     * @return новый массив {@code char[]}, содержащий символы строки
     */
    public char[] toChars() {
        char[] result = new char[this.str.length];
        for (int i = 0; i < this.str.length; i++) {
            result[i] = this.str[i];
        }
        return result;
    }

    /**
     * Возвращает строковое представление переданного булева значения:
     * {@code "true"} для {@code true} и {@code "false"} для {@code false}.
     *
     * @param b булево значение для преобразования
     * @return объект {@code MyString2}, содержащий текстовое представление
     * переданного значения
     */
    public static MyString2 valueOf(boolean b) {
        char[] result;
        if (b) {
            result = new char[]{'t', 'r', 'u', 'e'};
        } else {
            result = new char[]{'f', 'a', 'l', 's', 'e'};
        }
        return new MyString2(result);
    }


}


