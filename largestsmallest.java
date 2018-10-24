/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BBAU
 */
import java.util.Scanner;
public class largestsmallest
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int k = 0;
        System.out.print("Enter the length of the array : ");
        k=sc.nextInt();
        int arr[]=new int[k];
        System.out.println("Enter the elements in the array : ");
        int max=arr[0];
        for(int i=0;i<k;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<k;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        
        System.out.println("largest no in the array is : "+max);
        int min=arr[0];
        for(int i=0;i<k;i++)
        {
            if(min>arr[i])
                   
                min=arr[i];
        }
        System.out.print("largest no in the array is : "+min);
    }
}
