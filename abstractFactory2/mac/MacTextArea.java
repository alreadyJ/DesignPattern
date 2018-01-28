package abstractFactory2.mac;

import abstractFactory2.abst.TextArea;

public class MacTextArea implements TextArea{

    @Override
    public String getText() {
        return "mac Text";
    }
}
