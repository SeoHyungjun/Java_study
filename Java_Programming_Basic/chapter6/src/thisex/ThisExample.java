package thisex;

class Birthday {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
        // year = year 로 작성해도 컴파일 에러는 안나지만,
        // 코드는 가장 가까운곳을 참조하므로 둘다 함수의 파라미터인 지역변수 year로 인식한다.
    }

    public void printThis() {
        System.out.println(this);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        Birthday b1 = new Birthday();
        Birthday b2 = new Birthday();

        System.out.println(b1);
        b1.printThis();

        System.out.println(b2);
        b2.printThis();
    }
}
