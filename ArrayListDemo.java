.mkjhgfdfgfhjkl;'
';ljkgcxvbnm, vbklkjhgfddfghjkjhggfdxcvbnvcxzcvbnm,./,mnbvcxzpackage ga;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {

		ArrayList<String> countryList = new ArrayList<>();
		
		countryList.add("India");
		countryList.add("Australia");
		countryList.add("Pakistan");
		countryList.add("Zimbombe");
		
		int size = countryList.size();
		System.out.println("Size of the list is : "+size);
		
		boolean emptyState = countryList.isEmpty();
		System.out.println("Is empty :: "+emptyState);
		
		//countryList.clear();
		emptyState = countryList.isEmpty();
		System.out.println("Is empty :: "+emptyState);
		
		countryList.add("US");
		countryList.add("India");
		
		//adds the element at the specified index
		countryList.add(0, "Japan");
		size = countryList.size();
		System.out.println("Size of the list is : "+size);
		
		Iterator<String> iterator = countryList.iterator();
		System.out.println("All elements in the list \n");
		while(iterator.hasNext()) {
			String country = iterator.next();
			System.out.print(country+" ");
		}
		
		/*String removedObj = countryList.remove(1);
		System.out.println("\nRemove by index "+removedObj);*/
		
		/*boolean isRemoved = countryList.remove("India");
		System.out.println("Remove by object :: "+isRemoved);*/
		
		//updating the arraylist
		countryList.set(0, "ABCD");
		countryList.remove("India");
		
		boolean isIndiaAvailable = countryList.contains("India");
		System.out.println("\n Is India Available : "+isIndiaAvailable);
		
		System.out.println("\nAfter removing first index \n");
		iterator = countryList.iterator();
		while(iterator.hasNext()) {
			String country = iterator.next();
			System.out.print(country+" ");
		}
		
		System.out.println("\n Using for loop to traverse the Arraylist ");
		for(int i=0;i<countryList.size();i++)
			System.out.println(countryList.get(i));
		
		System.out.println("\n End of the program.");
	}

}
