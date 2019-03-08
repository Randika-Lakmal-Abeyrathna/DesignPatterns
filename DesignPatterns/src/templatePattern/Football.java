/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatePattern;

/**
 *
 * @author randika-lakmal
 */
public class Football extends Game {

    @Override
    public void initialize() {
        System.out.println("Football Init");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Start");
        

    }

    @Override
    public void endPlay() {
System.out.println("Football End");        
    }

}
