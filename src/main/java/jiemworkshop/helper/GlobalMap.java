package jiemworkshop.helper;

import java.util.HashMap;
import java.util.Map;

public class GlobalMap {
	public static final Map<String,String> GLOBALMAP = new HashMap<String,String>();
	public static void put(String key, String value) {
		System.out.println("Adding "  + key + " as  " + value);
		GLOBALMAP.put(key, value);
	}
	
	public static String getValue(String key) {
		return GLOBALMAP.get(key);
	}
}
