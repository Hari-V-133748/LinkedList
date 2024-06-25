/********************
 Question:
 
Add the Array and Linked list. 

 ********************/

 import java.util.*;
 public class array_to_linkedlist {
     public static void main(String[] args) {
         LinkedList<String> c1 = new LinkedList<>();
         c1.add("EEE");
         c1.add("CSE");
         c1.add("IT");
         System.out.println("Course 1 list: " + c1);
         ArrayList<String> c2 = new ArrayList<>();
         c2.add("Bio Medical");
         c2.add("ECE");
         System.out.println("Course 2  list: " + c2);
         c1.addAll(c2);
         System.out.println("Combined list: " + c1);
     }
 }
 
 /*****************************
 OUTPUT:
Course 1 list: [EEE, CSE, IT]
Course 2  list: [Bio Medical, ECE]
Combined list: [EEE, CSE, IT, Bio Medical, ECE]

  ****************************/
