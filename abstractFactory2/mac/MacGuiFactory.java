package abstractFactory2.mac;

import abstractFactory2.abst.Button;
import abstractFactory2.abst.GuiFactory;
import abstractFactory2.abst.TextArea;

public class MacGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
