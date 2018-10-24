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
public class empbonus
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float bonus,basic_pay,total_pay;
        int code = 0;

        System.out.print("Enter the Basic Pay : ");
        basic_pay=sc.nextInt();

        System.out.print("Enter the Emp Code 100,200,300,400 : ");
        code=sc.nextInt();
        switch(code)
                {
                    case 100: 
                        bonus=(5*basic_pay)/100;
                        System.out.println("Bonus : "+bonus);
                        total_pay=basic_pay+bonus;
                        System.out.print("Total Pay : "+total_pay);
                        break;
                        
                    case 200: 
                        bonus=(1*basic_pay)/100;
                        System.out.println("Bonus : "+bonus);
                        total_pay=basic_pay+bonus;
                        System.out.print("Total Pay : "+total_pay);
                        break;
                        
                    case 300: 
                        bonus=(2*basic_pay)/100;
                        System.out.println("Bonus : "+bonus);
                        total_pay=basic_pay+bonus;
                        System.out.print("Total Pay : "+total_pay);
                        break;
                        
                    case 400: 
                        bonus=(25*basic_pay)/100;
                        System.out.println("Bonus : "+bonus);
                        total_pay=basic_pay+bonus;
                        System.out.print("Total Pay : "+total_pay);
                        break;
                }
    }
}