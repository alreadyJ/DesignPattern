package abstractFactory2.concrete;

import abstractFactory2.abst.GuiFactory;
import abstractFactory2.linux.LinuxGuiFactory;
import abstractFactory2.mac.MacGuiFactory;
import abstractFactory2.win.WinGuiFactory;

public class FactoryInstance {
    public static GuiFactory getGuiFactory() {

        switch (getOsCode()) {
            case 0: return new MacGuiFactory();
            case 1: return new LinuxGuiFactory();
            case 2: return new WinGuiFactory();
        }
        return null;
    }

    private static int getOsCode() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            return 0;
        }
        return 1;
    }
}
