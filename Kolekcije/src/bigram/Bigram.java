package bigram;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bigram {
	public static void main(String[] args) {
		String s = "abbcceeeeeeabcc";
		Map<String, Integer> mapa = new HashMap<>();

		for (int i = 0; i < s.length() - 1; i++) {
			String bigram = s.substring(i, i+2);
			if(mapa.containsKey(bigram)){
				mapa.put(bigram, mapa.get(bigram) + 1);
			}
			else{
				mapa.put(bigram, 1);
			}
		}
		Iterator i = mapa.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<String, Integer> entry = (Entry<String, Integer>) i.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}