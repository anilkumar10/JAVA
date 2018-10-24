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
public class function_over
{
    void print()
    {
        for(int i=0;i<10;i++)
            System.out.print("a");
    }
    void print(char c)
    {
        for(int i=0;i<10;i++)
        System.out.print("c");
    }
    void print(int k,char c)
    {
        for(int i=0;i<k;i++)
        System.out.print("c");
    }
}

class poly
{
    public static void main(String args[])
    {
        function_over ob = new function_over();
        System.out.print("\n no args ");
        ob.print();
        System.out.print("\n one args ");
        ob.print('c');
        System.out.print("\n two args ");
        ob.print(4,'c');
    }
}
