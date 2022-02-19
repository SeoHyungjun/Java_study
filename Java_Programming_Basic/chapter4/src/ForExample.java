public class ForExample {
    public static void main(String[] args) {
        int num;
        int sum;

        for (num = 1, sum = 0; num <= 10; num++) {
            sum += num;
        }
        System.out.println(sum);
        System.out.println(num);

        int dan;
        int times;

        for (dan = 2; dan <= 9; dan++) {
            for (times = 1; times <= 9; times++) {
                System.out.println(dan + "X" + times + "=" + dan*times);
            }
            System.out.println();
        }
    }
}
