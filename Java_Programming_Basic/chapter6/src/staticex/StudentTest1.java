package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentJ = new Student();
        System.out.println(studentJ.studentID);

        Student studentT = new Student();
        System.out.println(studentT.studentID);

        // static 변수를 호출할 때 인스턴스를 사용하지 않고, class 이름을 사용한다.
        //System.out.println(Student.serialNum);

        // private로 설정되었다면, getter를 사용해서 가져와야함
        System.out.println(Student.getSerialNum());
    }
}
