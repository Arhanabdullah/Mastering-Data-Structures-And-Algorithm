package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {

        // List or Collection -> Interface
        // Syntax to declare the ArrayList
        // ArrayList<dataType> arr = new ArrayList<dataType>();

        // Methods to declace the ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Collection<Integer> collection = new ArrayList<>();

        //adding elements to the ArrayList
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println("ArrayList: " + arr);
        //adding is done sequentially, so the order of elements is preserved in the ArrayList
        arr.add(40);
        System.out.println("ArrayList: " + arr);

        //removing elements from the ArrayList
        arr.remove(1);
        //Removing is done based on the index of the element
        // Here the element at index 1 (20) is removed from the ArrayList
        System.out.println("ArrayList: " + arr);

        list.add(100);
        list.add(200);
        list.add(10);

        System.out.println("List: " + list);
        //addAll() method is used to add all the elements of the specified collection to the end of the ArrayList
        arr.addAll(list);
        System.out.println("ArrayList after adding List: " + arr);

        //removeAll() method is used to remove all the elements of the specified collection from the ArrayList
        //removeAll() method removes all the elements of the specified collection from the ArrayList. It also removes any duplicates if they are present in the ArrayList
        arr.removeAll(list);
        System.out.println("ArrayList after removing List: " + arr);

        //size() method is used to get the number of elements in the ArrayList
        System.out.println("Size of ArrayList: " + arr.size());

        //clear() method is used to remove all the elements from the ArrayList
            // System.out.println("List before clearing: " + list);
            // list.clear();
            // System.out.println("List after clearing: " + list);


        //Iterator is used to iterate through the elements of the ArrayList
        System.out.println("Iterating through the ArrayList using Iterator:");
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        collection.add(1000);
        collection.add(2000);
        collection.add(3000);
        collection.add(4000);
        //get() method is used to get the element at the specified index in the ArrayList
        System.out.println(list);
        System.out.println(list.get(1));

        //set() method is used to replace the element at the specified index in the ArrayList with the specified element
        list.set(1,20);
        System.out.println(list);

        //toArray() method is used to convert the ArrayList to an array
        Object[] arr1 = list.toArray();
        System.out.println("Array: ");
        for (Object obj : arr1) {
            System.out.println(obj);
        }

        //contains() method is used to check if the ArrayList contains the specified element returns boolean value true or false
        System.out.println("Does the ArrayList contain 10? " + list.contains(50));
    }
}
