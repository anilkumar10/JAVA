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
public class reverse
{
    public static void main(String args[])
    {
        int number,rem,rev=0,ans;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse : ");
        number =  sc.nextInt();
        while(number>0)
        {
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println("reverse is : "+rev);
    }
    
}
