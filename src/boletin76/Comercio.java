/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin76;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Comercio {
    public int pedirNumEnteiro(){
        int num;
        String res= JOptionPane.showInputDialog("teclee un numero");
        num= Integer.parseInt(res);
        return num;
    }
    public void consumo(int num){
        if (num<=100)
            System.out.println("O consumo e BAIXO");
        else if (num>100 & num<=500)
            System.out.println("O consumo e MEDIO");
        else if (num>500 & num<=1000)
            System.out.println("O consumo e ALTO");
        else if (num>1000)
            System.out.println("O consumo e de PRIMEIRA NECESIDADE");
    }
}
