public class Ifexample2 {
    public static void main(String[] args) {
        
        int age = 9;
        int charge = 0;

        if(age < 8) {
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        }
        else if(age < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        else if(age < 20) {
            charge = 2500;
            System.out.println("중,고등학생 입니다.");
        }
        else{
            charge = 3000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는 " + charge + "원 입니다.");


        // 모두 if로 할 경우 age는 9로 14보다 작으니까 "초등학생 입니다." 출력
        // 그리고 또 if문을 만나서 20살보다 작으므로 "중,고등학생 입니다." 출력
        // 하나의 조건에 대해서 배타적으로 비교할 경우 if + else if를 사용해야 함

        age = 9;
        charge = 0;

        if(age < 8) {
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        }
        if(age < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        if(age < 20) {
            charge = 2500;
            System.out.println("중,고등학생 입니다.");
        }
        else{
            charge = 3000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는 " + charge + "원 입니다.");
    }
}
