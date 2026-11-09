package lab8.task2;

import lab4.task1.MyCharacter;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        for (MyCharacter ch : new MyCharacter[]{new MyCharacter('9'), new MyCharacter('1'), new MyCharacter('ц'), new MyCharacter('w'), new MyCharacter('/')}) {
            stack.push(ch);
        }
        System.out.println(stack);
        stack.sort();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
