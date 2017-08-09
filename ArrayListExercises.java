import java.util.*;

public class ArrayListExercises {

	public static void main(String[] args) {
		
		//Exercise1: Create list and print it
		ArrayList <String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("Green");
		//System.out.println(list);
		
		//Exercise2: Iterate through all the elements in the list
		//for (String element : list) {
		//	System.out.println(element);
		//}
		
		//Exercise3: insert an element into the array list at the first position 
		//list.add(0,"Yellow");
		//System.out.println(list);
		
		//Exercise4: retrieve an element (at a specified index) from a given array list.
		//System.out.println(list.get(3));
		
		//Exercise5: update specific array element by given element.
		//list.set(1, "Pink");
		//System.out.println(list);
		
		//Exercise6: remove the third element from an array list.
		//list.remove(2);
		//System.out.println(list);
		
		//Exercise7: search an element in a array list.
		/*if (list.contains("Red")) {
			System.out.println("Found Red.");
		}
		else {
			System.out.println("No such color.");
		}*/
		
		//Exercise8: sort a given array list
		/*System.out.println("Print before sort" + list);
		Collections.sort(list);
		System.out.println("Print after sort" + list);*/
		
		//Exercise9: copy one array list into another.
		ArrayList <String> list2 = new ArrayList<String>();
		list2.add("Red");
		list2.add("2");
		list2.add("3");
		//Collections.copy(list, list2);
		//System.out.println(list);
		
		//Exercise10: shuffle elements in a array list
		//Collections.shuffle(list);
		//System.out.println(list);
		
		//Exercise11: reverse elements in a array list
		//Collections.reverse(list);
		//System.out.println(list);
		
		//Exercise12: extract a portion of a array list
		//List <String> list3 = new ArrayList<String>();
		//list3 = list.subList(0,2);
		//System.out.println(list3);
		
		//Exercise13: compare two array lists
		/*List <String> list3 = new ArrayList<String>();
		for (String e : list) {
			list3.add(list2.contains(e) ? "Yes" : "No");
		}
		System.out.println(list3);*/
		
		//Exercise14: swap two elements in an array list
		//Collections.swap(list, 0, 2);
		//System.out.println(list);
		
		//Exercise15: join two array lists
		//list.addAll(list2);
		//System.out.println(list);
		
		//Exercise16: clone an array list to another array list
		//ArrayList<String> newList = (ArrayList<String>) list.clone();
		 
		//Exercise17: empty an array list
		//list.clear();
		//System.out.println(list);
		
		//Exercise18: test an array list is empty or not
		/*if (list.isEmpty()) {
			System.out.println("Empty");
		}
		else {
			System.out.println("Not empty");
		}*/
		
		//Exercise19: trim the capacity of an array list the current list size
		//list.trimToSize();
		//System.out.println(list);
		
		//Exercise20: increase the size of an array list
		//list.ensureCapacity(6);
		//System.out.println(list);
		
		//Exercise21: replace the second element of a ArrayList with the specified element.
		//list.set(1, "Blööbö");
		//System.out.println(list);
		
		//Exercise22: print all the elements of a ArrayList using the position of the elements.
		/*int num = list.size();
		for (int i=0; i<num; i++) {
			System.out.println(list.get(i));
		}*/
		
		
	}

}
