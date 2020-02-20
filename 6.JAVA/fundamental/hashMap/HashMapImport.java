package hashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapImport {
	public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Trust Fall", "Caye");
        userMap.put("Tattoos Together", "Lauv");
        userMap.put("my song", "Charles Goose");
        userMap.put("Love Alone", "Makita");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key+" "+userMap.get(key));
        }
    }
}
