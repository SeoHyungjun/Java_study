package singleton;

public class Company {


    private static Company instance = new Company();

    // Constructor를 private로 할 경우 외부에서 이 Constructor를 사용할 수 없도록 설정하는 것
    private Company() {

    }

    // getInstance를 통해 외부에서 생성된 인스턴스를 가져가 사용할 수 있음
    // 객체를 생성하지 않고, 메서드를 사용하기 위해 static을 사용
    public static Company getInstance() {
        return instance;
    }
}
