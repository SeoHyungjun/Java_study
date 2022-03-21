package inheritance;

public class GoldCustomer extends Customer {

    public GoldCustomer() {
        bonusRatio = 0.05;
    }

    @Override // 컴파일러에게 역할을 알려주는 기능
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
