package lab6.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Random random = new Random();
        int countRejected = 0;
        int countApproved = 0;
        for (int i = 0; i < 25; i++) {
            try {
                bank.approveLoan(new LoanRequest(
                        random.nextDouble(4000),
                        random.nextInt(24)));
                countApproved ++;
            } catch (InvalidTermException | InvalidAmountException e) {
                System.out.println(e.getMessage());
                countRejected++;
            }
        }

        System.out.println("прошло: " + countApproved);
        System.out.println("не прошло: " + countRejected);
        System.out.println("в списке: " + bank.size());
    }
}
