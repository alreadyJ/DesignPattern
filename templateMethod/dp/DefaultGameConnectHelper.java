package templateMethod.dp;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("강화 시킨다 !! decryption");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("id, password 확인");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        // userName으로 나이를 판단하여 shut down 제를 실시 가능
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계");
        // 쓰레드를 넘겨준다거나 계정 주소를 준다던가의 과정
        return info;
    }

    @Override
    public String requestConnection(String encryptionString) {
        return super.requestConnection(encryptionString);
    }



    /*
    * 추상 클래스를 만들고 알고리즘을 쪼개 넣고
    * 이후에 추상클래스를 상속받아 메소드를 구현하는 일련의 과정
    *
    *
    * 일정한 프로세스를 가진 요구사항을 템플렛 메소드를 이용하여 구현 할 수 있다.
    *
    * 알고리즘의 구조를 메소드에 정의하고
    * 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의하는 패턴
    *
    * 구현하려는 알고리즘에 일정한 프로세스가 있다.
    * 구현하려는 알고리즘이 변경 가능성이 있다.
    *
    *
    * 단계
    *
    * 알고리즘을 여러단계로 나눈다.
    * 나눠진 알고리즘의 단계를 메소드로 선언한다.(abstract)
    * 알고리즘을 수행할 템플릿 메소드를 만든다. (여기서는 requestConnection 메소드가 해당됨)
    * 하위 클래스에서 나눠진 메소드들을 구현한다.
    *
    *
    * -단점 : 상속을 통하여 구현이 되므로 해당 추상 메소드가 필요한 클래스마다 상속을 받아야 한다.
    * */
}
