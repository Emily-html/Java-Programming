import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example,8.25:");
        double annualInterestRate = in.nextDouble();
        System.out.println("Enter number of years as an integer:");
        int numberOfYears = in.nextInt();
        System.out.println("Enter loan amount, for example,120000.95:");
        double loanAmount = in.nextDouble();
        in.close();
        Loan l = new Loan(annualInterestRate, numberOfYears, loanAmount);
        System.out.printf("The loan was created on%s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",
                l.getLoanDate(), l.getMonthlyPayment(), l.getTotalPayment());

    }
}
