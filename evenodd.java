/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANIL
 */
import java.util.*;
import java.Scanner;
public class evenodd
{
    int  input()
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        i=sc.nextInt();
        return i;
    }
    void test(int x)
    {
        if(x%2==0)
            System.out.println("The number is even");
        else
            System.out.println("The nunber is odd");
    }
    public static void main(String args[])
    {
        int y = 0;
        evenodd ob=new evenodd();
        ob.input();
        ob.test(y);
    }
}
