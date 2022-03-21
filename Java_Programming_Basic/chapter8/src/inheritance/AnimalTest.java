package inheritance;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        // moveAnimal 하나만 사용했지만 실제 실행 결과는 다양하다 -> Polymorphism(다형성)
        // 다형성이란 하나의 클래스를 상속 받은 여러 클래스가 있는 경우
        // 각 클래스마다 같은 이름의 서로 다른 메서드를 재정의 하고,
        // 상위 클래스 타입으로 선언된 하나의 변수가 여러 인스턴스에 대입되어 다양한 구현이 실행될 수 있음을 의미
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());

    }

    public void moveAnimal(Animal animal) {
        animal.move(); // -> 실제 다형성을 나타내는 코드
    }
}
