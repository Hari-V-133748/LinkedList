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
