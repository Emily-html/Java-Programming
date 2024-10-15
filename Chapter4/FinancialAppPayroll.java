import java.util.Scanner;

public class FinancialAppPayroll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name = in.nextLine();
        System.out.println("Enter number of hours worked in a week:");
        int hour = in.nextInt();
        System.out.println("Enter hourly pay rate:");
        double payrate = in.nextDouble();
        System.out.println("Enter federal tax withholding rate:");
        double federalrate = in.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double staterate = in.nextDouble();
        System.out.println("Employee Name:" + name);
        System.out.println("Hours Worked:" + hour);
        System.out.println("Pay Rate:$" + payrate);
        System.out.println("Gross Pay:$" + payrate * hour);
        System.out.println("Deductions:");
        System.out.println("Federal Withholding(" + federalrate * 100 + "):$" + payrate * hour * federalrate);
        System.out.println("State Withholding(" + staterate * 100 + "):$" + payrate * hour * staterate);
        System.out.println(
                "Federal Withholding(" + federalrate * 100 + "):$" + payrate * hour * (staterate + federalrate));
        System.out.println("Net Pay:$" + payrate * hour * (1 - federalrate - staterate));
        in.close();
    }
}
