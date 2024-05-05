package revisonSem2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class test {

	

	public static void main(String[] args){
	// create ArrayList
	ArrayList<String> languages = new ArrayList<>();

	// add() method without the index parameter
	languages.add("Java");
	languages.add("C");
	languages.add("Python");
	System.out.println("ArrayList: " + languages);
	// add() method with the index parameter
	languages.add(1, "C++");
	System.out.println("Updated ArrayList: " + languages);
	// get the element from the arraylist
	String str = languages.get(1);
	
	System.out.print("Element at index 1: " + str);
	// change the element of the array list
	languages.set(2, "JavaScript");
	System.out.println("Modified ArrayList: " + languages);
	//// iterate using for-each loop
	System.out.println("Accessing individual elements: ");
	for (String language : languages) {
	System.out.print(language);
	System.out.print(", ");
	}
	System.out.println(" index of the element  : "+languages.lastIndexOf("C++"));
	System.out.println(" try remove"+languages.remove(2));
	System.out.println("Modified ArrayList: " + languages);
	

	
	String[] tab = { "dog" , "cat" , "you" , "me"};
	HashSet<String> animals = new HashSet<String>();
	
	for (String e : tab)
	{animals.add(e);}
    
    
	Iterator<String> it = animals.iterator();
	while (it.hasNext())
	{System.out.println("- "+it.next());}


	
	System.out.println(" tab animals"+animals.contains("java"));
	}
}
