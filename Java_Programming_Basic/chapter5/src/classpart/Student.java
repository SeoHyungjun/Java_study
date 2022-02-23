package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    // 생성자는 처음 객체를 생성할 때 해야하는 일을 정의
    // 생성자를 선언하지 않으면 default 생성자가 사용됨(실제로 선언 안해도)
    // 그러나 다른 생성자가 있을때, default 생성자를 사용하고싶으면 overloading해서 사용해야한다.
    public Student() {}

    // 만약 생성할 때 id와 name을 받아서 생성할 경우
    public Student(int id, String name) {
        studentID = id;
        studentName = name;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() { // 메소드의 이름은 사용하는 class의 입장에서 만든다.
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    /*
    public static void main(String[] args) {
        // JVM이 main을 먼저 호출
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.studentID = 100;
        studentLee.address = "서울시 영등포구 여의도동";

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "미국 산호세";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
    */
}
