package secondproject;

import java.text.spi.CollatorProvider;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LaunchMap {

	public static void main(String[] args) {
		
		LaunchMap lm=new LaunchMap();
		lm.Htable();
		

	}
	public void Htable() {
		Hashtable ht=new Hashtable<>();
		ht.put(1, "ganesh");
		ht.put(2, "navakanth");
		ht.put(3, "Mohith");
		ht.put(4, "leela");
		ht.put(34, "hjegf");
		ht.put(23, "sdhfg");
		System.out.println(ht);
		
		
		
		
		
	}
	public void hMap() {
		HashMap hm=new HashMap<>();
		hm.put(1, "ganesh");
		hm.put(2, "navakanth");
		hm.put(3, "lella");
		hm.put(4, "mohith");
		hm.put(8, "kjeyrg");
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println(s);
		Collection c= hm.values();
		System.out.println(c);
		Set mapdata= hm.entrySet();
		System.out.println(mapdata); // Converted into set...
		Iterator itr=mapdata.iterator();
		
		while(itr.hasNext()) {
			Map.Entry data=(Map.Entry)itr.next();
			System.out.println(data.getKey() +" : "+ data.getValue());
		
		if(data.getKey().equals(6)) {
			data.setValue("ganesh kandi");
		}
		}
		System.out.println(hm);
	}

}
