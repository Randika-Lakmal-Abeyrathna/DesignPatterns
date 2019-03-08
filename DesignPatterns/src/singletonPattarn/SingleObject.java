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
public class SingleObject {
    
    private static SingleObject instance = new SingleObject();
    
    // Private Constuctor ==> so no objects can be made
    private SingleObject(){}
    
    
     
    /***
     * To get Thread safe object mart this method as Synchronized 
     *  
     */
    public  static SingleObject getInstance(){
        return instance;
    }
    
    public void getMessage(){
        System.out.println("Hello Single Object");
    }
}
