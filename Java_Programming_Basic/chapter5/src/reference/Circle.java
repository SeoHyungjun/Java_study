package reference;

public class Circle {
    //Circle을 만들때 x, y 좌표를 직접 정의해서 사용할수도 있지만, Point class 를 만들어 사용할 수 있음
    //int x;
    //int y;
    Point point;
    int radius;

    public Circle() {
        point = new Point();
    }
}
