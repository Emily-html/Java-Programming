public class Tuesday {
    public static void main(String[] args) {
        int day = 100 % 7;
        switch (day) {
            case 0:
                System.out.println("The day 100 days after is:Tuesday.");
                break;
            case 1:
                System.out.println("The day 100 days after is:Wedsday.");
                break;
            case 2:
                System.out.println("The day 100 days after is:Thursday.");
                break;
            case 3:
                System.out.println("The day 100 days after is:Friday.");
                break;
            case 4:
                System.out.println("The day 100 days after is:Saturday.");
                break;
            case 5:
                System.out.println("The day 100 days after is:Sunday.");
                break;
            case 6:
                System.out.println("The day 100 days after is:Monday.");
                break;
        }
    }
}
