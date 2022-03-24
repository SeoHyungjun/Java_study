package abstractex;

public abstract class Computer {

    // public void display();와 같이 선언하면 abstract로 선언하거나 body를 넣으라고 함
    // body는 public void display() {};와 같이 사용하는 것
    // abstact method를 선언하려면 class도 abstract로 선언해야 함
    // 실제 구현은 상속받은 하위 클래스에서 하는 것
    // 현재 클래스에서는 어떻게 구현해야할 지 모를때, 즉 하위에서 구현을 해야할 때 사용하는 것
    // "구현에대한 책임"은 하위 클래스에 있고, 현재 클래스는 "메소드에 대한 구현을 하위클래스에 위임" 시켰다고 표현
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
