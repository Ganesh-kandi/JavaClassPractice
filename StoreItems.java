package firstProject;

import java.util.ArrayList;

public class StoreItems {
	 ArrayList<String> StoreItems = new ArrayList<String>();
	 public void addStoreItems(String item) {
		 StoreItems.add(item);
	 }
	 
	 public void printStoreItems() {
		 System.out.println("you have "+ StoreItems.size() +"items in your list ");
		 for(int i=0;i<StoreItems.size();i++) {
			 System.out.println((i+1)+ "."+ StoreItems.get(i));
		 }
	 }
	 public void modifyStoreItems(int position, String neweItems) {
		 StoreItems.set(position, neweItems);
		 System.out.println("storeItems "+ (position+1) +" has been notified.");
	 }
	 public void removeStoreItems(int position) {
		 String theItem= StoreItems.get(position);
		 StoreItems.remove(position);
	 }
	 public boolean findItem(String Searchitem) {
		 boolean exits=StoreItems.contains(Searchitem);
		return exits;
	 }
	 public String findItem1(String Searchitem) {
		 int position =StoreItems.indexOf(Searchitem);
		 if(position>=0) {
			 return StoreItems.get(position);
		 }
		 return null;
	 }
}






