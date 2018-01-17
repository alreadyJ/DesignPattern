package singleton;

/*
* 싱글톤을 사용하는 이유 만약 스피커의 볼륨을 조절했는데,
* 객체가 100개라면 100개의 객체에 접근하여 모두 바꿔줘야하는 상황이 발생
* 이것을 막기위해 싱글톤을 사용
* */

public class SystemSpeaker {
    static private SystemSpeaker instance;
    private int volume;
    private SystemSpeaker() {
        this.volume = 5;
    }

    public static SystemSpeaker getInstance() {
        //스피커가 통신을 할 수 있도록 작업을 넣어 주어야 함.
        if (instance == null) {
            instance = new SystemSpeaker();
            System.out.println("새로 생성");
        } else {
            System.out.println("이미 생성");
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
