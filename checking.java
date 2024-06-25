/*****************************

Question:
To check the value present in list or not.

*****************************/

import java.util.*;
public class checking {
    public static void main(String[] args) {
        LinkedList <String> tech=new LinkedList<>();
        //initializing input in linkedlist
        tech.add("python");
        tech.add("JAVA");
        tech.add("Ruby");
        tech.add("C++");
        //checking the value
        if(tech.contains("JAVA")|| tech.contains("Python")){
            System.out.println("These technical language are Present.");
        }else{
            System.out.println("Language not present.");
        }
        
    }
}

/*****************************
OUTPUT:
These technical language are Present.
*****************************/
