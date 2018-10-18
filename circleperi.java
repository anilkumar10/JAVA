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
public class circleperi
{
    public static void main(String args[])
    {
        double r,x=2,pi=3.14,perimeter;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the Circle : ");
        r=sc.nextInt();
        perimeter=x*pi*r;
        System.out.print("Perimeter is : "+perimeter);
    }
}
