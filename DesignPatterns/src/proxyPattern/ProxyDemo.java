/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyPattern;

/**
 *
 * @author randika-lakmal
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("Randika.png");
        
        image.display();
        
        System.out.println("  ");
        
        image.display();
    }
    
}
