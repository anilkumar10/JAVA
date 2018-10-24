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
public class factorial
{
    public static void main(String args[])
    {
    int k,ans=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to find factorial : ");
    k=sc.nextInt();
    for(int i=1;i<=k;k++)
        ans=k*i;
    System.out.println("Factorial is : "+ans);
    }
}
