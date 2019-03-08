/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonPattarn;

/**
 *
 * @author randika-lakmal
 */
public class SingletonDemo {
    
    public static void main(String[] args) {
            SingleObject singleObject = SingleObject.getInstance();

            singleObject.getMessage();
    }

    
}
