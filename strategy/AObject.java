package strategy;

public class AObject {
    AInterface aInterface;

    AObject() {
        aInterface = new AInterfaceImpl();
    }

    public void funcAA() {
        aInterface.funcA();
        aInterface.funcA();
        //아래와 동일한 기능을 할 수 있도록 함. aInterface에 위임한다
        //책임을 다른 객체에 떠넘기는 것을 델리게이트(delegate)
        //System.out.println("AAA");
        //System.out.println("AAA");
    }
}
