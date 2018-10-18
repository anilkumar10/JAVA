
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
public class swapno
{
    public static void main(String args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the length of the array : ");
        num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered list : ");
        for(int i=0;i<num;i++)
        {
            System.out.print(" "+arr[num]);
        }
    }
}
