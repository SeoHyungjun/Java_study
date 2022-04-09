package interfaceex;

public class MyClass implements MyInterface {

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.x();
        myClass.y();
        myClass.myMethod();

        X xClass = myClass;
        xClass.x();
        // xClass.y();는 사용 불가능
    }
}
