package strategy;

public class Main {
    public static void main(String[] args) {
        AInterface aInterface = new AInterfaceImpl();
        //aInterface 사용 할 수 있는 통로의 역할을 함
        aInterface.funcA();
        AObject aObject = new AObject();

        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        // 도끼 추가
        character.setWeapon(new Ax());
        character.attack();

        // 건드리지 않는다는 점이 가장 이로운 점이고 이런 패턴을 공부하는 것이 목적임
        // 하나의 접근점을 통해 여러가지 클래스를 간편하게 추가할 수 있도록 함.
    }
}
