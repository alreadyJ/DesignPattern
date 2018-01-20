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


}
