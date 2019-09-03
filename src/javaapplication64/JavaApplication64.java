/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication64;

/**
 *
 * @author Shamarl Leonad
 */
public class JavaApplication64 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
            String str =new String ("Shamarl");
    str.concat(" Leonard");
    String ing =str.concat(" Leonard");
        System.out.println(str);
        System.out.println(ing);
        
        StringBuilder strb = new StringBuilder("Shamarl");
        strb.append(" Leonard");
        System.out.println(strb);
        
        String st = new String ("Sham");
        String st2 = new String ("Sham");
        System.out.println(st.equals(st2));
        
        
        
    }
    
    

}
