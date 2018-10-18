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
public class circlearea
{
    public static void main(String args[])
    {
        double pi= 3.14,x,area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        x=sc.nextInt();
        area=(pi*x*x);
        System.out.print("Area of the Circle is : "+area);
    }
}
