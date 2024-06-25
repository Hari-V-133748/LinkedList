/****************
Question:

To check the person is he/she eligible for the loan in bank.

*****************/

import java.util.*;
public class bank {
    public static void main(String[]args){
        LinkedList <String>  need= new LinkedList<>();
        //getting value in list
        need.add("Aadhar");
        need.add("CBIL");
        //checking values in list
        if(need.contains("Aadhar")&& need.contains("CBIL")){
            System.out.println("U'r Eligible");
        }else{
            System.out.println("U'r not Eligible");
        }
    }
    
}


/************************************
OUTPUT:
U'r Eligible
****************************/


