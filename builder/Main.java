package builder;

public class Main {

    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        factory.setBluePrint(new LgGramBluePrint());
        factory.make();

        Computer computer = factory.getComputer();
        System.out.println(computer.toString());
        //Computer computer = new Computer("i7", "16g", "256g ssd");

    }

    /*
    * 복잡한 단계가 필요한 인스턴스 생성을 빌더 패턴을 통하여 구현할 수 있다.
    * 복잡한 단계를 거처야 생성되는 객체의 구현을 서브 클래스에게 넘겨 주는 패턴
    * 이곳에서 블루프린트는 설계도로서 복잡한 단계를 서브클래스인 설계도로 넘긴다.
    *
    *
    * */
}
