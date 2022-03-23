package inheritance;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying() {
        System.out.println("하늘을 날아갑니다.");
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

        Animal[] animalList = new Animal[3];
        animalList[0] = new Human();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Tiger());
    }

    public void moveAnimal(Animal animal) {
        animal.move(); // -> 실제 다형성을 나타내는 코드

        // 오버라이딩을 통해 해결 불가능할 경우
        // animal로 업캐스팅이되어 tiger의 hunting이 보이지 않음.
        // 다운캐스팅을 잘못 사용하면 instance error 발생 가능
        // 그래서 if 문으로 확인하고 다운캐스팅하여 실행
        // instanceof는 인스턴스의 타입을 체크하는 예약어
        if (animal instanceof Human) {
            Human human = (Human)animal;
            human.readBook();
        }
        else if (animal instanceof Tiger) {
            Tiger tiger = (Tiger)animal;
            tiger.hunting();
        }
        else if (animal instanceof Eagle) {
            Eagle eagle = (Eagle)animal;
            eagle.flying();
        }
        else {
            System.out.println("지원되지 않는 기능입니다.");
        }
    }
}
