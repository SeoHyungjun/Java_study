package inheritance;

public class Circle {

    /*
    private int x;
    private int y;
     */
    // Circle과 Point의 관계는 상속 관계가 아님. 상속은 보편적인 것에서 일반적인 것으로 내려가는 경우
    // 그러나 Point를 사용하고 싶을 때는 합성(has - a)을 한다고 의미한다.
    Point point;

    private int radius;

    public Circle() {
        point = new Point();
    }
}
