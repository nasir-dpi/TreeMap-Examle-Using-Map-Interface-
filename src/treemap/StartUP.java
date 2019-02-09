package treemap;

import java.util.Map;
import java.util.TreeMap;

public class StartUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String,String> a = new TreeMap<String,String>();
		a.put("0", " Doing");
		a.put("1", " Something");
		a.put("2", " Different");
		a.put("3", " always");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.keySet());
		System.out.println(a.values());
		for(Map.Entry<String, String> i : a.entrySet()) {
			System.out.println(i.getValue());

		}
	}

}
