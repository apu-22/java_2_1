package kraven;

import java.util.Scanner;
public class Cal_Grade {
    public static void  main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of marks:");
        int mark= scan.nextInt();
//        if(mark>=0 && mark<=39) System.out.println("Grade is: F");
//        if(mark>=40 && mark<=59) System.out.println("Grade is: C+");
//        if(mark>=60 && mark<=69) System.out.println("Grade is: B");
//        if(mark>=70 && mark<=79) System.out.println("Grade is: A-");
//        if(mark>=80 && mark<=89) System.out.println("Grade is: A");
//        if(mark>=90 && mark<=100) System.out.println("Grade is: A+");
        String grade;
        if(mark>=90) grade="A+";
        else if (mark>=80) {
            grade="A";
        } else if (mark>=70) {
            grade="A-";
        } else if (mark>=60) {
            grade="B";
        } else if (mark>=40) {
            grade="C+";
        } else if (mark>=0) {
            grade="F";
        }else grade="Invalid mark";

        System.out.println("The grade is: "+ grade);

        scan.close();
    }
}
