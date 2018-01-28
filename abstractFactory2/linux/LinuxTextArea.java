package abstractFactory2.linux;

import abstractFactory2.abst.TextArea;

public class LinuxTextArea implements TextArea{

    @Override
    public String getText() {
        return "linux Text";
    }
}
