package staticex;

public class Student {
    //static int serialNum = 10000;
    // static은 외부에서 사용 가능하니까 private로 설정할 경우
    // getter, setter를 사용해야한다.
    private static int serialNum = 10000;

    int studentID;
    String studentName;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() {
        // static method에서는 생성이 불확실한 인스턴스 변수를 사용할 수 없음.
        // getSerrialNum은 class에서 호출하므로 인스턴스가 없어도 된다.
        // 그러므로 studentID나 studentName이 생성되지 않았을수도 있으므로 사용 x

        return serialNum;
    }
}
