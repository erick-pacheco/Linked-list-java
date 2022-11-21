# Instructions  
### Description:
Linked Lists are a data structure within the Java Collection API which inherits from both the List and Queue interfaces. Linked lists offer flexibility in that they store data in an ordered fashion, while also allowing data to be examined in a first-in-first-out order as well as a last-in-first-out order. In other words, you can iterate through a linked list from front-to-back or from back-to-front.

Common LinkedList methods:
* **add** : Inserts the supplied argument at a specified index.
* **addFirst** : Inserts the supplied argument into the starting position of the collection
* **addLast** : Appends the supplied argument to the end of the collection
* **get** : Returns are reference to an element at a specified index
* **getFirst** : Returns the first element of the collection
* **getLast** : Returns the last element of the collection
* **clear** : Removes all elements from the collection
* **remove** : Removes the element at a specified index or the first occurance of an object in the collection.
* **removeFirst** : Removes the first element of the collection
* **removeLast** : Removes the last element of the collection

As you can see, many of these methods are intuitively named. In this activity you will learn how and when to use linked lists. We will not explore each of these methods in detail within this example, but their use should be familiar enough that you can use them without guidance.

Please follow the steps below:

### Steps
1. Add the following code to the main() method within your Main class:
```Java
LinkedList<String> animals = new LinkedList<String>();
animals.addLast("Cat");
animals.addLast("Dog");
animals.addLast("Mouse");
animals.addLast("Wolf");
```
Here, we are using the addLast method to append new elements to the end of our collection. At the moment, you will probably see an error due to a missing import.

Additionally, notice the angle brackets '<>' which contain the word 'String'. These are known as 'Generics'. Different classes, particularly those in the Collection API of Java, use 'Generics' to specify what Datatype can be used with an Object that has been created. In this case, we are specifying that our LinkedList 'animals' can only contain String objects. If we try to place other Objects within this LinkedList, we would be met with a compilation error.

2. Add the following import statement to the top of your file, above the class declaration:
```Java
import java.util.LinkedList;
```
3. Next, add the following statement below the current code, and run the program:
```Java
for (int i = 0; i < animals.size(); i++) {
  System.out.println(animals.get(i));
}
```
You should see the following output:
```
Cat
Dog
Mouse
Wolf
```

4. Now, lets add a new animal to the start of our list. Within your main method, prior to the for-loop, add the following line then run the program:
```Java
animals.addFirst("Beaver");
```
You should see the following output:
```
Beaver
Cat
Dog
Mouse
Wolf
```
By using the `addFirst()` method, we have inserted the string "Beaver" to the start of our list, instead of at the end. If you do not see "Beaver" in your console output, make sure that your statement `animals.addFirst("Beaver")` is above the for-loop.

5. Now, lets insert a value to the middle of our collection. Add the following line to your `main()` method, above your for-loop:
```Java
animals.add(3, "Frog");
```
By supplying a number followed by a String object, the `add()` method can insert our String at a particular index. This insertion shifts all current elements, starting from the specified index, up one value (index 3 becomes index 4, index 4 becomes index 5, etc...) and places the new String value ("Frog") into the newly vacated position. When you run the code you should see the following output:
```
Beaver
Cat
Dog
Frog
Mouse
Wolf
```

6. Now that you've seen how to use LinkedLists its time to explore some of these concepts more on your own. Add the following code to your program, below your for-loop, and continue with the remaining steps:
```Java
planets.addLast("Sun");
planets.addLast("Mercury");
planets.addLast("Venus");
planets.addLast("Earth");
planets.addLast("Moon");
planets.addLast("Mars");
planets.addLast("Jupiter");
planets.addLast("Saturn");
planets.addLast("Uranus");
planets.addLast("Neptune");
planets.addLast("Pluto");
```
Note: adding these lines of code will cause an error for now. Make sure to follow the next steps to resolve this error moving forward.

7. Your Turn! Create another LinkedList of String objects in your `main()` method, above the previously added code from Step 6. Make sure to name the reference variable 'planets', to match the expected name for the LinkedList.

8. Use the `removeFirst()` method to remove the value "Sun" from the LinkedList.
9. Use the `remove()` method to remove the value "Moon" from the LinkedList. For the `remove()` method you can ***either*** supply the index, or the String value.
10. Use the `removeLast()` method to remove the value 'Pluto' from the LinkedList.
11. Create a for-loop which prints all the values of the 'planets' LinkedList.
12. **Optional Step**: Use the `addLast()` method to add "Pluto" back to the LinkedList.


### Test:
Use the test provided. 

#### Sample output:
```
Beaver
Cat
Dog
Frog
Mouse
Wolf
Mercury
Venus
Earth
Mars
Jupiter
Saturn
Uranus
Neptune
```