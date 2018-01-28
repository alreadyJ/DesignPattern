package abstractFactory2.win;

import abstractFactory2.abst.TextArea;

public class WinTextArea implements TextArea{

    @Override
    public String getText() {
        return "win Text";
    }
}
