package abstractex;

public class ComputerTest {
    public static void main(String[] args) {

        // Computer c1 = new Computer();
        // 이와 같이 선언은 불가능(오류)
        // 추상 클래스인 Computer는 수행될 메소드가 없어서 추상클래스의 인스턴스가 생성될 수 없음
        Computer c2 = new DeskTop();
        //Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();

        c2.display();
        c4.display();
    }
}
