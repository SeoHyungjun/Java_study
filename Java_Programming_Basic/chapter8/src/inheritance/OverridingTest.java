package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(100010, "LEE");
        int price = customerLee.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고 " + customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(100010, "Kim", 100);
        price = customerKim.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고 " + customerKim.showCustomerInfo());

        // CustomerWho가 인스턴스 VIPCustomer이므로, calcPrice가 오버라이딩되어 재정의되었으므로
        // 가상 메서드로 VIPCustomer의 calcPrice가 호출된다.
        // 메서드 영역에서 Customer 클래스의 calcPrice도 있고, VIPCustomer 클래스의 calcPrice가 있지만
        // 재정의된 calcPrice가 바인딩되어 인스턴스의 가상 메서드가 호출됨.
        Customer customerWho = new VIPCustomer(100010, "Who", 100);
        price = customerWho.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고 " + customerWho.showCustomerInfo());

        Customer customerGold = new GoldCustomer();
    }
}
