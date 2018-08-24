/**
import java.lang.Comparable;
import java.util.PriorityQueue;

class Test
{
    public static void main(String[] args)
    {
        PriorityQueue<MyClass> queue = new PriorityQueue<MyClass>();
        queue.add(new MyClass(2, "short"));
        queue.add(new MyClass(2, "very long indeed"));
        queue.add(new MyClass(1, "medium"));
        queue.add(new MyClass(1, "very long indeed"));
        queue.add(new MyClass(2, "medium"));
        queue.add(new MyClass(1, "short"));
        while (queue.size() != 0)
            System.out.println(queue.remove());
    }
}
class MyClass implements Comparable<MyClass>
{
    int sortFirst;
    String sortByLength;

    public MyClass(int sortFirst, String sortByLength)
    {
        this.sortFirst = sortFirst;
        this.sortByLength = sortByLength;
    }

    @Override
    public int compareTo(MyClass other)
    {
        if (sortFirst != other.sortFirst)
            return Integer.compare(sortFirst, other.sortFirst);
        else
            return Integer.compare(sortByLength.length(), other.sortByLength.length());
    }

    public String toString()
    {
        return sortFirst + ", " + sortByLength;
    }
}
Output:

1, short
1, medium
1, very long indeed
2, short
2, medium
2, very long indeed
*/

// Java progrm to demonstrate working of priority queue in Java
import java.util.*;
 
class Example
{
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<String> pQueue =
                          new PriorityQueue<String>();
 
        // Adding items to the pQueue using add()
        pQueue.add("C");
        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");
 
        // Printing the most priority element
        System.out.println("Head value using peek function:"
                                           + pQueue.peek());
 
        // Printing all elements
        System.out.println("The queue elements:");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
 
        // Removing the top priority element (or head) and
        // printing the modified pQueue using poll()
        pQueue.poll();
        System.out.println("After removing an element" +
                           "with poll function:");
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());
 
        // Removing Java using remove()
        pQueue.remove("Java");
        System.out.println("after removing Java with" +
                           " remove function:");
        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next());
 
        // Check if an element is present using contains()
        boolean b = pQueue.contains("C");
        System.out.println ( "Priority queue contains C " +
                             "or not?: " + b);
 
        // Getting objects from the queue using toArray()
        // in an array and print the array 
        Object[] arr = pQueue.toArray();
        System.out.println ( "Value in array: ");
        for (int i = 0; i<arr.length; i++)
          System.out.println ( "Value: " + arr[i].toString()) ;
    }
}
