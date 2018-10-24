/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BBAU
 */
public class construct
{
    int id;
    String nm;
    
    construct(int id,String nm)
    {
        this.id=id;
        this.nm=nm;
    }
    
    void show()
    {
        System.out.println(id+" "+nm);
    }
    
    public static void main(String args[])
    {
        construct ob1=new construct(101,"Amit");
        construct ob2=new construct(102,"Seema");
        ob1.show();
        ob2.show();
    }
}
