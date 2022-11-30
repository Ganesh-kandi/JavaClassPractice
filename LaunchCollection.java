package secondproject;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchCollection {

	public static void main(String[] args) {
		LaunchCollection lc=new LaunchCollection();
//		lc.LList();
//		lc.ArrayDQ();
//		lc.PriQ();
//		lc.TreeS();
		LinkedList ll=new LinkedList<>();
		LinkedList ll1=new LinkedList<>();
		ll.add(12);
		ll.add("ganesh");
		ll.add("hudch");
		ll.add(0, "kandi");
		ll1.add(736487);
		ll1.add("dbv");
		ll.addAll(0, ll1);
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(" ");
		ListIterator ltr=ll.listIterator(ll.size());
//		while(ltr.hasPrevious()) {
//			System.out.println(ltr.previous());
//		}
		Iterator ltr1=ll.descendingIterator();
		while(ltr1.hasNext()) {
			System.out.println(ltr1.next());
//			ll.add(8475);
			
		}
		System.out.println(" ");
		
		//filesafe
		CopyOnWriteArrayList cwa=new CopyOnWriteArrayList<>();
		cwa.add(857);
		cwa.add("jdhfb");
		cwa.add(4958);
		cwa.add("ssgfbjb jk");
		Iterator itr3=cwa.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
			cwa.add(9457948);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ArrayDQ() {
		ArrayDeque ad=new ArrayDeque<>();
		ad.add(736);
		ad.add("ganesh");
		ad.add(8359);
		ad.add("kandi");
		
		System.out.println(ad);
		System.out.println(ad.getLast());
		}
	public void PriQ() {
		PriorityQueue pq=new  PriorityQueue<>();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(65);
		pq.add(125);
		System.out.println(pq);
		
	}
	public void TreeS() {
		TreeSet ts=new TreeSet<>();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		System.out.println(ts.floor(99));
	}
	
	
	
	
	
	public void LList() {
		LinkedList ll=new LinkedList<>();
		LinkedList ll1=new LinkedList<>();
		ll.add(12);
		ll.add("ganesh");
		ll.add("hudch");
		ll.add(0, "kandi");
		ll1.add(736487);
		ll1.add("dbv");
		ll.addAll(0, ll1);
		System.out.println(ll);
		System.out.println(ll.get(2));
	}

}
