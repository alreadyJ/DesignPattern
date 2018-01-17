package templateMethod;

import templateMethod.dp.DefaultGameConnectHelper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DefaultGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("아이디 암호 접속 정보");
        //dp는 라이브러리 형태로 배포가 되는 것이고 패키지를 따로 나눠줘야 함.
    }
}
