import java.util.Scanner;

public class Ep10PrintCalendar {
    public static void main(String[] args) {
        System.out.println("Enter full year (e.g. 2012):");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println("Enter moonth as number between 1 and 12:");
        int month = in.nextInt();
        System.out.println("        " + month + " " + year);
        System.out.println("-------------------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        Calendar(year, month);
        in.close();
    }

    public static void Calendar(int year, int month) {
        int days_sum = 0;
        for (int i = 2005; i < year; i++) {
            if (year % 4 == 0 && year % 100 != 0)
                days_sum += 366;
            else
                days_sum += 365;
        }
        for (int i = 1; i < month; i++) {
            switch (i) {

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days_sum += 31;
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0) {
                        days_sum += 29;
                    } else {
                        days_sum += 28;
                    }
                    break;
                default:
                    days_sum += 30;
                    break;
            }

        }
        int day;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;

                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            default:
                day = 30;
                break;
        }

        int f;

        f = (days_sum % 7 + 6) % 7;
        switch (f) {
            case 1:

                System.out.printf("%d", 1);
                break;
            case 2:

                System.out.printf("%5d", 1);
                break;
            case 3:

                System.out.printf("%9d", 1);
                break;
            case 4:

                System.out.printf("%13d", 1);
                break;
            case 5:

                System.out.printf("%17d", 1);
                break;
            case 6:

                System.out.printf("%21d", 1);

                break;
            case 7:

                System.out.printf("%25d", 1);
                break;

        }
        for (int i = 2; i <= day; i++) {
            System.out.printf("%4d", i);

        }
    }
}
