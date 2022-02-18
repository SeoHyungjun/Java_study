public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
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