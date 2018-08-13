import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet;
    private static List<String> bannedSites;
    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    public ProxyInternet() {
        internet = new RealInternet();
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        /*
        connection 을 프록시에서 결정하도록 한다.
        */
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        internet.connectTo(serverHost);
    }
}
