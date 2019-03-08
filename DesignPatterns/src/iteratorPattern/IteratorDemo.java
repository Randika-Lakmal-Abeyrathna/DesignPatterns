/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorPattern;

/**
 *
 * @author randika-lakmal
 */
public class IteratorDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        
        for (Iterator iterator = nameRepository.getInstance(); iterator.hasNext();) {
            String name  = (String)iterator.next();
            System.out.println("Name : "+name);
            
        }
    }
    
}
