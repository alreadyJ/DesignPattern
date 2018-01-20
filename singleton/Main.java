package singleton;

public class Main {
    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(11);

        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
    }


    /*
    * 싱글톤을 사용하는 이유 만약 스피커의 볼륨을 조절했는데,
    * 객체가 100개라면 100개의 객체에 접근하여 모두 바꿔줘야하는 상황이 발생
    * 이것을 막기위해 싱글톤을 사용
    * */
}
