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
public class rectangleperi
{
    public static void main(String args[])
    {
        double l,b,peri;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle : ");
        l=sc.nextInt();
        System.out.print("Enter the width of the Rectangle : ");
        b=sc.nextInt();
        peri=(2*(l+b));
        System.out.print("Perimeter of the rectangle is : "+peri);
    }
}
