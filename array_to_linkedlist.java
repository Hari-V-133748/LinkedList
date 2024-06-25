/*
 Question:
Add the Array and Linked list. 
 */

 import java.util.*;
 public class array_to_linkedlist {
     public static void main(String[] args) {
         LinkedList<String> subject = new LinkedList<>();
         subject.add("EEE");
         subject.add("CSE");
         subject.add("IT");
         System.out.println("Subject list: " + subject);
         ArrayList<String> courses = new ArrayList<>();
         courses.add("Bio Medical");
         courses.add("ECE");
         System.out.println("Courses list: " + courses);
         subject.addAll(courses);
         System.out.println("Combined list: " + subject);
     }
 }
 
 
