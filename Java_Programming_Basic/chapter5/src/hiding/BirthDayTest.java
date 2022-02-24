package hiding;

class BirthDay {

    // 접근제어자는 4가지가 있다. (상속관계일때 하나 더 있는데 다음에 추가 설명 예정)
    // public 는 외부 class에서 다 가져다 쓸 수 있음
    // private 는 내 class 안에서만 쓸 수 있음
    // default (아무것도 안적음)는 같은 패키지 내에서는 사용할 수 있음
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day == 2) {
            if (day < 1 || day > 28) {
                System.out.println("날짜 오류입니다.");
            }
        }
        else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// 하나의 파일 안에 class가 여러개일 수 있지만, public class는 1개 (파일명과 같아야 함)
public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay day = new BirthDay();

        // private라 직접 변경 불가능
        /*
        day.month = 2;
        day.year = 2018;
        day.day = 30;
        */

        // private를 사용할 경우 데이터 무결성을 만족할 수 있다.
        day.setMonth(2);
        day.setDay(30);
        day.setYear(2018);
    }
}