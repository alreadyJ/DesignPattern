package abstractFactory2.win;

import abstractFactory2.abst.Button;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("win click");
    }
}
