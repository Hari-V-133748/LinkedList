/**************
Question:
To reverse the List.
**************/

import java.util.*;
public class reverse {
    public static void main(String[] args) {
    LinkedList <Integer> number = new LinkedList<>();
    number.add(1);
    number.add(2);
    number.add(3);
    number.add(4);
    number.add(5);
    System.out.println("List before Reversing : "+number);
    System.out.println("List after Reversed : "+number.reversed());
}
}

/**********************
OUTPUT:

List before Reversing : [1, 2, 3, 4, 5]
List after Reversed : [5, 4, 3, 2, 1]

*********************/    
