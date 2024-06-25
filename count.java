/*******************
Qutions:

Count the number of digit in a number.

**********************/


import java.util.*;
public class count {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value : ");
        long a=sc.nextLong();
        long r=0;
        long x = a;
        int c=0;
        while(a!=0){
            r=a % 10;
            a=a/10;
            c=c+1;
        }
        System.out.println("The number of digits in "+x+" is : "+c);
    }
}

/***********************
OUTPUT:

Enter the value : 12345
The number of digits in 12345 is : 5

 ************************/
