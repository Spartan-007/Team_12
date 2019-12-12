package ganesh;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> numberString = new LinkedList<>();
		numberString.addFirst("Mayur");
		numberString.addLast("Harsh");
		numberString.addLast("Nikita");
		numberString.addFirst("ganya");
		numberString.add("Nasir bhai");

		System.out.println("First Element :: "+numberString.getFirst());
		System.out.println("Last Element :: "+numberString.getLast());
		
		/*numberString.removeFirst();
		numberString.removeFirst();*/
		
		System.out.println("Elements in the LinkedList :");
		Iterator<String> iterator = numberString.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			String number = iterator.next();
			if( number.startsWith("T"))
			  iterator.remove();
			System.out.println(number);
		}
		
		
		System.out.println("Traversing using List Iterator : ");
		ListIterator<String> listIterator = numberString.listIterator();

		listIterator.next();
		listIterator.next();
		listIterator.next();
		while(listIterator.hasPrevious()) {
			//listIterator.previous();
			//listIterator.add(e);
//			listIterator.remove();
			listIterator.set("Ten");
			System.out.println(listIterator.previous());
		}
		System.out.println("After lisst iiterator");
		Iterator<String> itterator = numberString.iterator();
		while(itterator.hasNext()) {
			//System.out.println(iterator.next());
			String number = itterator.next();
			//if( number.startsWith("T"))
			  //iterator.remove();
			System.out.println(number);
		}
	
		
		
		System.out.println("Number of elements :: "+numberString.size());
	}

}
