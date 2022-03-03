package array;

public class ArrayTest {
    public static void main(String[] args) {

        // int[] number로 사용하든 int number[]로 하든 같은 결과
        int[] numbers = new int[10];
        //int numbers[] = new int[10];

        // 선언하면서 초기화까지 같이하려면 아래와 같이 사용할 수 있다.
        // new int[]에 배열의 크기를 직접 넣지않아도 3개의 값을 넣었으므로 가능
        int[] numbers2 = new int[] {0, 1, 2};
        // int[] numbers2 = {0, 1, 2}; -> 이처럼 사용할 수 있지만 잘 사용하지 않는 방법

        System.out.println(numbers2.length);

        int[] numbers3 = new int[3];
        // int[] numbers3;
        // numbers3 = new int[3]; 처럼도 사용 가능

        // 선언 시 초기화를 하지않으면, 각각을 하나씩 초기화 해야한다.
        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;

        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

        // 초기화 하지 않으면 int -> 0, double -> 0.0 으로 초기화가 된다.
        int[] studentIDs = new int[5];

        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println(studentIDs[i]);
        }
    }
}
