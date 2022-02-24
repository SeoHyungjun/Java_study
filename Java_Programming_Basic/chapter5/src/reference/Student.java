package reference;

public class Student {

    int studentID;
    String studentName; // new 하지않아도 사용할 수 있는 참조자료형이 있다.
    Subject korea;
    Subject math;

    public Student() {
        korea = new Subject("국어");
        math = new Subject("수학");
    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;

        korea = new Subject("국어");
        math = new Subject("수학");
    }

    public void setKorea(int score) {
        korea.setScore(score);
    }

    public void setMath(int score) {
        math.setScore(score);
    }

    public void showStudentInfo() {
        int total = korea.getScore() + math.getScore();
        System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
    }
}
