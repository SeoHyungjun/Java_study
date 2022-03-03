package array;

public class ArrayTest2 {
    public static void main(String[] args) {

        double[] num = new double[5];
        num[0] = 10.0;
        num[1] = 20.0;
        num[2] = 30.0;

        double total = 0.0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }

        System.out.println(total);

        double mul = 1;
        for (int i = 0; i < num.length; i++) {
            mul *= num[i];
        }

        System.out.println(mul);

        double[] num2 = new double[5];
        int size = 0;
        num2[0] = 10.0; size++;
        num2[1] = 20.0; size++;
        num2[2] = 30.0; size++;

        double mul2 = 1;
        for (int i = 0; i < size; i++) {
            mul2 *= num2[i];
        }

        System.out.println(mul2);
    }
}
