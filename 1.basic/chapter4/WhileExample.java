public class WhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("while : 1부터 10까지의 합은 " + sum + "입니다.");

        num = 1;
        sum = 0;
        do {
            sum += num;
            num++;
        }while(num <= 10);
        System.out.println("do-while : 1부터 10까지의 합은 " + sum + "입니다.");
    }
}