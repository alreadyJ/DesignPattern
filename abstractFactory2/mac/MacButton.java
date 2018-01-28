package abstractFactory2.mac;

import abstractFactory2.abst.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("mac click");
    }
}
