public class Test {
    public static void main(String[] args) {
        int sum = 0, i = 0, j = 0;
        for (i = 0; i < 10; i++)
            sum += i;
        if (i < j)
            System.out.println(i);
        else
            System.out.println(j);
        while (j < 10) {
            j++;

        }
        do {
            j++;
        } while (j < 10);
        System.out.println("i:" + i + " j:" + j + " sum:" + sum);
    }
}
