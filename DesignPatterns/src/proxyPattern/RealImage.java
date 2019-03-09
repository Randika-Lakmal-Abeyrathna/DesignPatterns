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
public class RealImage implements Image{

    public String fileName ;
    
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    
    public void loadFromDisk(String fileName){
        System.out.println("Loading File  : "+ fileName);
    }
    
    @Override
    public void display() {
        System.out.println("Display File : "+fileName);
    
    }

    
    
}
