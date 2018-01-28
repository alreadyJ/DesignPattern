package abstractFactory;

import abstractFactory.Sam.SamFactory;
import abstractFactory.abst.BikeFactory;
import abstractFactory.abst.Body;
import abstractFactory.abst.Wheel;

public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
    /*
    *
    * 관련 있는 객체의 생성을 가상화 시킬 수 있다.
    * 여러가지 하나의 팩토리로 묶어줘서 동일한 방식으로 생성해주는 패턴
    * */
}
