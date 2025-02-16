package kraven;

import java.awt.*;
import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a= scan.nextInt();

        System.out.println("Enter the value of b:");
        int b= scan.nextInt();

        System.out.println("Enter the operator between a and b:");
        char ch= scan.next().charAt(0);

        double result=0;

        if(ch=='+') result=a+b;
        else if (ch=='-') {
            result=a-b;
        } else if (ch=='*') {
            result=a*b;
        } else if (ch=='/') {
            if(b!=0) result=(double) a/b;
            else System.out.println("Error: Division by zero is not allowed.");
        }else System.out.println(("Invalid operation between a and b."));

        System.out.println("The result is: "+ result);
        scan.close();
    }
}
