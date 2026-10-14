## Задания по теме 3. Часть 1
### Задание 1

Java-библиотека предоставляет класс `Character`. Предоставьте собственную
реализацию следующих методов (назовите новый класс `MyCharacter`):
````Java
public MyCharacter(char value);
public char charValue();
public int compareTo(MyCharacter anotherCharacter);
public boolean equals(Object anotherCharacter);
public boolean isDigit();
public static boolean isDigit(MyCharacter ch);
public static boolean isLetter(MyCharacter ch);
public static boolean isLetterOrDigit(MyCharacter ch);
````
### Задание 2

Java-библиотека предоставляет класс `String`. Предоставьте собственную
реализацию следующих методов (назовите новый класс `MyString2`):
````Java
public MyString2(char[] chars);
public MyString2 substring(int begin);
public MyString2 substring(int begin, int end);
public boolean equals(Object obj);
public int compareTo(MyString2 obj);
public char[] toChars();
public static MyString2 valueOf(boolean b);
````

### Примечание
Метод `equals()` сравнивает объекты и возвращает `true`, если они равны.
Метод `compareTo()` сравнивает объекты и возвращает `0`, если объекты равны,
`число меньше 0`, если вызвавший объект меньше переданного в параметре, и
`число больше 0`, если вызвавший объект больше переданного в параметре. 