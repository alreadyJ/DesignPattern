package factoryMethod.concrete;

import factoryMethod.framework.Item;
import factoryMethod.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {

    @Override
    protected void requestItemsInfo() {
        System.out.println("Info of HpPotion get from DB");
    }

    @Override
    protected void createItemLog() {
        System.out.println("created HpPotion " + new Date());
    }

    @Override
    protected Item createItem() {
        //약간의 작업
        return new HpPotion();
    }
}
