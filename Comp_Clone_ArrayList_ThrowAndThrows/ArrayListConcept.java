package Comp_Clone_ArrayList_ThrowAndThrows;

import java.util.ArrayList;
public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		System.out.println("Before Remove: ");
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println("After Remove: ");
		intList.remove(0);
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println("After Clear: ");
		intList.clear();
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		
		// Object adding in ArrayList
		System.out.println("Student Object: ");
		ArrayList<Student> slist = new ArrayList();
		slist.add( new Student("Fahim", 11));
		slist.add(new Student("Jim", 12));
		slist.add(new Student("Arham", 13));
		for (int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i).name + " " + slist.get(i).roll);
		}
		
		Student ss1 = new Student("Tanvir", 11);
		System.out.println(slist.contains(ss1));
		
	}
}
