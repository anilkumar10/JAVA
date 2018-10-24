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
public class greaterless
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        System.out.print("Enter the two numbers to find greater or less : ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            System.out.print(a+" is greter");
            else
            System.out.print(b+" is greter");
    }
}
