package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

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
        Student studenLee = new Student();
        studenLee.studentName = "이순신";
        studenLee.address = "서울시 서초구 서초동";

        studenLee.showStudentInfo();
    }
    */
}
