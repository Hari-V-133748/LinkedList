/************
Question:

Functions of Linkedlist.

***********/
import java.util.*;
public class linkedlist {
    public static void main(String[]args){
        LinkedList<String> mobile=new LinkedList<>();
        // giving input to list
        mobile.add("Poco");
        mobile.add("Redmi");
        mobile.add("Samsung");
        mobile.add("Nothing");
        mobile.add("Vivo");
        System.out.println("Mobiles in list : "+mobile);
        //  using addFirst() fuction
        mobile.addFirst("Oppo");
        System.out.println("New list : "+mobile);
        // using addLast() function
        mobile.addLast("Realme");
        System.out.println("Second New list : "+mobile);
        // getting the value from list
        System.out.println("The first mobile in list : "+mobile.getFirst());
        System.out.println("The last mobile in list is : "+mobile.getLast());
        System.out.println("The mobile at index 2 in list : "+mobile.get(2));
        // using remove() function
        mobile.remove("Nothing");
        System.out.println("List after removed Nothing phone : "+mobile);
        mobile.remove(2);
        System.out.println("List after removed 2nd index mobile : "+mobile);
        // setting the value in list
        mobile.set(2, "Nothing");
        System.out.println("Setting the value in list : "+mobile);
        //calculate the size in list
        System.out.println("The size of the list is : "+mobile.size());
        //clearing all data in list
        mobile.clear();
        System.out.println("The list after clearing the data : "+mobile);
        System.out.println("The size of the list after deleting the data in list : "+mobile.size());

    }
}

/*****************
OUTPUT:


Mobiles in list : [Poco, Redmi, Samsung, Nothing, Vivo]
New list : [Oppo, Poco, Redmi, Samsung, Nothing, Vivo]
Second New list : [Oppo, Poco, Redmi, Samsung, Nothing, Vivo, Realme]
The first mobile in list : Oppo
The last mobile in list is : Realme
The mobile at index 2 in list : Redmi
List after removed Nothing phone : [Oppo, Poco, Redmi, Samsung, Vivo, Realme]
List after removed 2nd index mobile : [Oppo, Poco, Samsung, Vivo, Realme]
Setting the value in list : [Oppo, Poco, Nothing, Vivo, Realme]
The size of the list is : 5
The list after clearing the data : []
The size of the list after deleting the data in list : 0



 ****************/
