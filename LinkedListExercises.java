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
        //System.out.println(list2.getFirst());
        //System.out.println(list2.getLast());
        //Alternative solution:
        Object first_element = list2.getFirst();
        System.out.println("First element:" + first_element);
        Object last_element = list2.getLast();
        System.out.println("Last element:" + last_element);
        
        //Exercise11: display the elements and their positions in a linked list
        /* for (int i = 0; i<list2.size(); i++) {
		System.out.println(i + " " + list2.get(i));
        }*/
        
        //Exercise12: remove a specified element from a linked list
        /* list2.remove(9);
        for (int i = 0; i<list2.size(); i++) {
    		System.out.println(i + " " + list2.get(i));
        }*/
        
        //Exercise13: remove first and last element from a linked list
        /*list2.removeFirst();
        list2.removeLast();
        System.out.println(list2);*/
        
        //Exercise14: remove all the elements from a linked list
        //list2.clear();
        //System.out.println(list2);
        
        //Exercise15: swap two elements in an linked list
        /*Object temp = list2.get(2);
        Object temp2 = list2.get(7);
        list2.set(7, (String) temp);
        list2.set(2, (String) temp2);
        System.out.println(list2);*/
        //Alternative solution:
        //Collections.swap(list2, 3, 5);
       // System.out.println(list2);
        
        //Exercise16: shuffle the elements in a linked list.
        //Collections.shuffle(list2);
        //System.out.println(list2);
        
        //Exercise17: join two linked lists
        //list2.addAll(list);
        //System.out.println(list2);
        
        //Exercise18: clone an linked list to another linked list
        @SuppressWarnings("unchecked")
		LinkedList <String> newList1 = (LinkedList<String>) list2.clone();
        System.out.println(newList1);
        
        //Exercise19: remove and return the first element of a linked list
        Object temp = list2.remove();
        System.out.println(temp);
        //Alternative solution:
        System.out.println(list2);
        System.out.println(list2.pop());
        System.out.println(list2);
        
        //Exercise20: retrieve but does not remove, the first element of a linked list
        System.out.println(list2.peek());
        
        //Exercise21: retrieve but does not remove, the last element of a linked list
        System.out.println(list2.peekLast());
        
        //Exercise22: check if a particular element exists in a linked list
        if (list2.contains("Black")) {
        	System.out.println("Yessss!");
        }
        else {
        	System.out.println("Nooo!");
        }
        
        //Exercise23: convert a linked list to array list
        List <String> aList = new ArrayList<String>(list2);
        for (String e : aList) {
        	System.out.println(e);
        }
        
        //Exercise24: compare two linked lists
        List <String> joint = new LinkedList<String>();
        for (String e : list) {
        	joint.add(list2.contains(e) ? "Yes" : "No");
        }
        System.out.println(joint);
        
        //Exercise25: test an linked list is empty or not
        if (list.isEmpty()) {
        	System.out.println("Empty!");
        } else {
        	System.out.println("Not empty!");
        }
        
        //Exercise26: replace an element in a linked list
        list.set(3, "Pinkki");
        System.out.println(list);
	}

}
