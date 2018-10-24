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
public class swapno2
{
    public static void main(String args[])
            
    {
        Scanner sc=new Scanner(System.in);
        int num,pos1 = 0,pos2 = 0,temp;
        System.out.print("Enter the length of the array : ");
        num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements in array : ");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered list : ");
        for(int i=0;i<num;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("\n\nEnter the two position between array range : ");
        System.out.print("Position 1 : ");
        pos1=sc.nextInt();
        System.out.print("Position 2 : ");
        pos2=sc.nextInt();
        pos1=pos1-1;
        pos2=pos2-1;
       
        arr[pos1]=arr[pos1]+arr[pos2];
        arr[pos2]=arr[pos1]-arr[pos2];
        arr[pos1]=arr[pos1]-arr[pos2];

        System.out.println("Swaped list : ");
        for(int i=0;i<num;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}

