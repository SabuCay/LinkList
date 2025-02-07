//import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
public class test11 {
	public static void main(String[] args){
		String[] things = {"eggs", "apples", "lemons", "bananas", "grapes", "steaks"};
		List<String> list1 = new LinkedList<String>();
		
		for(String x: things){
			list1.add(x);
		}
		
		String[] morethings = {"pineapples", "blueberry", "strawberry"};
		List<String> list2 = new LinkedList<String>();
		
		for(String y: morethings){
			list2.add(y);
		}
		
		System.out.println("List1: "+list1);
		System.out.println("List2: "+list2);
		System.out.println();
		
		//add list2 to list1, empty list2, new line
		list1.addAll(list2);
	    System.out.println("NewList1: "+list1);
	    
		
		System.out.println();
		
		printMe("PrintMe List1: ",list1);

		removeStuff(list1, 2, 5);
		reverseMe(list1);
		
	}
	
	// printMe method
	private static void printMe(String ListName, List<String> L){
		System.out.print(ListName+L);
		System.out.println();
	}

	
	//removeStuff method
	private static void removeStuff(List<String> L, int from, int to){  //2 inclusive, 5 exclusive
		L.subList(from,to).clear();
		System.out.println();
		System.out.println("remove from" + from + "til "+ to);
		printMe("PrintMe List.SubList: ",L);
	}
		
		
	
	//reverseMe method
	private static void reverseMe(List<String> list){
		ListIterator<String> it = list.listIterator(list.size());
		System.out.println();
		while(it.hasPrevious())
			System.out.print(it.previous()+" ");
	}
	
}
