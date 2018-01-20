package factoryMethod.framework;

public abstract class ItemCreator {
    // 팩토리 메소드 패턴
    public Item create() {// 템플릿 메소드처럼 됨.
        Item item;

        requestItemsInfo();
        item = createItem();
        createItemLog();

        return item;
    }
    // 생성 전에 DB에서 정보를 가져옴
    protected abstract void requestItemsInfo();
    // 복제 방지
    protected abstract void createItemLog();
    // 아이템을 생성하는 알고리즘
    protected abstract Item createItem();
}
