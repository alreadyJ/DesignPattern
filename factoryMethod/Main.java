package factoryMethod;

import factoryMethod.concrete.HpCreator;
import factoryMethod.concrete.MpCreator;
import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator ic;
        Item item;

        ic = new HpCreator();
        item = ic.create();
        item.use();

        ic = new MpCreator();
        item = ic.create();
        item.use();
    }
}
