import java.util.*;

public class LinkedListExercises {

	public static void main(String[] args) {
		
		//Exercise1: append the specified element to the end of a linked list
		List <String> list = new LinkedList<String>();
		list.add("Black");
		list.add("Green");
        list.add("Blue");
        list.add("White");
        list.add("Pink");
        list.add("Yellow");
		//System.out.println(list);
		
		//Exercise2: iterate through all elements in a linked list.
		/*for(String element : list) {
			System.out.println(element);
		}*/
		
		//Exercise3: iterate through all elements in a linked list starting at the specified position
		/*for (int i = 2; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		//Alternative solution:
		/*Iterator p = list.listIterator(2);
		while (p.hasNext()) {
			System.out.println(p.next());
		}*/
		
		
		//Exercise4: iterate a linked list in reverse order.
		/*int lastPosition = list.size()-1;
		for (int i = lastPosition; i >= 0;i--) {
			System.out.println(list.get(i));
		}*/
		//Alternative solution:
		/*LinkedList <String> list2 = new LinkedList<String>();
		list2.add("Black");
		list2.add("Green");
        list2.add("Blue");
        list2.add("White");
        list2.add("Pink");
        list2.add("Yellow");
		System.out.println(list2);
		
		Iterator p = list2.descendingIterator();
		while (p.hasNext()) {
			System.out.println(p.next());
		}*/
        
        //Exercise5: insert the specified element at the specified position in the linked list.
        //list.add(2, "Blööbö");
        //System.out.println(list);
		
        //Exercise6: insert elements into the linked list at the first and last position.
        /*list.add(0, "Jotain");
        System.out.println(list);
        list.add(list.size(), "Jotain muuta");
        System.out.println(list);*/
        //Alternative solution:
        LinkedList <String> list2 = new LinkedList<String>();
		list2.add("Black");
		list2.add("Green");
        list2.add("Blue");
        list2.add("White");
        list2.add("Pink");
        list2.add("Yellow");
        
        list2.addFirst("Jotain");
        list2.addLast("Jotain muuta");
        //System.out.println(list2);
        
        //Exercise7:  insert the specified element at the front of a linked list.
        list2.offerFirst("Helppoo kauraa");
        System.out.println(list2);
        
        //Exercise8: insert the specified element at the end of a linked list
        list2.offerLast("Taas helppoo");
        System.out.println(list2);
        
        //Exercise9: insert some elements at the specified position into a linked list
        LinkedList <String> newList = new LinkedList<String>();
        newList.add("Mustaa");
        newList.add("Mustaakin mustempaa");
        list2.addAll(2, newList);
        System.out.println(list2);
        
        //Exercise10: get the first and last occurrence of the specified elements in a linked list.
        System.out.println(list2.getFirst());
        System.out.println(list2.getLast());
        
        
        
	}

}
