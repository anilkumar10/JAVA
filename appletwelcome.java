/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author ANIL
 */
public class appletwelcome extends Applet
    {
        Label l1;
    
    public void init()
    {
        l1=new Label("WELCOME");
        setLayout(null);
        l1.setBounds(150,50,100,100);
        add(l1);
    }


}
