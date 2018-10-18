/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANIL
 */
import java.io.*;
    interface interface1
    {
        void fun1();
        void fun2();
    }
    
    interface interface2
    {
        void fun3();
    }
    
    class interdemo implements interface1,interface2
    {
        public void fun1()
        {
         System.out.println("function 1");
        }
        
        public void fun2()
        {
         System.out.println("function 2");
        }
                
        public void fun3()
        {
         System.out.println("function 3");
        }
        
           public static void main(String args[])
        {
            interdemo ob = new interdemo();
            ob.fun1();
            ob.fun2();
            ob.fun3();
        }
    }
