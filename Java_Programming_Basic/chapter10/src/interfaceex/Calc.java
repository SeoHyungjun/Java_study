package interfaceex;

public interface Calc {

    // 인터페이스에 선언된 모든 변수는 public static final로 상수가 된다. (프리컴파일 중 변경)
    double PI = 3.14;
    int ERROR = -999999999;

    // 인터페이스에 선언된 모든 메서드는 public abstract로 추상 메서드가 된다. (프리컴파일 중 변경)
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
    }

    static int total(int[] arr) {
        int total = 0;

        for (int i: arr) {
            total += i;
        }
        return total;
    }
}
