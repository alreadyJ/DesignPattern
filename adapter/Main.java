package adapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100.f));
        System.out.println(adapter.halfOf(88.f));
    }


    /* 알고리즘을 요구사항에 맞게 바꿀 수 있다!! 이것이 어뎁터 패턴의 필요성
    *  연관성 없는 두 객체를 묶어 사용하기
    *  Main 함수나 Adapter 함수를 건드리지 않고 Impl만 수정하여 알고리즘을 수정할 수 있다.
    *  구현 클래스에서 수정한다는 느낌.
    *  bubble sort 알고리즘을 받았을 때, list를 array로 바꾸고 소팅 후, 다시 array를 list로 바꾸는 로직을 구현함.
    */
}
