package abstractFactory2.win;

import abstractFactory2.abst.Button;
import abstractFactory2.abst.GuiFactory;
import abstractFactory2.abst.TextArea;

public class WinGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
