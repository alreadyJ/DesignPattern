package abstractFactory2.linux;

import abstractFactory2.abst.Button;
import abstractFactory2.abst.GuiFactory;
import abstractFactory2.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}
