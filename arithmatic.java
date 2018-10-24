/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anil;

/**
 *
 * @author BBAU
 */
public class arithmatic
{
    int add(int x)
    {
        return (x+x);
    }
    
    int add(int x,int y)
    {
        return (x+y);
    }
}

class answer
{
    public static void main(String args[])
    {
        arithmatic ob = new arithmatic();
        int x = ob.add(4);
        int y = ob.add(4,8);
        System.out.println("x+x = "+x);
        System.out.println("x+y = "+y);
    }
}
