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
public class Cricket extends Game{

    @Override
    public void initialize() {
        System.out.println("Cricket Init");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Start");

    }

    @Override
    public void endPlay() {
        System.out.println("Cricket End");

    }

    
}
