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


    /*
    * 팩토리 vs 템플릿
    *
    *   템플릿 메소드 패턴:
    *   - 상속을 통해 슈퍼클래스의 기능을 확장
    *   - 하위 클래스가 재정의하여 기능을 구체화 함
    *   팩토리 메소드 패턴:
    *   - 기반 클래스에 알려지지 않은 구체 클래스를 생성하는 패턴
    *   - 파생 클래스가 어떤 객체 를 생성할지를 결정하도록 하는 패턴
    *   생성을 하는 메소드를 위임한다는 느낌에서 차이점이 있음
    *
    *
    * 팩토리 메소드 패턴을 사용하는 이유는 클래스간의 결합도를 낮추기 위한것입니다.
    * 결합도라는 것은 간단히 말해 클래스의 변경점이 생겼을 때 얼마나 다른 클래스에도 영향을 주는가입니다.
    * 팩토리 메소드 패턴을 사용하는 경우 직접 객체를 생성해 사용하는 것을 방지하고 서브 클래스에 위임함으로써
    * 보다 효율적인 코드 제어를 할 수 있고 의존성을 제거합니다.
    * 결과적으로 결합도 또한 낮출 수 있습니다.
    *
    *
    *Template Method의 생성 패턴 버전으로 볼 수 있다
    *
    * */
}
