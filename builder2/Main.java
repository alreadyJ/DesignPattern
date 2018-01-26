package builder2;

public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .start()
                .setCpu("i7")
                .setRam("16g")
                .setStorage("256g ssd")
                .build();
        System.out.println(computer.toString());
    }

    /*
    * 많은 변수를 가진 객체의 생성을 가독성이 높도록 코딩할 수 있다.
    * builder 1 보다 가독성이 높다.
    *
    * */
}
