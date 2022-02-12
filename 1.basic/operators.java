public class operators {
    public static void main(String[] args) {
        // 복합 대입 연산자
        int num1 = 10;
        System.out.println(num1 += 1);

        System.out.println(num1 %= 10);
        num1 -= 1;
        System.out.println(num1);

        // 조건 연산자
        // 조건식 ? 결과1 : 결과2;
        // 조건식이 참 -> 결과1, 거짓 -> 결과2 가 선택
        int num2 = (5 > 3)? 10:20;
        System.out.println(num2);

        // 비트 연산자
        int num3 = 5;
        int num4 = 10;

        int result = num3 & num4;
        System.out.println(result);
        result = num3 | num4;
        System.out.println(result);

        int num5 = 5; // 101
        System.out.println(num5 << 1); // 0000 1010 = 10
        System.out.println(num5 << 2); // 0001 0100 = 20

        System.out.println(num5 >> 1); // 0000 0101 -> 0000 0010 = 2
    }
}