package hashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapImport {
	HashMap<String, String> userMap = new HashMap<String, String>();
	public void createTrankList() {
        //HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Trust Fall", "Caye");
        userMap.put("Tattoos Together", "Lauv");
        userMap.put("my song", "Charles Goose");
        userMap.put("Love Alone", "Makita");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
        }
    }
	public String getSong(String m) {
		String n=userMap.get(m);
		return n;
	}
}
