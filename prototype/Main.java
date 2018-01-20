package prototype;
/*
* prototype 복사를 하기위한 원형
* 생산비용이 높은 인스턴스를 복사해서 사용하여 쉽게 인스턴스를 생성하는 패턴!!
*
* 1. 종류가 너무 많아서 클래스로 정리가 안되는 경우
* 2. 클래스로부터 인스턴스 생성이 어려운 경우
* */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(0, 0, 10);
        Circle circle2 = circle1.copy();
        System.out.println(circle1.getX() + ", " + circle1.getY() + ", " + circle1.getR());
        System.out.println(circle2.getX() + ", " + circle2.getY() + ", " + circle2.getR());
        System.out.println(circle1 == circle2);
    }
}
