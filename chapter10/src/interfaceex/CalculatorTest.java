package interfaceex;

public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();

        System.out.println(calc.add(num1, num2));
        // calc.showInfo()는 업캐스팅된 상태이기때문에 호출 불가능
        // CompleteCalc calc = new CompleteCalc();로 선언했다면 호출 가능
    }
}
