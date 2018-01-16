package templateMathod.dp;

public abstract class AbstGameConnectHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);
    // 위 과정들은 노출이 되어서는 안됨.따라서 외부에서는 호출해선 안되고 하위 클래스에서 오버라이딩을 해야함
    // 템플릿 메소드
    public String requestConnection(String encryptionString) {
        // 암호화된 String이 들어온다고 생각하고 밑에와 같이 doSecurity 메소드를 호출
        String decryptionString = doSecurity(encryptionString);// decryption 하는 과정이라고 생각
        // 반환된 string에서 id, password를 받음
        String id = "aaa", password = "bbb";
        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }
        String userName = "";
        int i = authorization(userName);
        switch (i) {
            case -1: throw new Error("shutdown");
            case 0: break;//게임 매니저
            case 1: break;//유료 회원
            case 2: break;//무료 회원
            case 3: break;//권한 없음
            default: break;// 기타 상황
        }
        return connection(decryptionString);
    }
}
