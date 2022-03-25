package template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    // 추상 메서드인 wiper를 run에 추가하면 하위 클래스에서 모두 정의해야하지만
    public abstract void wiper();
    // washCar의 경우에는 run에 추가해도 문제가 안생긴다. (훅 메서드라고 부른다)
    // 만약 차에따라 필요할 경우 하위 클래스에서 override해서 사용하면 된다.
    public void washCar() {}

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다..");
    }

    // method를 final로 선언하여 하위 클래스에서 run 메서드를 재정의(override)할 수 없다.
    // 즉, 함수를 정의할 수 있지만 전체적인 흐름(template)가 바뀌면 안될때 사용한다.
    public final void run() {
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }
}
