package thisex;

class Person {
    String name;
    int age;

    public Person() {
        // this를 사용한다는건 생성자를 호출하겠다는 의미인데, 앞에 어떠한 문장을 넣게된다면
        // 실제 생성되기 전에 state를 사용할 수 없으므로 에러 발생
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person returnSelf() {
        // 혀내 자신의 주소값을 리턴
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);

        System.out.println(p1.returnSelf());
    }
}
