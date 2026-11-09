package lab7.task1;

import lab5.task1.FeatureFilm;
import lab5.task1.Movie;


public class Main {
    public static void main(String[] args) {
        MyStack s1 = new MyStack();
        try {
            s1.push(1000);
            s1.push(2000);
            s1.push(1000);
        }catch (DuplicateElementException e){
            System.out.println(e.getMessage());
        }

        System.out.println(s1);

        try {
            s1.pop();
            s1.pop();
            s1.pop();
        }catch (StackEmptyException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println();

        MyStack s2 = new MyStack();
        try {
            s2.push('a');
            s2.push('b');
            s2.push('a');
        }catch (DuplicateElementException e){
            System.out.println(e.getMessage());
        }

        System.out.println(s2);


        try {
            s2.pop();
            s2.pop();
            s2.pop();
        }catch (StackEmptyException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println();

        MyStack s3 = new MyStack();
        try {
            s3.push(new FeatureFilm("Матрица", 136, 8.7, "фантастика"));
            s3.push(new FeatureFilm("Остров проклятых", 138, 8.2, "триллер"));
            s3.push(new FeatureFilm("Матрица", 136, 4, "фантастика"));
        }catch (DuplicateElementException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println(s3);


        try {
            s3.pop();
            s3.pop();
            s3.pop();
        }catch (StackEmptyException e){
            System.out.println(e.getMessage());
        }


        System.out.println();

    }
}
