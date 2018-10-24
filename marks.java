
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANIL
 */
public class marks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.print("Enter the marks in Digits : ");
        marks=sc.nextInt();
        
        if(marks<40&& marks>=0)
            System.out.print("FAIL");
        else if(marks>=40 && marks<=50)
            System.out.print("BETTER");  
        else if(marks>=50 && marks<=75)
            System.out.print("GOOD"); 
        else if(marks>=75 && marks<=90)
            System.out.print("VERY GOOD"); 
        else if(marks>=90 && marks<=100)
            System.out.print("EXCELLENT"); 
        else
            System.out.print("Invalid marks");
    }
}
