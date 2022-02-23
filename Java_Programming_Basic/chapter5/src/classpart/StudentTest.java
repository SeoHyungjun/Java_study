package classpart;

public class StudentTest {
    public static void main(String[] args) {
        // JVM이 main을 먼저 호출
        Student studentLee = new Student(100, "이순신");
        studentLee.address = "서울시 영등포구 여의도동";

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "미국 산호세";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        // 인스턴스를 출력하면 32bit의 heap영역 address가 나온다.
        // 인스턴스를 생성하면 실제로 heap영역에 데이터를 저장할 수 있는 공간을 할당하고,
        // stack 영역에 heap 영역의 주소값을 나타내는 변수를 생성한다 (ex) studentLee, studentKim) )
        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
