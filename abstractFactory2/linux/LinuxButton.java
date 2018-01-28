package abstractFactory2.linux;

import abstractFactory2.abst.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("linux click");
    }
}
