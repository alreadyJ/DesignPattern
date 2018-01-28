package abstractFactory2;

import abstractFactory2.abst.Button;
import abstractFactory2.abst.GuiFactory;
import abstractFactory2.abst.TextArea;
import abstractFactory2.concrete.FactoryInstance;
import abstractFactory2.linux.LinuxGuiFactory;

public class Main {
    public static void main(String[] args) {
        GuiFactory factory = FactoryInstance.getGuiFactory();
        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();
        button.click();
        System.out.println(textArea.getText());
        System.out.println(System.getProperty("os.name"));
    }
}
