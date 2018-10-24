/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANIL
 */
import java.util.Scanner;
public class weekday
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int day;
        System.out.print("Enter the day in Digits : ");
        day=sc.nextInt();
        
        if(day==1)
            System.out.print("HAVE A NICE DAY");
        else if(day==2)
            System.out.print("WELCOME BACK TO THE WORKING DAY");  
        else if(day==3)
            System.out.print("WELCOME BACK TO THE WORKING DAY"); 
        else if(day==4)
            System.out.print("WELCOME BACK TO THE WORKING DAY"); 
        else if(day==5)
            System.out.print("WELCOME BACK TO THE WORKING DAY"); 
        else if(day==6)
            System.out.print("WELCOME BACK TO THE WORKING DAY"); 
        else if(day==7)
            System.out.print("HAVE A NICE WEEKEND");
        else
            System.out.print("Invalid Day");
    }
}
