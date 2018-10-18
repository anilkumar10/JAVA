/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANIL
 */
public class c_over
{
    c_over()
    {
        System.out.println("java is fun");
    }
    
    c_over(String s)
    {
        System.out.println("I like prog in "+s);
    }
    
    c_over(int i)
    {
        System.out.println("It will take "+i+" ```days to learn properly");
    }
    
    public static void main(String args[])
    {
        new c_over();
        new c_over("java");
        new c_over(10);
    }
}
