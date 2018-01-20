package singleton;



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
